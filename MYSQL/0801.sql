				/*0801*/ -- p.220
	-- 내장함수 설명 https://dev.mysql.com/doc/refman/8.0/en/functions.html
        
        
        
        
-- 절댓값
select abs(-78),abs(78);	-- 속성을 양수만 들어가도록 변경하고 싶을 때 기존에 들어가있는 음수값를 전부 양수로 바꾼 후 얼터를 사용하여 전체 속성을 바꿔야 함.
							-- 그런 경우에 자주 쓰임
-- 반올림    
select round(4.875, 1);		-- 반올림해서 소숫점 1의 자리까지만 출력, 정수 반올림은 '-n' 사용
    
    
		-- 고객별 평균 주문 금액을 100원 단위로 반올림한 값을 구하세요
    select name, round(avg(saleprice),-2)
    from customer, orders
    where customer.custid=orders.custid
    group by name;
    
    select name, round(avg(saleprice/100))*100
	from Customer,Orders
	where Customer.custid=Orders.custid
	group by Customer.name;
    
    
    
    
    
			/*문자 및 숫자값 변경 함수*/ -- p.223
-- 문자열 연결
select concat('마당','서점');
    
-- 대상 문자열을 소문자로 변환
select lower('MR.SCOTT');	-- 아이디 비번 전화번호 등 입력할 때 특수문자와 한글 같은 거 못쓰게 할 때
							-- 숫자만 입력할 수 있게 지정할 때 
							-- 대소문자 구분 없이 똑같이 받고 싶을 때 사용
-- 대상 문자열을 모두 대문자로 전환
select upper('mr.scott');
    
-- 대상 문자열의 왼쪽부터 지정한 자릿수까지 지정한 문자로 채움
select lpad('Page 1', 10, "*");		-- rpad는 오른쪽부터
        
-- 대상 문자열의 지정한 문자를 원하는 문자로 변경
select replace('jack &jue', 'j', 'bl');
    
-- 대상 문자열의 지정된 자리에서부터 지정된 길이만큼 잘라서 반환
select substr('ABCDEG', 3, 4);
    
-- 대상 문자열의 양쪽에서 지정된 문자를 삭제(문자열만 넣으면 기본값으로 공백 제거)
select trim(" A B C D E");
select trim('=' from"==A= B=C= D=E//= =");



	-- 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 나타내세요
    select bookid, replace(bookname, '야구', '농구'), publisher, price
    from book;
   
    -- 굿스포츠에서 출판한 도서의 제목과 제목의 문자수, 바이트수를 나타내시오
    select bookname '제목', char_length(bookname) '문자수', length(bookname) '바이트수'
    from book
    where publisher='굿스포츠';
    
    -- 마당서점의 고객 중에서 성이 같은 사람이 몇 명이나 되는지 알고 싶다. 성별 인원수를 구하시오
    select substr(name, 1,1) '성',count(*) as amount
    from customer
    group by substr(name,1,1);
    
   
-- 날짜 수정   (-:해당날짜로부터 이전 / +:해당날짜로부터 이후) p.226
select adddate('2024-07-01', interval -5 day) before5,
		adddate('2024-07-01', interval 5 day) after5;
    
		
        
	-- 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하세요.
		-- 쇼핑몰에서 후기를 배송 확정일자로부터 n일 안에 작성하면 포인트 주기 or n일 안에만 후기 작성할 수 있도록 하기
    select orderid '주문번호', orderdate '주문일', 
			adddate(orderdate, interval 10 day) '확정'
    from orders;
    
    
    -- 2024년 7월 4일 주문받은 도서를 모두 나타내세요. 
    -- 240704 형태로
    -- Jul 04 2024 형태로
    -- 24-07-04 Thu 형태로
    select orderid, name,
    date_format(orderdate, '%y%m%d'), 
    date_format(orderdate, '%b %d %Y'), 
    date_format(orderdate, '%y-%m-%d %a'),
    orders.custid, book.bookid
    from orders, customer, book
    where orders.custid=customer.custid and book.bookid=orders.bookid
    order by orders.orderid;
    
    
    
    
    
    
    

		/*뷰*/ -- p.243
    -- 뷰=>join을 한 결과물. 가상의 테이블 뷰Vorders 생성, 테이블 원본에서 직접 select하지 않고 뷰에서 쿼리해옴
    -- 보안성 => 사용자별로 필요한 데이터만 선별해서 보여줄 수 있음.(사원정보 뷰->사장이 볼 수 있는 부분과 팀장이 볼 수 있는 부분 각각 선별 가능)
    -- 실무에서도 뷰를 많이 만들어서 뷰에서 select해옴
    -- 원본 테이블에 행을 추가하면 중복데이터가 생기므로 뷰를 사용해야함
    -- 뷰는 테이블이 아닌 가상의 테이블이다. 그러나 물리적으로 공간을 차지함
    -- 독립성 => 원본 테이블의 구조가 변해도 응용에 영향을 주지 않음
    
    
    
    
-- 뷰 생성문
create view vorders
as select orderid,O.custid,name,O.bookid,bookname,saleprice,orderdate
from customer C, orders O, book B
where C.custid=O.custid and B.bookid=O.bookid;
    -- 확인
    select * from vorders;
    
    
    
    -- 주소에 대한민국을 포함하는 고객들로 구성된 뷰를 만들고 조회. 뷰이름은 vw_Customer
    create view vw_Customer
	as select *
    from customer C
    where address like ('%대한민국%');
		select * from vw_Customer;
    
    -- Order테이블에서 고객명과 도서명을 확인할 수 있는 뷰를 생성한 후, 김연아 고객이 구입한 도서의 주문번호, 도서명, 주문액을 출력하세요
    create view vw_Orders(orderid,custid,name,bookid,bookname,saleprice,orderdate)
    as select O.orderid, O.custid, C.name,O.bookid,B.bookname, O.saleprice, O.orderdate
    from customer C, orders O, book B
    where C.custid=O.custid and O.bookid=B.bookid;
    
    select * from vw_Orders;
    
    drop view vw_Customer;
    
    select orderid, bookname, saleprice
    from vw_Orders
    where name like '김연아';
    
		
    
    
    
		/*null*/ -- p.229
        
-- null값 확인
select *
from customer
where phone is null;


				create table MyBook(
				bookid int primary key,
				price int
				);

				insert into MyBook values(1,10000);
				insert into MyBook values(2,20000);
				insert into MyBook values(3,null);
				insert into MyBook(bookid) values(4);

					select *
					from Mybook;
    
    
    
-- null에 값 더해도 null
select price+100
from mybook
where bookid=3;

-- 총합(sum) 계산에선 null+다른값=null로 처리하지 않고 아예 null값을 제외하고 계산한다
-- 총갯수( count(*) )는 null값인 갯수까지 카운트한다(총 열의 갯수 카운트)
-- [select 연산(조건)]에서 조건에 *
select sum(price), avg(price), count(*),count(price)
from mybook;
   
-- where 조건에 맞는 데이터가 없는(리턴이 없는) 열은 [select 연산(조건)]에서 조건이 들어가있어도 아무것도 없으므로 null로 취급한다
select sum(price), avg(price), count(*),count(price)
from mybook
where bookid>=4;
    
-- null 값 찾기
select count(*)
from mybook
where price is null;

select *
from mybook
where price=0;
    

		/*ifnull*/
        -- 출력시 null값에 표시할 문장
        
select name '이름', ifnull(phone,'연락처없음') '전화번호'
from customer;

select * , ifnull(price,'가격미정') 
from mybook;






    
    
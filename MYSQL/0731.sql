				/* 0731 */
                
 -- 복습               
-- select bookname 
-- from book where price(1, '우효림', '대한민국대구', '010-0000-0009');
-- select * from table_name where custid=1;
-- update table_name set 변경할 내용 where 조건;
-- create table 테이블이름
-- creat database  데이터베이스이름
-- DROP TABLE 테이블이름
-- drop database 데이터베이스이름
-- delete from 테이블이름 where 조건;
-- 복습끝


--  대한미디어에서 출판한 도서를 구매한 고객의 이름을 출력하세요
-- 서브쿼리
select customer.name
from customer
where custid in (select custid from orders 
where bookid in (select bookid from book 
where publisher = '대한미디어'));

-- join
select customer.name from customer, book, orders
where orders.bookid=book.bookid 
	and customer.custid=orders.custid
    and book.publisher='대한미디어';




	/*union*/
    -- 중복을 제거해줌
    -- join은 옆으로 붙이는 것(행을 추가함), union은 결과를 위아래로 붙임(열을 추가함)

-- 대한민국에 거주하는 고객 리스트 출력
	select name
	from customer
	where address like '대한민국%';
-- 세명

-- 도서를 주문한 고객리스트 출력(서브쿼리)
	select name 
    from customer
	where custid in (select custid from orders);
-- 네명

-- --->대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하시오(중복X)
	select name from customer where address like '대한민국%'
union
    select name from customer where custid in (select custid from orders);	
    
-- --->대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하시오(중복O)
	select name from customer where address like '대한민국%'
union all
    select name from customer where custid in (select custid from orders);
    
    
    
    

		/*exists*/
	-- 행에 영향을 줌, exists 앞에 칼럼 이름이 없음
-- 주문이 있는 고객의 이름과 주소
select name, address from customer cs
where exists (select * from orders od where cs.custid=od.custid);





		/*create*/
create table NewBook(
	bookid integer primary key,
	bookname varchar(20),
    publisher varchar(20),
    price integer

);

-- bookid 속성 없이 다른 두 개의 속성을 합해서 primary key로 지정하기 예시
-- db에서 사용하는 모든 메세지를 관리하는 Code Table
-- id_1 : 대분류 -> 0 : 회원 관련 메세지
-- id_2 : 중분류 -> 0 : 회원가입 / 1 : 로그인,로그아웃
-- id_3 : 소분류 -> 0 : 가입성공
-- msg : 출력될 내용
/*
create table tblCode(
	id_1 char(2) not null,
    id_2 char(2) not null,
    id_3 char(3) not null,
    msg varchar(60) not null,
	primary key (id_1, id_2, id_3)
    );

insert into tblCode ('00','00','000', '회원가입을 축하합니다');
insert into tblCode ('00','01','001', '로그인 되었씁니다');
insert into tblCode ('0','1','2', '로그아웃되었습니다');
insert into tblCode ('00','00','001', '중복된 아이디입니다');
*/

create table NewCustomer(
custid integer primary key,
name varchar(40),
address varchar(40),
phone varchar(30)
);

create table NewOrders(
orderid integer primary key,
custid integer not null ,
bookid integer not null,
saleprice integer,
orderdate date,
foreign key (custid) references NewCustomer(custid) on delete CASCADE
);





	-- DML(데이터조작어)
		/*alter문*/
        
	alter table NewBook add	isbn varchar(13);	-- 칼럼추가
describe newbook;	-- 테이블 속성 확인
	
    alter table newbook modify isbn integer;	-- 속성 변경

	alter table newbook drop isbn;	-- 칼럼삭제
    
    alter table newbook modify bookname varchar(20) not null;	-- 칼럼속성 수정하기. 그 칼럼에 있는 모든 속성 다 적어줘야함(수정 안 하는 것도)
	alter table newbook add primary key (bookname, publisher);	-- 수정이 아니라 없는 속성을 추가할 땐 add
																-- 이미 운영중인 서비스는 alter 잘 안 쓴다..쓸라면 일이 굉장히 많아짐
																-- publisher는 null허용이므로 기본키로 설정할 수 없음
    drop table newbook;
    
-- 테이블 만들 때 마스터테이블 만들고 이를 참조하는 다른 테이블 만듦. 삭제할 땐 반대로
    
    
    
-- ------------------------------------------------------------------------
    
    
    
    update newbook set bookname='하하' where bookid='2';
    delete from newbook where bookid='1';
    -- update와 delete문은 무조건 조건(where) 들어가야함
    
    
    
		/*insert*/
    
-- book 테이블에 새로은 도서 ' 스포츠 의학' 삽입.  출판사 한솔의학서적, 가격 9만원
		insert into book(bookid, bookname, publisher, price)	
        values(11,'스포츠 의학', '한솔의학서적',90000);
-- 가격미정
    	insert into book(bookid, bookname, publisher)	
        values(11,'스포츠 의학', '한솔의학서적');
        -- 넣고 싶지 않은 정보는 안 적어도 됨
        
        
-- ------------------------------------------------------------------------
    
    select book.publisher
    from book, orders, customer
    where book.bookid=orders.bookid and customer.custid=orders.custid and customer.name = '박지성' ;
		-- 박지성이 구매한 책의 출판사
        
-- 1)박지성이 구매한 도서의 출판사와/ 같은 출판사에서/ 도서를 구매한 /고객의 이름

	select name, publisher
    from book, orders, customer
    where customer.custid=orders.custid 
		and book.bookid=orders.bookid 
		and publisher in (select book.publisher 
							from book, orders, customer 
							where customer.name = '박지성' 
                            and customer.custid=orders.custid 
                            and book.bookid=orders.bookid)
    order by publisher;



    select name, publisher from customer, book, orders where orders.custid=customer.custid and orders.bookid=book.bookid order by name;
    
    
-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- 두 개를 구매한 고객->출판사 중복 없는->이름출력
-- 책구매한사람 아이디+구매한 책 출판사 목록 (select customer.custid, publisher from customer, book, orders where orders.custid=customer.custid and orders.bookid=book.bookid order by name);



-- 3) 전체 고객의 30%이상이 구매한 도서
    
    
    
    
    
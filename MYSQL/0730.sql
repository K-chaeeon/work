-- p.150~ --

SELECT 
    name, phone
FROM
    Customer
WHERE
    name LIKE '김연아';
-- select 찾을 거 from 칼럼이름 where 조건;


	-- 가격이 10000원 이상인 도서의 이름과 출판사 검색 
select bookname, publisher from Book
where price>=10000;

	-- 가격이 10000원 이상 20000원 이하인 도서의 이름과 출판사 검색 
SELECT 
    bookname, publisher
FROM
    Book
WHERE
    price >= 10000 && price <= 20000;
-- where price>=10000 and price<=20000; 


	-- 중복 삭제 : select distince 칼럼이름 from 테이블 
SELECT DISTINCT
    publisher
FROM
    Book;
    
    
    -- phone의 값이 입력되지 않은(NULL) 고객의 이름 출력하기 
select name, phone from customer
where phone is null;
	-- null 아닌 사람 출력은 not null 


-- 출판사가 굿스포츠, 가격이 만원 이상 이만원 "미만" 
-- between a and b는 a이상 b이하 
select * from Book
where (publisher like '굿스포츠') and (price between 10000 and 19999);
-- where (publisher = '굿스포츠') and (price between 10000 and 19999); 


-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서 검색 
select * from Book
-- where publisher like '굿스포츠' or publisher='대한미디어'; 
-- where publisher in ('굿스포츠', '대한미디어'); 
-- 아닌거
where publisher not in ('굿스포츠', '대한미디어');


-- 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서 검색(첫번쨰글자 아무거나 상관X)
select * from Book
where bookname like '_구%';

	/* 데이터 수정하기 */
-- update 테이블이름 set 속성이름
-- where~ 조건이 없으면 죄다 바뀜

update Book set bookname='그 여자의 축구' where bookid=2;
select * from Book;

	/*delete문*/
-- 마스터테이블에 있는 항목부터 지워줘야함 
delete from Book
where bookid=2;

	/*order by*/
-- 오름차순으로 정렬
select * from Book order by bookname;
-- 뒤에 desc를 붙이면 내림차순, 아무것도 안 적으면 asc(오름차순)이 디폴트값임

-- 가격순으로 검색 후 가격이 같으면 이름순으로 정렬
select * from Book order by price, bookname;
-- 가격순으로 검색 후 가격이 같으면 이름순으로 정렬


-- 고객이 주문한 도서의 금액 집계 --
select sum(saleprice) from orders;	-- 총합
select avg(saleprice) from orders;
select count(saleprice) from orders;
select min(saleprice) from orders;
select max(saleprice) from orders;

	select price as '판매가격' from Book;	-- price말고 '판매가격'으로 출력

-- 한번에 출력하기
SELECT 
    SUM(saleprice) AS 총합,
    AVG(saleprice) AS Average,
    MIN(saleprice) AS Max,
    MAX(saleprice) AS Max
FROM
    Orders;
    
    
select * from Orders;
select count from Orders; -- count는 null값이 출력 안 됨

     
    
-- 고객별(group by)로 주문한 도서의 총 수량(count)과 총 판매액(sum)을 구하시오 --
select custid as 아이디, 
	count(*) as 총수량, 
	sum(saleprice) as 총판매액 
	from Orders 
	group by custid;
    
    
    -- 가격이 8천원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총수량을 구하시오.    
    -- 단, 두 권 이상 구매한 고객만 출력
select custid as 아이디, count(*) as 주문수량  from Orders where saleprice>=8000 group by custid having count(*)>=2;
    -- (select~where) + from~ + group by~having
    -- group by에서 쓰인 조건(속성)=select절에 쓰인 조건(속성)
    
    
    
		/*join*/
    -- 고객과 고객의 주문에 관한 데이터 나타내기
    select * from customer, orders 
    where customer.custid=orders.custid		-- 중복되는 속성 합쳐서 출력
    order by orders.orderid;	-- 뭘 기준으로 정렬할지 정하는 것
    
    
    
    -- 고객별로 주문한 모든 도서의 총판매액읠 구하고, 고객별로 정렬하시오.
    select name, sum(saleprice)
    from customer, orders
    where customer.custid=orders.custid
    group by customer.name
    order by customer.name;
    

-- 다시
    -- 가격이 8천원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총수량을 구하시오.    
SELECT name AS 이름, COUNT(*) AS 주문수량
FROM customer,orders
where customer.custid=orders.custid
GROUP BY customer.name
HAVING COUNT(*) >= 2;


		-- 고객의 이름과 고객이 주문한 도서의 이름,가격
        -- 2만원 이상
        select customer.name, book.bookname, book.price
        from customer, orders, book
        where book.bookid=orders.bookid and customer.custid=orders.custid and book.price>=20000
        order by book.bookname;
        



-- 1) 도서번호가 1인 도서의 이름
select book.bookid, book.bookname
from book
where bookid=1;

-- 2) 가격이 2만원 이상인 도서의 이름
select book.bookname, book.price
from book
where price>=20000;

-- 3) 박지성의 총구매금액
select sum(saleprice), customer.name
from orders, customer
where name='박지성' and orders.custid=customer.custid;

-- 4) 박지성이 구매한 도서의 수
select count(*), customer.name
from customer, orders
where orders.custid=customer.custid and customer.name='박지성';

-- 5) 박지성이 구매한 도서의 출판사 수
select count(distinct publisher), customer.name
from book, customer, orders
where customer.name='박지성' and orders.bookid=book.bookid and customer.custid=orders.custid;

-- 6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select name, price, price-saleprice
from book, customer, orders;



-- 7) 박지성이 구매하지 않은 도서의 이름 
	-- join으로
SELECT 
    book.bookname
FROM
    book,customer,orders
WHERE
    customer.custid = orders.custid
        AND book.bookid = orders.bookid
        AND customer.name != '박지성';
        -- customer.name<>'박지성'
        -- customer.name not in ('박지성')
	


-- 8) 마당서점 도서의 총개수
select count(*) , book.bookid
from book;

-- 9) 마당서점에 도서를 납품하는 출판사의 총개수
select count(distinct publisher) from book;

-- 10) 모든 고객의 이름, 주소
select customer.name, customer.adderss
from customer;

-- 11) 2024년 7월 4일부터 2024년 7월 7일 사이에 주문된 도서의 목록
select book.bookname, orders.orderdata
from orders, book
where book.bookid=orders.bookid and orders.orderdata between'2024-07-04'and'2024-07-07';

-- 12) 성이 김씨인 고객의 이름과 주소
select name, address
from customer
where name like '김%%';

-- 13) 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소
select name, address
from customer
where name like '김%_' and name like '_%아';


-- 14) 주문 금액의 총액과  평균금액
select sum(saleprice) from orders;
select avg(saleprice) from orders;


-- 15) 고객의 이름과 고객별 구매액
select name, sum(saleprice) as '누적 구매금액'
from customer, orders
where customer.custid=orders.custid
group by name
order by name;


-- 16) 고객의 이름과 고객이 구매한 도서목록
select name, bookname
from customer, orders, book
where customer.custid=orders.custid and book.bookid=orders.bookid;

select C.name, B.bookname
from customer C, book B, orders O
where C.custid=O.custid and B.bookid=O.bookid
order by name;

-- 같음
-- 주문자.아이디와 책.책아이디 안에 주문목록에 있는 주문자아이디와 책아이디가 있는 것
select C.name, B.bookname
from book B, customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders);	-- join

select* from orders;
select custid, bookid from orders;

-- 다름.  조건없는 join과 같음
-- (주문자.아이디 안에 있는 주문목록.아이디) + (북.북아이디 안에 있는 주문목록.북아이디)=각각 다 합해서 출력됨
select C.name,B.bookname
from customer C, book B
where C.custid in (select custid from orders) and B.bookid in (select bookid from orders);


	/*max*/
    -- 가장 비싼 도서의 이름
    select bookname from book
    where price = (select max(price) from book);
-- 서브쿼리 -> sql문 안에 또 다른 sql문이 들어가 있는 것alter

-- 도서를 구매한 이력이 있는 고객명
	select name from customer
	where custid in (select custid from orders);

	select distinct name 
    from customer, orders
	where orders.custid=customer.custid;
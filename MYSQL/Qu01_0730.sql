/*
1) 도서번호가 1인 도서의 이름
2) 가격이 2만원 이상인 도서의 이름
3) 박지성의 총구매금액
4) 박지성이 구매한 도서의 수
5) 박지성이 구매한 도서의 출판사 수
6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
7) 박지성이 구매하지 않은 도서의 이름

8) 마당서점 도서의 총개수
9) 마당서점에 도서를 납품하는 출판사의 총개수
10) 모든 고객의 이름, 주소
11) 2024년 7월 4일부터 2024년 7월 7일 사이에 주문된 도서의 목록
12) 성이 김씨인 고객의 이름과 주소
13) 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소
14) 주문 금액의 총액과  평균금액
15) 고객의 이름과 고객별 구매액
16) 고객의 이름과 고객이 구매한 도서목록
*/

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
select name, sum(saleprice)
from customer, orders
where customer.custid=orders.custid
group by name;


-- 16) 고객의 이름과 고객이 구매한 도서목록
select name, bookname
from customer, orders, book
where customer.custid=orders.custid and book.bookid=orders.bookid;
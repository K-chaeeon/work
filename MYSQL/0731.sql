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
select customer.name
from customer
where custid in (select custid from orders 
where bookid in (select bookid from book 
where publisher = '대한미디어'));

select customer.name from customer, book, orders
where orders.bookid=book.bookid 
	and customer.custid=orders.custid
    and book.publisher='대한미디어';


-- 



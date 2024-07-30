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
select custid as 아이디, count(*) as 주문수량 from Orders where saleprice>=8000 group by custid;



    



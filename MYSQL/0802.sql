				/*0802*/ 
    
    
    
	/*행번호 출력*/ -- p.231
    
-- 고객 목록에서 고객번호, 이름, 젆롸번호를 앞의 2명만 나타내기.
set @seq:=0;
select (@seq:=@seq+1) '순번', custid, name, phone
from Customer
where @seq < 2;


	/*서브쿼리 복습*/
select sum(saleprice)
from orders
where custid=(select custid
				from customer
				where name='박지성');
                
                
	
-- 각 고객의 평균 주문금액보다 큰 금액의 주문내역에 대해서 주문번호, 고객번호, 금액을 나타내세요
-- ?????????????
select name,avg(saleprice) from orders O, customer C where O.custid=C.custid group by C.custid;

select O.orderid, C.custid, O.saleprice
from orders O, customer C;


-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 판매금액
select orderid, saleprice
from orders
where saleprice>(select max(saleprice)
					from orders
					where custid='3');
                    
               
-- 고객번호가 2 이하인 고객의 판매액을 나타내시오(고객이름과 고객별 판매액 출력)
select cs.name, sum(od.saleprice) 'total'
from (select custid, name 
		from customer 
		where custid <= 2) cs, orders od 
where cs.custid=od.custid
group by cs.name;



	/*인덱스*/
		-- 값이 중복되지 않도록 걸기(쓸데없이 많이 걸면 속도 느려짐)
        -- unique 제약조건 달 수 있음-> 값이 중복되지 않게 인덱스 생성됨
        
-- 생성
create index ix_Book on Book(bookname);		-- create index 인덱스이름 on 테이블이름(칼럼);
		 drop index ix_Book on Book;		-- drop index 인덱스이름;
         
         











                
                
		
                
                
                
                
                
                
                
                
                
                
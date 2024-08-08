					/* 0808 */

select * from book;

		/*프로시저 정의*/ -- p.286
    -- 반복작업, 수정할 때 씀
    -- 칼럼
    
delimiter //
create procedure dorepeat(p1 int)
	begin
		set @x = 0;
        repeat set @x = @x + 1; 
        until @x > p1 end repeat;
	end //
        delimiter ;

call dorepeat(1000);

select @x;



	-- 삽입작업
    
use madangdb;
delimiter //
create procedure InsertBook(
in mybookid integer,
in mybookname varchar(40),
in mypublisher varchar(40),
in myprice integer)
	begin
		insert into Book(bookid, bookname, publisher, price)
			values(mybookid, mybookname, mypublisher, myprice);
	end //
    delimiter ;

call InsertBook(13, '스포츠과학', '마당과학서적', 25000);
select * from book;



		-- 제어문 사용 p.289
        -- 보고할 때..?
			-- begin ~ end : 함수에서의 {} 역할을 함. 프로그램 문을 블록화. 중첩 가능
			-- if - else - end if 
            
	-- declare =>변수선언
    
use madangdb;
delimiter //
create procedure bookinsertorupdate(
	mybookid integer,
    mybookname varchar(40),
    mypublisher varchar(40),
    myprice int)
begin
	declare mycount integer;
    select count(*) into mycount from book
		
        where bookname like mybookname;
	if mycount!=0 then
		set sql_safe_updates=0; /*delete, update 연산에 필요한 설정문*/
        update book set price = myprice
			where bookname like mybookname;
	else
		insert into book(bookid, bookname, publisher, price)
			values (mybookid, mybookname, mypublisher, myprice);
	end if;
end;
//
delimiter ;

call bookinsertorupdate(15, '스포츠의 즐거움', '마당과학서적', 25000);
select * from book;

call bookinsertorupdate(15, '스포츠의 즐거움', '마당과학서적', 20000);
select * from book;

		
		-- 결과를 반환하는 프로시저 p.292

delimiter //
create procedure averageprice(
	out Averageval integer)
begin
	select avg(price) into averageval
    from book
    where price is not null;
end;
//
delimiter ;
call averageprice(@myvalue);
select @myValue;



			/*트리거*/

set global log_bin_trust_function_creators = on;

create table book_log(
bookid_l integer,
bookname_l varchar(40),
publisher_l varchar(40),
price_l integer);

delimiter //
create trigger afterinsertbook
	after insert on book for each row
begin 
	declare average integer;
    insert into Book_log
    values(new.bookid, new.bookname, new.publisher, new.price);
end;
//
delimiter ;

insert into book values(14, '스포츠 과학 1', '이상미디어', 25000);

select * from book
where bookid=14;

select * from book_log 
where bookid_l='14';




		/*저장프로그램문법*/ -- p.300
        
        
        
        
        




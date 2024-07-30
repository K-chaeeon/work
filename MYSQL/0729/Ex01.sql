/*
create table tbl_name(
col_name col_datatype not null,
 ,
col_phone clo_name not null, unique,
 ,
primary key(col_name),
unique 
); 
*/

/*스키마=데이터베이스*/


CREATE TABLE `test`.`student` (
  `id` INT NOT NULL,
  `s_name` VARCHAR(40) NOT NULL,
  `s_phone` VARCHAR(20) NOT NULL,
  `s_gender` CHAR(1) NOT NULL,
  `s_addr1` VARCHAR(50) NOT NULL,
  `s_addr2` VARCHAR(50) NOT NULL,
  `s_email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `s_phone_UNIQUE` (`s_phone` ASC) VISIBLE);	/*ASC->오름차순



/* 명령어*/


/*데이터베이스 변경하는 방법
use 변경할데이터베이스이름 
네비게이터에서 더블클릭하는 것과 같음(mysql 전용)
*/
use test;
use sakila;

describe student; /*데이터베이스 불러오기*/

show databases; /*mysql에 있는 데이터 다 보여줌*/

use mysql;
show tables;
describe user; 

select * from user;

/*
행->투플,로우, 레코드
열->칼럼, 데이터, 필드
*/

use test;
describe student;
select * from student;

drop tables book; /*테이블 삭제*/

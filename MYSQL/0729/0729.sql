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

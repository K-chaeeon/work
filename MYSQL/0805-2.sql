create database highschool;

create table student(
s_id integer auto_increment,		-- 숫자 자동으로 붙여줌
s_name VARCHAR(40) NOT NULL,
s_year varchar(4) NOT NULL,
s_grade varchar(2) NOT NULL,
s_class varchar(2) NOT NULL,
s_num int not null,
s_pass VARCHAR(20) NOT NULL DEFAULT 1234,
primary key (s_year, s_grade, s_class, s_num)
);


create table teacher(
t_id varchar(20) not null primary key,
t_pass varchar(40) not null,
t_name varchar(20) not null,
t_subject varchar(10) not null,
t_type int(1) default 4 null
);

 
create table lesson(	-- 다른날 다른학기 다른학년에서 같은 강의 이름이 생길 수 있으므로 l_id가 유니크가 될 수 없음
l_id integer auto_increment primary key,
t_id varchar(20) not null,
l_name varchar(30) not null,
l_year varchar(4) not null,
l_sem varchar(2) not null,	-- 학기
l_grade varchar(2) not null,
l_class varchar(2) null, -- 선택과목일 경우
l_day char(6) not null,
l_time varchar(2) not null,
l_room varchar(16) null, 
foreign key (t_id) references teacher(t_id)
);


create table chulsuk(
l_id integer not null,
s_id integer not null,
primary key(s_id, l_id),
foreign key(s_id) references student(s_id),
foreign key(l_id) references lesson(l_id)
);

create table perform(	-- 수행평가
p_id integer auto_increment primary key,
p_title varchar(100) not null,
p_type char(1) null,
p_content varchar(500) not null,
p_criteria varchar(100) null,		-- 평가기준
p_start date not null,
p_end date not null,
l_id integer not null,
foreign key(l_id) references lesson(l_id)
);


create table evaluation(		-- 성적
s_id integer not null,
p_id integer not null,
e_score integer not null,
e_check char(1) null,
e_checkdate date null,
primary key(p_id, s_id),
foreign key(s_id) references student(s_id),
foreign key(p_id) references perform(p_id)
);

/*
create table evaluation(
e_id integer auto_increment primary key,
s_id integer not null,
p_id integer not null,
e_score integer not null,
e_check char(1) null,
e_checkdate date null,
foreign key(s_id) references student(s_id),
foreign key(p_id) references perform(p_id)
);

이렇게도 가능
*/









	/*p.378*/
create database madanguniv;



create table professor(			-- 마스터테이블
ssn varchar(20) not null primary key,
name varchar(20) not null,
age varchar(6) not null,
rank_n varchar(30) null,
speciality varchar(60) null
);


create table department(
dno int not null primary key,
dname varchar(40) not null,
run varchar(20) not null,				
office varchar(40) null,
foreign key(run) references professor(ssn)
);

-- 다대다 관계인 테이블은 중간에 맵핑테이블(=릴레이션테이블)이 있어야 함
create table work_dept(
ssn varchar(20) not null,
dno int not null,
pec_time int not null default(0),
primary key(ssn, dno),
foreign key(ssn) references professor(ssn),
foreign key(dno) references department(dno)
);

create table graduate(
ssn varchar(20) not null primary key,
name varchar(20) not null,
dno int not null,
age varchar(6) not null,
deg_prog char(12) not null,
advisor varchar(20) null,		-- 참조하는 칼럼(ssn)과 타입이 같아야함 
foreign key(dno) references department(dno), 	
foreign key(advisor) references graduate(ssn) -- 같은 테이블끼리 참조함. 학생조언자가 없을 수 있으므로 null
);

create table project(
pid integer auto_increment primary key,
manager varchar(20) not null,	
sponsor varchar(80) null,
start_date date not null,
end_date date not null,
budget varchar(50) null, 
foreign key(manager) references graduate(ssn)

);

create table work_in(
pid integer not null,
ssn varchar(20) not null,
primary key(pid, ssn),
foreign key(pid) references project(pid),
foreign key(ssn) references graduate(ssn)
);

create table work_prog(
pid integer not null,
ssn varchar(20) not null,
primary key(pid, ssn),
foreign key(pid) references project(pid),
foreign key(ssn) references graduate(ssn)
);





/*
10번 과제는 한 사람 이상의 교수(공동연구책임자)에 의해 수행된다
1. 프로젝트 테이블에 매니저 칼럼을 만들어서 그 칼럼이 교수테이블을 참조
	->work_in 테이블에 프로젝트아이디, 교수아이디를 참조하는 칼럼이 두 개인 테이블을 만든다. 
    그럼 work_in 테이블은 무조건 공동연구책임자만 들어가는 테이블이 된다.
2. 프로젝트 테이블에서 매니저 칼럼 만들지 않고 work_in 테이블에 프로젝트 아이디, 교수 아이디를 참조해온 후 
교수의 롤(매니저와 공동연구 책임자)칼럼을 만든다
	->프젝에 참여하는 모든 교수가 들어가있음
*/

/*
11번 한 과제는 한 명 이상의 대학원생(연구조교)에 의해 수행된다
(orders테이블은 따로 orderid를 만들지 않고 커스터머아이디와 북아이디를 복함키로 해서 프라이머리키로 쓸 수 있는데 따로 orderid를 만든 이유
	->한 사람이 재주문하는 경우가 있으므로 주문상황을 각각 따로 구분할 수 있도록 오더아이디를 따로 만들었음)
    
그러나 11번 문제는 중복되는 일(한 과제에 한명의 대학원이 중복으로 입력되는 경우)이 있으면 안 되므로 
따로 id칼럼을 생성하지 않고 아예 중복상황이 입력되지 않도록 막아야 함

*/




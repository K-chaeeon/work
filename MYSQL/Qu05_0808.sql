/*
푸드코트 ERD- 요구사항

나는 주말에 아이들과 A마트 푸트코트를 자주 이용한다. 
A마트 푸트코트에는 상히이, 한성면옥, 전주한식, 돈이돈가스 음식코너가 있고, 각각 다섯 개 이상의 메뉴를 갖고 있다.
나와 아이들은 각자 원하는 음식을 주문 기계롤 주문한다.
큰 아이는 두가지 음식을 시키기도 한다.
주문을 한 후 주문번호가 적힌 주문서를 가지고 기다리면 음식이 나온다.
음식은 주문서와 교환하여 받아온다.

*/
/*
A마트 푸드코트>음식점

주문결제(키오스크 입력)-주문번호(자동생성)
				식당id(여러개 가능)
				(메뉴(여러개 가능)-갯수-가격
                결제)
                


가게-가게번호, 가게이름, 메뉴, 가격

메뉴	메뉴id 메뉴이름 가격 가게id

손님-주문번호(주문>주문번호 참조)

=====

식당목록 -(식당id 메뉴) 이름 음식이름 주문번호 

주문 (주문번호) zldhtmzm메뉴 식당id 손님입력

손님 주문번호


A가게 누적3개 / B가게 누적 5개


--- 푸드코트 ERD- 요구사항

1. 코너테이블
상하이, 한성면옥, 전주한식, 돈이돈가스 음식코너가 있고, 
2. 메뉴테이블
각각 다섯 개 이상의 메뉴를 갖고 있다.
3. 주문테이블
원하는 음식을 주문 기계롤 주문한다.
4. 하나의 주문에서 같은 코너면 주문번호가 같다. 다른 코너면 주문번호가 다르다.
큰 아이는 두가지 음식을 시키기도 한다.
5. 수량
6. 주문을 한 후 주문번호가 적힌 주문서를 가지고 기다리면 음식이 나온다.
7. 음식은 주문서와 교환하여 받아온다.

*/



create table corner(
	corner_id varchar(6) primary key,
    corner_name varchar(20) not null
    );
    
create table menu(
	menu_id varchar(6) primary key,
    menu_name varchar(20) not null,
    price integer not null,
    corner_id varchar(6),
    foreign key (corner_id) references corner(corner_id)
    );
    
create table orders(
	order_id varchar(6) not null,
    menu_id varchar(6) not null,
    cnt integer not null,
    order_date date not null,
    status char(1) null,	-- 접수중, 픽업대기, 픽업완료
    foreign key (menu_id) references menu(menu_id),
    saleprice integer,
    primary key(order_id, menu_id, order_date)
);






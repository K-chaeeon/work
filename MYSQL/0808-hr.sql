/*
--- 문자열 처리 문제
1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.

--- Date 타입 처리 문제
1. 1987년에 입사한 사원의 이름을 출력하세요.
2. 사원의 이름, 입사년도, 근무년수를 출력하세요.
3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
4. 6월에 입사한 사원의 이름과 성을 출력하세요.
hire date에서 month만 가져오기
5. 부서별, 연도별 입사한 사원의 수를 구하세요.
그룹바이-부서,연도 순으로 
*/

/*
SELECT first_name, 
       GROUP_CONCAT(last_name) AS 'last_name'
  FROM vw_full_name
 GROUP BY first_name;
 
create view vw_full_name(first_name, last_name)
as select e.first_name, e.last_name
from employees e;
*/

/* first_name 과 last_name을 합친 후 뷰 포인트 만들기..? */


create view vw_info(employee_id, first_name, last_name, email, phone_number, salary)
as select e.employee_id, e.first_name, e.last_name, e.email, e.phone_number, e.salary
from employees e;

    select * from vw_info;
    select * from employees;
    
	-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
select *
from vw_info
where length(first_name)+length(last_name)>=8;


-- 2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.

select *
from vw_info
where btw A-Z


-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
select first_name, last_name
from employees
where first_name = '_c%';


-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
select trim(street_address)
from locations
where length(street_address)=(select min(length(street_address)) from locations);



-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 
-- 이름과 이름의 길이를 출력하세요.
select first_name
from employees
where first_name='A%' and
;






-- 1. 1987년에 입사한 사원의 이름을 출력하세요.



-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요.

select 


-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.










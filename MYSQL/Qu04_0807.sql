/*
1. 성(last name)이 Matos와 Taylor인 직원의 성, 직무 ID(job_id), 시작 날짜(start date)를 출력하는 보고서를 작성하세요. 쿼리를 시작 날짜 기준 오름차순으로 정렬하세요.

2. 1994년에 고용된 모든 직원의 성(last name)과 해고 날짜(fire date)를 출력하는 보고서가 인사부서에 필요합니다.
 
3. 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 성(last name), 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요.
 
4. 매니저 수를 나열하지 않고 구하세요. 열 이름을 '매니저 수(Number of Managers)'로 표시하세요.(매니저수만)
 
5. 매니저의 번호(manager number)와 해당 매니저 밑에서 가장 낮은 급여를 받는 직원의 급여를 출력하는 보고서를 작성하세요. 매니저가 알려지지 않은 경우와 최소 급여가 $6,000 이하인 그룹은 제외하세요. 출력 값을 급여 내림차순으로 정렬하세요.

6. 직원의 성(last name)과 직원 번호(employee number), 그리고 그들의 매니저의 성(last name)과 매니저 번호(manager number)를 함께 출력하는 보고서를 작성하세요. 열 이름은 각각 'Employee', 'Emp#', 'Manager', 'Mgr#'로 표시하세요.

7. 주어진 직원과 같은 부서에서 일하는 모든 직원의 성(last name), 부서 번호(department number)를 출력하는 보고서를 인사부서에 작성하세요.
 
8. 임원 부서(Executive department)에 있는 모든 직원의 부서 번호(department number), 성(last name), 직무 ID(job_id)를 출력하는 보고서를 작성하세요.

9. King에게 보고하는 모든 직원의 성(last name)과 급여(salary)를 출력하는 보고서를 작성하세요.
 
10. 'ST_CLERK' 직무 ID를 포함하지 않는 부서의 부서 ID 목록이 인사부서에 필요합니다.*/



-- 1. 성(last name)이 Matos와 Taylor인 직원의
-- 성, 직무 ID(job_id), 시작 날짜(start date)를 출력하는 보고서를 작성하세요. 쿼리를 시작 날짜 기준 오름차순으로 정렬하세요.
select e.last_name, e.job_id, e.hire_date
from employees e
where last_name = 'Matos' or last_name = 'Taylor'
order by hire_date;

-- 2. 1994년에 고용된 모든 직원의 성(last name)과 해고 날짜(fire date)를 출력하는 보고서가 인사부서에 필요합니다.
select last_name, hire_date
from employees
where date_format(hire_date, '%Y') = '1994'; 


-- 3. 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 
-- 성(last name), 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요.









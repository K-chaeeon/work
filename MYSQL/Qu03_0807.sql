
-- desc 테이블이름 -> 테이블 칼럼 타입 출력

/*
1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 
department_id를 last_name에 대하여 오름차순으로 출력하세요.
5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.
/*







-- 1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
select count(*) from employees;
select count(*) from departments;

-- 2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
select employee_id, last_name, job_title, hire_date
from employees, jobs
where employees.job_id = jobs.job_id;
/*select e.employee_id, e.last_name, j.job_title, e.hire_date
from employees e, jobs j
where e.employees.job_id = j.job_id;*/

-- 3 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 
-- 성(last name), 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요.
select last_name, salary 
from employees
where salary>=12000;
desc employees;

-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 
-- department_id를 last_name에 대하여 오름차순으로 출력하세요.
select d.department_name, e.last_name
from departments d, employees e
where e.department_id = d.department_id
	and e.department_id in(20, 50)
order by e.last_name;

-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.

select last_name from employees
where last_name like '__a%';

-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
select job_id, count(*) from employees
group by job_id
having count(job_id)>=2;

-- 7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
select max(salary) - min(salary) 
from employees;
-- '직업별' 최대급여와 최소급여의 차를 구하시오
select job_title, max_salary- min_salary '차이'
from jobs;


-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.

select e.last_name, j.job_title, d.department_id, d.department_name
from departments d, employees e, locations l, jobs j
where l.location_id = d.location_id 
and d.department_id = e.department_id
and j.job_id = e.job_id
and l.city = 'Toronto';








	select * from EMP; 
    select * from dept;
    select * from salgrade;
    -- 등급별 최소급여,최대급여
    
    
    -- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요.
		select ename '사원이름', job '사원직위'
        from emp;
	
    
	-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요.
		select ename, sal
		from emp
        where deptno = 30;
		
    
    
    -- 3) 사원번호와 이름, 현재 급여, 증가한 급여분(열 이름은 '증가액'), 10% 인상된 급여(열 이름은 '인상된 급여')를 사원번호순으로 출력하세요.
		select empno, ename, comm '증가액', sal+(sal*0.1)'인상된 급여'
        from emp
        order by empno;
        
        
	-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
		select ename, deptno
        from emp
        where ename like 'S%';
        
        
	-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
		select ename, round(max(sal),1) 'MAX', round(min(sal),1) 'MIN', round(sum(sal),1) 'SUM', round(avg(sal),0) 'AVG'
        from emp
        group by ename;
    
    
	-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
		select job '업무', count(empno)'업무별 사원수'
        from emp
		group by job;
    
    -- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
		select max(sal)-min(sal)
        from emp;
        
        
	-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
		select count(empno), sum(empno), avg(empno)
        from emp
        where deptno = 30;
    
    
    
    -- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요.
	-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서, 업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다.
	-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하세요.
	-- 12) EMP테이블에서 이름, 겹여, 커미션(COMM)금액, 총액(SAL+COMM)을 구하여 총액이 많은 순서대로 출력하세요. 단 커미션이 NULL인 사람은 제외합니다.
	-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
	-- 14) 사원이 한 명도 없는 부서의 이름을 출력하세요.
	-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하세요.
	-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하세요.
	-- 17) 사원의 이름과 사원의 부서를 출력하세요.
	-- 18) 사원의 이름과 팀장(MGR)의 이름을 출력하세요.
	-- 19) 사원 SCOTT보다 급여를 많이 받는 사람의 이름을 출력하세요.
	-- 20) 사원 SCOTT이 일하는 부서번호 혹은 DALLAS에 있는 부서번호를 출력하세요.	
    
    
    
    
    
			/*0806*/
            
            
	/*식별관계, 비식별관계*/
    -- 식별관계: 참조한 칼럼이 현재 테이블의 프라이머리 키가 되면 현재 테이블과 참조테이블은 식별관계
    -- 비식별: 참조한 칼럼이 현재 테이블의 프라이머리 키가 아닌 것
    
    
    
		/*정규화*/ -- p.395
        -- 제1정규형 : 한 칼럼엔 하나의 값만 들어가야함
			-- 고객 취미들(이름,취미1,취미2,...)=> X
			-- 고객 취미(이름,취미1=> X
            
		-- 제2정규형 : 한 테이블은 하나의 정보만 가져야함(학생테이블에 강의실 칼럼 들어가는 거 X)
			-- 계절수강 테이블-> 학생, 강좌이름 칼럼
            -- 수강료 테이블->강좌이름, 비용
            
		-- 제3정규형
			-- 한 테이블에 다 때려넣으면 안 되고 이런식으로 브릿지 역할을 하는 칼럼 사용해야함
                
						-- 제2정규형과 제3정규형의 차이...?
                
                
                
                
                
		/*정규화 연습(부동산 데이터베이스)*/ -- p.432
        
        
        
        
        
        
        /*데이터베이스 보안과 관리*/ 
        
create user madang@localhost identified by '1234';         
        
	show databases;
	use mysql;
	desc user;
	select * from user;
        
create user mdguest@localhost identified by '1234';   

      drop user mdguest@localhost;
      
		/*권한부여*/
        
        grant all privileges on madang.* to madang@localhost;
        
        flush privileges;	/*권한 밀어주기*/
        
        show grants for madang@localhost;
        
        grant select on madangdb.book to mdguest@localhost;
        
        
        
        /*백업 및 복원*/
        
        -- sql로 내보내기
        -- dump export
			-- 왼쪽 네비게이션>administration>data export
        
        
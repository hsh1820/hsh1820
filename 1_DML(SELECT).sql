-- 전체 사원 정보 조회
SELECT
    *
FROM
    employee;

-- EMPLOYEE 테이블에서 사번, 이름, 월급 모두 조회

SELECT
    emp_id,
    emp_name,
    salary
FROM
    employee;

SELECT
    *
FROM
    employee;

-- 실습문제 --
-- 1. JOB 테이블의 보든 정보를 조회

SELECT
    *
FROM
    job;
-- 2. JOB 테이블의 직급명만 조회

SELECT
    job_name
FROM
    job;
-- 3. DEPARTMENT 테이블의 모든 정보 조회

SELECT
    *
FROM
    department;
-- 4. EMPLOYEE 테이블의 이름, 이메일, 전화번호, 고용일 조회

SELECT
    emp_name,
    email,
    phone,
    hire_date
FROM
    employee;
-- 5. EMPLOYEE 테이블의 고용일, 사원명, 월급 조회

SELECT
    hire_date,
    emp_name,
    salary
FROM
    employee;

-- 컬럼 값 산술 연산
-- EMPLOYEE 테이블에서 직원의 이름과 연봉 조회

SELECT
    emp_name,
    salary * 12
FROM
    employee;
    
-- EMPLOYEE 테이블에서 직원의 이름과 연봉 조회, 보너스가 반영된 연봉

SELECT
    emp_name,
    salary * 12,
    ( salary + ( salary * bonus ) ) * 12
FROM
    employee;
-- 산술 연산 시 NULL 값이 포함되어 있으면 결과가 NULL이 됨.

---- 실습문제 ----
-- 1. EMPLOYEE 테이블에서 이름, 연봉, 총수령액(연봉+보너스), 실수령액(총 수령액 - 세금3%)
select Emp_name as 이름 , salary*12 as 연봉, (salary*12)+ bonus as 총수령액, (salary*12)+ bonus-(((salary*12)+ bonus)*0.3) as 실수령액
from Employee;
-- 2.EMPLOYEE 테이블에서 
-- 이름, 고용일, 근무일수(오늘 날짜 - 고용일) 조회
-- *DATE 형식 끼리는 산술 연산가능
-- *현재 시간(날짜)를 조회하는 키워드 == SYSDATE
select emp_name, hire_date,to_date(to_char(sysdate-hire_date,'yy/mm/dd')) as 근무일수
from EMPLOYEE;

select * from EMPLOYEE;

SELECT to_char(trunc(sysdate,'dd')  ) FROM dual ; 

select (mod((trunc(sysdate)-hire_date),12) ) as 년월일 from employee;

   select
 to_date('20090301', 'yyyymmdd')+1 - to_date('20090225', 'yyyymmdd')
from dual;

select 
trunc(sysdate-hire_date)
from employee;

-- EMPLOYEE 테이블에서 직원의 이름과 연봉(별칭 : 연봉(원)),
-- 보너스가 반영된 연봉(별칭 : 총 소득(원)), 조회하기
-- (보너스가 반영된 연봉 = (급여+(급여*보너스)) *12
select emp_name, 
salary*12 as "연봉(원)", 
(salary*12)+((salary*12)*bonus) as "총 소득(원)"
from employee;

-- 리터럴

-- EMPLOYEE 테이블에서 직원의 
-- 사번, 이름, 급여, 단위(데이터 : 원) 조회
select emp_id, emp_name, salary,
'원' as 단위 
from employee;

-- DISTINCT
-- 컬럼에 포함된 중복값을 한 번씩만 표시하고자 할 때 
-- 사용하는 키워드

-- EMPLOYEE 테이블에서 직원의 직급 코드 조회
select * from employee;
select job_code from employee;
-- EMPLOYEE 테이블에서 직원의 직급 코드 중복 제거하여 조회
select DISTINCT job_code from employee ;

-- ***** where 절 *****
-- 조회할 테이블에서 조건이 맞는 값을 가진 행을 골라내는 구문
/* [표현식]
SELECT 컬럼명
FROM 테이블명
WHERE 조건식;
*/

-- * 비교연산자
-- =(같다), > (크다), < (작다) >= (크거나같다), <=(작거나 같다)
-- !=, ^=, <> (같지않다)
select * from employee;
-- EMPLOYEE 테이블에서 부서코드가 'D9'인 직원의 이름, 부서코드 조회
select emp_name, employee.dept_code
from employee
where dept_code = 'D9';
-- EMPLOYEE 테이블에서 급여가 4000000 이상인 직원의 이름, 급여 조회
select emp_name, salary
from employee
where salary > 4000000 ;
-- EMPLOYEE 테이블에서 부서코드가 D9가 아닌 사원의 사번, 이름, 부서코드 조회
select emp_id, emp_name,dept_code 
from employee
where dept_code <> 'D9';

-- EMPLOYEE 테이블에서 퇴사 여부가 N 인 직원을 조회하고
-- 근무 여부를 '재직중' 으로 표시하여
-- 사번, 이름, 고용일, 근무여부를 조회
select emp_id, emp_name,hire_date,'재직중' as 근무여부
from employee
where ent_yn = 'N';

-- EMPLOYEE 테이블에서
-- 실 수령액(총수령액(연봉+보너스) - (연봉*세금 %3)이 5천만원 이상인 사원의 
-- 이름, 월급, 실수령액, 고용일 조회
select emp_name, salary,((salary + (salary*bonus))*12)-(salary*12*0.03) as 실수령액, hire_date
from employee
where ((salary+(salary*bonus))*12)-(salary*12*0.03) >= 50000000;

-- EMPLOYEE 테이블에서 부서코드가 'D6' 이고
-- 급여를 200만 이상 받는 직원의
-- 이름, 부서코드, 급여를 조회
select emp_name, dept_code, salary
from employee
where dept_code = 'D6' and salary > 2000000;
-- EMPLOYEE 테이블에서 부서코드가 'D6' 이거나
-- 급여를 200만 이상 받는 직원의
-- 이름, 부서코드, 급여를 조회
select emp_name, dept_code, salary
from employee
where dept_code = 'D6' or salary > 2000000;

-- EMPLOYEE 테이블에서 
-- 급여를 350만원 이상 600만원 이하로 받는 직원의
-- 사번, 이름, 급여, 부서코드, 직급코드를 조회
select emp_name, dept_code, salary, dept_code, job_code
from employee
where salary > 3500000 and salary > 6000000;

select *
from employee;

-- 실습 문제 -- 
-- 1. EMPLOYEE 테이블에서 월급이 4000000이상이고 job_code가 j2인 사원의 전체 내용 조회
select *
from employee
where salary > 4000000 and job_code = 'J2';
-- 2. EMPLOYEE 테이블에서 dept_code가 d9이거나 d5인 사원중
-- 고용일이 02년 1월 1일 보다 빠른 사원의
-- 이름, 부서코드, 고용일 조회
-- tip 다중 조건일 경우 순서 중요 먼저 조건을 검색해야되는 경우 괄로를 묶을 것
select emp_name, dept_code, hire_date
from employee
where (dept_code = 'D9' or dept_code = 'D5') and hire_date < '020101';

-- BETWEEN 'a' and 'b'
-- >> a 이상 b 이하

-- EMPLOYEE 테이블에서 
-- 급여를 350만원 이상 600만원 이하로 받는 직원의
-- 사번, 이름, 급여, 부서코드, 직급코드를 조회
select emp_id, emp_name, salary, dept_code
from employee
where salary BETWEEN 3500000 and 6000000;

-- EMPLOYEE 테이블에서 
-- 급여를 350만원 미만 600만원 초과로 받는 직원의
-- 사번, 이름, 급여, 부서코드, 직급코드를 조회
select emp_id, emp_name, salary, dept_code
from employee
where salary NOT BETWEEN 3500000 and 6000000;
-- NOT 키워드는 컬럼명 또는 BETWEEN 앞에 붙이는게 가능

-- EMPLOYEE 테이블에서 
-- 고용일이 '90/01/01' ~ '01/01/01' 인 사원의 
-- 모든 정보 조회
select *
from EMPLOYEE
where HIRE_DATE between '900101' and '010101';




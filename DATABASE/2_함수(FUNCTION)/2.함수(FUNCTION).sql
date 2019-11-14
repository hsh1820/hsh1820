-- 함수(FUCTION)
-- 컬럼의 값을 읽어서 계산한 결과를 리턴함

-- 단일행(SINGLE ROW) 함수
--> 컬럼에 기록된 N개의 값을 읽어서 N개의 결과를 리턴

-- 그룹(GROUP) 함수
--> 컬럼에 기록된 N개의 값을 읽어서 1개의 결과를 리턴



----------------------------------------------------------------------

-- 1. 문자 관련 함수
-- LENGTH(문자) / LENGTHB(문자의 바이트 길이)
SELECT LENGTH('오라클'), LENGTHB('오라클')
-- 오라클 11G XE 버전은 문자1개를 3BYTE로 취급
-- NVARCHAR2 : 문자 1개를 유니코드 값으로 받아서 문자 1개당 2BYTE로 변수타입 변경가능
FROM DUAL;
/*
오라클 Express Edtion (XE버전)은
한글을 3byte로 인식

2byte로 인식 시키고 싶을 경우
저장되는 컬럼의 타입을 NVARCHAR2로 지정
*/

-- EMPLOYEE 테이블에서
-- 모든 사원의 이름, 이메일, 이메일 길이, 이메일 바이트 크기 조회
SELECT EMP_NAME, EMAIL, LENGTH(EMAIL), LENGTHB(EMAIL)
FROM employee;

----------------------------------------------------------------------
-- INSTR
--> INSTR('문자열' | '컬럼명', '문자', 찾을 위치의 시작값, [순번])
-- 순번생략시 기본값 : 1 

SELECT INSTR('AABAACAABBAA','B',4,2) 
FROM DUAL;

----------------------------------------------------------------------
-- LTRIM / RTRIM 은 자습할때 한번씩 사용

-- TRIM
-- 주어진 컬럼이나 문자열의 앞 / 뒤 / 양쪽에 있는 지정한 문자를 제거
-- 문자를 지정하지 않은 경우 공백제거
-- 제거한 위치를 지정하지 않은 경우 양쪽 공백제거가 기본값
-- 메모리를 줄이고, 오류를 줄일 수 있는 가장 쉬운 방법
SELECT TRIM('            백동현                 ') FROM DUAL;

-- 양쪽 문자 제거
SELECT TRIM( BOTH 'Z' FROM 'ZZZKHZZZ') FROM DUAL;
SELECT TRIM('Z' FROM 'ZZZKHZZZ') FROM DUAL;

-- 앞쪽 문자 제거
SELECT TRIM(LEADING 'Z' FROM 'ZZZKHZZZ ') FROM DUAL;

-- 뒤쪽 문자 제거
SELECT TRIM(TRAILING 'Z' FROM 'ZZZKHZZZ') FROM DUAL;

----------------------------------------------------------------------
-- ** SUBSTR
-- 컬럼이나 문자열에서 지정한 위치부터 지정한 개수의 문자열을
-- 잘라내어 반환 ( 자바에 String subString()과 유사함)
-- 공백도 하나의 문자로 간주함
--> SUBSTR(STRING, POSITION , [LENGTH])
----> STRING : 문자 타입 컬럼 또는 문자열
----> POSITION : 문자열을 잘라낼 위치, 양수면 시작방향부터, 음수면 끝방향 기준
----> LENGTH : 반환할 문자 개수(생략 시 끝까지) (음수 작성시 NULL 리턴)
SELECT SUBSTR('SHOWMETHEMONEY',1,4) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',4) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',5,2) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',7,3) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',-8,3) FROM DUAL;

-- EMPLOYEE 테이블에서
-- EMP_NAME, EMAIL@이후를 제외한 아이디 조회
SELECT EMP_NAME, SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1)
FROM EMPLOYEE;

-- REPLACE
-- 컬럼의 문자 또는 문자열에서 특정 문자(열)을 지정한 문자(열)로 변환 후 반환 
--> REPLACE(STRING, 변환전 문자(열), 변환후 문자(열))
SELECT REPLACE('서울시 강남구 역삼동', '역삼동', '삼성동') FROM DUAL;

SELECT EMAIL, REPLACE(EMAIL,'kh.or.kr', 'gmail.com') as 변환후
from employee;

----------------------------------------------------------------------

-- ROUND : 반올림
--> ROUND( 숫자 | 숫자로된 컬럼 [, 위치])
SELECT ROUND(123.456) FROM DUAL;
SELECT ROUND(123.678) FROM DUAL;
-- 반올림하여 소수점 첫 째자리 까지 조회
SELECT ROUND(123.456,1) FROM DUAL;
SELECT ROUND(123.456,2) FROM DUAL;

SELECT ROUND(123.456, -2) FROM DUAL;

----------------------------------------------------------------------


-- EXTRACT  : 년, 월, 일 정보를 추출하여 반환
-- EXTRACT(YEAR FROM 날짜타입) : 년도 반환
-- EXTRACT(MONTH FROM 날짜타입) : 월반환
-- EXTRACT(DAY FROM 날짜타입) : 일 반환

-- EMPLOYEE 테이블에서
-- 모든 사원의 이름, 입사 년도, 입사월, 입사일 조회
SELECT EMP_NAME, EXTRACT(YEAR FROM HIRE_DATE) "입사년도",
EXTRACT(MONTH FROM HIRE_DATE)"입사 월",
EXTRACT(DAY FROM HIRE_DATE) "입사 일"
FROM EMPLOYEE;


------------- 실습문제----------------------------
-- 1. EMPLOYEE 테이블에서 사원명, 입사일-오늘, 오늘-입사일 조회
-- 단, 별칭은 근무일수1, 근무일수2로 하고
-- 모두 정수처리, 양수가 되도록 처리
SELECT EMP_NAME,TRUNC(ABS (hire_date-SYSDATE)) AS 근무일수1, 
TRUNC(ABS(SYSDATE-HIRE_DATE)) AS 근무일수2
FROM EMPLOYEE;

-- 2. EMPLOYEE 테이블에서 사번이 홀수인 직원들의 정보 모두 조회
SELECT * 
FROM employee
WHERE  NOT MOD(EMP_ID,2) = 0;
-- 원칙적으로는 형변환을 통해 타입을 맞춰주는 것이 좋음
WHERE MOD(TO_NUMBER(EMP_ID),2)=1;
-- 3. EMPLOYEE 테이블에서 근무 년수가 20년(240개월) 이상인 직원 정보 조회
SELECT *
FROM employee
WHERE TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)) > 240;

-- 4. EMPLOYEE 테이블에서 사원명, 입사일, 입사한 월의 남은 근무일수를 조회
SELECT EMP_NAME, hire_date, LAST_DAY( HIRE_DATE)-hire_date 
FROM EMPLOYEE;

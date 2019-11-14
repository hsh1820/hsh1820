-- �Լ�(FUCTION)
-- �÷��� ���� �о ����� ����� ������

-- ������(SINGLE ROW) �Լ�
--> �÷��� ��ϵ� N���� ���� �о N���� ����� ����

-- �׷�(GROUP) �Լ�
--> �÷��� ��ϵ� N���� ���� �о 1���� ����� ����



----------------------------------------------------------------------

-- 1. ���� ���� �Լ�
-- LENGTH(����) / LENGTHB(������ ����Ʈ ����)
SELECT LENGTH('����Ŭ'), LENGTHB('����Ŭ')
-- ����Ŭ 11G XE ������ ����1���� 3BYTE�� ���
-- NVARCHAR2 : ���� 1���� �����ڵ� ������ �޾Ƽ� ���� 1���� 2BYTE�� ����Ÿ�� ���氡��
FROM DUAL;
/*
����Ŭ Express Edtion (XE����)��
�ѱ��� 3byte�� �ν�

2byte�� �ν� ��Ű�� ���� ���
����Ǵ� �÷��� Ÿ���� NVARCHAR2�� ����
*/

-- EMPLOYEE ���̺���
-- ��� ����� �̸�, �̸���, �̸��� ����, �̸��� ����Ʈ ũ�� ��ȸ
SELECT EMP_NAME, EMAIL, LENGTH(EMAIL), LENGTHB(EMAIL)
FROM employee;

----------------------------------------------------------------------
-- INSTR
--> INSTR('���ڿ�' | '�÷���', '����', ã�� ��ġ�� ���۰�, [����])
-- ���������� �⺻�� : 1 

SELECT INSTR('AABAACAABBAA','B',4,2) 
FROM DUAL;

----------------------------------------------------------------------
-- LTRIM / RTRIM �� �ڽ��Ҷ� �ѹ��� ���

-- TRIM
-- �־��� �÷��̳� ���ڿ��� �� / �� / ���ʿ� �ִ� ������ ���ڸ� ����
-- ���ڸ� �������� ���� ��� ��������
-- ������ ��ġ�� �������� ���� ��� ���� �������Ű� �⺻��
-- �޸𸮸� ���̰�, ������ ���� �� �ִ� ���� ���� ���
SELECT TRIM('            �鵿��                 ') FROM DUAL;

-- ���� ���� ����
SELECT TRIM( BOTH 'Z' FROM 'ZZZKHZZZ') FROM DUAL;
SELECT TRIM('Z' FROM 'ZZZKHZZZ') FROM DUAL;

-- ���� ���� ����
SELECT TRIM(LEADING 'Z' FROM 'ZZZKHZZZ ') FROM DUAL;

-- ���� ���� ����
SELECT TRIM(TRAILING 'Z' FROM 'ZZZKHZZZ') FROM DUAL;

----------------------------------------------------------------------
-- ** SUBSTR
-- �÷��̳� ���ڿ����� ������ ��ġ���� ������ ������ ���ڿ���
-- �߶󳻾� ��ȯ ( �ڹٿ� String subString()�� ������)
-- ���鵵 �ϳ��� ���ڷ� ������
--> SUBSTR(STRING, POSITION , [LENGTH])
----> STRING : ���� Ÿ�� �÷� �Ǵ� ���ڿ�
----> POSITION : ���ڿ��� �߶� ��ġ, ����� ���۹������, ������ ������ ����
----> LENGTH : ��ȯ�� ���� ����(���� �� ������) (���� �ۼ��� NULL ����)
SELECT SUBSTR('SHOWMETHEMONEY',1,4) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',4) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',5,2) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',7,3) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY',-8,3) FROM DUAL;

-- EMPLOYEE ���̺���
-- EMP_NAME, EMAIL@���ĸ� ������ ���̵� ��ȸ
SELECT EMP_NAME, SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1)
FROM EMPLOYEE;

-- REPLACE
-- �÷��� ���� �Ǵ� ���ڿ����� Ư�� ����(��)�� ������ ����(��)�� ��ȯ �� ��ȯ 
--> REPLACE(STRING, ��ȯ�� ����(��), ��ȯ�� ����(��))
SELECT REPLACE('����� ������ ���ﵿ', '���ﵿ', '�Ｚ��') FROM DUAL;

SELECT EMAIL, REPLACE(EMAIL,'kh.or.kr', 'gmail.com') as ��ȯ��
from employee;

----------------------------------------------------------------------

-- ROUND : �ݿø�
--> ROUND( ���� | ���ڷε� �÷� [, ��ġ])
SELECT ROUND(123.456) FROM DUAL;
SELECT ROUND(123.678) FROM DUAL;
-- �ݿø��Ͽ� �Ҽ��� ù °�ڸ� ���� ��ȸ
SELECT ROUND(123.456,1) FROM DUAL;
SELECT ROUND(123.456,2) FROM DUAL;

SELECT ROUND(123.456, -2) FROM DUAL;

----------------------------------------------------------------------


-- EXTRACT  : ��, ��, �� ������ �����Ͽ� ��ȯ
-- EXTRACT(YEAR FROM ��¥Ÿ��) : �⵵ ��ȯ
-- EXTRACT(MONTH FROM ��¥Ÿ��) : ����ȯ
-- EXTRACT(DAY FROM ��¥Ÿ��) : �� ��ȯ

-- EMPLOYEE ���̺���
-- ��� ����� �̸�, �Ի� �⵵, �Ի��, �Ի��� ��ȸ
SELECT EMP_NAME, EXTRACT(YEAR FROM HIRE_DATE) "�Ի�⵵",
EXTRACT(MONTH FROM HIRE_DATE)"�Ի� ��",
EXTRACT(DAY FROM HIRE_DATE) "�Ի� ��"
FROM EMPLOYEE;


------------- �ǽ�����----------------------------
-- 1. EMPLOYEE ���̺��� �����, �Ի���-����, ����-�Ի��� ��ȸ
-- ��, ��Ī�� �ٹ��ϼ�1, �ٹ��ϼ�2�� �ϰ�
-- ��� ����ó��, ����� �ǵ��� ó��
SELECT EMP_NAME,TRUNC(ABS (hire_date-SYSDATE)) AS �ٹ��ϼ�1, 
TRUNC(ABS(SYSDATE-HIRE_DATE)) AS �ٹ��ϼ�2
FROM EMPLOYEE;

-- 2. EMPLOYEE ���̺��� ����� Ȧ���� �������� ���� ��� ��ȸ
SELECT * 
FROM employee
WHERE  NOT MOD(EMP_ID,2) = 0;
-- ��Ģ�����δ� ����ȯ�� ���� Ÿ���� �����ִ� ���� ����
WHERE MOD(TO_NUMBER(EMP_ID),2)=1;
-- 3. EMPLOYEE ���̺��� �ٹ� ����� 20��(240����) �̻��� ���� ���� ��ȸ
SELECT *
FROM employee
WHERE TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)) > 240;

-- 4. EMPLOYEE ���̺��� �����, �Ի���, �Ի��� ���� ���� �ٹ��ϼ��� ��ȸ
SELECT EMP_NAME, hire_date, LAST_DAY( HIRE_DATE)-hire_date 
FROM EMPLOYEE;

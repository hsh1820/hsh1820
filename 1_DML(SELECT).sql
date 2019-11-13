-- ��ü ��� ���� ��ȸ
SELECT
    *
FROM
    employee;

-- EMPLOYEE ���̺��� ���, �̸�, ���� ��� ��ȸ

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

-- �ǽ����� --
-- 1. JOB ���̺��� ���� ������ ��ȸ

SELECT
    *
FROM
    job;
-- 2. JOB ���̺��� ���޸� ��ȸ

SELECT
    job_name
FROM
    job;
-- 3. DEPARTMENT ���̺��� ��� ���� ��ȸ

SELECT
    *
FROM
    department;
-- 4. EMPLOYEE ���̺��� �̸�, �̸���, ��ȭ��ȣ, ����� ��ȸ

SELECT
    emp_name,
    email,
    phone,
    hire_date
FROM
    employee;
-- 5. EMPLOYEE ���̺��� �����, �����, ���� ��ȸ

SELECT
    hire_date,
    emp_name,
    salary
FROM
    employee;

-- �÷� �� ��� ����
-- EMPLOYEE ���̺��� ������ �̸��� ���� ��ȸ

SELECT
    emp_name,
    salary * 12
FROM
    employee;
    
-- EMPLOYEE ���̺��� ������ �̸��� ���� ��ȸ, ���ʽ��� �ݿ��� ����

SELECT
    emp_name,
    salary * 12,
    ( salary + ( salary * bonus ) ) * 12
FROM
    employee;
-- ��� ���� �� NULL ���� ���ԵǾ� ������ ����� NULL�� ��.

---- �ǽ����� ----
-- 1. EMPLOYEE ���̺��� �̸�, ����, �Ѽ��ɾ�(����+���ʽ�), �Ǽ��ɾ�(�� ���ɾ� - ����3%)
select Emp_name as �̸� , salary*12 as ����, (salary*12)+ bonus as �Ѽ��ɾ�, (salary*12)+ bonus-(((salary*12)+ bonus)*0.3) as �Ǽ��ɾ�
from Employee;
-- 2.EMPLOYEE ���̺��� 
-- �̸�, �����, �ٹ��ϼ�(���� ��¥ - �����) ��ȸ
-- *DATE ���� ������ ��� ���갡��
-- *���� �ð�(��¥)�� ��ȸ�ϴ� Ű���� == SYSDATE
select emp_name, hire_date,to_date(to_char(sysdate-hire_date,'yy/mm/dd')) as �ٹ��ϼ�
from EMPLOYEE;

select * from EMPLOYEE;

SELECT to_char(trunc(sysdate,'dd')  ) FROM dual ; 

select (mod((trunc(sysdate)-hire_date),12) ) as ����� from employee;

   select
 to_date('20090301', 'yyyymmdd')+1 - to_date('20090225', 'yyyymmdd')
from dual;

select 
trunc(sysdate-hire_date)
from employee;

-- EMPLOYEE ���̺��� ������ �̸��� ����(��Ī : ����(��)),
-- ���ʽ��� �ݿ��� ����(��Ī : �� �ҵ�(��)), ��ȸ�ϱ�
-- (���ʽ��� �ݿ��� ���� = (�޿�+(�޿�*���ʽ�)) *12
select emp_name, 
salary*12 as "����(��)", 
(salary*12)+((salary*12)*bonus) as "�� �ҵ�(��)"
from employee;

-- ���ͷ�

-- EMPLOYEE ���̺��� ������ 
-- ���, �̸�, �޿�, ����(������ : ��) ��ȸ
select emp_id, emp_name, salary,
'��' as ���� 
from employee;

-- DISTINCT
-- �÷��� ���Ե� �ߺ����� �� ������ ǥ���ϰ��� �� �� 
-- ����ϴ� Ű����

-- EMPLOYEE ���̺��� ������ ���� �ڵ� ��ȸ
select * from employee;
select job_code from employee;
-- EMPLOYEE ���̺��� ������ ���� �ڵ� �ߺ� �����Ͽ� ��ȸ
select DISTINCT job_code from employee ;

-- ***** where �� *****
-- ��ȸ�� ���̺��� ������ �´� ���� ���� ���� ��󳻴� ����
/* [ǥ����]
SELECT �÷���
FROM ���̺��
WHERE ���ǽ�;
*/

-- * �񱳿�����
-- =(����), > (ũ��), < (�۴�) >= (ũ�ų�����), <=(�۰ų� ����)
-- !=, ^=, <> (�����ʴ�)
select * from employee;
-- EMPLOYEE ���̺��� �μ��ڵ尡 'D9'�� ������ �̸�, �μ��ڵ� ��ȸ
select emp_name, employee.dept_code
from employee
where dept_code = 'D9';
-- EMPLOYEE ���̺��� �޿��� 4000000 �̻��� ������ �̸�, �޿� ��ȸ
select emp_name, salary
from employee
where salary > 4000000 ;
-- EMPLOYEE ���̺��� �μ��ڵ尡 D9�� �ƴ� ����� ���, �̸�, �μ��ڵ� ��ȸ
select emp_id, emp_name,dept_code 
from employee
where dept_code <> 'D9';

-- EMPLOYEE ���̺��� ��� ���ΰ� N �� ������ ��ȸ�ϰ�
-- �ٹ� ���θ� '������' ���� ǥ���Ͽ�
-- ���, �̸�, �����, �ٹ����θ� ��ȸ
select emp_id, emp_name,hire_date,'������' as �ٹ�����
from employee
where ent_yn = 'N';

-- EMPLOYEE ���̺���
-- �� ���ɾ�(�Ѽ��ɾ�(����+���ʽ�) - (����*���� %3)�� 5õ���� �̻��� ����� 
-- �̸�, ����, �Ǽ��ɾ�, ����� ��ȸ
select emp_name, salary,((salary + (salary*bonus))*12)-(salary*12*0.03) as �Ǽ��ɾ�, hire_date
from employee
where ((salary+(salary*bonus))*12)-(salary*12*0.03) >= 50000000;

-- EMPLOYEE ���̺��� �μ��ڵ尡 'D6' �̰�
-- �޿��� 200�� �̻� �޴� ������
-- �̸�, �μ��ڵ�, �޿��� ��ȸ
select emp_name, dept_code, salary
from employee
where dept_code = 'D6' and salary > 2000000;
-- EMPLOYEE ���̺��� �μ��ڵ尡 'D6' �̰ų�
-- �޿��� 200�� �̻� �޴� ������
-- �̸�, �μ��ڵ�, �޿��� ��ȸ
select emp_name, dept_code, salary
from employee
where dept_code = 'D6' or salary > 2000000;

-- EMPLOYEE ���̺��� 
-- �޿��� 350���� �̻� 600���� ���Ϸ� �޴� ������
-- ���, �̸�, �޿�, �μ��ڵ�, �����ڵ带 ��ȸ
select emp_name, dept_code, salary, dept_code, job_code
from employee
where salary > 3500000 and salary > 6000000;

select *
from employee;

-- �ǽ� ���� -- 
-- 1. EMPLOYEE ���̺��� ������ 4000000�̻��̰� job_code�� j2�� ����� ��ü ���� ��ȸ
select *
from employee
where salary > 4000000 and job_code = 'J2';
-- 2. EMPLOYEE ���̺��� dept_code�� d9�̰ų� d5�� �����
-- ������� 02�� 1�� 1�� ���� ���� �����
-- �̸�, �μ��ڵ�, ����� ��ȸ
-- tip ���� ������ ��� ���� �߿� ���� ������ �˻��ؾߵǴ� ��� ���θ� ���� ��
select emp_name, dept_code, hire_date
from employee
where (dept_code = 'D9' or dept_code = 'D5') and hire_date < '020101';

-- BETWEEN 'a' and 'b'
-- >> a �̻� b ����

-- EMPLOYEE ���̺��� 
-- �޿��� 350���� �̻� 600���� ���Ϸ� �޴� ������
-- ���, �̸�, �޿�, �μ��ڵ�, �����ڵ带 ��ȸ
select emp_id, emp_name, salary, dept_code
from employee
where salary BETWEEN 3500000 and 6000000;

-- EMPLOYEE ���̺��� 
-- �޿��� 350���� �̸� 600���� �ʰ��� �޴� ������
-- ���, �̸�, �޿�, �μ��ڵ�, �����ڵ带 ��ȸ
select emp_id, emp_name, salary, dept_code
from employee
where salary NOT BETWEEN 3500000 and 6000000;
-- NOT Ű����� �÷��� �Ǵ� BETWEEN �տ� ���̴°� ����

-- EMPLOYEE ���̺��� 
-- ������� '90/01/01' ~ '01/01/01' �� ����� 
-- ��� ���� ��ȸ
select *
from EMPLOYEE
where HIRE_DATE between '900101' and '010101';




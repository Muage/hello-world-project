--Q1. ���� �־��� ���̺��� ���ؼ� �Ʒ��� ���� ������� ��ȯ�ǵ��� �Ʒ� SQL���� ��ĭ�� �� ���� �����ÿ�.
--    [SQLD_37]
--    COL1    COL2    COL3
--    null    0       30
--    0       null    0
--    10      20      null
--    11      21      31
--    12      22      32
--    
--    [���]
--    A       B       C
--    12      0       33
--    
--    select (    ) AS A, (   ) AS B, (   ) AS C from SQLD_37;
--    
--    �� max(COL2), min(COL2), sum(COL1)
--    �� max(COL1), min(COL2), sum(COL2)
--    �� max(COL1), min(COL2), sum(COL1)
--    �� min(COL1), max(COL2), max(COL1)
--    
--A. ��

create table SQLD_37 (
    COL1 int,
    COL2 int,
    COL3 int
);

select * from SQLD_37;

--insert into SQLD_37 (COL1, COL2, COL3) values (null, 0, 30);
insert into SQLD_37 values (null, 0, 30);
insert into SQLD_37 values (0, null, 0);
insert into SQLD_37 values (10, 20, null);
insert into SQLD_37 values (11, 21, 31);
insert into SQLD_37 values (12, 22, 32);

--��
select max(COL2) AS A, min(COL2) AS B, sum(COL1) AS C from SQLD_37;
--A   B   C
--22  0   33

--��
select max(COL1) AS A, min(COL2) AS B, sum(COL2) AS C from SQLD_37;
--A   B   C
--12  0   63

--��
select max(COL1) AS A, min(COL2) AS B, sum(COL1) AS C from SQLD_37;
--A   B   C
--12  0   33

--��
select min(COL1) AS A, max(COL2) AS B, max(COL1) AS C from SQLD_37;
--A   B   C
--0  22   12


--Q2. ������ SQL���� ����� ��, ��¥�� ������ ���������� �ٲ� �� �ִ� ����?
--    SELECT SYSDATE FROM DUAL;
--    
--    �� TO_NUMBER
--    �� TO_DATE
--    �� TO_CHAR
--    �� CONVERT
--
--A. ��

--��
--TO_NUMBER : �־��� ���ڿ� �Ǵ� �÷��� �����͸� ���ڷ� ��ȯ
SELECT TO_NUMBER(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
--����

--��
--TO_DATE : ���ڸ� ��¥ ������ Ÿ������ ��ȯ
SELECT TO_DATE(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
--23/03/31

--��
--TO_CHAR : ��¥ �� ���� ���� ���� ���ڿ��� ��ȯ
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
--2023-03-31

--��
--CONVERT : ���ڼ�Ʈ�� �ٸ� ���ڼ�Ʈ�� ���ڿ��� ��ȯ
SELECT CONVERT(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
--����


--Q3. �Ʒ��� ���� ���̺��� ���� �� ��� SQL�� ����� ������ �����?
--    [���̺�]
--    SQLD_D5
--    COL1 VARCHAR2(30)
--    COL2 NUMBER
--
--    [SQL]
--    INSERT INTO SQLD_D5(COL1, COL2) VALUES('ABCD', NULL);
--    INSERT INTO SQLD_D5(COL1, COL2) VALUES('BC', NULL);
--    ALTER TABLE SQLD_D5 MODIFY COL2 DEFAULT 10;
--    INSERT INTO SQLD_D5(COL1, COL2) VALUES('XY', NULL);
--    INSERT INTO SQLD_D5(COL1) VALUES('EXD');
--    SELECT SUM(COL2) FROM SQLD_D5;
--    
--    �� 10
--    �� 40
--    �� 20
--    �� 0
--
--A. ��

create table SQLD_D5 (
    COL1 varchar2(30),
    COL2 int
);

select * from SQLD_D5;

INSERT INTO SQLD_D5(COL1, COL2) VALUES('ABCD', NULL);
INSERT INTO SQLD_D5(COL1, COL2) VALUES('BC', NULL);
ALTER TABLE SQLD_D5 MODIFY COL2 DEFAULT 10;
INSERT INTO SQLD_D5(COL1, COL2) VALUES('XY', NULL);
INSERT INTO SQLD_D5(COL1) VALUES('EXD');
SELECT SUM(COL2) FROM SQLD_D5;

--Q4. �Ʒ��� ���� ���ڿ� ���ڸ� �����ϴ� �Լ��� ���ؼ� �ۼ��Ͻÿ�.
--    SELECT (    ) (COL1, COL2)
--    FROM EMP
--    WHERE EMPID = 10;
    
--    �� LENGTH
--    �� CONCAT
--    �� TRIM
--    �� SUBSTR
--
--A. ��

create table EMP(
    COL1 varchar(10),
    COL2 varchar(10),
    EMPID int
);

select * from EMP;

insert into EMP values('test', 'check', 10);

--��
SELECT LENGTH (COL1, COL2) FROM EMP WHERE EMPID = 10;
--����

--��
SELECT CONCAT (COL1, COL2) FROM EMP WHERE EMPID = 10;
--CONCAT(COL1,COL2)
--testcheck

--��
SELECT TRIM (COL1, COL2) FROM EMP WHERE EMPID = 10;
--����

--��
SELECT SUBSTR (COL1, COL2) FROM EMP WHERE EMPID = 10;
--����
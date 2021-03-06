-- ==============================================================
--  Table : EMPLOYEES                                    
-- ==============================================================
DROP PUBLIC SYNONYM EMPLOYEES;
DROP SEQUENCE NORTHWIND.SEQ_EMPLOYEES;
CREATE TABLE EMPLOYEES(
    EMPLOYEEID NUMBER(22,0) NOT NULL,
    REPORTSTO NUMBER(22,0) NULL,
    POSTALCODE VARCHAR2(10) NULL,
    LASTNAME VARCHAR2(20) NOT NULL,
    NOTES CLOB NULL,
    TITLE VARCHAR2(30) NULL,
    REGION VARCHAR2(15) NULL,
    FIRSTNAME VARCHAR2(10) NOT NULL,
    ADDRESS VARCHAR2(60) NULL,
    HIREDATE DATE NULL,
    PHOTOPATH VARCHAR2(255) NULL,
    BIRTHDATE DATE NULL,
    TITLEOFCOURTESY VARCHAR2(25) NULL,
    HOMEPHONE VARCHAR2(24) NULL,
    COUNTRY VARCHAR2(15) NULL,
    CITY VARCHAR2(15) NULL,
    EXTENSION VARCHAR2(4) NULL,
    PHOTO BLOB NULL
)
storage
(
    initial 10K
    next 10K
    minextents 1
    maxextents unlimited
    pctincrease 50
    freelists 1
    freelist groups 1
    optimal NULL
    buffer_pool default
)
tablespace TS_DATA_NORTHWIND;

CREATE PUBLIC SYNONYM EMPLOYEES FOR NORTHWIND.EMPLOYEES;

CREATE SEQUENCE NORTHWIND.SEQ_EMPLOYEES INCREMENT BY 1 START WITH 1000;
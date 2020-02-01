CREATE TABLE investor (
    investorId VARCHAR2 PRIMARY KEY,
	investorName VARCHAR2,
	description VARCHAR2,
	sector VARCHAR2,
	interestedIn VARCHAR2,
	webUrl VARCHAR2,
	iconUrl VARCHAR2,
	expectedToInvest VARCHAR2,
	investorPwd VARCHAR2,
	approved VARCHAR2
);

CREATE TABLE COMPANY (
   companyId varchar2 PRIMARY KEY,
   companyName varchar2,
   description varchar2,
   sector varchar2,
   webUrl varchar2,
   iconUrl varchar2,
   companyPwd varchar2,
   approved varchar2,
);

CREATE SEQUENCE companyidgenerator
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE ;

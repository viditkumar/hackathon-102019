CREATE TABLE INVESTOR (
investorId VARCHAR2 PRIMARY KEY,
investorName VARCHAR2,
description VARCHAR2,
sector VARCHAR2,
interestedIn VARCHAR2,
webUrl VARCHAR2,
iconUrl VARCHAR2,
expectedToInvest VARCHAR2,
investorPwd VARCHAR2,
approved VARCHAR2,
accountNo VARCHAR2,
ifsCode VARCHAR2
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
accountNo VARCHAR2,
ifsCode VARCHAR2
);

CREATE TABLE TRANSACTION (
transactionId varchar2 PRIMARY KEY,
investorId varchar2,
companyId varchar2,
transactionAmt varchar2,
date varchar2,
description varchar2,
projectId varchar2
);

CREATE TABLE PROJECT (
projectId VARCHAR2 PRIMARY KEY,
projectName VARCHAR2,
description VARCHAR2,
sector VARCHAR2,
companyId VARCHAR2,
projectUrl VARCHAR2,
pitchingVideoUrl VARCHAR2,
minInvestmentReqd VARCHAR2,
sustainabilityDesc VARCHAR2,
views VARCHAR2,
projectIcon VARCHAR2,
approved VARCHAR2,
fundingReceived VARCHAR2,
);

CREATE SEQUENCE companyidgenerator
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE ;

CREATE SEQUENCE investoridgenerator
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE ;

CREATE SEQUENCE projectidgenerator
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE ;

CREATE SEQUENCE transactionidgenerator
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE ;
insert into COMPANY (companyId, companyName, description, sector, webUrl, iconUrl, companyPwd, approved, accountNo, ifsCode) VALUES ('c1', 'Plobal', 'Plobal provides a do-it-yourself (DIY) native app development platform, and claims to help offline businesses and early-stage startups develop their own app in less than 10 minutes.', 'IT', 'www.plobal.com', 'https://cdn.shopify.com/plus-assets/partners/logos.png','plobal', 'P', '1234', '0000');

insert into COMPANY (companyId, companyName, description, sector, webUrl, iconUrl, companyPwd, approved, accountNo, ifsCode) VALUES ('c2','Altizon','Altizon Systems is an Internet of Things (IoT) platform that helps enterprises build IoT products and solutions in weeks by providing device connectivity kits & a device management layer','IT','www.altizon.com', 'icon','altizon','P','1111','0001');


insert into COMPANY (companyId, companyName, description, sector, webUrl, iconUrl, companyPwd, approved, accountNo, ifsCode) VALUES ('c3','abc','Arcatron Mobility designs smart wheelchairs to assist people with limited mobility.','Manufacturing','www.altizon.com', 'icon','abc','P','1115','0002');



insert into INVESTOR (investorId, investorName, description, sector, interestedIn, webUrl, iconUrl,expectedToInvest, investorPwd, approved, accountNo, ifsCode) VALUES ('i1','Bluechip','Finance Planners and Investors in Pune', 'Finance','Finance','www.bluechip.com','icon','1 million','bluechip','P','1145','0003');

insert into INVESTOR (investorId, investorName, description, sector, interestedIn, webUrl, iconUrl,expectedToInvest, investorPwd, approved, accountNo, ifsCode) VALUES ('i2','Ratan Tata','Ratan Naval Tata is an Indian industrialist, investor, philanthropist, and a former chairman of Tata Sons who serves as its chairman emeritus.', 'Manufacturing','Green Technology','www.ratan.com','icon','3 million','ratan','P','1169','0003');

insert into INVESTOR (investorId, investorName, description, sector, interestedIn, webUrl, iconUrl,expectedToInvest, investorPwd, approved, accountNo, ifsCode) VALUES ('i3','Anil','Anil Dhirubhai Ambani is an Indian businessman. He is the chairman of Reliance Group.', 'Finance','Finance','www.anil.com','icon','1 million','anil','P','1845','0005');



insert into PROJECT (projectId, projectName, description, sector, companyId, projectUrl, pitchingVideoUrl, minInvestmentReqd, sustainabilityDesc, views, projectIcon, approved, fundingReceived) VALUES ('p1','The Green Technolgy','Reclaiming materials and reducing waste in New Orleans.','GreenTech','c1','www.greentech.org','video','2 million','Waste management','10000','icon','P','0.5 million');

insert into PROJECT (projectId, projectName, description, sector, companyId, projectUrl, pitchingVideoUrl, minInvestmentReqd, sustainabilityDesc, views, projectIcon, approved, fundingReceived) VALUES ('p2','Impossible Foods Inc.','Offers sustainable vegetarian produce to conscious consumers across the United States.','Food','c3','www.impossiblefoods.inc','video','6 million','Sustainable food','5000','icon','P','2 million');

insert into PROJECT (projectId, projectName, description, sector, companyId, projectUrl, pitchingVideoUrl, minInvestmentReqd, sustainabilityDesc, views, projectIcon, approved, fundingReceived) VALUES ('p3','Choose Energy',' launched with the vision of simplifying shopping for electricity and natural gas rates, plan terms and renewable energy options for the average consumer and small business.','Energy','c3','www.energy.com','video','3 million',' marketplace for clean technology and services. ','888888','icon','P','1 million');

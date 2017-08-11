--------------------------------------------------------
--  File created - Friday-August-11-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LOOKUPS
--------------------------------------------------------

  CREATE TABLE "LOOKUPS" 
   (	"LOOKUP_ID" NUMBER(10,0), 
	"LOOKUP_CATEGORY" VARCHAR2(50 CHAR), 
	"POSSIBLE_VALUE" VARCHAR2(50 CHAR), 
	"DESCRIPTION" VARCHAR2(1024 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into LOOKUPS
SET DEFINE OFF;
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (1,'BUYING_ROLE','Initiator','One who identifies the need to buy a particular product or service to solve an organisational problem');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (2,'BUYING_ROLE','Influencer','One who influence the buying centre''s buyers and deciders');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (3,'BUYING_ROLE','Decider','One who approves all or any part of the entire buying decision');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (4,'DEPARTMENT_NAME','Marketing','Deals with marketing procedures');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (5,'DEPARTMENT_NAME','Finance','Deals with financial activities');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (6,'DEPARTMENT_NAME','Sales','Deals with sales of products');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (7,'DEPARTMENT_NAME','Customer Care','Deals with customer care and contacts');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (8,'DEPARTMENT_NAME','Purchasing ','Deals with purchase of products');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (9,'LEVEL','High',null);
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (10,'LEVEL ','Medium',null);
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (11,'LEVEL','Low',null);
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (12,'SALES_CHANNEL','Direct','No mediator ');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (13,'SALES_CHANNEL','Indirect','Mediator is present');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (14,'SALES_METHOD','Standard ','Internationally standardized process');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (15,'SALES_STAGE','Custom','Customizable sales process');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (16,'SALES_STAGE','Qualification','The potential for a deal exists');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (17,'SALES_STAGE','Oppurtunity','Identifies oppurtunity ');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (18,'SALES_STAGE','Building Vision','Sets vision');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (19,'SALES_STAGE','Presentation','Communication with  the customer by presenting the product');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (20,'SALES_STAGE','Agreement','Makes the deal');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (21,'SALES_STAGE','Negotiation','Agrees commercial terms and sorts out the legal paperwork.');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (22,'SALES_STAGE','Closed','can be a CLOSED WON or CLOSED LOST');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (23,'PRODUCT_CATEGORY','Light Commercial Vehicle','Light Commercial Vehicle (LCV)');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (24,'PRODUCT_CATEGORY','Medium Commercial Vehicle','Commercial Vehicle (MCV)');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (25,'PRODUCT_CATEGORY','Heavy Commercial Vehicle','Commercial Vehicle (HCV)');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (26,'PRODUCT_CATEGORY','Compact ','Passenger Vehicle');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (27,'PRODUCT_CATEGORY','Utility Vehicle','Passenger Vehicle');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (28,'PRODUCT_CATEGOR','Luxury ','Passenger vehicle(Premium and Luxury)');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (29,'ROLE_NAME','Administrator','The administrator of the system');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (30,'ROLE_NAME','Sales Manager','Manager of the Sales Department');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (31,'ROLE_NAME','Sales Representative','Representative in the Sales Department');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (32,'DECISION_LEVEL','CEO','Chief Executive Officer of the organisation');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (33,'DECISION_LEVEL','VP','Vice President of the organizaton');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (34,'DECISION_LEVEL','Manager','Manager of any department in the organization');
Insert into LOOKUPS (LOOKUP_ID,LOOKUP_CATEGORY,POSSIBLE_VALUE,DESCRIPTION) values (35,'DECISION_LEVEL','Buyer','The buyer of the product');
--------------------------------------------------------
--  DDL for Index LOOKUPS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LOOKUPS_PK" ON "LOOKUPS" ("LOOKUP_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger LOOKUPS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "LOOKUPS_TRG" 
BEFORE INSERT ON LOOKUPS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.LOOKUP_ID IS NULL THEN
      SELECT LOOKUPS_SEQ.NEXTVAL INTO :NEW.LOOKUP_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "LOOKUPS_TRG" ENABLE;
--------------------------------------------------------
--  Constraints for Table LOOKUPS
--------------------------------------------------------

  ALTER TABLE "LOOKUPS" ADD CONSTRAINT "LOOKUPS_PK" PRIMARY KEY ("LOOKUP_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "LOOKUPS" MODIFY ("LOOKUP_ID" NOT NULL ENABLE);

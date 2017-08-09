CREATE OR REPLACE TRIGGER CUSTOMERS_TRG 
BEFORE INSERT ON CUSTOMERS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.CUSTOMER_ID IS NULL THEN
      SELECT CUSTOMERS_SEQ.NEXTVAL INTO :NEW.CUSTOMER_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

CREATE OR REPLACE TRIGGER OPPORTUNITIES_TRG 
BEFORE INSERT ON OPPORTUNITIES 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.OPPORTUNITY_ID IS NULL THEN
      SELECT OPPORTUNITIES_SEQ.NEXTVAL INTO :NEW.OPPORTUNITY_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

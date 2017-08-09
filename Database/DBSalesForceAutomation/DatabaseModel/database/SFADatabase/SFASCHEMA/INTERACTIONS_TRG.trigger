CREATE OR REPLACE TRIGGER INTERACTIONS_TRG 
BEFORE INSERT ON INTERACTIONS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.INTERACTION_ID IS NULL THEN
      SELECT INTERACTIONS_SEQ.NEXTVAL INTO :NEW.INTERACTION_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

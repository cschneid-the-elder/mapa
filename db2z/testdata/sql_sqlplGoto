
--#SET TERMINATOR @

CREATE PROCEDURE TESTGOTO ( )
TG1: BEGIN
   DECLARE V1 , V2 INTEGER;
     SET V1 = 1;
  LABL1: SET V2 = 1;
    BEGIN
      LABL2: SET V2 = 2;
         BEGIN
           SET V1 = V1 + 1;
           IF V1<3 THEN GOTO LABL1;
           END IF;
         END;
    END;
END TG1
@



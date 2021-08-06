       ID Division.
       Program-ID. test9023.
       Environment Division.
       Configuration Section.
       Repository.
           FUNCTION ALL INTRINSIC.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           MOVE REVERSE(WORK-AREAS) TO RETURN-CODE

           EXIT PROGRAM.

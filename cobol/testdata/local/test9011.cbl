       ID Division.
       Program-ID. test9011.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           MOVE FUNCTION REVERSE(WORK-AREAS) TO RETURN-CODE

           EXIT PROGRAM.

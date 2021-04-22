       ID Division.
       Program-ID. test9013.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select A001 Assign UT-S-DD000001.
           Select A002 Assign S-DD000002.
           Select A003 Assign DD000003.
           Select A004 Assign BEEP.
           Select A005 Assign 'ZERO'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           MOVE FUNCTION REVERSE(WORK-AREAS) TO RETURN-CODE

           EXIT PROGRAM.

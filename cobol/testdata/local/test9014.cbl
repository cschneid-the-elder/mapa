       ID Division.
       Program-ID. test9014.
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
           CALL 'test9014a'
           EXIT PROGRAM.
       ID Division.
       Program-ID. test9014a.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select B001 Assign UT-S-DD000011.
           Select B002 Assign S-DD000012.
           Select B003 Assign DD000013.
           Select B004 Assign ABORT.
           Select B005 Assign 'PASSWORD'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           MOVE FUNCTION REVERSE(WORK-AREAS) TO RETURN-CODE
           CALL 'test9014b'
           EXIT PROGRAM.
       END PROGRAM test9014a.
       END PROGRAM test9014.

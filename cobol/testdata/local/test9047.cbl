       Identification Division.
       Program-ID. test9047.
       Environment Division.
       Configuration Section.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME                  PIC X(008) VALUE 'test9047'.
           
       EXEC SQLIMS INCLUDE SQL9047A END-EXEC.
       EXEC SQLIMS INCLUDE SQLIMSCA END-EXEC.
       Procedure Division.
           EXEC SQLIMS WHENEVER SQLWARNING CONTINUE END-EXEC.
           
           DISPLAY MYNAME
           EXEC SQLIMS
                SELECT EDWIN, CHARLES FROM PCB01.CASE
           END-EXEC
           
           GOBACK.
       End Program test9047.


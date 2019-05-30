       Identification Division.
       Program-ID. testantlr010.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr010'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC SQL CALL PGMA0001 END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



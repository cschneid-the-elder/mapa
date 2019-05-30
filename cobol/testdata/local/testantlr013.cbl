       Identification Division.
       Program-ID. testantlr013.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr013'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC SQL
                CALL PGMA0001(AEIOU, EGBDF)
           END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



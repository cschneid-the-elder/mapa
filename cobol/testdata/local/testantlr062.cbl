       Identification Division.
       Program-ID. testantlr062.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr062'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

           EXEC SQL INCLUDE SQLCA END-EXEC

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC SQL INCLUDE testantlr062a END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



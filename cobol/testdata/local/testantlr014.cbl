       Identification Division.
       Program-ID. testantlr014.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr014'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS
                LINK
                PROGRAM(PGM-0001)
                COMMAREA(CA-STUFF)
                LENGTH(CA-STUFF-LEN)
           END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



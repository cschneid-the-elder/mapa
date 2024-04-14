       Identification Division.
       Program-ID. testantlr012.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr012'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS
                XCTL
                PROGRAM('PGMA0001')
                COMMAREA(CA-STUFF)
                LENGTH(CA-STUFF-LEN)
           END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



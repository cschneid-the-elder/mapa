       Identification Division.
       Program-ID. testantlr007.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr007'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS XCTL PROGRAM('PGMA0001') END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



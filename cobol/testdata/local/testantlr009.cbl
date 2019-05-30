       Identification Division.
       Program-ID. testantlr009.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr009'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS XCTL PROGRAM(PGM-0001) END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .


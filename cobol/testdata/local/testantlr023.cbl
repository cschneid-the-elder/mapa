       Identification Division.
       Program-ID. testantlr023.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr023'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.

      *

       01 WORK-AREAS.                                        COPY TA023.

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           MOVE 'PGMB0004' TO PGM-0004
           MOVE PGM-0001   TO PGM-0004
           
           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           CALL PGM-0004

           .


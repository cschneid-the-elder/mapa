       Identification Division.
       Program-ID. testantlr016.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr016'.

       01 WORK-AREAS.
          05  PGM-0004              PIC X(008) VALUE SPACES.
          05  PGM-0005              PIC X(008) VALUE SPACES.
              88  PGMB5                        VALUE 'PGMB0005'.
          05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.
          05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).
          05  ABC.
              10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.
          05  DEF.
              10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.
          05  GHI.
              10  ABC.
                  15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           MOVE 'PGMB0004' TO PGM-0004
           CALL PGM-0004

           .


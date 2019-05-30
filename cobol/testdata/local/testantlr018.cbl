       Identification Division.
       Program-ID. testantlr018.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr018'.

       01 WORK-AREAS.
          05  PGM-0004              PIC X(008) VALUE SPACES.
          05  PGM-0005              PIC X(008) VALUE SPACES.
              88  PGMB5                        VALUE 'PGMB0005'.
          05  ABC.
              10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.
          05  DEF.
              10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.
          05  GHI.
              10  ABC.
                  15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.
          05  PGM-TO-LINK           PIC X(008) VALUE 'PGML0013'.
          05  PGM-TO-XCTL           PIC X(008) VALUE 'PGMX0014'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL PGM-0010 OF ABC OF GHI

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



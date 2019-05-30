       Identification Division.
       Program-ID. testantlr020.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr020'.

       01 WORK-AREAS.
          05  PGM-0004              PIC X(008) VALUE SPACES.
          05  PGM-0005              PIC X(008) VALUE SPACES.
              88  PGMB5                        VALUE 'PGMB0005'.
          05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.
          05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL PGM-0008

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



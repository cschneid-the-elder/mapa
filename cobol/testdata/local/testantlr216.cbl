       Identification Division.                                         00000001
       Program-ID. testantlr216.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr216'.    00000007
                                                                        00000008
       01 WORK-AREAS.                                                   00000009
          05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
          05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
              88  PGMB5                        VALUE 'PGMB0005'.        00000012
          05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.        00000013
          05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).               00000014
          05  ABC.                                                      00000015
              10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.        00000016
          05  DEF.                                                      00000017
              10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.        00000018
          05  GHI.                                                      00000019
              10  ABC.                                                  00000020
                  15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.        00000021
                                                                        00000022
       Procedure Division.                                              00000023
           DISPLAY MYNAME ' Begin'                                      00000024
                                                                        00000025
                                                                        00000026
           DISPLAY MYNAME ' End'                                        00000027
                                                                        00000028
           GOBACK                                                       00000029
           .                                                            00000030
                                                                        00000031
       1000-para.                                                       00000032
                                                                        00000033
           MOVE 'PGMB0004' TO PGM-0004                                  00000034
           CALL PGM-0004                                                00000035
                                                                        00000036
           .                                                            00000037
                                                                        00000038

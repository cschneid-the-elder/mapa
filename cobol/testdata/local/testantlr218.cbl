       Identification Division.                                         00000001
       Program-ID. testantlr218.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr028'.    00000007
                                                                        00000008
       01 WORK-AREAS.                                                   00000009
          05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
          05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
              88  PGMB5                        VALUE 'PGMB0005'.        00000012
          05  ABC.                                                      00000013
              10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.        00000014
          05  DEF.                                                      00000015
              10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.        00000016
          05  GHI.                                                      00000017
              10  ABC.                                                  00000018
                  15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.        00000019
          05  PGM-TO-LINK           PIC X(008) VALUE 'PGML0013'.        00000020
          05  PGM-TO-XCTL           PIC X(008) VALUE 'PGMX0014'.        00000021
                                                                        00000022
       Procedure Division.                                              00000023
           DISPLAY MYNAME ' Begin'                                      00000024
                                                                        00000025
           CALL PGM-0010 OF ABC OF GHI                                  00000026
                                                                        00000027
           DISPLAY MYNAME ' End'                                        00000028
                                                                        00000029
           GOBACK                                                       00000030
           .                                                            00000031
                                                                        00000032
                                                                        00000033

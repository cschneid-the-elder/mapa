       Identification Division.                                         00000001
       Program-ID. testantlr220.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr220'.    00000007
                                                                        00000008
       01 WORK-AREAS.                                                   00000009
          05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
          05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
              88  PGMB5                        VALUE 'PGMB0005'.        00000012
          05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.        00000013
          05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).               00000014
                                                                        00000015
       Procedure Division.                                              00000016
           DISPLAY MYNAME ' Begin'                                      00000017
                                                                        00000018
           CALL PGM-0008                                                00000019
                                                                        00000020
           DISPLAY MYNAME ' End'                                        00000021
                                                                        00000022
           GOBACK                                                       00000023
           .                                                            00000024
                                                                        00000025
                                                                        00000026

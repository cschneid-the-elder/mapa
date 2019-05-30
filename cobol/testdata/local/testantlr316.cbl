000001 Identification Division.                                         00000001
000002 Program-ID. testantlr316.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr316'.    00000007
000008                                                                  00000008
000009 01 WORK-AREAS.                                                   00000009
000010    05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
000011    05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
000012        88  PGMB5                        VALUE 'PGMB0005'.        00000012
000013    05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.        00000013
000014    05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).               00000014
000015    05  ABC.                                                      00000015
000016        10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.        00000016
000017    05  DEF.                                                      00000017
000018        10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.        00000018
000019    05  GHI.                                                      00000019
000020        10  ABC.                                                  00000020
000021            15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.        00000021
000022                                                                  00000022
000023 Procedure Division.                                              00000023
000024     DISPLAY MYNAME ' Begin'                                      00000024
000025                                                                  00000025
000026                                                                  00000026
000027     DISPLAY MYNAME ' End'                                        00000027
000028                                                                  00000028
000029     GOBACK                                                       00000029
000030     .                                                            00000030
000031                                                                  00000031
000032 1000-para.                                                       00000032
000033                                                                  00000033
000034     MOVE 'PGMB0004' TO PGM-0004                                  00000034
000035     CALL PGM-0004                                                00000035
000036                                                                  00000036
000037     .                                                            00000037
000038                                                                  00000038

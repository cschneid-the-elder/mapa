000001 Identification Division.                                         00000001
000002 Program-ID. testantlr319.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr319'.    00000007
000008                                                                  00000008
000009 01 WORK-AREAS.                                                   00000009
000010    05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
000011    05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
000012        88  PGMB5                        VALUE 'PGMB0005'.        00000012
000013    05  ABC.                                                      00000013
000014        10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.        00000014
000015    05  DEF.                                                      00000015
000016        10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.        00000016
000017    05  GHI.                                                      00000017
000018        10  ABC.                                                  00000018
000019            15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.        00000019
000020    05  PGM-TO-LINK           PIC X(008) VALUE 'PGML0013'.        00000020
000021    05  PGM-TO-XCTL           PIC X(008) VALUE 'PGMX0014'.        00000021
000022                                                                  00000022
000023 Procedure Division.                                              00000023
000024     DISPLAY MYNAME ' Begin'                                      00000024
000025                                                                  00000025
000026     CALL PGM-0010 OF DEF                                         00000026
000027                                                                  00000027
000028     DISPLAY MYNAME ' End'                                        00000028
000029                                                                  00000029
000030     GOBACK                                                       00000030
000031     .                                                            00000031
000032                                                                  00000032
000033                                                                  00000033

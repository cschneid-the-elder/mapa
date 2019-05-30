000001 Identification Division.                                         00000001
000002 Program-ID. testantlr320.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr320'.    00000007
000008                                                                  00000008
000009 01 WORK-AREAS.                                                   00000009
000010    05  PGM-0004              PIC X(008) VALUE SPACES.            00000010
000011    05  PGM-0005              PIC X(008) VALUE SPACES.            00000011
000012        88  PGMB5                        VALUE 'PGMB0005'.        00000012
000013    05  PGM-0008-VAL          PIC X(008) VALUE 'PGMK0008'.        00000013
000014    05  PGM-0008 REDEFINES PGM-0008-VAL PIC X(008).               00000014
000015                                                                  00000015
000016 Procedure Division.                                              00000016
000017     DISPLAY MYNAME ' Begin'                                      00000017
000018                                                                  00000018
000019     CALL PGM-0008                                                00000019
000020                                                                  00000020
000021     DISPLAY MYNAME ' End'                                        00000021
000022                                                                  00000022
000023     GOBACK                                                       00000023
000024     .                                                            00000024
000025                                                                  00000025
000026                                                                  00000026

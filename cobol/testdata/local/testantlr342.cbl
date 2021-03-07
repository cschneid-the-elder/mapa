000001 PROCESS DEFINE(X=2)                                              00000001
000002 Identification Division.                                         00000002
000003 Program-ID. testantlr342.                                        00000003
000004 Data Division.                                                   00000004
000005 Working-Storage Section.                                         00000005
000006                                                                  00000006
000007 01  CONSTANTS.                                                   00000007
000008     05  MYNAME               PIC X(012) VALUE 'testantlr342'.    00000008
000009     >>EVALUATE TRUE                                              00000009
000010     >>WHEN X = 1                                                 00000010
000011     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000011
000012     >>WHEN X = 2                                                 00000012
000013     05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000013
000014     >>WHEN X = 3                                                 00000014
000015     05  PGM-0001             PIC X(008) VALUE 'PGMA0003'.        00000015
000016     >>WHEN OTHER                                                 00000016
000017     05  PGM-0001             PIC X(008) VALUE 'PGMA0009'.        00000017
000018     >>END-EVALUATE                                               00000018
000019                                                                  00000019
000020*                                                                 00000020
000021                                                                  00000021
000022 Procedure Division.                                              00000022
000023     DISPLAY MYNAME ' Begin'                                      00000023
000024     CALL PGM-0001                                                00000024
000025                                                                  00000025
000026     DISPLAY MYNAME ' End'                                        00000026
000027                                                                  00000027
000028     GOBACK                                                       00000028
000029     .                                                            00000029
000030                                                                  00000030
000031                                                                  00000031

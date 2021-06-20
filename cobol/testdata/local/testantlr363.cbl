000001 Identification Division.                                         00000001
000002 Program-ID. testantlr363.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr363'.    00000006
000007     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000007
000008                                                                  00000008
000009     EXEC SQL INCLUDE SQLCA END-EXEC.                             00000009
000010                                                                  00000010
000011 Procedure Division.                                              00000011
000012     DISPLAY MYNAME ' Begin'                                      00000012
000013                                                                  00000013
000014     EXEC SQL                                                     00000014
000015          SELECT C1, C2                                           00000015
000016          FROM T1                                                 00000016
000017          WHERE C3 = 'BLUE'                                       00000017
000018     END-EXEC.                                                    00000018
000019                                                                  00000019
000020     EXEC SQL                                                     00000020
000021          INSERT INTO T1                                          00000021
000022          SELECT * FROM T2                                        00000022
000023     END-EXEC.                                                    00000023
000024                                                                  00000024
000025     DISPLAY MYNAME ' End'                                        00000025
000026                                                                  00000026
000027     GOBACK                                                       00000027
000028     .                                                            00000028
000029                                                                  00000029
000030                                                                  00000030

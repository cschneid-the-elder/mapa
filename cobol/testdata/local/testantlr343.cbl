000001 Identification Division.                                         00000001
000002 Program-ID. testantlr343.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr343'.    00000007
000008     >>EVALUATE TRUE                                              00000008
000009     >>WHEN X = 1                                                 00000009
000010     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000010
000011     >>WHEN X = 2                                                 00000011
000012     05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000012
000013     >>WHEN X = 3                                                 00000013
000014     05  PGM-0001             PIC X(008) VALUE 'PGMA0003'.        00000014
000015     >>WHEN OTHER                                                 00000015
000016     05  PGM-0001             PIC X(008) VALUE 'PGMA0009'.        00000016
000017     >>END-EVALUATE                                               00000017
000018                                                                  00000018
000019*                                                                 00000019
000020                                                                  00000020
000021 Procedure Division.                                              00000021
000022     DISPLAY MYNAME ' Begin'                                      00000022
000023     CALL PGM-0001                                                00000023
000024                                                                  00000024
000025     DISPLAY MYNAME ' End'                                        00000025
000026                                                                  00000026
000027     GOBACK                                                       00000027
000028     .                                                            00000028
000029                                                                  00000029
000030                                                                  00000030

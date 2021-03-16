000001 ID Division.                                                     00000001
000002 Program-ID. testantlr356.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  WORK-AREAS.                                                  00000005
000006     05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.         00000006
000007 Procedure Division.                                              00000007
000008     PERFORM 10 TIMES                                             00000008
000009       ADD 1 TO WS-COUNT                                          00000009
000010       IF WS-COUNT = 3                                            00000010
000011         EXIT PERFORM                                             00000011
000012       END-IF                                                     00000012
000013     END-PERFORM                                                  00000013
000014                                                                  00000014
000015     PERFORM 10 TIMES                                             00000015
000016       ADD 1 TO WS-COUNT                                          00000016
000017       IF WS-COUNT = 4                                            00000017
000018         EXIT PERFORM CYCLE                                       00000018
000019       END-IF                                                     00000019
000020     END-PERFORM                                                  00000020
000021                                                                  00000021
000022     PERFORM 10 TIMES                                             00000022
000023       ADD 1 TO WS-COUNT                                          00000023
000024       IF WS-COUNT = 13                                           00000024
000025         EXIT METHOD                                              00000025
000026       END-IF                                                     00000026
000027     END-PERFORM                                                  00000027
000028                                                                  00000028
000029     EXIT SECTION                                                 00000029
000030     EXIT PARAGRAPH                                               00000030
000031                                                                  00000031
000032     EXIT PROGRAM.                                                00000032

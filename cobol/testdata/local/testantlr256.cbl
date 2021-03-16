       ID Division.                                                     00000001
       Program-ID. testantlr256.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  WORK-AREAS.                                                  00000005
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.         00000006
       Procedure Division.                                              00000007
           PERFORM 10 TIMES                                             00000008
             ADD 1 TO WS-COUNT                                          00000009
             IF WS-COUNT = 3                                            00000010
               EXIT PERFORM                                             00000011
             END-IF                                                     00000012
           END-PERFORM                                                  00000013
                                                                        00000014
           PERFORM 10 TIMES                                             00000015
             ADD 1 TO WS-COUNT                                          00000016
             IF WS-COUNT = 4                                            00000017
               EXIT PERFORM CYCLE                                       00000018
             END-IF                                                     00000019
           END-PERFORM                                                  00000020
                                                                        00000021
           PERFORM 10 TIMES                                             00000022
             ADD 1 TO WS-COUNT                                          00000023
             IF WS-COUNT = 13                                           00000024
               EXIT METHOD                                              00000025
             END-IF                                                     00000026
           END-PERFORM                                                  00000027
                                                                        00000028
           EXIT SECTION                                                 00000029
           EXIT PARAGRAPH                                               00000030
                                                                        00000031
           EXIT PROGRAM.                                                00000032

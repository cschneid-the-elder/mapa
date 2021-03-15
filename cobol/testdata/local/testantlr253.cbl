       ID Division.                                                     00000001
       Program-ID. testantlr253.                                        00000002
       Procedure Division.                                              00000003
                                                                        00000004
           >>DEFINE A B'1'                                              00000005
           >>DEFINE B B'0'                                              00000006
           >>DEFINE C B'1'                                              00000007
           >>DEFINE D B'0'                                              00000008
                                                                        00000009
           >>IF A AND B                                                 00000010
           CALL 'PGM00001'                                              00000011
           >>END-IF                                                     00000012
                                                                        00000013
           >>IF (((((A AND B)))))                                       00000014
           CALL 'PGM00002'                                              00000015
           >>END-IF                                                     00000016
                                                                        00000017
           >>IF A AND (B OR C)                                          00000018
           CALL 'PGM00003'                                              00000019
           >>END-IF                                                     00000020
                                                                        00000021
           >>IF (A AND B) OR D                                          00000022
           CALL 'PGM00004'                                              00000023
           >>END-IF                                                     00000024
                                                                        00000025
           >>IF A AND (B AND (C OR D))                                  00000026
           CALL 'PGM00005'                                              00000027
           >>END-IF                                                     00000028
                                                                        00000029
           >>IF B AND (C OR D)                                          00000030
           CALL 'PGM00006'                                              00000031
           >>END-IF                                                     00000032
                                                                        00000033
           >>IF (B AND C) OR D                                          00000034
           CALL 'PGM00007'                                              00000035
           >>END-IF                                                     00000036
                                                                        00000037
           >>IF A AND (B OR C) AND D                                    00000038
           CALL 'PGM00008'                                              00000039
           >>END-IF                                                     00000040
                                                                        00000041
           >>IF (A OR D) AND (B OR C)                                   00000042
           CALL 'PGM00009'                                              00000043
           >>END-IF                                                     00000044
                                                                        00000045
           GOBACK.                                                      00000046

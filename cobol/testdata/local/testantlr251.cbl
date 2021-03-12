       PROCESS DEFINE(A=B'1'),DEFINE(B=B'0')                            00000001
       ID Division.                                                     00000002
       Program-ID. testantlr251.                                        00000003
       Procedure Division.                                              00000004
           >>IF A                                                       00000005
           CALL 'PGM0001A'                                              00000006
           >>END-IF                                                     00000007
                                                                        00000008
           >>IF B                                                       00000009
           CALL 'PGM0001B'                                              00000010
           >>END-IF                                                     00000011
                                                                        00000012
           >>DEFINE A B'0' OVERRIDE                                     00000013
           >>DEFINE B B'1' OVERRIDE                                     00000014
                                                                        00000015
           >>IF A                                                       00000016
           CALL 'PGM0001C'                                              00000017
           >>END-IF                                                     00000018
                                                                        00000019
           >>IF B                                                       00000020
           CALL 'PGM0001D'                                              00000021
           >>END-IF                                                     00000022
                                                                        00000023
           >>DEFINE A AS PARAMETER                                      00000024
           >>DEFINE B AS PARAMETER                                      00000025
                                                                        00000026
           >>IF A                                                       00000027
           CALL 'PGM0001E'                                              00000028
           >>END-IF                                                     00000029
                                                                        00000030
           >>IF B                                                       00000031
           CALL 'PGM0001F'                                              00000032
           >>END-IF                                                     00000033
                                                                        00000034
           >>IF A                                                       00000035
           COPY testantlr251.cpy.                                       00000036
           >>END-IF                                                     00000037
                                                                        00000038
           >>IF B                                                       00000039
           CALL 'PGM0001G'                                              00000040
           >>END-IF                                                     00000041
                                                                        00000042
           >>DEFINE B AS PARAMETER                                      00000043
                                                                        00000044
           >>IF B                                                       00000045
           CALL 'PGM0001H'                                              00000046
           >>END-IF                                                     00000047
                                                                        00000048
           GOBACK.                                                      00000049

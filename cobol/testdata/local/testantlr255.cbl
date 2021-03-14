       ID Division.                                                     00000001
       Program-ID. testantlr255.                                        00000002
       Procedure Division.                                              00000003
                                                                        00000004
       >>DEFINE VAR1 'ALICE'                                            00000005
       >>DEFINE VAR2 'JULIA'                                            00000006
       >>DEFINE VAR3 'KADY'                                             00000007
       >>DEFINE VAR4 'MARGOT'                                           00000008
                                                                        00000009
       >>EVALUATE VAR1                                                  00000010
       >>WHEN 'MARGOT'                                                  00000011
           EXEC CICS                                                    00000012
                LINK                                                    00000013
                PROGRAM('PGM00001')                                     00000014
           END-EXEC                                                     00000015
       >>WHEN VAR3                                                      00000016
           EXEC CICS                                                    00000017
                LINK                                                    00000018
                PROGRAM('PGM00002')                                     00000019
           END-EXEC                                                     00000020
       >>WHEN VAR4                                                      00000021
           EXEC CICS                                                    00000022
                LINK                                                    00000023
                PROGRAM('PGM00003')                                     00000024
           END-EXEC                                                     00000025
       >>WHEN OTHER                                                     00000026
           EXEC CICS                                                    00000027
                LINK                                                    00000028
                PROGRAM('PGM00004')                                     00000029
           END-EXEC                                                     00000030
       >>END-EVALUATE                                                   00000031
                                                                        00000032
       >>EVALUATE VAR1                                                  00000033
       >>WHEN 'ALICE'                                                   00000034
           EXEC CICS                                                    00000035
                LINK                                                    00000036
                PROGRAM('PGM00005')                                     00000037
           END-EXEC                                                     00000038
       >>WHEN VAR2                                                      00000039
           EXEC CICS                                                    00000040
                LINK                                                    00000041
                PROGRAM('PGM00006')                                     00000042
           END-EXEC                                                     00000043
       >>WHEN VAR4                                                      00000044
           EXEC CICS                                                    00000045
                LINK                                                    00000046
                PROGRAM('PGM00007')                                     00000047
           END-EXEC                                                     00000048
       >>WHEN OTHER                                                     00000049
           EXEC CICS                                                    00000050
                LINK                                                    00000051
                PROGRAM('PGM00008')                                     00000052
           END-EXEC                                                     00000053
       >>END-EVALUATE                                                   00000054
                                                                        00000055
       >>IF VAR2 = 'BRAKEBILLS'                                         00000056
           EXEC CICS                                                    00000057
                LINK                                                    00000058
                PROGRAM('PGM00009')                                     00000059
           END-EXEC                                                     00000060
       >>ELSE                                                           00000061
           EXEC CICS                                                    00000062
                LINK                                                    00000063
                PROGRAM('PGM00010')                                     00000064
           END-EXEC                                                     00000065
       >>END-IF                                                         00000066
                                                                        00000067
       >>IF VAR1 DEFINED                                                00000068
           EXEC CICS                                                    00000069
                LINK                                                    00000070
                PROGRAM('PGM00011')                                     00000071
           END-EXEC                                                     00000072
       >>END-IF                                                         00000073
                                                                        00000074
       >>IF VAR5 DEFINED                                                00000075
           >>IF VAR5 = 'QUENTIN'                                        00000076
               EXEC CICS                                                00000077
                    LINK                                                00000078
                    PROGRAM('PGM00012')                                 00000079
               END-EXEC                                                 00000080
           >>END-IF                                                     00000081
       >>ELSE                                                           00000082
           >>DEFINE VAR5 'PENNY'                                        00000083
       >>END-IF                                                         00000084
                                                                        00000085
       >>IF VAR5 = 'PENNY'                                              00000086
           EXEC CICS                                                    00000087
                LINK                                                    00000088
                PROGRAM('PGM00013')                                     00000089
           END-EXEC                                                     00000090
       >>END-IF                                                         00000091
                                                                        00000092
                                                                        00000093
           GOBACK.                                                      00000094

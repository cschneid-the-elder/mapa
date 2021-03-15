       ID Division.                                                     00000001
       Program-ID. testantlr254.                                        00000002
       Procedure Division.                                              00000003
                                                                        00000004
       >>DEFINE VAR1 1                                                  00000005
       >>DEFINE VAR2 2                                                  00000006
       >>DEFINE VAR3 3                                                  00000007
       >>DEFINE VAR4 4                                                  00000008
                                                                        00000009
       >>EVALUATE VAR1                                                  00000010
       >>WHEN VAR2                                                      00000011
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
       >>WHEN VAR2 - 1                                                  00000034
           EXEC CICS                                                    00000035
                LINK                                                    00000036
                PROGRAM('PGM00005')                                     00000037
           END-EXEC                                                     00000038
       >>WHEN VAR3 - 1                                                  00000039
           EXEC CICS                                                    00000040
                LINK                                                    00000041
                PROGRAM('PGM00006')                                     00000042
           END-EXEC                                                     00000043
       >>WHEN VAR4 - 1                                                  00000044
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
       >>IF VAR1 = VAR2 - 1                                             00000056
           EXEC CICS                                                    00000057
                LINK                                                    00000058
                PROGRAM('PGM00009')                                     00000059
           END-EXEC                                                     00000060
       >>END-IF                                                         00000061
                                                                        00000062
       >>EVALUATE VAR1 + 1                                              00000063
       >>WHEN VAR2 - 1                                                  00000064
           EXEC CICS                                                    00000065
                LINK                                                    00000066
                PROGRAM('PGM00010')                                     00000067
           END-EXEC                                                     00000068
       >>WHEN VAR3 - 1                                                  00000069
           EXEC CICS                                                    00000070
                LINK                                                    00000071
                PROGRAM('PGM00011')                                     00000072
           END-EXEC                                                     00000073
       >>WHEN VAR4 - 1                                                  00000074
           EXEC CICS                                                    00000075
                LINK                                                    00000076
                PROGRAM('PGM00012')                                     00000077
           END-EXEC                                                     00000078
       >>WHEN OTHER                                                     00000079
           EXEC CICS                                                    00000080
                LINK                                                    00000081
                PROGRAM('PGM00013')                                     00000082
           END-EXEC                                                     00000083
       >>END-EVALUATE                                                   00000084
                                                                        00000085
       >>EVALUATE TRUE                                                  00000086
       >>WHEN VAR1 = VAR2                                               00000087
           EXEC CICS                                                    00000088
                LINK                                                    00000089
                PROGRAM('PGM00014')                                     00000090
           END-EXEC                                                     00000091
       >>WHEN VAR3 = VAR4                                               00000092
           EXEC CICS                                                    00000093
                LINK                                                    00000094
                PROGRAM('PGM00015')                                     00000095
           END-EXEC                                                     00000096
       >>WHEN VAR4 - 1 = VAR2 + 1                                       00000097
           EXEC CICS                                                    00000098
                LINK                                                    00000099
                PROGRAM('PGM00016')                                     00000100
           END-EXEC                                                     00000101
       >>WHEN OTHER                                                     00000102
           EXEC CICS                                                    00000103
                LINK                                                    00000104
                PROGRAM('PGM00017')                                     00000105
           END-EXEC                                                     00000106
       >>END-EVALUATE                                                   00000107
                                                                        00000108
       >>IF VAR4 - 1 = VAR2 + 1                                         00000109
           EXEC CICS                                                    00000110
                LINK                                                    00000111
                PROGRAM('PGM00018')                                     00000112
           END-EXEC                                                     00000113
       >>END-IF                                                         00000114
                                                                        00000115
           GOBACK.                                                      00000116

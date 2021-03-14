000001 ID Division.                                                     00000001
000002 Program-ID. testantlr354.                                        00000002
000003 Procedure Division.                                              00000003
000004                                                                  00000004
000005 >>DEFINE VAR1 1                                                  00000005
000006 >>DEFINE VAR2 2                                                  00000006
000007 >>DEFINE VAR3 3                                                  00000007
000008 >>DEFINE VAR4 4                                                  00000008
000009                                                                  00000009
000010 >>EVALUATE VAR1                                                  00000010
000011 >>WHEN VAR2                                                      00000011
000012     EXEC CICS                                                    00000012
000013          LINK                                                    00000013
000014          PROGRAM('PGM00001')                                     00000014
000015     END-EXEC                                                     00000015
000016 >>WHEN VAR3                                                      00000016
000017     EXEC CICS                                                    00000017
000018          LINK                                                    00000018
000019          PROGRAM('PGM00002')                                     00000019
000020     END-EXEC                                                     00000020
000021 >>WHEN VAR4                                                      00000021
000022     EXEC CICS                                                    00000022
000023          LINK                                                    00000023
000024          PROGRAM('PGM00003')                                     00000024
000025     END-EXEC                                                     00000025
000026 >>WHEN OTHER                                                     00000026
000027     EXEC CICS                                                    00000027
000028          LINK                                                    00000028
000029          PROGRAM('PGM00004')                                     00000029
000030     END-EXEC                                                     00000030
000031 >>END-EVALUATE                                                   00000031
000032                                                                  00000032
000033 >>EVALUATE VAR1                                                  00000033
000034 >>WHEN VAR2 - 1                                                  00000034
000035     EXEC CICS                                                    00000035
000036          LINK                                                    00000036
000037          PROGRAM('PGM00005')                                     00000037
000038     END-EXEC                                                     00000038
000039 >>WHEN VAR3 - 1                                                  00000039
000040     EXEC CICS                                                    00000040
000041          LINK                                                    00000041
000042          PROGRAM('PGM00006')                                     00000042
000043     END-EXEC                                                     00000043
000044 >>WHEN VAR4 - 1                                                  00000044
000045     EXEC CICS                                                    00000045
000046          LINK                                                    00000046
000047          PROGRAM('PGM00007')                                     00000047
000048     END-EXEC                                                     00000048
000049 >>WHEN OTHER                                                     00000049
000050     EXEC CICS                                                    00000050
000051          LINK                                                    00000051
000052          PROGRAM('PGM00008')                                     00000052
000053     END-EXEC                                                     00000053
000054 >>END-EVALUATE                                                   00000054
000055                                                                  00000055
000056 >>IF VAR1 = VAR2 - 1                                             00000056
000057     EXEC CICS                                                    00000057
000058          LINK                                                    00000058
000059          PROGRAM('PGM00009')                                     00000059
000060     END-EXEC                                                     00000060
000061 >>END-IF                                                         00000061
000062                                                                  00000062
000063 >>EVALUATE VAR1 + 1                                              00000063
000064 >>WHEN VAR2 - 1                                                  00000064
000065     EXEC CICS                                                    00000065
000066          LINK                                                    00000066
000067          PROGRAM('PGM00010')                                     00000067
000068     END-EXEC                                                     00000068
000069 >>WHEN VAR3 - 1                                                  00000069
000070     EXEC CICS                                                    00000070
000071          LINK                                                    00000071
000072          PROGRAM('PGM00011')                                     00000072
000073     END-EXEC                                                     00000073
000074 >>WHEN VAR4 - 1                                                  00000074
000075     EXEC CICS                                                    00000075
000076          LINK                                                    00000076
000077          PROGRAM('PGM00012')                                     00000077
000078     END-EXEC                                                     00000078
000079 >>WHEN OTHER                                                     00000079
000080     EXEC CICS                                                    00000080
000081          LINK                                                    00000081
000082          PROGRAM('PGM00013')                                     00000082
000083     END-EXEC                                                     00000083
000084 >>END-EVALUATE                                                   00000084
000085                                                                  00000085
000086 >>EVALUATE TRUE                                                  00000086
000087 >>WHEN VAR1 = VAR2                                               00000087
000088     EXEC CICS                                                    00000088
000089          LINK                                                    00000089
000090          PROGRAM('PGM00014')                                     00000090
000091     END-EXEC                                                     00000091
000092 >>WHEN VAR3 = VAR4                                               00000092
000093     EXEC CICS                                                    00000093
000094          LINK                                                    00000094
000095          PROGRAM('PGM00015')                                     00000095
000096     END-EXEC                                                     00000096
000097 >>WHEN VAR4 - 1 = VAR2 + 1                                       00000097
000098     EXEC CICS                                                    00000098
000099          LINK                                                    00000099
000100          PROGRAM('PGM00016')                                     00000100
000101     END-EXEC                                                     00000101
000102 >>WHEN OTHER                                                     00000102
000103     EXEC CICS                                                    00000103
000104          LINK                                                    00000104
000105          PROGRAM('PGM00017')                                     00000105
000106     END-EXEC                                                     00000106
000107 >>END-EVALUATE                                                   00000107
000108                                                                  00000108
000109 >>IF VAR4 - 1 = VAR2 + 1                                         00000109
000110     EXEC CICS                                                    00000110
000111          LINK                                                    00000111
000112          PROGRAM('PGM00018')                                     00000112
000113     END-EXEC                                                     00000113
000114 >>END-IF                                                         00000114
000115                                                                  00000115
000116     GOBACK.                                                      00000116

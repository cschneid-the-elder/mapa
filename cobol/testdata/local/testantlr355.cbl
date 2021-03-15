000001 ID Division.                                                     00000001
000002 Program-ID. testantlr355.                                        00000002
000003 Procedure Division.                                              00000003
000004                                                                  00000004
000005 >>DEFINE VAR1 'ALICE'                                            00000005
000006 >>DEFINE VAR2 'JULIA'                                            00000006
000007 >>DEFINE VAR3 'KADY'                                             00000007
000008 >>DEFINE VAR4 'MARGOT'                                           00000008
000009                                                                  00000009
000010 >>EVALUATE VAR1                                                  00000010
000011 >>WHEN 'MARGOT'                                                  00000011
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
000034 >>WHEN 'ALICE'                                                   00000034
000035     EXEC CICS                                                    00000035
000036          LINK                                                    00000036
000037          PROGRAM('PGM00005')                                     00000037
000038     END-EXEC                                                     00000038
000039 >>WHEN VAR2                                                      00000039
000040     EXEC CICS                                                    00000040
000041          LINK                                                    00000041
000042          PROGRAM('PGM00006')                                     00000042
000043     END-EXEC                                                     00000043
000044 >>WHEN VAR4                                                      00000044
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
000056 >>IF VAR2 = 'BRAKEBILLS'                                         00000056
000057     EXEC CICS                                                    00000057
000058          LINK                                                    00000058
000059          PROGRAM('PGM00009')                                     00000059
000060     END-EXEC                                                     00000060
000061 >>ELSE                                                           00000061
000062     EXEC CICS                                                    00000062
000063          LINK                                                    00000063
000064          PROGRAM('PGM00010')                                     00000064
000065     END-EXEC                                                     00000065
000066 >>END-IF                                                         00000066
000067                                                                  00000067
000068 >>IF VAR1 DEFINED                                                00000068
000069     EXEC CICS                                                    00000069
000070          LINK                                                    00000070
000071          PROGRAM('PGM00011')                                     00000071
000072     END-EXEC                                                     00000072
000073 >>END-IF                                                         00000073
000074                                                                  00000074
000075 >>IF VAR5 DEFINED                                                00000075
000076     >>IF VAR5 = 'QUENTIN'                                        00000076
000077         EXEC CICS                                                00000077
000078              LINK                                                00000078
000079              PROGRAM('PGM00012')                                 00000079
000080         END-EXEC                                                 00000080
000081     >>END-IF                                                     00000081
000082 >>ELSE                                                           00000082
000083     >>DEFINE VAR5 'PENNY'                                        00000083
000084 >>END-IF                                                         00000084
000085                                                                  00000085
000086 >>IF VAR5 = 'PENNY'                                              00000086
000087     EXEC CICS                                                    00000087
000088          LINK                                                    00000088
000089          PROGRAM('PGM00013')                                     00000089
000090     END-EXEC                                                     00000090
000091 >>END-IF                                                         00000091
000092                                                                  00000092
000093                                                                  00000093
000094     GOBACK.                                                      00000094

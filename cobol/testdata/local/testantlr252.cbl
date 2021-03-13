       ID Division.                                                     00000001
       Program-ID. testantlr252.                                        00000002
       Procedure Division.                                              00000003
                                                                        00000004
       >>DEFINE IGY-ARCH 0                                              00000005
       >>DEFINE VAR1 0                                                  00000006
                                                                        00000007
       >>EVALUATE TRUE                                                  00000008
       >>WHEN IGY-CICS                                                  00000009
           EXEC CICS                                                    00000010
                XCTL                                                    00000011
                PROGRAM('IGYCICS1')                                     00000012
           END-EXEC                                                     00000013
       >>WHEN IGY-ARCH > 10                                             00000014
           CALL 'IGYARCH1' USING                                        00000015
                X                                                       00000016
                Y                                                       00000017
                Z                                                       00000018
           END-CALL                                                     00000019
       >>WHEN VAR2 IS DEFINED                                           00000020
           CALL 'VAR2#1' USING                                          00000021
                X                                                       00000022
                Y                                                       00000023
                Z                                                       00000024
           END-CALL                                                     00000025
       >>WHEN VAR1 + 1 = 2                                              00000026
           CALL 'VAR1#1' USING                                          00000027
                X                                                       00000028
                Y                                                       00000029
                Z                                                       00000030
           END-CALL                                                     00000031
       >>WHEN OTHER                                                     00000032
           CALL 'OTHER#1' USING                                         00000033
                X                                                       00000034
                Y                                                       00000035
                Z                                                       00000036
           END-CALL                                                     00000037
       >>END-EVALUATE                                                   00000038
                                                                        00000039
       >>DEFINE VAR1 AS 1                                               00000040
                                                                        00000041
       >>EVALUATE TRUE                                                  00000042
       >>WHEN IGY-CICS                                                  00000043
           EXEC CICS                                                    00000044
                XCTL                                                    00000045
                PROGRAM('IGYCICS2')                                     00000046
           END-EXEC                                                     00000047
       >>WHEN IGY-ARCH > 10                                             00000048
           CALL 'IGYARCH2' USING                                        00000049
                X                                                       00000050
                Y                                                       00000051
                Z                                                       00000052
           END-CALL                                                     00000053
       >>WHEN VAR2 IS DEFINED                                           00000054
           CALL 'VAR2#2' USING                                          00000055
                X                                                       00000056
                Y                                                       00000057
                Z                                                       00000058
           END-CALL                                                     00000059
       >>WHEN VAR1 + 1 = 2                                              00000060
           CALL 'VAR1#2' USING                                          00000061
                X                                                       00000062
                Y                                                       00000063
                Z                                                       00000064
           END-CALL                                                     00000065
       >>WHEN OTHER                                                     00000066
           CALL 'OTHER#2' USING                                         00000067
                X                                                       00000068
                Y                                                       00000069
                Z                                                       00000070
           END-CALL                                                     00000071
       >>END-EVALUATE                                                   00000072
                                                                        00000073
       >>DEFINE VAR2                                                    00000074
                                                                        00000075
       >>EVALUATE TRUE                                                  00000076
       >>WHEN IGY-CICS                                                  00000077
           EXEC CICS                                                    00000078
                XCTL                                                    00000079
                PROGRAM('IGYCICS3')                                     00000080
           END-EXEC                                                     00000081
       >>WHEN IGY-ARCH > 10                                             00000082
           CALL 'IGYARCH3' USING                                        00000083
                X                                                       00000084
                Y                                                       00000085
                Z                                                       00000086
           END-CALL                                                     00000087
       >>WHEN VAR2 IS DEFINED                                           00000088
           CALL 'VAR2#3' USING                                          00000089
                X                                                       00000090
                Y                                                       00000091
                Z                                                       00000092
           END-CALL                                                     00000093
       >>WHEN VAR1 + 1 = 2                                              00000094
           CALL 'VAR1#3' USING                                          00000095
                X                                                       00000096
                Y                                                       00000097
                Z                                                       00000098
           END-CALL                                                     00000099
       >>WHEN OTHER                                                     00000100
           CALL 'OTHER#3' USING                                         00000101
                X                                                       00000102
                Y                                                       00000103
                Z                                                       00000104
           END-CALL                                                     00000105
       >>END-EVALUATE                                                   00000106
                                                                        00000107
       >>DEFINE IGY-ARCH 11                                             00000108
                                                                        00000109
       >>EVALUATE TRUE                                                  00000110
       >>WHEN IGY-CICS                                                  00000111
           EXEC CICS                                                    00000112
                XCTL                                                    00000113
                PROGRAM('IGYCICS4')                                     00000114
           END-EXEC                                                     00000115
       >>WHEN IGY-ARCH > 10                                             00000116
           CALL 'IGYARCH4' USING                                        00000117
                X                                                       00000118
                Y                                                       00000119
                Z                                                       00000120
           END-CALL                                                     00000121
       >>WHEN VAR2 IS DEFINED                                           00000122
           CALL 'VAR2#4' USING                                          00000123
                X                                                       00000124
                Y                                                       00000125
                Z                                                       00000126
           END-CALL                                                     00000127
       >>WHEN VAR1 + 1 = 2                                              00000128
           CALL 'VAR1#4' USING                                          00000129
                X                                                       00000130
                Y                                                       00000131
                Z                                                       00000132
           END-CALL                                                     00000133
       >>WHEN OTHER                                                     00000134
           CALL 'OTHER#4' USING                                         00000135
                X                                                       00000136
                Y                                                       00000137
                Z                                                       00000138
           END-CALL                                                     00000139
       >>END-EVALUATE                                                   00000140
                                                                        00000141
       >>DEFINE IGY-CICS                                                00000142
                                                                        00000143
       >>EVALUATE TRUE                                                  00000144
       >>WHEN IGY-CICS                                                  00000145
           EXEC CICS                                                    00000146
                XCTL                                                    00000147
                PROGRAM('IGYCICS5')                                     00000148
           END-EXEC                                                     00000149
       >>WHEN IGY-ARCH > 10                                             00000150
           CALL 'IGYARCH5' USING                                        00000151
                X                                                       00000152
                Y                                                       00000153
                Z                                                       00000154
           END-CALL                                                     00000155
       >>WHEN VAR2 IS DEFINED                                           00000156
           CALL 'VAR2#5' USING                                          00000157
                X                                                       00000158
                Y                                                       00000159
                Z                                                       00000160
           END-CALL                                                     00000161
       >>WHEN VAR1 + 1 = 2                                              00000162
           CALL 'VAR1#5' USING                                          00000163
                X                                                       00000164
                Y                                                       00000165
                Z                                                       00000166
           END-CALL                                                     00000167
       >>WHEN OTHER                                                     00000168
           CALL 'OTHER#5' USING                                         00000169
                X                                                       00000170
                Y                                                       00000171
                Z                                                       00000172
           END-CALL                                                     00000173
       >>END-EVALUATE                                                   00000174
                                                                        00000175
                                                                        00000176
           GOBACK.                                                      00000177

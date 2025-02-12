000001 Identification Division.                                         00000001
000002 Program-ID. testantlr332.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr332'.    00000006
000007                                                                  00000007
000008 01  SWITCHES.                                                    00000008
000009     05  SD-001-TRUTH-SW      PIC X(008).                         00000009
000010         88  SD-001-TRUTH     VALUE 'ZAPHOD'.                     00000010
000011                                                                  00000011
000012*                                                                 00000012
000013 01  SOME-DATA.                                                   00000013
000014     05  SD-001               PIC X(008).                         00000014
000015     05  SD-002.                                                  00000015
000016         10  SD-002-A         PIC X(001).                         00000016
000017         10  SD-002-B         PIC X(001).                         00000017
000018     05  SD-003               PIC X(008).                         00000018
000019                                                                  00000019
000020 01  WS-BUF                   PIC X(100).                         00000020
000021                                                                  00000021
000022 77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000022
000023                                                                  00000023
000024 Procedure Division.                                              00000024
000025     DISPLAY MYNAME ' Begin'                                      00000025
000026                                                                  00000026
000027     JSON GENERATE WS-BUF FROM SOME-DATA END-JSON                 00000027
000028                                                                  00000028
000029     JSON GENERATE WS-BUF FROM SOME-DATA                          00000029
000030         ENCODING 37                                              00000030
000031     END-JSON                                                     00000031
000032                                                                  00000032
000033     JSON GENERATE WS-BUF FROM SOME-DATA                          00000033
000034         ENCODING WS-COUNT                                        00000034
000035     END-JSON                                                     00000035
000036                                                                  00000036
000037     JSON GENERATE WS-BUF FROM SOME-DATA                          00000037
000038         ENCODING FROM CODEPAGE                                   00000038
000039     END-JSON                                                     00000039
000040                                                                  00000040
000041     JSON GENERATE                                                00000041
000042         WS-BUF FROM SOME-DATA                                    00000042
000043         COUNT WS-COUNT                                           00000043
000044         NAME SD-001 'ARTHUR'                                     00000044
000045              SD-002 'DENT'                                       00000045
000046         SUPPRESS                                                 00000046
000047              SD-001                                              00000047
000048              SD-002                                              00000048
000049         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000049
000050         NOT ON EXCEPTION PERFORM 1000-para                       00000050
000051     END-JSON                                                     00000051
000052                                                                  00000052
000053     JSON GENERATE                                                00000053
000054         WS-BUF FROM SOME-DATA                                    00000054
000055         COUNT IN WS-COUNT                                        00000055
000056         NAME OF SD-001 IS 'ARTHUR'                               00000056
000057                 SD-002 IS 'DENT'                                 00000057
000058         SUPPRESS SD-001 SD-003                                   00000058
000059         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000059
000060         NOT ON EXCEPTION PERFORM 1000-para                       00000060
000061     END-JSON                                                     00000061
000062                                                                  00000062
000063     JSON GENERATE                                                00000063
000064         WS-BUF FROM SOME-DATA                                    00000064
000065         COUNT IN WS-COUNT                                        00000065
000066         NAME OF SD-001 IS 'ARTHUR'                               00000066
000067                 SD-002 IS 'DENT'                                 00000067
000068         SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000068
000069         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000069
000070         NOT ON EXCEPTION PERFORM 1000-para                       00000070
000071     END-JSON                                                     00000071
000072                                                                  00000072
000073     JSON GENERATE                                                00000073
000074         WS-BUF FROM SOME-DATA                                    00000074
000075         COUNT IN WS-COUNT                                        00000075
000076         NAME OF SD-001 IS 'ARTHUR'                               00000076
000077                 SD-002 IS 'DENT'                                 00000077
000078         SUPPRESS                                                 00000078
000079                 EVERY NUMERIC WHEN ZEROES                        00000079
000080                 EVERY NONNUMERIC WHEN SPACES                     00000080
000081                 EVERY NONNUMERIC WHEN LOW-VALUES                 00000081
000082                 EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000082
000083         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000083
000084         NOT ON EXCEPTION PERFORM 1000-para                       00000084
000085     END-JSON                                                     00000085
000086                                                                  00000086
000087     JSON GENERATE                                                00000087
000088         WS-BUF FROM SOME-DATA                                    00000088
000089         COUNT WS-COUNT                                           00000089
000090         NAME SD-001 'ARTHUR'                                     00000090
000091              SD-002 'DENT'                                       00000091
000092         SUPPRESS                                                 00000092
000093              SD-001 WHEN SPACES                                  00000093
000094              SD-002 WHEN LOW-VALUES                              00000094
000095         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000095
000096         NOT ON EXCEPTION PERFORM 1000-para                       00000096
000097     END-JSON                                                     00000097
000098                                                                  00000098
000099     JSON GENERATE                                                00000099
000100         WS-BUF FROM SOME-DATA                                    00000100
000101         COUNT WS-COUNT                                           00000101
000102         NAME SD-001 'ARTHUR'                                     00000102
000103              SD-002 'DENT'                                       00000103
000104         SUPPRESS                                                 00000104
000105              SD-001                                              00000105
000106              SD-002                                              00000106
000107         CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000107
000108         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000108
000109         NOT ON EXCEPTION PERFORM 1000-para                       00000109
000110     END-JSON                                                     00000110
000111                                                                  00000111
000112     JSON GENERATE                                                00000112
000113         WS-BUF FROM SOME-DATA                                    00000113
000114         COUNT WS-COUNT                                           00000114
000115         NAME SD-001 'ARTHUR'                                     00000115
000116              SD-002 'DENT'                                       00000116
000117         SUPPRESS                                                 00000117
000118              SD-001                                              00000118
000119              SD-002                                              00000119
000120         CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000120
000121         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000121
000122         NOT ON EXCEPTION PERFORM 1000-para                       00000122
000123     END-JSON                                                     00000123
000124                                                                  00000124
000125     JSON GENERATE                                                00000125
000126         WS-BUF FROM SOME-DATA                                    00000126
000127         COUNT WS-COUNT                                           00000127
000128         NAME SD-001 'ARTHUR'                                     00000128
000129              SD-002 'DENT'                                       00000129
000130         SUPPRESS                                                 00000130
000131              SD-001                                              00000131
000132              SD-002                                              00000132
000133         CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000133
000134         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000134
000135         NOT ON EXCEPTION PERFORM 1000-para                       00000135
000136     END-JSON                                                     00000136
000137                                                                  00000137
000138     JSON GENERATE                                                00000138
000139         WS-BUF FROM SOME-DATA                                    00000139
000140         COUNT WS-COUNT                                           00000140
000141         NAME SD-001 'ARTHUR'                                     00000141
000142              SD-002 'DENT'                                       00000142
000143         SUPPRESS                                                 00000143
000144              SD-001                                              00000144
000145              SD-002                                              00000145
000146         CONVERTING SD-003 JSON NULL USING SPACES                 00000146
000147         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000147
000148         NOT ON EXCEPTION PERFORM 1000-para                       00000148
000149     END-JSON                                                     00000149
000150                                                                  00000150
000151     JSON GENERATE                                                00000151
000152         WS-BUF FROM SOME-DATA                                    00000152
000153         COUNT WS-COUNT                                           00000153
000154         NAME SD-001 'ARTHUR'                                     00000154
000155              SD-002 'DENT'                                       00000155
000156         SUPPRESS                                                 00000156
000157              SD-001                                              00000157
000158              SD-002                                              00000158
000159         CONVERTING SD-003 NULL USING SPACES                      00000159
000160         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000160
000161         NOT ON EXCEPTION PERFORM 1000-para                       00000161
000162     END-JSON                                                     00000162
000163                                                                  00000163
000164     JSON GENERATE                                                00000164
000165         WS-BUF FROM SOME-DATA                                    00000165
000166         COUNT WS-COUNT                                           00000166
000167         NAME SD-001 'ARTHUR'                                     00000167
000168              SD-002 'DENT'                                       00000168
000169         SUPPRESS                                                 00000169
000170              SD-001                                              00000170
000171              SD-002                                              00000171
000172         CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000172
000173         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000173
000174         NOT ON EXCEPTION PERFORM 1000-para                       00000174
000175     END-JSON                                                     00000175
000176                                                                  00000176
000177     JSON GENERATE                                                00000177
000178         WS-BUF FROM SOME-DATA                                    00000178
000179         COUNT WS-COUNT                                           00000179
000180         NAME SD-001 'ARTHUR'                                     00000180
000181              SD-002 'DENT'                                       00000181
000182         SUPPRESS                                                 00000182
000183              SD-001                                              00000183
000184              SD-002                                              00000184
000185         CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000185
000186         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000186
000187         NOT ON EXCEPTION PERFORM 1000-para                       00000187
000188     END-JSON                                                     00000188
000189                                                                  00000189
000190     JSON GENERATE                                                00000190
000191         WS-BUF FROM SOME-DATA                                    00000191
000192         COUNT WS-COUNT                                           00000192
000193         NAME SD-001 'ARTHUR'                                     00000193
000194              SD-002 'DENT'                                       00000194
000195         SUPPRESS                                                 00000195
000196              SD-001                                              00000196
000197              SD-002                                              00000197
000198         CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000198
000199         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000199
000200         NOT ON EXCEPTION PERFORM 1000-para                       00000200
000201     END-JSON                                                     00000201
000202                                                                  00000202
000203     JSON GENERATE                                                00000203
000204         WS-BUF FROM SOME-DATA                                    00000204
000205         COUNT WS-COUNT                                           00000205
000206         NAME SD-001 'ARTHUR'                                     00000206
000207              SD-002 'DENT'                                       00000207
000208         SUPPRESS                                                 00000208
000209              SD-001                                              00000209
000210              SD-002                                              00000210
000211         CONVERTING                                               00000211
000212              SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000212
000213              ALSO SD-002 BOOL '&&'                               00000213
000214         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000214
000215         NOT ON EXCEPTION PERFORM 1000-para                       00000215
000216     END-JSON                                                     00000216
000217                                                                  00000217
000218                                                                  00000218
000219     DISPLAY MYNAME ' End'                                        00000219
000220                                                                  00000220
000221     GOBACK                                                       00000221
000222     .                                                            00000222
000223                                                                  00000223
000224 1000-para.                                                       00000224
000225                                                                  00000225
000226     .                                                            00000226
000227                                                                  00000227

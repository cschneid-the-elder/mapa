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
000055         COUNT CHARACTERS WS-COUNT                                00000055
000056         NAME SD-001 'ARTHUR'                                     00000056
000057              SD-002 'DENT'                                       00000057
000058         SUPPRESS                                                 00000058
000059              SD-001                                              00000059
000060              SD-002                                              00000060
000061         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000061
000062         NOT ON EXCEPTION PERFORM 1000-para                       00000062
000063     END-JSON                                                     00000063
000064                                                                  00000064
000065     JSON GENERATE                                                00000065
000066         WS-BUF FROM SOME-DATA                                    00000066
000067         COUNT BYTES WS-COUNT                                     00000067
000068         NAME SD-001 'ARTHUR'                                     00000068
000069              SD-002 'DENT'                                       00000069
000070         SUPPRESS                                                 00000070
000071              SD-001                                              00000071
000072              SD-002                                              00000072
000073         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000073
000074         NOT ON EXCEPTION PERFORM 1000-para                       00000074
000075     END-JSON                                                     00000075
000076                                                                  00000076
000077     JSON GENERATE                                                00000077
000078         WS-BUF FROM SOME-DATA                                    00000078
000079         COUNT IN WS-COUNT                                        00000079
000080         NAME OF SD-001 IS 'ARTHUR'                               00000080
000081                 SD-002 IS 'DENT'                                 00000081
000082         SUPPRESS SD-001 SD-003                                   00000082
000083         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000083
000084         NOT ON EXCEPTION PERFORM 1000-para                       00000084
000085     END-JSON                                                     00000085
000086                                                                  00000086
000087     JSON GENERATE                                                00000087
000088         WS-BUF FROM SOME-DATA                                    00000088
000089         COUNT IN WS-COUNT                                        00000089
000090         NAME OF SD-001 IS 'ARTHUR'                               00000090
000091                 SD-002 IS 'DENT'                                 00000091
000092         SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000092
000093         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000093
000094         NOT ON EXCEPTION PERFORM 1000-para                       00000094
000095     END-JSON                                                     00000095
000096                                                                  00000096
000097     JSON GENERATE                                                00000097
000098         WS-BUF FROM SOME-DATA                                    00000098
000099         COUNT IN WS-COUNT                                        00000099
000100         NAME OF SD-001 IS 'ARTHUR'                               00000100
000101                 SD-002 IS 'DENT'                                 00000101
000102         SUPPRESS                                                 00000102
000103                 EVERY NUMERIC WHEN ZEROES                        00000103
000104                 EVERY NONNUMERIC WHEN SPACES                     00000104
000105                 EVERY NONNUMERIC WHEN LOW-VALUES                 00000105
000106                 EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000106
000107         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000107
000108         NOT ON EXCEPTION PERFORM 1000-para                       00000108
000109     END-JSON                                                     00000109
000110                                                                  00000110
000111     JSON GENERATE                                                00000111
000112         WS-BUF FROM SOME-DATA                                    00000112
000113         COUNT WS-COUNT                                           00000113
000114         NAME SD-001 'ARTHUR'                                     00000114
000115              SD-002 'DENT'                                       00000115
000116         SUPPRESS                                                 00000116
000117              SD-001 WHEN SPACES                                  00000117
000118              SD-002 WHEN LOW-VALUES                              00000118
000119         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000119
000120         NOT ON EXCEPTION PERFORM 1000-para                       00000120
000121     END-JSON                                                     00000121
000122                                                                  00000122
000123     JSON GENERATE                                                00000123
000124         WS-BUF FROM SOME-DATA                                    00000124
000125         COUNT WS-COUNT                                           00000125
000126         NAME SD-001 'ARTHUR'                                     00000126
000127              SD-002 'DENT'                                       00000127
000128         SUPPRESS                                                 00000128
000129              SD-001                                              00000129
000130              SD-002                                              00000130
000131         CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000131
000132         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000132
000133         NOT ON EXCEPTION PERFORM 1000-para                       00000133
000134     END-JSON                                                     00000134
000135                                                                  00000135
000136     JSON GENERATE                                                00000136
000137         WS-BUF FROM SOME-DATA                                    00000137
000138         COUNT WS-COUNT                                           00000138
000139         NAME SD-001 'ARTHUR'                                     00000139
000140              SD-002 'DENT'                                       00000140
000141         SUPPRESS                                                 00000141
000142              SD-001                                              00000142
000143              SD-002                                              00000143
000144         CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000144
000145         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000145
000146         NOT ON EXCEPTION PERFORM 1000-para                       00000146
000147     END-JSON                                                     00000147
000148                                                                  00000148
000149     JSON GENERATE                                                00000149
000150         WS-BUF FROM SOME-DATA                                    00000150
000151         COUNT WS-COUNT                                           00000151
000152         NAME SD-001 'ARTHUR'                                     00000152
000153              SD-002 'DENT'                                       00000153
000154         SUPPRESS                                                 00000154
000155              SD-001                                              00000155
000156              SD-002                                              00000156
000157         CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000157
000158         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000158
000159         NOT ON EXCEPTION PERFORM 1000-para                       00000159
000160     END-JSON                                                     00000160
000161                                                                  00000161
000162     JSON GENERATE                                                00000162
000163         WS-BUF FROM SOME-DATA                                    00000163
000164         COUNT WS-COUNT                                           00000164
000165         NAME SD-001 'ARTHUR'                                     00000165
000166              SD-002 'DENT'                                       00000166
000167         SUPPRESS                                                 00000167
000168              SD-001                                              00000168
000169              SD-002                                              00000169
000170         CONVERTING SD-003 JSON NULL USING SPACES                 00000170
000171         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000171
000172         NOT ON EXCEPTION PERFORM 1000-para                       00000172
000173     END-JSON                                                     00000173
000174                                                                  00000174
000175     JSON GENERATE                                                00000175
000176         WS-BUF FROM SOME-DATA                                    00000176
000177         COUNT WS-COUNT                                           00000177
000178         NAME SD-001 'ARTHUR'                                     00000178
000179              SD-002 'DENT'                                       00000179
000180         SUPPRESS                                                 00000180
000181              SD-001                                              00000181
000182              SD-002                                              00000182
000183         CONVERTING SD-003 NULL USING SPACES                      00000183
000184         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000184
000185         NOT ON EXCEPTION PERFORM 1000-para                       00000185
000186     END-JSON                                                     00000186
000187                                                                  00000187
000188     JSON GENERATE                                                00000188
000189         WS-BUF FROM SOME-DATA                                    00000189
000190         COUNT WS-COUNT                                           00000190
000191         NAME SD-001 'ARTHUR'                                     00000191
000192              SD-002 'DENT'                                       00000192
000193         SUPPRESS                                                 00000193
000194              SD-001                                              00000194
000195              SD-002                                              00000195
000196         CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000196
000197         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000197
000198         NOT ON EXCEPTION PERFORM 1000-para                       00000198
000199     END-JSON                                                     00000199
000200                                                                  00000200
000201     JSON GENERATE                                                00000201
000202         WS-BUF FROM SOME-DATA                                    00000202
000203         COUNT WS-COUNT                                           00000203
000204         NAME SD-001 'ARTHUR'                                     00000204
000205              SD-002 'DENT'                                       00000205
000206         SUPPRESS                                                 00000206
000207              SD-001                                              00000207
000208              SD-002                                              00000208
000209         CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000209
000210         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000210
000211         NOT ON EXCEPTION PERFORM 1000-para                       00000211
000212     END-JSON                                                     00000212
000213                                                                  00000213
000214     JSON GENERATE                                                00000214
000215         WS-BUF FROM SOME-DATA                                    00000215
000216         COUNT WS-COUNT                                           00000216
000217         NAME SD-001 'ARTHUR'                                     00000217
000218              SD-002 'DENT'                                       00000218
000219         SUPPRESS                                                 00000219
000220              SD-001                                              00000220
000221              SD-002                                              00000221
000222         CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000222
000223         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000223
000224         NOT ON EXCEPTION PERFORM 1000-para                       00000224
000225     END-JSON                                                     00000225
000226                                                                  00000226
000227     JSON GENERATE                                                00000227
000228         WS-BUF FROM SOME-DATA                                    00000228
000229         COUNT WS-COUNT                                           00000229
000230         NAME SD-001 'ARTHUR'                                     00000230
000231              SD-002 'DENT'                                       00000231
000232         SUPPRESS                                                 00000232
000233              SD-001                                              00000233
000234              SD-002                                              00000234
000235         CONVERTING                                               00000235
000236              SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000236
000237              ALSO SD-002 BOOL '&&'                               00000237
000238         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000238
000239         NOT ON EXCEPTION PERFORM 1000-para                       00000239
000240     END-JSON                                                     00000240
000241                                                                  00000241
000242                                                                  00000242
000243     DISPLAY MYNAME ' End'                                        00000243
000244                                                                  00000244
000245     GOBACK                                                       00000245
000246     .                                                            00000246
000247                                                                  00000247
000248 1000-para.                                                       00000248
000249                                                                  00000249
000250     .                                                            00000250
000251                                                                  00000251

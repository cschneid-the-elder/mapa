       Identification Division.                                         00000001
       Program-ID. testantlr232.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr232'.    00000006
                                                                        00000007
       01  SWITCHES.                                                    00000008
           05  SD-001-TRUTH-SW      PIC X(008).                         00000009
               88  SD-001-TRUTH     VALUE 'ZAPHOD'.                     00000010
                                                                        00000011
      *                                                                 00000012
       01  SOME-DATA.                                                   00000013
           05  SD-001               PIC X(008).                         00000014
           05  SD-002.                                                  00000015
               10  SD-002-A         PIC X(001).                         00000016
               10  SD-002-B         PIC X(001).                         00000017
           05  SD-003               PIC X(008).                         00000018
                                                                        00000019
       01  WS-BUF                   PIC X(100).                         00000020
                                                                        00000021
       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000022
                                                                        00000023
       Procedure Division.                                              00000024
           DISPLAY MYNAME ' Begin'                                      00000025
                                                                        00000026
           JSON GENERATE WS-BUF FROM SOME-DATA END-JSON                 00000027
                                                                        00000028
           JSON GENERATE WS-BUF FROM SOME-DATA                          00000029
               ENCODING 37                                              00000030
           END-JSON                                                     00000031
                                                                        00000032
           JSON GENERATE WS-BUF FROM SOME-DATA                          00000033
               ENCODING WS-COUNT                                        00000034
           END-JSON                                                     00000035
                                                                        00000036
           JSON GENERATE WS-BUF FROM SOME-DATA                          00000037
               ENCODING FROM CODEPAGE                                   00000038
           END-JSON                                                     00000039
                                                                        00000040
           JSON GENERATE                                                00000041
               WS-BUF FROM SOME-DATA                                    00000042
               COUNT WS-COUNT                                           00000043
               NAME SD-001 'ARTHUR'                                     00000044
                    SD-002 'DENT'                                       00000045
               SUPPRESS                                                 00000046
                    SD-001                                              00000047
                    SD-002                                              00000048
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000049
               NOT ON EXCEPTION PERFORM 1000-para                       00000050
           END-JSON                                                     00000051
                                                                        00000052
           JSON GENERATE                                                00000053
               WS-BUF FROM SOME-DATA                                    00000054
               COUNT CHARACTERS WS-COUNT                                00000055
               NAME SD-001 'ARTHUR'                                     00000056
                    SD-002 'DENT'                                       00000057
               SUPPRESS                                                 00000058
                    SD-001                                              00000059
                    SD-002                                              00000060
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000061
               NOT ON EXCEPTION PERFORM 1000-para                       00000062
           END-JSON                                                     00000063
                                                                        00000064
           JSON GENERATE                                                00000065
               WS-BUF FROM SOME-DATA                                    00000066
               COUNT BYTES WS-COUNT                                     00000067
               NAME SD-001 'ARTHUR'                                     00000068
                    SD-002 'DENT'                                       00000069
               SUPPRESS                                                 00000070
                    SD-001                                              00000071
                    SD-002                                              00000072
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000073
               NOT ON EXCEPTION PERFORM 1000-para                       00000074
           END-JSON                                                     00000075
                                                                        00000076
           JSON GENERATE                                                00000077
               WS-BUF FROM SOME-DATA                                    00000078
               COUNT IN WS-COUNT                                        00000079
               NAME OF SD-001 IS 'ARTHUR'                               00000080
                       SD-002 IS 'DENT'                                 00000081
               SUPPRESS SD-001 SD-003                                   00000082
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000083
               NOT ON EXCEPTION PERFORM 1000-para                       00000084
           END-JSON                                                     00000085
                                                                        00000086
           JSON GENERATE                                                00000087
               WS-BUF FROM SOME-DATA                                    00000088
               COUNT IN WS-COUNT                                        00000089
               NAME OF SD-001 IS 'ARTHUR'                               00000090
                       SD-002 IS 'DENT'                                 00000091
               SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000092
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000093
               NOT ON EXCEPTION PERFORM 1000-para                       00000094
           END-JSON                                                     00000095
                                                                        00000096
           JSON GENERATE                                                00000097
               WS-BUF FROM SOME-DATA                                    00000098
               COUNT IN WS-COUNT                                        00000099
               NAME OF SD-001 IS 'ARTHUR'                               00000100
                       SD-002 IS 'DENT'                                 00000101
               SUPPRESS                                                 00000102
                       EVERY NUMERIC WHEN ZEROES                        00000103
                       EVERY NONNUMERIC WHEN SPACES                     00000104
                       EVERY NONNUMERIC WHEN LOW-VALUES                 00000105
                       EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000106
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000107
               NOT ON EXCEPTION PERFORM 1000-para                       00000108
           END-JSON                                                     00000109
                                                                        00000110
           JSON GENERATE                                                00000111
               WS-BUF FROM SOME-DATA                                    00000112
               COUNT WS-COUNT                                           00000113
               NAME SD-001 'ARTHUR'                                     00000114
                    SD-002 'DENT'                                       00000115
               SUPPRESS                                                 00000116
                    SD-001 WHEN SPACES                                  00000117
                    SD-002 WHEN LOW-VALUES                              00000118
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000119
               NOT ON EXCEPTION PERFORM 1000-para                       00000120
           END-JSON                                                     00000121
                                                                        00000122
           JSON GENERATE                                                00000123
               WS-BUF FROM SOME-DATA                                    00000124
               COUNT WS-COUNT                                           00000125
               NAME SD-001 'ARTHUR'                                     00000126
                    SD-002 'DENT'                                       00000127
               SUPPRESS                                                 00000128
                    SD-001                                              00000129
                    SD-002                                              00000130
               CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000131
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000132
               NOT ON EXCEPTION PERFORM 1000-para                       00000133
           END-JSON                                                     00000134
                                                                        00000135
           JSON GENERATE                                                00000136
               WS-BUF FROM SOME-DATA                                    00000137
               COUNT WS-COUNT                                           00000138
               NAME SD-001 'ARTHUR'                                     00000139
                    SD-002 'DENT'                                       00000140
               SUPPRESS                                                 00000141
                    SD-001                                              00000142
                    SD-002                                              00000143
               CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000144
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000145
               NOT ON EXCEPTION PERFORM 1000-para                       00000146
           END-JSON                                                     00000147
                                                                        00000148
           JSON GENERATE                                                00000149
               WS-BUF FROM SOME-DATA                                    00000150
               COUNT WS-COUNT                                           00000151
               NAME SD-001 'ARTHUR'                                     00000152
                    SD-002 'DENT'                                       00000153
               SUPPRESS                                                 00000154
                    SD-001                                              00000155
                    SD-002                                              00000156
               CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000157
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000158
               NOT ON EXCEPTION PERFORM 1000-para                       00000159
           END-JSON                                                     00000160
                                                                        00000161
           JSON GENERATE                                                00000162
               WS-BUF FROM SOME-DATA                                    00000163
               COUNT WS-COUNT                                           00000164
               NAME SD-001 'ARTHUR'                                     00000165
                    SD-002 'DENT'                                       00000166
               SUPPRESS                                                 00000167
                    SD-001                                              00000168
                    SD-002                                              00000169
               CONVERTING SD-003 JSON NULL USING SPACES                 00000170
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000171
               NOT ON EXCEPTION PERFORM 1000-para                       00000172
           END-JSON                                                     00000173
                                                                        00000174
           JSON GENERATE                                                00000175
               WS-BUF FROM SOME-DATA                                    00000176
               COUNT WS-COUNT                                           00000177
               NAME SD-001 'ARTHUR'                                     00000178
                    SD-002 'DENT'                                       00000179
               SUPPRESS                                                 00000180
                    SD-001                                              00000181
                    SD-002                                              00000182
               CONVERTING SD-003 NULL USING SPACES                      00000183
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000184
               NOT ON EXCEPTION PERFORM 1000-para                       00000185
           END-JSON                                                     00000186
                                                                        00000187
           JSON GENERATE                                                00000188
               WS-BUF FROM SOME-DATA                                    00000189
               COUNT WS-COUNT                                           00000190
               NAME SD-001 'ARTHUR'                                     00000191
                    SD-002 'DENT'                                       00000192
               SUPPRESS                                                 00000193
                    SD-001                                              00000194
                    SD-002                                              00000195
               CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000196
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000197
               NOT ON EXCEPTION PERFORM 1000-para                       00000198
           END-JSON                                                     00000199
                                                                        00000200
           JSON GENERATE                                                00000201
               WS-BUF FROM SOME-DATA                                    00000202
               COUNT WS-COUNT                                           00000203
               NAME SD-001 'ARTHUR'                                     00000204
                    SD-002 'DENT'                                       00000205
               SUPPRESS                                                 00000206
                    SD-001                                              00000207
                    SD-002                                              00000208
               CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000209
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000210
               NOT ON EXCEPTION PERFORM 1000-para                       00000211
           END-JSON                                                     00000212
                                                                        00000213
           JSON GENERATE                                                00000214
               WS-BUF FROM SOME-DATA                                    00000215
               COUNT WS-COUNT                                           00000216
               NAME SD-001 'ARTHUR'                                     00000217
                    SD-002 'DENT'                                       00000218
               SUPPRESS                                                 00000219
                    SD-001                                              00000220
                    SD-002                                              00000221
               CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000222
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000223
               NOT ON EXCEPTION PERFORM 1000-para                       00000224
           END-JSON                                                     00000225
                                                                        00000226
           JSON GENERATE                                                00000227
               WS-BUF FROM SOME-DATA                                    00000228
               COUNT WS-COUNT                                           00000229
               NAME SD-001 'ARTHUR'                                     00000230
                    SD-002 'DENT'                                       00000231
               SUPPRESS                                                 00000232
                    SD-001                                              00000233
                    SD-002                                              00000234
               CONVERTING                                               00000235
                    SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000236
                    ALSO SD-002 BOOL '&&'                               00000237
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000238
               NOT ON EXCEPTION PERFORM 1000-para                       00000239
           END-JSON                                                     00000240
                                                                        00000241
                                                                        00000242
           DISPLAY MYNAME ' End'                                        00000243
                                                                        00000244
           GOBACK                                                       00000245
           .                                                            00000246
                                                                        00000247
       1000-para.                                                       00000248
                                                                        00000249
           .                                                            00000250
                                                                        00000251

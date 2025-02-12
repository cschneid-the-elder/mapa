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
               COUNT IN WS-COUNT                                        00000055
               NAME OF SD-001 IS 'ARTHUR'                               00000056
                       SD-002 IS 'DENT'                                 00000057
               SUPPRESS SD-001 SD-003                                   00000058
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000059
               NOT ON EXCEPTION PERFORM 1000-para                       00000060
           END-JSON                                                     00000061
                                                                        00000062
           JSON GENERATE                                                00000063
               WS-BUF FROM SOME-DATA                                    00000064
               COUNT IN WS-COUNT                                        00000065
               NAME OF SD-001 IS 'ARTHUR'                               00000066
                       SD-002 IS 'DENT'                                 00000067
               SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000068
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000069
               NOT ON EXCEPTION PERFORM 1000-para                       00000070
           END-JSON                                                     00000071
                                                                        00000072
           JSON GENERATE                                                00000073
               WS-BUF FROM SOME-DATA                                    00000074
               COUNT IN WS-COUNT                                        00000075
               NAME OF SD-001 IS 'ARTHUR'                               00000076
                       SD-002 IS 'DENT'                                 00000077
               SUPPRESS                                                 00000078
                       EVERY NUMERIC WHEN ZEROES                        00000079
                       EVERY NONNUMERIC WHEN SPACES                     00000080
                       EVERY NONNUMERIC WHEN LOW-VALUES                 00000081
                       EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000082
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000083
               NOT ON EXCEPTION PERFORM 1000-para                       00000084
           END-JSON                                                     00000085
                                                                        00000086
           JSON GENERATE                                                00000087
               WS-BUF FROM SOME-DATA                                    00000088
               COUNT WS-COUNT                                           00000089
               NAME SD-001 'ARTHUR'                                     00000090
                    SD-002 'DENT'                                       00000091
               SUPPRESS                                                 00000092
                    SD-001 WHEN SPACES                                  00000093
                    SD-002 WHEN LOW-VALUES                              00000094
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000095
               NOT ON EXCEPTION PERFORM 1000-para                       00000096
           END-JSON                                                     00000097
                                                                        00000098
           JSON GENERATE                                                00000099
               WS-BUF FROM SOME-DATA                                    00000100
               COUNT WS-COUNT                                           00000101
               NAME SD-001 'ARTHUR'                                     00000102
                    SD-002 'DENT'                                       00000103
               SUPPRESS                                                 00000104
                    SD-001                                              00000105
                    SD-002                                              00000106
               CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000107
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000108
               NOT ON EXCEPTION PERFORM 1000-para                       00000109
           END-JSON                                                     00000110
                                                                        00000111
           JSON GENERATE                                                00000112
               WS-BUF FROM SOME-DATA                                    00000113
               COUNT WS-COUNT                                           00000114
               NAME SD-001 'ARTHUR'                                     00000115
                    SD-002 'DENT'                                       00000116
               SUPPRESS                                                 00000117
                    SD-001                                              00000118
                    SD-002                                              00000119
               CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000120
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000121
               NOT ON EXCEPTION PERFORM 1000-para                       00000122
           END-JSON                                                     00000123
                                                                        00000124
           JSON GENERATE                                                00000125
               WS-BUF FROM SOME-DATA                                    00000126
               COUNT WS-COUNT                                           00000127
               NAME SD-001 'ARTHUR'                                     00000128
                    SD-002 'DENT'                                       00000129
               SUPPRESS                                                 00000130
                    SD-001                                              00000131
                    SD-002                                              00000132
               CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000133
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000134
               NOT ON EXCEPTION PERFORM 1000-para                       00000135
           END-JSON                                                     00000136
                                                                        00000137
           JSON GENERATE                                                00000138
               WS-BUF FROM SOME-DATA                                    00000139
               COUNT WS-COUNT                                           00000140
               NAME SD-001 'ARTHUR'                                     00000141
                    SD-002 'DENT'                                       00000142
               SUPPRESS                                                 00000143
                    SD-001                                              00000144
                    SD-002                                              00000145
               CONVERTING SD-003 JSON NULL USING SPACES                 00000146
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000147
               NOT ON EXCEPTION PERFORM 1000-para                       00000148
           END-JSON                                                     00000149
                                                                        00000150
           JSON GENERATE                                                00000151
               WS-BUF FROM SOME-DATA                                    00000152
               COUNT WS-COUNT                                           00000153
               NAME SD-001 'ARTHUR'                                     00000154
                    SD-002 'DENT'                                       00000155
               SUPPRESS                                                 00000156
                    SD-001                                              00000157
                    SD-002                                              00000158
               CONVERTING SD-003 NULL USING SPACES                      00000159
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000160
               NOT ON EXCEPTION PERFORM 1000-para                       00000161
           END-JSON                                                     00000162
                                                                        00000163
           JSON GENERATE                                                00000164
               WS-BUF FROM SOME-DATA                                    00000165
               COUNT WS-COUNT                                           00000166
               NAME SD-001 'ARTHUR'                                     00000167
                    SD-002 'DENT'                                       00000168
               SUPPRESS                                                 00000169
                    SD-001                                              00000170
                    SD-002                                              00000171
               CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000172
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000173
               NOT ON EXCEPTION PERFORM 1000-para                       00000174
           END-JSON                                                     00000175
                                                                        00000176
           JSON GENERATE                                                00000177
               WS-BUF FROM SOME-DATA                                    00000178
               COUNT WS-COUNT                                           00000179
               NAME SD-001 'ARTHUR'                                     00000180
                    SD-002 'DENT'                                       00000181
               SUPPRESS                                                 00000182
                    SD-001                                              00000183
                    SD-002                                              00000184
               CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000185
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000186
               NOT ON EXCEPTION PERFORM 1000-para                       00000187
           END-JSON                                                     00000188
                                                                        00000189
           JSON GENERATE                                                00000190
               WS-BUF FROM SOME-DATA                                    00000191
               COUNT WS-COUNT                                           00000192
               NAME SD-001 'ARTHUR'                                     00000193
                    SD-002 'DENT'                                       00000194
               SUPPRESS                                                 00000195
                    SD-001                                              00000196
                    SD-002                                              00000197
               CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000198
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000199
               NOT ON EXCEPTION PERFORM 1000-para                       00000200
           END-JSON                                                     00000201
                                                                        00000202
           JSON GENERATE                                                00000203
               WS-BUF FROM SOME-DATA                                    00000204
               COUNT WS-COUNT                                           00000205
               NAME SD-001 'ARTHUR'                                     00000206
                    SD-002 'DENT'                                       00000207
               SUPPRESS                                                 00000208
                    SD-001                                              00000209
                    SD-002                                              00000210
               CONVERTING                                               00000211
                    SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000212
                    ALSO SD-002 BOOL '&&'                               00000213
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000214
               NOT ON EXCEPTION PERFORM 1000-para                       00000215
           END-JSON                                                     00000216
                                                                        00000217
                                                                        00000218
           DISPLAY MYNAME ' End'                                        00000219
                                                                        00000220
           GOBACK                                                       00000221
           .                                                            00000222
                                                                        00000223
       1000-para.                                                       00000224
                                                                        00000225
           .                                                            00000226
                                                                        00000227

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
           JSON GENERATE                                                00000029
               WS-BUF FROM SOME-DATA                                    00000030
               COUNT WS-COUNT                                           00000031
               NAME SD-001 'ARTHUR'                                     00000032
                    SD-002 'DENT'                                       00000033
               SUPPRESS                                                 00000034
                    SD-001                                              00000035
                    SD-002                                              00000036
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000037
               NOT ON EXCEPTION PERFORM 1000-para                       00000038
           END-JSON                                                     00000039
                                                                        00000040
           JSON GENERATE                                                00000041
               WS-BUF FROM SOME-DATA                                    00000042
               COUNT IN WS-COUNT                                        00000043
               NAME OF SD-001 IS 'ARTHUR'                               00000044
                       SD-002 IS 'DENT'                                 00000045
               SUPPRESS SD-001 SD-003                                   00000046
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000047
               NOT ON EXCEPTION PERFORM 1000-para                       00000048
           END-JSON                                                     00000049
                                                                        00000050
           JSON GENERATE                                                00000051
               WS-BUF FROM SOME-DATA                                    00000052
               COUNT IN WS-COUNT                                        00000053
               NAME OF SD-001 IS 'ARTHUR'                               00000054
                       SD-002 IS 'DENT'                                 00000055
               SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000056
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000057
               NOT ON EXCEPTION PERFORM 1000-para                       00000058
           END-JSON                                                     00000059
                                                                        00000060
           JSON GENERATE                                                00000061
               WS-BUF FROM SOME-DATA                                    00000062
               COUNT IN WS-COUNT                                        00000063
               NAME OF SD-001 IS 'ARTHUR'                               00000064
                       SD-002 IS 'DENT'                                 00000065
               SUPPRESS                                                 00000066
                       EVERY NUMERIC WHEN ZEROES                        00000067
                       EVERY NONNUMERIC WHEN SPACES                     00000068
                       EVERY NONNUMERIC WHEN LOW-VALUES                 00000069
                       EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000070
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000071
               NOT ON EXCEPTION PERFORM 1000-para                       00000072
           END-JSON                                                     00000073
                                                                        00000074
           JSON GENERATE                                                00000075
               WS-BUF FROM SOME-DATA                                    00000076
               COUNT WS-COUNT                                           00000077
               NAME SD-001 'ARTHUR'                                     00000078
                    SD-002 'DENT'                                       00000079
               SUPPRESS                                                 00000080
                    SD-001 WHEN SPACES                                  00000081
                    SD-002 WHEN LOW-VALUES                              00000082
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
                    SD-001                                              00000093
                    SD-002                                              00000094
               CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000095
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000096
               NOT ON EXCEPTION PERFORM 1000-para                       00000097
           END-JSON                                                     00000098
                                                                        00000099
           JSON GENERATE                                                00000100
               WS-BUF FROM SOME-DATA                                    00000101
               COUNT WS-COUNT                                           00000102
               NAME SD-001 'ARTHUR'                                     00000103
                    SD-002 'DENT'                                       00000104
               SUPPRESS                                                 00000105
                    SD-001                                              00000106
                    SD-002                                              00000107
               CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000108
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000109
               NOT ON EXCEPTION PERFORM 1000-para                       00000110
           END-JSON                                                     00000111
                                                                        00000112
           JSON GENERATE                                                00000113
               WS-BUF FROM SOME-DATA                                    00000114
               COUNT WS-COUNT                                           00000115
               NAME SD-001 'ARTHUR'                                     00000116
                    SD-002 'DENT'                                       00000117
               SUPPRESS                                                 00000118
                    SD-001                                              00000119
                    SD-002                                              00000120
               CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000121
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000122
               NOT ON EXCEPTION PERFORM 1000-para                       00000123
           END-JSON                                                     00000124
                                                                        00000125
           JSON GENERATE                                                00000126
               WS-BUF FROM SOME-DATA                                    00000127
               COUNT WS-COUNT                                           00000128
               NAME SD-001 'ARTHUR'                                     00000129
                    SD-002 'DENT'                                       00000130
               SUPPRESS                                                 00000131
                    SD-001                                              00000132
                    SD-002                                              00000133
               CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000134
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000135
               NOT ON EXCEPTION PERFORM 1000-para                       00000136
           END-JSON                                                     00000137
                                                                        00000138
           JSON GENERATE                                                00000139
               WS-BUF FROM SOME-DATA                                    00000140
               COUNT WS-COUNT                                           00000141
               NAME SD-001 'ARTHUR'                                     00000142
                    SD-002 'DENT'                                       00000143
               SUPPRESS                                                 00000144
                    SD-001                                              00000145
                    SD-002                                              00000146
               CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000147
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000148
               NOT ON EXCEPTION PERFORM 1000-para                       00000149
           END-JSON                                                     00000150
                                                                        00000151
           JSON GENERATE                                                00000152
               WS-BUF FROM SOME-DATA                                    00000153
               COUNT WS-COUNT                                           00000154
               NAME SD-001 'ARTHUR'                                     00000155
                    SD-002 'DENT'                                       00000156
               SUPPRESS                                                 00000157
                    SD-001                                              00000158
                    SD-002                                              00000159
               CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000160
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000161
               NOT ON EXCEPTION PERFORM 1000-para                       00000162
           END-JSON                                                     00000163
                                                                        00000164
           JSON GENERATE                                                00000165
               WS-BUF FROM SOME-DATA                                    00000166
               COUNT WS-COUNT                                           00000167
               NAME SD-001 'ARTHUR'                                     00000168
                    SD-002 'DENT'                                       00000169
               SUPPRESS                                                 00000170
                    SD-001                                              00000171
                    SD-002                                              00000172
               CONVERTING                                               00000173
                    SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000174
                    ALSO SD-002 BOOL '&&'                               00000175
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000176
               NOT ON EXCEPTION PERFORM 1000-para                       00000177
           END-JSON                                                     00000178
                                                                        00000179
                                                                        00000180
           DISPLAY MYNAME ' End'                                        00000181
                                                                        00000182
           GOBACK                                                       00000183
           .                                                            00000184
                                                                        00000185
       1000-para.                                                       00000186
                                                                        00000187
           .                                                            00000188
                                                                        00000189

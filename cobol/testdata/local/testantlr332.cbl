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
000029     JSON GENERATE                                                00000029
000030         WS-BUF FROM SOME-DATA                                    00000030
000031         COUNT WS-COUNT                                           00000031
000032         NAME SD-001 'ARTHUR'                                     00000032
000033              SD-002 'DENT'                                       00000033
000034         SUPPRESS                                                 00000034
000035              SD-001                                              00000035
000036              SD-002                                              00000036
000037         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000037
000038         NOT ON EXCEPTION PERFORM 1000-para                       00000038
000039     END-JSON                                                     00000039
000040                                                                  00000040
000041     JSON GENERATE                                                00000041
000042         WS-BUF FROM SOME-DATA                                    00000042
000043         COUNT IN WS-COUNT                                        00000043
000044         NAME OF SD-001 IS 'ARTHUR'                               00000044
000045                 SD-002 IS 'DENT'                                 00000045
000046         SUPPRESS SD-001 SD-003                                   00000046
000047         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000047
000048         NOT ON EXCEPTION PERFORM 1000-para                       00000048
000049     END-JSON                                                     00000049
000050                                                                  00000050
000051     JSON GENERATE                                                00000051
000052         WS-BUF FROM SOME-DATA                                    00000052
000053         COUNT IN WS-COUNT                                        00000053
000054         NAME OF SD-001 IS 'ARTHUR'                               00000054
000055                 SD-002 IS 'DENT'                                 00000055
000056         SUPPRESS EVERY NUMERIC WHEN ZEROES                       00000056
000057         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000057
000058         NOT ON EXCEPTION PERFORM 1000-para                       00000058
000059     END-JSON                                                     00000059
000060                                                                  00000060
000061     JSON GENERATE                                                00000061
000062         WS-BUF FROM SOME-DATA                                    00000062
000063         COUNT IN WS-COUNT                                        00000063
000064         NAME OF SD-001 IS 'ARTHUR'                               00000064
000065                 SD-002 IS 'DENT'                                 00000065
000066         SUPPRESS                                                 00000066
000067                 EVERY NUMERIC WHEN ZEROES                        00000067
000068                 EVERY NONNUMERIC WHEN SPACES                     00000068
000069                 EVERY NONNUMERIC WHEN LOW-VALUES                 00000069
000070                 EVERY WHEN HIGH-VALUES OR HIGH-VALUE             00000070
000071         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000071
000072         NOT ON EXCEPTION PERFORM 1000-para                       00000072
000073     END-JSON                                                     00000073
000074                                                                  00000074
000075     JSON GENERATE                                                00000075
000076         WS-BUF FROM SOME-DATA                                    00000076
000077         COUNT WS-COUNT                                           00000077
000078         NAME SD-001 'ARTHUR'                                     00000078
000079              SD-002 'DENT'                                       00000079
000080         SUPPRESS                                                 00000080
000081              SD-001 WHEN SPACES                                  00000081
000082              SD-002 WHEN LOW-VALUES                              00000082
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
000093              SD-001                                              00000093
000094              SD-002                                              00000094
000095         CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH     00000095
000096         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000096
000097         NOT ON EXCEPTION PERFORM 1000-para                       00000097
000098     END-JSON                                                     00000098
000099                                                                  00000099
000100     JSON GENERATE                                                00000100
000101         WS-BUF FROM SOME-DATA                                    00000101
000102         COUNT WS-COUNT                                           00000102
000103         NAME SD-001 'ARTHUR'                                     00000103
000104              SD-002 'DENT'                                       00000104
000105         SUPPRESS                                                 00000105
000106              SD-001                                              00000106
000107              SD-002                                              00000107
000108         CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH        00000108
000109         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000109
000110         NOT ON EXCEPTION PERFORM 1000-para                       00000110
000111     END-JSON                                                     00000111
000112                                                                  00000112
000113     JSON GENERATE                                                00000113
000114         WS-BUF FROM SOME-DATA                                    00000114
000115         COUNT WS-COUNT                                           00000115
000116         NAME SD-001 'ARTHUR'                                     00000116
000117              SD-002 'DENT'                                       00000117
000118         SUPPRESS                                                 00000118
000119              SD-001                                              00000119
000120              SD-002                                              00000120
000121         CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH             00000121
000122         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000122
000123         NOT ON EXCEPTION PERFORM 1000-para                       00000123
000124     END-JSON                                                     00000124
000125                                                                  00000125
000126     JSON GENERATE                                                00000126
000127         WS-BUF FROM SOME-DATA                                    00000127
000128         COUNT WS-COUNT                                           00000128
000129         NAME SD-001 'ARTHUR'                                     00000129
000130              SD-002 'DENT'                                       00000130
000131         SUPPRESS                                                 00000131
000132              SD-001                                              00000132
000133              SD-002                                              00000133
000134         CONVERTING SD-001 BOOLEAN SD-001-TRUTH                   00000134
000135         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000135
000136         NOT ON EXCEPTION PERFORM 1000-para                       00000136
000137     END-JSON                                                     00000137
000138                                                                  00000138
000139     JSON GENERATE                                                00000139
000140         WS-BUF FROM SOME-DATA                                    00000140
000141         COUNT WS-COUNT                                           00000141
000142         NAME SD-001 'ARTHUR'                                     00000142
000143              SD-002 'DENT'                                       00000143
000144         SUPPRESS                                                 00000144
000145              SD-001                                              00000145
000146              SD-002                                              00000146
000147         CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH        00000147
000148         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000148
000149         NOT ON EXCEPTION PERFORM 1000-para                       00000149
000150     END-JSON                                                     00000150
000151                                                                  00000151
000152     JSON GENERATE                                                00000152
000153         WS-BUF FROM SOME-DATA                                    00000153
000154         COUNT WS-COUNT                                           00000154
000155         NAME SD-001 'ARTHUR'                                     00000155
000156              SD-002 'DENT'                                       00000156
000157         SUPPRESS                                                 00000157
000158              SD-001                                              00000158
000159              SD-002                                              00000159
000160         CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'       00000160
000161         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000161
000162         NOT ON EXCEPTION PERFORM 1000-para                       00000162
000163     END-JSON                                                     00000163
000164                                                                  00000164
000165     JSON GENERATE                                                00000165
000166         WS-BUF FROM SOME-DATA                                    00000166
000167         COUNT WS-COUNT                                           00000167
000168         NAME SD-001 'ARTHUR'                                     00000168
000169              SD-002 'DENT'                                       00000169
000170         SUPPRESS                                                 00000170
000171              SD-001                                              00000171
000172              SD-002                                              00000172
000173         CONVERTING                                               00000173
000174              SD-001 TO JSON BOOLEAN USING 'FPREFECT'             00000174
000175              ALSO SD-002 BOOL '&&'                               00000175
000176         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000176
000177         NOT ON EXCEPTION PERFORM 1000-para                       00000177
000178     END-JSON                                                     00000178
000179                                                                  00000179
000180                                                                  00000180
000181     DISPLAY MYNAME ' End'                                        00000181
000182                                                                  00000182
000183     GOBACK                                                       00000183
000184     .                                                            00000184
000185                                                                  00000185
000186 1000-para.                                                       00000186
000187                                                                  00000187
000188     .                                                            00000188
000189                                                                  00000189

000001 Identification Division.                                         00000001
000002 Program-ID. testantlr333.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr333'.    00000006
000007                                                                  00000007
000008*                                                                 00000008
000009 01  SWITCHES.                                                    00000009
000010     05  SD-001-TRUTH-SW      PIC X(008).                         00000010
000011         88  SD-001-TRUTH     VALUE 'ZAPHOD'.                     00000011
000012         88  SD-001-ALSO-TRUE VALUE 'FPREFECT'.                   00000012
000013                                                                  00000013
000014 01  SOME-DATA.                                                   00000014
000015     05  SD-001               PIC X(008).                         00000015
000016     05  SD-002.                                                  00000016
000017         10  SD-002-A         PIC X(001).                         00000017
000018         10  SD-002-B         PIC X(001).                         00000018
000019     05  SD-003               PIC X(008).                         00000019
000020                                                                  00000020
000021 01  WS-BUF                   PIC X(100).                         00000021
000022                                                                  00000022
000023 77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000023
000024                                                                  00000024
000025 Procedure Division.                                              00000025
000026     DISPLAY MYNAME ' Begin'                                      00000026
000027                                                                  00000027
000028     JSON PARSE WS-BUF INTO SOME-DATA END-JSON                    00000028
000029                                                                  00000029
000030     JSON PARSE WS-BUF INTO SOME-DATA                             00000030
000031       ENCODING 37                                                00000031
000032     END-JSON                                                     00000032
000033                                                                  00000033
000034     JSON PARSE WS-BUF INTO SOME-DATA                             00000034
000035       ENCODING WS-COUNT                                          00000035
000036     END-JSON                                                     00000036
000037                                                                  00000037
000038     JSON PARSE WS-BUF INTO SOME-DATA                             00000038
000039       ENCODING FROM CODEPAGE                                     00000039
000040     END-JSON                                                     00000040
000041                                                                  00000041
000042     JSON PARSE                                                   00000042
000043         WS-BUF INTO SOME-DATA                                    00000043
000044         DETAIL                                                   00000044
000045         NAME SD-001 'ARTHUR'                                     00000045
000046              SD-002 'DENT'                                       00000046
000047         SUPPRESS                                                 00000047
000048              SD-001                                              00000048
000049              SD-002                                              00000049
000050         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000050
000051         NOT ON EXCEPTION PERFORM 1000-para                       00000051
000052     END-JSON                                                     00000052
000053                                                                  00000053
000054     JSON PARSE                                                   00000054
000055         WS-BUF INTO SOME-DATA                                    00000055
000056         WITH DETAIL                                              00000056
000057         NAME OF SD-001 IS 'ARTHUR'                               00000057
000058                 SD-002 IS OMITTED                                00000058
000059         SUPPRESS SD-001 SD-003                                   00000059
000060         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000060
000061         NOT ON EXCEPTION PERFORM 1000-para                       00000061
000062     END-JSON                                                     00000062
000063                                                                  00000063
000064     JSON PARSE                                                   00000064
000065         WS-BUF INTO SOME-DATA                                    00000065
000066         WITH DETAIL                                              00000066
000067         NAME OF SD-001 IS 'ARTHUR'                               00000067
000068                 SD-002 IS OMITTED                                00000068
000069         SUPPRESS SD-001 SD-003                                   00000069
000070         CONVERTING SD-001 FROM JSON BOOLEAN USING SD-001-TRUTH   00000070
000071         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000071
000072         NOT ON EXCEPTION PERFORM 1000-para                       00000072
000073     END-JSON                                                     00000073
000074                                                                  00000074
000075     JSON PARSE                                                   00000075
000076         WS-BUF INTO SOME-DATA                                    00000076
000077         WITH DETAIL                                              00000077
000078         NAME OF SD-001 IS 'ARTHUR'                               00000078
000079                 SD-002 IS OMITTED                                00000079
000080         SUPPRESS SD-001 SD-003                                   00000080
000081         CONVERTING                                               00000081
000082                SD-001 FROM JSON BOOLEAN                          00000082
000083                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000083
000084         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000084
000085         NOT ON EXCEPTION PERFORM 1000-para                       00000085
000086     END-JSON                                                     00000086
000087                                                                  00000087
000088     JSON PARSE                                                   00000088
000089         WS-BUF INTO SOME-DATA                                    00000089
000090         WITH DETAIL                                              00000090
000091         NAME OF SD-001 IS 'ARTHUR'                               00000091
000092                 SD-002 IS OMITTED                                00000092
000093         SUPPRESS SD-001 SD-003                                   00000093
000094         CONVERTING                                               00000094
000095                SD-001 FROM JSON BOOLEAN                          00000095
000096                    USING 'TRILLIAN' AND 'MARVIN'                 00000096
000097         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000097
000098         NOT ON EXCEPTION PERFORM 1000-para                       00000098
000099     END-JSON                                                     00000099
000100                                                                  00000100
000101     JSON PARSE                                                   00000101
000102         WS-BUF INTO SOME-DATA                                    00000102
000103         WITH DETAIL                                              00000103
000104         NAME OF SD-001 IS 'ARTHUR'                               00000104
000105                 SD-002 IS OMITTED                                00000105
000106         SUPPRESS SD-001 SD-003                                   00000106
000107         CONVERTING                                               00000107
000108                SD-001 FROM JSON BOOLEAN                          00000108
000109                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000109
000110           ALSO                                                   00000110
000111                SD-002 FROM BOOL USING '%%'                       00000111
000112         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000112
000113         NOT ON EXCEPTION PERFORM 1000-para                       00000113
000114     END-JSON                                                     00000114
000115                                                                  00000115
000116     JSON PARSE                                                   00000116
000117         WS-BUF INTO SOME-DATA                                    00000117
000118         WITH DETAIL                                              00000118
000119         NAME OF SD-001 IS 'ARTHUR'                               00000119
000120                 SD-002 IS OMITTED                                00000120
000121         SUPPRESS SD-001 SD-003                                   00000121
000122         CONVERTING                                               00000122
000123                SD-001 FROM JSON BOOLEAN                          00000123
000124                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000124
000125           ALSO                                                   00000125
000126                SD-002 FROM BOOL USING '%%' AND '##'              00000126
000127         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000127
000128         NOT ON EXCEPTION PERFORM 1000-para                       00000128
000129     END-JSON                                                     00000129
000130                                                                  00000130
000131     JSON PARSE                                                   00000131
000132         WS-BUF INTO SOME-DATA                                    00000132
000133         WITH DETAIL                                              00000133
000134         NAME OF SD-001 IS 'ARTHUR'                               00000134
000135                 SD-002 IS OMITTED                                00000135
000136         SUPPRESS SD-001 SD-003                                   00000136
000137         CONVERTING SD-003 FROM JSON NULL USING SPACES            00000137
000138         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000138
000139         NOT ON EXCEPTION PERFORM 1000-para                       00000139
000140     END-JSON                                                     00000140
000141                                                                  00000141
000142     JSON PARSE                                                   00000142
000143         WS-BUF INTO SOME-DATA                                    00000143
000144         WITH DETAIL                                              00000144
000145         NAME OF SD-001 IS 'ARTHUR'                               00000145
000146                 SD-002 IS OMITTED                                00000146
000147         SUPPRESS SD-001 SD-003                                   00000147
000148         CONVERTING SD-003 FROM NULL USING SPACES                 00000148
000149         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000149
000150         NOT ON EXCEPTION PERFORM 1000-para                       00000150
000151     END-JSON                                                     00000151
000152                                                                  00000152
000153                                                                  00000153
000154     DISPLAY MYNAME ' End'                                        00000154
000155                                                                  00000155
000156     GOBACK                                                       00000156
000157     .                                                            00000157
000158                                                                  00000158
000159 1000-para.                                                       00000159
000160                                                                  00000160
000161     .                                                            00000161
000162                                                                  00000162

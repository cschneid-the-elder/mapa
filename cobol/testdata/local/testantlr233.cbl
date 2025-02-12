       Identification Division.                                         00000001
       Program-ID. testantlr233.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr233'.    00000006
                                                                        00000007
      *                                                                 00000008
       01  SWITCHES.                                                    00000009
           05  SD-001-TRUTH-SW      PIC X(008).                         00000010
               88  SD-001-TRUTH     VALUE 'ZAPHOD'.                     00000011
               88  SD-001-ALSO-TRUE VALUE 'FPREFECT'.                   00000012
                                                                        00000013
       01  SOME-DATA.                                                   00000014
           05  SD-001               PIC X(008).                         00000015
           05  SD-002.                                                  00000016
               10  SD-002-A         PIC X(001).                         00000017
               10  SD-002-B         PIC X(001).                         00000018
           05  SD-003               PIC X(008).                         00000019
                                                                        00000020
       01  WS-BUF                   PIC X(100).                         00000021
                                                                        00000022
       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000023
                                                                        00000024
       Procedure Division.                                              00000025
           DISPLAY MYNAME ' Begin'                                      00000026
                                                                        00000027
           JSON PARSE WS-BUF INTO SOME-DATA END-JSON                    00000028
                                                                        00000029
           JSON PARSE WS-BUF INTO SOME-DATA                             00000030
             ENCODING 37                                                00000031
           END-JSON                                                     00000032
                                                                        00000033
           JSON PARSE WS-BUF INTO SOME-DATA                             00000034
             ENCODING WS-COUNT                                          00000035
           END-JSON                                                     00000036
                                                                        00000037
           JSON PARSE WS-BUF INTO SOME-DATA                             00000038
             ENCODING FROM CODEPAGE                                     00000039
           END-JSON                                                     00000040
                                                                        00000041
           JSON PARSE                                                   00000042
               WS-BUF INTO SOME-DATA                                    00000043
               DETAIL                                                   00000044
               NAME SD-001 'ARTHUR'                                     00000045
                    SD-002 'DENT'                                       00000046
               SUPPRESS                                                 00000047
                    SD-001                                              00000048
                    SD-002                                              00000049
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000050
               NOT ON EXCEPTION PERFORM 1000-para                       00000051
           END-JSON                                                     00000052
                                                                        00000053
           JSON PARSE                                                   00000054
               WS-BUF INTO SOME-DATA                                    00000055
               WITH DETAIL                                              00000056
               NAME OF SD-001 IS 'ARTHUR'                               00000057
                       SD-002 IS OMITTED                                00000058
               SUPPRESS SD-001 SD-003                                   00000059
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000060
               NOT ON EXCEPTION PERFORM 1000-para                       00000061
           END-JSON                                                     00000062
                                                                        00000063
           JSON PARSE                                                   00000064
               WS-BUF INTO SOME-DATA                                    00000065
               WITH DETAIL                                              00000066
               NAME OF SD-001 IS 'ARTHUR'                               00000067
                       SD-002 IS OMITTED                                00000068
               SUPPRESS SD-001 SD-003                                   00000069
               CONVERTING SD-001 FROM JSON BOOLEAN USING SD-001-TRUTH   00000070
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000071
               NOT ON EXCEPTION PERFORM 1000-para                       00000072
           END-JSON                                                     00000073
                                                                        00000074
           JSON PARSE                                                   00000075
               WS-BUF INTO SOME-DATA                                    00000076
               WITH DETAIL                                              00000077
               NAME OF SD-001 IS 'ARTHUR'                               00000078
                       SD-002 IS OMITTED                                00000079
               SUPPRESS SD-001 SD-003                                   00000080
               CONVERTING                                               00000081
                      SD-001 FROM JSON BOOLEAN                          00000082
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000083
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000084
               NOT ON EXCEPTION PERFORM 1000-para                       00000085
           END-JSON                                                     00000086
                                                                        00000087
           JSON PARSE                                                   00000088
               WS-BUF INTO SOME-DATA                                    00000089
               WITH DETAIL                                              00000090
               NAME OF SD-001 IS 'ARTHUR'                               00000091
                       SD-002 IS OMITTED                                00000092
               SUPPRESS SD-001 SD-003                                   00000093
               CONVERTING                                               00000094
                      SD-001 FROM JSON BOOLEAN                          00000095
                          USING 'TRILLIAN' AND 'MARVIN'                 00000096
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000097
               NOT ON EXCEPTION PERFORM 1000-para                       00000098
           END-JSON                                                     00000099
                                                                        00000100
           JSON PARSE                                                   00000101
               WS-BUF INTO SOME-DATA                                    00000102
               WITH DETAIL                                              00000103
               NAME OF SD-001 IS 'ARTHUR'                               00000104
                       SD-002 IS OMITTED                                00000105
               SUPPRESS SD-001 SD-003                                   00000106
               CONVERTING                                               00000107
                      SD-001 FROM JSON BOOLEAN                          00000108
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000109
                 ALSO                                                   00000110
                      SD-002 FROM BOOL USING '%%'                       00000111
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000112
               NOT ON EXCEPTION PERFORM 1000-para                       00000113
           END-JSON                                                     00000114
                                                                        00000115
           JSON PARSE                                                   00000116
               WS-BUF INTO SOME-DATA                                    00000117
               WITH DETAIL                                              00000118
               NAME OF SD-001 IS 'ARTHUR'                               00000119
                       SD-002 IS OMITTED                                00000120
               SUPPRESS SD-001 SD-003                                   00000121
               CONVERTING                                               00000122
                      SD-001 FROM JSON BOOLEAN                          00000123
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000124
                 ALSO                                                   00000125
                      SD-002 FROM BOOL USING '%%' AND '##'              00000126
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000127
               NOT ON EXCEPTION PERFORM 1000-para                       00000128
           END-JSON                                                     00000129
                                                                        00000130
           JSON PARSE                                                   00000131
               WS-BUF INTO SOME-DATA                                    00000132
               WITH DETAIL                                              00000133
               NAME OF SD-001 IS 'ARTHUR'                               00000134
                       SD-002 IS OMITTED                                00000135
               SUPPRESS SD-001 SD-003                                   00000136
               CONVERTING SD-003 FROM JSON NULL USING SPACES            00000137
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000138
               NOT ON EXCEPTION PERFORM 1000-para                       00000139
           END-JSON                                                     00000140
                                                                        00000141
           JSON PARSE                                                   00000142
               WS-BUF INTO SOME-DATA                                    00000143
               WITH DETAIL                                              00000144
               NAME OF SD-001 IS 'ARTHUR'                               00000145
                       SD-002 IS OMITTED                                00000146
               SUPPRESS SD-001 SD-003                                   00000147
               CONVERTING SD-003 FROM NULL USING SPACES                 00000148
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000149
               NOT ON EXCEPTION PERFORM 1000-para                       00000150
           END-JSON                                                     00000151
                                                                        00000152
                                                                        00000153
           DISPLAY MYNAME ' End'                                        00000154
                                                                        00000155
           GOBACK                                                       00000156
           .                                                            00000157
                                                                        00000158
       1000-para.                                                       00000159
                                                                        00000160
           .                                                            00000161
                                                                        00000162

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
           JSON PARSE                                                   00000030
               WS-BUF INTO SOME-DATA                                    00000031
               DETAIL                                                   00000032
               NAME SD-001 'ARTHUR'                                     00000033
                    SD-002 'DENT'                                       00000034
               SUPPRESS                                                 00000035
                    SD-001                                              00000036
                    SD-002                                              00000037
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000038
               NOT ON EXCEPTION PERFORM 1000-para                       00000039
           END-JSON                                                     00000040
                                                                        00000041
           JSON PARSE                                                   00000042
               WS-BUF INTO SOME-DATA                                    00000043
               WITH DETAIL                                              00000044
               NAME OF SD-001 IS 'ARTHUR'                               00000045
                       SD-002 IS OMITTED                                00000046
               SUPPRESS SD-001 SD-003                                   00000047
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000048
               NOT ON EXCEPTION PERFORM 1000-para                       00000049
           END-JSON                                                     00000050
                                                                        00000051
           JSON PARSE                                                   00000052
               WS-BUF INTO SOME-DATA                                    00000053
               WITH DETAIL                                              00000054
               NAME OF SD-001 IS 'ARTHUR'                               00000055
                       SD-002 IS OMITTED                                00000056
               SUPPRESS SD-001 SD-003                                   00000057
               CONVERTING SD-001 FROM JSON BOOLEAN USING SD-001-TRUTH   00000058
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000059
               NOT ON EXCEPTION PERFORM 1000-para                       00000060
           END-JSON                                                     00000061
                                                                        00000062
           JSON PARSE                                                   00000063
               WS-BUF INTO SOME-DATA                                    00000064
               WITH DETAIL                                              00000065
               NAME OF SD-001 IS 'ARTHUR'                               00000066
                       SD-002 IS OMITTED                                00000067
               SUPPRESS SD-001 SD-003                                   00000068
               CONVERTING                                               00000069
                      SD-001 FROM JSON BOOLEAN                          00000070
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000071
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000072
               NOT ON EXCEPTION PERFORM 1000-para                       00000073
           END-JSON                                                     00000074
                                                                        00000075
           JSON PARSE                                                   00000076
               WS-BUF INTO SOME-DATA                                    00000077
               WITH DETAIL                                              00000078
               NAME OF SD-001 IS 'ARTHUR'                               00000079
                       SD-002 IS OMITTED                                00000080
               SUPPRESS SD-001 SD-003                                   00000081
               CONVERTING                                               00000082
                      SD-001 FROM JSON BOOLEAN                          00000083
                          USING 'TRILLIAN' AND 'MARVIN'                 00000084
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000085
               NOT ON EXCEPTION PERFORM 1000-para                       00000086
           END-JSON                                                     00000087
                                                                        00000088
           JSON PARSE                                                   00000089
               WS-BUF INTO SOME-DATA                                    00000090
               WITH DETAIL                                              00000091
               NAME OF SD-001 IS 'ARTHUR'                               00000092
                       SD-002 IS OMITTED                                00000093
               SUPPRESS SD-001 SD-003                                   00000094
               CONVERTING                                               00000095
                      SD-001 FROM JSON BOOLEAN                          00000096
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000097
                 ALSO                                                   00000098
                      SD-002 FROM BOOL USING '%%'                       00000099
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000100
               NOT ON EXCEPTION PERFORM 1000-para                       00000101
           END-JSON                                                     00000102
                                                                        00000103
           JSON PARSE                                                   00000104
               WS-BUF INTO SOME-DATA                                    00000105
               WITH DETAIL                                              00000106
               NAME OF SD-001 IS 'ARTHUR'                               00000107
                       SD-002 IS OMITTED                                00000108
               SUPPRESS SD-001 SD-003                                   00000109
               CONVERTING                                               00000110
                      SD-001 FROM JSON BOOLEAN                          00000111
                          USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000112
                 ALSO                                                   00000113
                      SD-002 FROM BOOL USING '%%' AND '##'              00000114
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000115
               NOT ON EXCEPTION PERFORM 1000-para                       00000116
           END-JSON                                                     00000117
                                                                        00000118
                                                                        00000119
           DISPLAY MYNAME ' End'                                        00000120
                                                                        00000121
           GOBACK                                                       00000122
           .                                                            00000123
                                                                        00000124
       1000-para.                                                       00000125
                                                                        00000126
           .                                                            00000127
                                                                        00000128

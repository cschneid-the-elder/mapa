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
000030     JSON PARSE                                                   00000030
000031         WS-BUF INTO SOME-DATA                                    00000031
000032         DETAIL                                                   00000032
000033         NAME SD-001 'ARTHUR'                                     00000033
000034              SD-002 'DENT'                                       00000034
000035         SUPPRESS                                                 00000035
000036              SD-001                                              00000036
000037              SD-002                                              00000037
000038         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000038
000039         NOT ON EXCEPTION PERFORM 1000-para                       00000039
000040     END-JSON                                                     00000040
000041                                                                  00000041
000042     JSON PARSE                                                   00000042
000043         WS-BUF INTO SOME-DATA                                    00000043
000044         WITH DETAIL                                              00000044
000045         NAME OF SD-001 IS 'ARTHUR'                               00000045
000046                 SD-002 IS OMITTED                                00000046
000047         SUPPRESS SD-001 SD-003                                   00000047
000048         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000048
000049         NOT ON EXCEPTION PERFORM 1000-para                       00000049
000050     END-JSON                                                     00000050
000051                                                                  00000051
000052     JSON PARSE                                                   00000052
000053         WS-BUF INTO SOME-DATA                                    00000053
000054         WITH DETAIL                                              00000054
000055         NAME OF SD-001 IS 'ARTHUR'                               00000055
000056                 SD-002 IS OMITTED                                00000056
000057         SUPPRESS SD-001 SD-003                                   00000057
000058         CONVERTING SD-001 FROM JSON BOOLEAN USING SD-001-TRUTH   00000058
000059         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000059
000060         NOT ON EXCEPTION PERFORM 1000-para                       00000060
000061     END-JSON                                                     00000061
000062                                                                  00000062
000063     JSON PARSE                                                   00000063
000064         WS-BUF INTO SOME-DATA                                    00000064
000065         WITH DETAIL                                              00000065
000066         NAME OF SD-001 IS 'ARTHUR'                               00000066
000067                 SD-002 IS OMITTED                                00000067
000068         SUPPRESS SD-001 SD-003                                   00000068
000069         CONVERTING                                               00000069
000070                SD-001 FROM JSON BOOLEAN                          00000070
000071                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000071
000072         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000072
000073         NOT ON EXCEPTION PERFORM 1000-para                       00000073
000074     END-JSON                                                     00000074
000075                                                                  00000075
000076     JSON PARSE                                                   00000076
000077         WS-BUF INTO SOME-DATA                                    00000077
000078         WITH DETAIL                                              00000078
000079         NAME OF SD-001 IS 'ARTHUR'                               00000079
000080                 SD-002 IS OMITTED                                00000080
000081         SUPPRESS SD-001 SD-003                                   00000081
000082         CONVERTING                                               00000082
000083                SD-001 FROM JSON BOOLEAN                          00000083
000084                    USING 'TRILLIAN' AND 'MARVIN'                 00000084
000085         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000085
000086         NOT ON EXCEPTION PERFORM 1000-para                       00000086
000087     END-JSON                                                     00000087
000088                                                                  00000088
000089     JSON PARSE                                                   00000089
000090         WS-BUF INTO SOME-DATA                                    00000090
000091         WITH DETAIL                                              00000091
000092         NAME OF SD-001 IS 'ARTHUR'                               00000092
000093                 SD-002 IS OMITTED                                00000093
000094         SUPPRESS SD-001 SD-003                                   00000094
000095         CONVERTING                                               00000095
000096                SD-001 FROM JSON BOOLEAN                          00000096
000097                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000097
000098           ALSO                                                   00000098
000099                SD-002 FROM BOOL USING '%%'                       00000099
000100         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000100
000101         NOT ON EXCEPTION PERFORM 1000-para                       00000101
000102     END-JSON                                                     00000102
000103                                                                  00000103
000104     JSON PARSE                                                   00000104
000105         WS-BUF INTO SOME-DATA                                    00000105
000106         WITH DETAIL                                              00000106
000107         NAME OF SD-001 IS 'ARTHUR'                               00000107
000108                 SD-002 IS OMITTED                                00000108
000109         SUPPRESS SD-001 SD-003                                   00000109
000110         CONVERTING                                               00000110
000111                SD-001 FROM JSON BOOLEAN                          00000111
000112                    USING SD-001-TRUTH AND SD-001-ALSO-TRUE       00000112
000113           ALSO                                                   00000113
000114                SD-002 FROM BOOL USING '%%' AND '##'              00000114
000115         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000115
000116         NOT ON EXCEPTION PERFORM 1000-para                       00000116
000117     END-JSON                                                     00000117
000118                                                                  00000118
000119                                                                  00000119
000120     DISPLAY MYNAME ' End'                                        00000120
000121                                                                  00000121
000122     GOBACK                                                       00000122
000123     .                                                            00000123
000124                                                                  00000124
000125 1000-para.                                                       00000125
000126                                                                  00000126
000127     .                                                            00000127
000128                                                                  00000128

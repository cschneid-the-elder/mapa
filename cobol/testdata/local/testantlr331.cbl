000001 Identification Division.                                         00000001
000002 Program-ID. testantlr331.                                        00000002
000003 Environment Division.                                            00000003
000004 Configuration Section.                                           00000004
000005 Special-Names.                                                   00000005
000006     XML-SCHEMA OSR-DATA-FILE IS OSRDATA1.                        00000006
000007 Data Division.                                                   00000007
000008 Working-Storage Section.                                         00000008
000009 01  CONSTANTS.                                                   00000009
000010     05  MYNAME               PIC X(012) VALUE 'testantlr331'.    00000010
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
000022 01  OSR-DATA                 PIC X(1024).                        00000022
000023                                                                  00000023
000024 77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000024
000025                                                                  00000025
000026 Procedure Division.                                              00000026
000027     DISPLAY MYNAME ' Begin'                                      00000027
000028                                                                  00000028
000029     XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para END-XML      00000029
000030                                                                  00000030
000031     XML PARSE                                                    00000031
000032         WS-BUF                                                   00000032
000033         ENCODING 37                                              00000033
000034         VALIDATING OSR-DATA                                      00000034
000035         PROCESSING PROCEDURE 1000-para                           00000035
000036         EXCEPTION CALL 'CEE3ABD' END-CALL                        00000036
000037         NOT EXCEPTION PERFORM 2000-para                          00000037
000038     END-XML                                                      00000038
000039                                                                  00000039
000040     XML PARSE                                                    00000040
000041         WS-BUF                                                   00000041
000042         WITH ENCODING 37                                         00000042
000043         RETURNING NATIONAL                                       00000043
000044         VALIDATING WITH OSR-DATA                                 00000044
000045         PROCESSING PROCEDURE IS 1000-para                        00000045
000046         ON EXCEPTION CALL 'CEE3ABD'                              00000046
000047         NOT ON EXCEPTION PERFORM 2000-para                       00000047
000048     END-XML                                                      00000048
000049                                                                  00000049
000050     XML PARSE                                                    00000050
000051         WS-BUF                                                   00000051
000052         WITH ENCODING 37                                         00000052
000053         RETURNING NATIONAL                                       00000053
000054         VALIDATING WITH FILE OSR-DATA-FILE                       00000054
000055         PROCESSING PROCEDURE IS 1000-para                        00000055
000056         ON EXCEPTION CALL 'CEE3ABD'                              00000056
000057         NOT ON EXCEPTION PERFORM 2000-para                       00000057
000058     END-XML                                                      00000058
000059                                                                  00000059
000060     XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para THRU         00000060
000061     1001-end END-XML                                             00000061
000062                                                                  00000062
000063     XML PARSE                                                    00000063
000064         WS-BUF                                                   00000064
000065         ENCODING 37                                              00000065
000066         VALIDATING OSR-DATA                                      00000066
000067         PROCESSING PROCEDURE 1000-para THRU 1001-end             00000067
000068         EXCEPTION CALL 'CEE3ABD'                                 00000068
000069         NOT EXCEPTION PERFORM 2000-para                          00000069
000070     END-XML                                                      00000070
000071                                                                  00000071
000072     XML PARSE                                                    00000072
000073         WS-BUF                                                   00000073
000074         WITH ENCODING 37                                         00000074
000075         RETURNING NATIONAL                                       00000075
000076         VALIDATING WITH OSR-DATA                                 00000076
000077         PROCESSING PROCEDURE IS 1000-para THRU 1001-end          00000077
000078         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000078
000079         NOT ON EXCEPTION PERFORM 2000-para                       00000079
000080     END-XML                                                      00000080
000081                                                                  00000081
000082     XML PARSE                                                    00000082
000083         WS-BUF                                                   00000083
000084         WITH ENCODING 37                                         00000084
000085         RETURNING NATIONAL                                       00000085
000086         VALIDATING WITH FILE OSR-DATA-FILE                       00000086
000087         PROCESSING PROCEDURE IS 1000-para THRU 1001-end          00000087
000088         ON EXCEPTION CALL 'CEE3ABD'                              00000088
000089         NOT ON EXCEPTION PERFORM 2000-para                       00000089
000090     END-XML                                                      00000090
000091                                                                  00000091
000092     DISPLAY MYNAME ' End'                                        00000092
000093                                                                  00000093
000094     GOBACK                                                       00000094
000095     .                                                            00000095
000096                                                                  00000096
000097 1000-para.                                                       00000097
000098                                                                  00000098
000099     .                                                            00000099
000100                                                                  00000100
000101 1001-end.                                                        00000101
000102                                                                  00000102
000103     .                                                            00000103
000104                                                                  00000104
000105 2000-para.                                                       00000105
000106                                                                  00000106
000107     .                                                            00000107
000108                                                                  00000108

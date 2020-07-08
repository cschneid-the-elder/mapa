000001 Identification Division.                                         00000001
000002 Program-ID. testantlr330.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr330'.    00000006
000007                                                                  00000007
000008*                                                                 00000008
000009 01  SOME-DATA.                                                   00000009
000010     05  SD-001               PIC X(008).                         00000010
000011     05  SD-002.                                                  00000011
000012         10  SD-002-A         PIC X(001).                         00000012
000013         10  SD-002-B         PIC X(001).                         00000013
000014     05  SD-003               PIC X(008).                         00000014
000015                                                                  00000015
000016 01  WS-BUF                   PIC X(100).                         00000016
000017                                                                  00000017
000018 77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000018
000019                                                                  00000019
000020 Procedure Division.                                              00000020
000021     DISPLAY MYNAME ' Begin'                                      00000021
000022                                                                  00000022
000023     XML GENERATE WS-BUF FROM SOME-DATA END-XML                   00000023
000024                                                                  00000024
000025     XML GENERATE                                                 00000025
000026         WS-BUF FROM SOME-DATA                                    00000026
000027         COUNT WS-COUNT                                           00000027
000028         ENCODING 37                                              00000028
000029         XML-DECLARATION                                          00000029
000030         ATTRIBUTES                                               00000030
000031         NAMESPACE 'AEIOU'                                        00000031
000032         NAMESPACE-PREFIX 'ZZ9PLURALZA'                           00000032
000033         NAME SD-001 'ARTHUR'                                     00000033
000034              SD-002 'DENT'                                       00000034
000035         TYPE SD-003 ELEMENT SD-002-A ATTRIBUTE SD-002-B CONTENT  00000035
000036         SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES        00000036
000037                  EVERY NUMERIC ELEMENT                           00000037
000038                        WHEN LOW-VALUES OR HIGH-VALUES            00000038
000039         ON EXCEPTION PERFORM 1000-para                           00000039
000040         NOT ON EXCEPTION CALL 'CEE3ABD'                          00000040
000041     END-XML                                                      00000041
000042                                                                  00000042
000043     XML GENERATE                                                 00000043
000044         WS-BUF FROM SOME-DATA                                    00000044
000045         COUNT IN WS-COUNT                                        00000045
000046         WITH ENCODING 37                                         00000046
000047         WITH XML-DECLARATION                                     00000047
000048         WITH ATTRIBUTES                                          00000048
000049         NAMESPACE IS 'AEIOU'                                     00000049
000050         NAMESPACE-PREFIX IS 'ZZ9PLURALZA'                        00000050
000051         NAME OF SD-001 IS 'ARTHUR'                               00000051
000052                 SD-002 IS 'DENT'                                 00000052
000053         TYPE OF SD-003 IS ELEMENT                                00000053
000054                 SD-002-A IS ATTRIBUTE                            00000054
000055                 SD-002-B IS CONTENT                              00000055
000056         SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES        00000056
000057                  SD-001 WHEN ZERO OR ZEROES OR ZEROS             00000057
000058                  EVERY NUMERIC ELEMENT                           00000058
000059                        WHEN LOW-VALUES OR HIGH-VALUES            00000059
000060                  SD-003 WHEN HIGH-VALUES                         00000060
000061         ON EXCEPTION PERFORM 1000-para                           00000061
000062         NOT ON EXCEPTION CALL 'CEE3ABD'                          00000062
000063     END-XML                                                      00000063
000064                                                                  00000064
000065                                                                  00000065
000066     DISPLAY MYNAME ' End'                                        00000066
000067                                                                  00000067
000068     GOBACK                                                       00000068
000069     .                                                            00000069
000070                                                                  00000070
000071 1000-para.                                                       00000071
000072                                                                  00000072
000073     .                                                            00000073
000074                                                                  00000074

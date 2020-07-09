000001 Identification Division.                                         00000001
000002 Program-ID. testantlr333.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr333'.    00000006
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
000023     JSON PARSE WS-BUF INTO SOME-DATA END-JSON                    00000023
000024                                                                  00000024
000025     JSON PARSE                                                   00000025
000026         WS-BUF INTO SOME-DATA                                    00000026
000027         DETAIL                                                   00000027
000028         NAME SD-001 'ARTHUR'                                     00000028
000029              SD-002 'DENT'                                       00000029
000030         SUPPRESS                                                 00000030
000031              SD-001                                              00000031
000032              SD-002                                              00000032
000033         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000033
000034         NOT ON EXCEPTION PERFORM 1000-para                       00000034
000035     END-JSON                                                     00000035
000036                                                                  00000036
000037     JSON PARSE                                                   00000037
000038         WS-BUF INTO SOME-DATA                                    00000038
000039         WITH DETAIL                                              00000039
000040         NAME OF SD-001 IS 'ARTHUR'                               00000040
000041                 SD-002 IS OMITTED                                00000041
000042         SUPPRESS SD-001 SD-003                                   00000042
000043         ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000043
000044         NOT ON EXCEPTION PERFORM 1000-para                       00000044
000045     END-JSON                                                     00000045
000046                                                                  00000046
000047                                                                  00000047
000048     DISPLAY MYNAME ' End'                                        00000048
000049                                                                  00000049
000050     GOBACK                                                       00000050
000051     .                                                            00000051
000052                                                                  00000052
000053 1000-para.                                                       00000053
000054                                                                  00000054
000055     .                                                            00000055
000056                                                                  00000056

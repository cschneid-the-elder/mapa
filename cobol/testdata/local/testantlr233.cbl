       Identification Division.                                         00000001
       Program-ID. testantlr233.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr233'.    00000006
                                                                        00000007
      *                                                                 00000008
       01  SOME-DATA.                                                   00000009
           05  SD-001               PIC X(008).                         00000010
           05  SD-002.                                                  00000011
               10  SD-002-A         PIC X(001).                         00000012
               10  SD-002-B         PIC X(001).                         00000013
           05  SD-003               PIC X(008).                         00000014
                                                                        00000015
       01  WS-BUF                   PIC X(100).                         00000016
                                                                        00000017
       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000018
                                                                        00000019
       Procedure Division.                                              00000020
           DISPLAY MYNAME ' Begin'                                      00000021
                                                                        00000022
           JSON PARSE WS-BUF INTO SOME-DATA END-JSON                    00000023
                                                                        00000024
           JSON PARSE                                                   00000025
               WS-BUF INTO SOME-DATA                                    00000026
               DETAIL                                                   00000027
               NAME SD-001 'ARTHUR'                                     00000028
                    SD-002 'DENT'                                       00000029
               SUPPRESS                                                 00000030
                    SD-001                                              00000031
                    SD-002                                              00000032
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000033
               NOT ON EXCEPTION PERFORM 1000-para                       00000034
           END-JSON                                                     00000035
                                                                        00000036
           JSON PARSE                                                   00000037
               WS-BUF INTO SOME-DATA                                    00000038
               WITH DETAIL                                              00000039
               NAME OF SD-001 IS 'ARTHUR'                               00000040
                       SD-002 IS OMITTED                                00000041
               SUPPRESS SD-001 SD-003                                   00000042
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000043
               NOT ON EXCEPTION PERFORM 1000-para                       00000044
           END-JSON                                                     00000045
                                                                        00000046
                                                                        00000047
           DISPLAY MYNAME ' End'                                        00000048
                                                                        00000049
           GOBACK                                                       00000050
           .                                                            00000051
                                                                        00000052
       1000-para.                                                       00000053
                                                                        00000054
           .                                                            00000055
                                                                        00000056

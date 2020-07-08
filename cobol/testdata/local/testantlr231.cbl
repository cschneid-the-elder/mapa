       Identification Division.                                         00000001
       Program-ID. testantlr231.                                        00000002
       Environment Division.                                            00000003
       Configuration Section.                                           00000004
       Special-Names.                                                   00000005
           XML-SCHEMA OSR-DATA-FILE IS OSRDATA1.                        00000006
       Data Division.                                                   00000007
       Working-Storage Section.                                         00000008
       01  CONSTANTS.                                                   00000009
           05  MYNAME               PIC X(012) VALUE 'testantlr231'.    00000010
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
       01  OSR-DATA                 PIC X(1024).                        00000022
                                                                        00000023
       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.          00000024
                                                                        00000025
       Procedure Division.                                              00000026
           DISPLAY MYNAME ' Begin'                                      00000027
                                                                        00000028
           XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para END-XML      00000029
                                                                        00000030
           XML PARSE                                                    00000031
               WS-BUF                                                   00000032
               ENCODING 37                                              00000033
               VALIDATING OSR-DATA                                      00000034
               PROCESSING PROCEDURE 1000-para                           00000035
               EXCEPTION CALL 'CEE3ABD'  END-CALL                       00000036
               NOT EXCEPTION PERFORM 2000-para                          00000037
           END-XML                                                      00000038
                                                                        00000039
           XML PARSE                                                    00000040
               WS-BUF                                                   00000041
               WITH ENCODING 37                                         00000042
               RETURNING NATIONAL                                       00000043
               VALIDATING WITH OSR-DATA                                 00000044
               PROCESSING PROCEDURE IS 1000-para                        00000045
               ON EXCEPTION CALL 'CEE3ABD'                              00000046
               NOT ON EXCEPTION PERFORM 2000-para                       00000047
           END-XML                                                      00000048
                                                                        00000049
           XML PARSE                                                    00000050
               WS-BUF                                                   00000051
               WITH ENCODING 37                                         00000052
               RETURNING NATIONAL                                       00000053
               VALIDATING WITH FILE OSR-DATA-FILE                       00000054
               PROCESSING PROCEDURE IS 1000-para                        00000055
               ON EXCEPTION CALL 'CEE3ABD'                              00000056
               NOT ON EXCEPTION PERFORM 2000-para                       00000057
           END-XML                                                      00000058
                                                                        00000059
           XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para THRU         00000060
           1001-end END-XML                                             00000061
                                                                        00000062
           XML PARSE                                                    00000063
               WS-BUF                                                   00000064
               ENCODING 37                                              00000065
               VALIDATING OSR-DATA                                      00000066
               PROCESSING PROCEDURE 1000-para THRU 1001-end             00000067
               EXCEPTION CALL 'CEE3ABD'                                 00000068
               NOT EXCEPTION PERFORM 2000-para                          00000069
           END-XML                                                      00000070
                                                                        00000071
           XML PARSE                                                    00000072
               WS-BUF                                                   00000073
               WITH ENCODING 37                                         00000074
               RETURNING NATIONAL                                       00000075
               VALIDATING WITH OSR-DATA                                 00000076
               PROCESSING PROCEDURE IS 1000-para THRU 1001-end          00000077
               ON EXCEPTION CALL 'CEE3ABD' END-CALL                     00000078
               NOT ON EXCEPTION PERFORM 2000-para                       00000079
           END-XML                                                      00000080
                                                                        00000081
           XML PARSE                                                    00000082
               WS-BUF                                                   00000083
               WITH ENCODING 37                                         00000084
               RETURNING NATIONAL                                       00000085
               VALIDATING WITH FILE OSR-DATA-FILE                       00000086
               PROCESSING PROCEDURE IS 1000-para THRU 1001-end          00000087
               ON EXCEPTION CALL 'CEE3ABD'                              00000088
               NOT ON EXCEPTION PERFORM 2000-para                       00000089
           END-XML                                                      00000090
                                                                        00000091
           DISPLAY MYNAME ' End'                                        00000092
                                                                        00000093
           GOBACK                                                       00000094
           .                                                            00000095
                                                                        00000096
       1000-para.                                                       00000097
                                                                        00000098
           .                                                            00000099
                                                                        00000100
       1001-end.                                                        00000101
                                                                        00000102
           .                                                            00000103
                                                                        00000104
       2000-para.                                                       00000105
                                                                        00000106
           .                                                            00000107
                                                                        00000108

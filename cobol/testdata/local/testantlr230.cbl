       Identification Division.                                         00000001
       Program-ID. testantlr230.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr230'.    00000006
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
           XML GENERATE WS-BUF FROM SOME-DATA END-XML                   00000023
                                                                        00000024
           XML GENERATE                                                 00000025
               WS-BUF FROM SOME-DATA                                    00000026
               COUNT WS-COUNT                                           00000027
               ENCODING 37                                              00000028
               XML-DECLARATION                                          00000029
               ATTRIBUTES                                               00000030
               NAMESPACE 'AEIOU'                                        00000031
               NAMESPACE-PREFIX 'ZZ9PLURALZA'                           00000032
               NAME SD-001 'ARTHUR'                                     00000033
                    SD-002 'DENT'                                       00000034
               TYPE SD-003 ELEMENT SD-002-A ATTRIBUTE SD-002-B CONTENT  00000035
               SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES        00000036
                        EVERY NUMERIC ELEMENT                           00000037
                              WHEN LOW-VALUES OR HIGH-VALUES            00000038
               ON EXCEPTION PERFORM 1000-para                           00000039
               NOT ON EXCEPTION CALL 'CEE3ABD'                          00000040
           END-XML                                                      00000041
                                                                        00000042
           XML GENERATE                                                 00000043
               WS-BUF FROM SOME-DATA                                    00000044
               COUNT IN WS-COUNT                                        00000045
               WITH ENCODING 37                                         00000046
               WITH XML-DECLARATION                                     00000047
               WITH ATTRIBUTES                                          00000048
               NAMESPACE IS 'AEIOU'                                     00000049
               NAMESPACE-PREFIX IS 'ZZ9PLURALZA'                        00000050
               NAME OF SD-001 IS 'ARTHUR'                               00000051
                       SD-002 IS 'DENT'                                 00000052
               TYPE OF SD-003 IS ELEMENT                                00000053
                       SD-002-A IS ATTRIBUTE                            00000054
                       SD-002-B IS CONTENT                              00000055
               SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES        00000056
                        SD-001 WHEN ZERO OR ZEROES OR ZEROS             00000057
                        EVERY NUMERIC ELEMENT                           00000058
                              WHEN LOW-VALUES OR HIGH-VALUES            00000059
                        SD-003 WHEN HIGH-VALUES                         00000060
               ON EXCEPTION PERFORM 1000-para                           00000061
               NOT ON EXCEPTION CALL 'CEE3ABD'                          00000062
           END-XML                                                      00000063
                                                                        00000064
                                                                        00000065
           DISPLAY MYNAME ' End'                                        00000066
                                                                        00000067
           GOBACK                                                       00000068
           .                                                            00000069
                                                                        00000070
       1000-para.                                                       00000071
                                                                        00000072
           .                                                            00000073
                                                                        00000074

       Identification Division.                                         00000001
       Program-ID. testantlr212.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr212'.    00000007
                                                                        00000008
       Procedure Division.                                              00000009
           DISPLAY MYNAME ' Begin'                                      00000010
                                                                        00000011
           EXEC CICS                                                    00000012
                XCTL                                                    00000013
                PROGRAM('PGMA0001')                                     00000014
                COMMAREA(CA-STUFF)                                      00000015
                LENGTH(CA-STUFF-LEN)                                    00000016
           END-EXEC                                                     00000017
                                                                        00000018
           DISPLAY MYNAME ' End'                                        00000019
                                                                        00000020
           GOBACK                                                       00000021
           .                                                            00000022
                                                                        00000023
                                                                        00000024

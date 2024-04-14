       Identification Division.                                         00000001
       Program-ID. testantlr215.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr215'.    00000007
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000008
                                                                        00000009
       Procedure Division.                                              00000010
           DISPLAY MYNAME ' Begin'                                      00000011
                                                                        00000012
           EXEC CICS                                                    00000013
                XCTL                                                    00000014
                PROGRAM(PGM-0001)                                       00000015
                COMMAREA(CA-STUFF)                                      00000016
                LENGTH(CA-STUFF-LEN)                                    00000017
           END-EXEC                                                     00000018
                                                                        00000019
           DISPLAY MYNAME ' End'                                        00000020
                                                                        00000021
           GOBACK                                                       00000022
           .                                                            00000023
                                                                        00000024
                                                                        00000025

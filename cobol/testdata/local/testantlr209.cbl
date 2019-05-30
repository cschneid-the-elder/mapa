       Identification Division.                                         00000001
       Program-ID. testantlr209.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr209'.    00000007
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000008
                                                                        00000009
       Procedure Division.                                              00000010
           DISPLAY MYNAME ' Begin'                                      00000011
                                                                        00000012
           EXEC CICS XCTL PROGRAM(PGM-0001) END-EXEC                    00000013
                                                                        00000014
           DISPLAY MYNAME ' End'                                        00000015
                                                                        00000016
           GOBACK                                                       00000017
           .                                                            00000018
                                                                        00000019
       1000-para.                                                       00000020
                                                                        00000021
           .                                                            00000022
                                                                        00000023

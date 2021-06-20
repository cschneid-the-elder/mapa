       Identification Division.                                         00000001
       Program-ID. testantlr262.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr262'.    00000006
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000007
                                                                        00000008
           EXEC SQL INCLUDE SQLCA END-EXEC                              00000009
                                                                        00000010
       Procedure Division.                                              00000011
           DISPLAY MYNAME ' Begin'                                      00000012
                                                                        00000013
           EXEC SQL INCLUDE testantlr262a END-EXEC                      00000014
                                                                        00000015
           DISPLAY MYNAME ' End'                                        00000016
                                                                        00000017
           GOBACK                                                       00000018
           .                                                            00000019
                                                                        00000020
                                                                        00000021

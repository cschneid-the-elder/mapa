       Identification Division.                                         00000001
       Program-ID. testantlr208.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr208'.    00000006
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000007
                                                                        00000008
       Procedure Division.                                              00000009
           DISPLAY MYNAME ' Begin'                                      00000010
                                                                        00000011
           EXEC CICS LINK PROGRAM(PGM-0001) END-EXEC                    00000012
                                                                        00000013
           DISPLAY MYNAME ' End'                                        00000014
                                                                        00000015
           GOBACK                                                       00000016
           .                                                            00000017
                                                                        00000018
                                                                        00000019

       Identification Division.                                         00000001
       Program-ID. testantlr206.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr206'.    00000007
                                                                        00000008
       Procedure Division.                                              00000009
           DISPLAY MYNAME ' Begin'                                      00000010
                                                                        00000011
           EXEC CICS LINK PROGRAM('PGMA0001') END-EXEC                  00000012
                                                                        00000013
           GOBACK                                                       00000014
           .                                                            00000015
                                                                        00000016
       1000-para.                                                       00000017
                                                                        00000018
           .                                                            00000019
                                                                        00000020

       Identification Division.                                         00000001
       Program-ID. testantlr202.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr202'.    00000006
                                                                        00000007
       Procedure Division.                                              00000008
           DISPLAY MYNAME ' Begin'                                      00000009
                                                                        00000010
           CALL 'PGMA0001'                                              00000011
                                                                        00000012
           GOBACK                                                       00000013
           .                                                            00000014
                                                                        00000015
                                                                        00000016

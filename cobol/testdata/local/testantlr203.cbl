       Identification Division.                                         00000001
       Program-ID. testantlr203.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr203'.    00000006
                                                                        00000007
                                                                        00000008
       Procedure Division.                                              00000009
           DISPLAY MYNAME ' Begin'                                      00000010
                                                                        00000011
           CALL 'PGMA0001' USING MYNAME                                 00000012
                                                                        00000013
           DISPLAY MYNAME ' End'                                        00000014
                                                                        00000015
           GOBACK                                                       00000016
           .                                                            00000017
                                                                        00000018
       1000-para.                                                       00000019
                                                                        00000020
           .                                                            00000021
                                                                        00000022

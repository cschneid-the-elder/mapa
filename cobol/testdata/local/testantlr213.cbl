       Identification Division.                                         00000001
       Program-ID. testantlr213.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr213'.    00000007
                                                                        00000008
       Procedure Division.                                              00000009
           DISPLAY MYNAME ' Begin'                                      00000010
                                                                        00000011
           EXEC SQL                                                     00000012
                CALL PGMA0001(AEIOU, EGBDF)                             00000013
           END-EXEC                                                     00000014
                                                                        00000015
           DISPLAY MYNAME ' End'                                        00000016
                                                                        00000017
           GOBACK                                                       00000018
           .                                                            00000019
                                                                        00000020
                                                                        00000021

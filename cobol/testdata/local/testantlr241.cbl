       Identification Division.                                         00000001
       Program-ID. testantlr241.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr241'.    00000007
           >>EVALUATE TRUE                                              00000008
           >>WHEN X = 3                                                 00000009
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000010
           >>WHEN OTHER                                                 00000011
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000012
           >>END-EVALUATE                                               00000013
                                                                        00000014
      *                                                                 00000015
                                                                        00000016
       Procedure Division.                                              00000017
           DISPLAY MYNAME ' Begin'                                      00000018
           CALL PGM-0001                                                00000019
                                                                        00000020
           DISPLAY MYNAME ' End'                                        00000021
                                                                        00000022
           GOBACK                                                       00000023
           .                                                            00000024
                                                                        00000025
                                                                        00000026

       Identification Division.                                         00000001
       Program-ID. testantlr235.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr235'.    00000007
           >>IF X DEFINED                                               00000008
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000009
           >>ELSE                                                       00000010
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000011
           >>END-IF                                                     00000012
                                                                        00000013
      *                                                                 00000014
                                                                        00000015
       Procedure Division.                                              00000016
           DISPLAY MYNAME ' Begin'                                      00000017
           CALL PGM-0001                                                00000018
                                                                        00000019
           DISPLAY MYNAME ' End'                                        00000020
                                                                        00000021
           GOBACK                                                       00000022
           .                                                            00000023
                                                                        00000024

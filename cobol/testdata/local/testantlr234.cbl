       PROCESS DEFINE(X)                                                00000001
       Identification Division.                                         00000002
       Program-ID. testantlr234.                                        00000003
       Data Division.                                                   00000004
       Working-Storage Section.                                         00000005
                                                                        00000006
       01  CONSTANTS.                                                   00000007
           05  MYNAME               PIC X(012) VALUE 'testantlr234'.    00000008
           >>IF X DEFINED                                               00000009
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000010
           >>ELSE                                                       00000011
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000012
           >>END-IF                                                     00000013
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

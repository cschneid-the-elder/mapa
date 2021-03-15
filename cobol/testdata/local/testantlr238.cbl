       PROCESS DEFINE(X=3)                                              00000001
       Identification Division.                                         00000002
       Program-ID. testantlr238.                                        00000003
       Data Division.                                                   00000004
       Working-Storage Section.                                         00000005
                                                                        00000006
       01  CONSTANTS.                                                   00000007
           05  MYNAME               PIC X(012) VALUE 'testantlr238'.    00000008
           >>EVALUATE X                                                 00000009
           >>WHEN 3                                                     00000010
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000011
           >>WHEN OTHER                                                 00000012
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000013
           >>END-EVALUATE                                               00000014
                                                                        00000015
      *                                                                 00000016
                                                                        00000017
       Procedure Division.                                              00000018
           DISPLAY MYNAME ' Begin'                                      00000019
           CALL PGM-0001                                                00000020
                                                                        00000021
           DISPLAY MYNAME ' End'                                        00000022
                                                                        00000023
           GOBACK                                                       00000024
           .                                                            00000025
                                                                        00000026
                                                                        00000027

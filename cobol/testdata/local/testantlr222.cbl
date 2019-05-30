       Identification Division.                                         00000001
       Program-ID. testantlr222.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr222'.    00000007
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000008
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000009
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000010
                                                                        00000011
      *                                                                 00000012
                                                                        00000013
       COPY 'testantlr005.cpy' REPLACING ==:PRFX:== BY ==AA-==          00000014
       .                                                                00000015
                                                                        00000016
                                                                        00000017
       Procedure Division.                                              00000018
           DISPLAY MYNAME ' Begin'                                      00000019
                                                                        00000020
                                                                        00000021
           DISPLAY MYNAME ' End'                                        00000022
                                                                        00000023
           GOBACK                                                       00000024
           .                                                            00000025
                                                                        00000026
                                                                        00000027

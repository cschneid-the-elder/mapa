       Identification Division.                                         00000001
       Program-ID. testantlr243.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       01  CONSTANTS.                                                   00000006
           05  MYNAME               PIC X(012) VALUE 'testantlr243'.    00000007
           >>EVALUATE TRUE                                              00000008
           >>WHEN X = 1                                                 00000009
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000010
           >>WHEN X = 2                                                 00000011
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000012
           >>WHEN X = 3                                                 00000013
           05  PGM-0001             PIC X(008) VALUE 'PGMA0003'.        00000014
           >>WHEN OTHER                                                 00000015
           05  PGM-0001             PIC X(008) VALUE 'PGMA0009'.        00000016
           >>END-EVALUATE                                               00000017
                                                                        00000018
      *                                                                 00000019
                                                                        00000020
       Procedure Division.                                              00000021
           DISPLAY MYNAME ' Begin'                                      00000022
           CALL PGM-0001                                                00000023
                                                                        00000024
           DISPLAY MYNAME ' End'                                        00000025
                                                                        00000026
           GOBACK                                                       00000027
           .                                                            00000028
                                                                        00000029
                                                                        00000030

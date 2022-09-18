       Identification Division.                                         00000001
       Program-ID. testantlr223.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr223'.    00000011
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000012
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000013
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000014
                                                                        00000015
      *                                                                 00000016
                                                                        00000017
       01 WORK-AREAS.                                        COPY TA023.00000018
                                                                        00000019
       Procedure Division.                                              00000020
           DISPLAY MYNAME ' Begin'                                      00000021
                                                                        00000022
           MOVE 'PGMB0004' TO PGM-0004                                  00000023
           MOVE PGM-0001   TO PGM-0004                                  00000024
                                                                        00000025
           DISPLAY MYNAME ' End'                                        00000026
                                                                        00000027
           GOBACK                                                       00000028
           .                                                            00000029
                                                                        00000030
       1000-para.                                                       00000031
                                                                        00000032
           CALL PGM-0004                                                00000033
                                                                        00000034
           .                                                            00000035
                                                                        00000036

       Identification Division.                                         00000001
       Program-ID. testantlr263.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  CONSTANTS.                                                   00000005
           05  MYNAME               PIC X(012) VALUE 'testantlr263'.    00000006
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000007
                                                                        00000008
           EXEC SQL INCLUDE SQLCA END-EXEC.                             00000009
                                                                        00000010
       Procedure Division.                                              00000011
           DISPLAY MYNAME ' Begin'                                      00000012
                                                                        00000013
           EXEC SQL                                                     00000014
                SELECT C1, C2                                           00000015
                FROM T1                                                 00000016
                WHERE C3 = 'BLUE'                                       00000017
           END-EXEC.                                                    00000018
                                                                        00000019
           EXEC SQL                                                     00000020
                INSERT INTO T1                                          00000021
                SELECT * FROM T2                                        00000022
           END-EXEC.                                                    00000023
                                                                        00000024
           DISPLAY MYNAME ' End'                                        00000025
                                                                        00000026
           GOBACK                                                       00000027
           .                                                            00000028
                                                                        00000029
                                                                        00000030

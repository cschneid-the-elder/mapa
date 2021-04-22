000100 IDENTIFICATION DIVISION.                                         SM2024.2
000200 PROGRAM-ID.                                                      SM2024.2
000300     SM202A.                                                      SM2024.2
003000 ENVIRONMENT DIVISION.                                            SM2024.2
003100 CONFIGURATION SECTION.                                           SM2024.2
003200 SOURCE-COMPUTER.                                                 SM2024.2
003300     XXXXX082.                                                    SM2024.2
003400 OBJECT-COMPUTER.                                                 SM2024.2
003500     XXXXX083.                                                    SM2024.2
004200 DATA DIVISION.                                                   SM2024.2
005800 WORKING-STORAGE SECTION.                                         SM2024.2
005900 01  COUNTER-16 PICTURE 9 VALUE 1.                                SM2024.2
006000 01  TOTAL-AREA.                                                  SM2024.2
006100     02 AREA-1          PICTURE AAAAA.                            SM2024.2
006200     02 AREA-2          PICTURE XXXXB.                            SM2024.2
006300     02 AREA-3          PICTURE XXXXX.                            SM2024.2
006400     02 AREA-4          PICTURE ZZZZZ.                            SM2024.2
006500 01  MISLEADING-DATA.                                             SM2024.2
006600     02 FALSE-DATA-1    PICTURE AAAAA VALUE "FALSE".              SM2024.2
006700     02 FALSE-DATA-2    PICTURE XXXXX VALUE " TENT".              SM2024.2
006800     02 FALSE-DATA-3    PICTURE XXXXX VALUE "- 5 =".              SM2024.2
006900     02 FALSE-DATA-4    PICTURE 99999 VALUE 00012.                SM2024.2
007000 01  QUALIFIED-DATA.                                              SM2024.2
007100     02 TRUE-Q-02.                                                SM2024.2
007200         03 TRUE-Q-03.                                            SM2024.2
007300             04 TRUE-Q-04 PICTURE A(5) VALUE "TRUE ".             SM2024.2
007400         03 FALSE-Q-03.                                           SM2024.2
007500             04 TRUE-Q-04 PICTURE A(5) VALUE "FIGHT".             SM2024.2
007600     02 FALSE-Q-02.                                               SM2024.2
007700         03 TRUE-Q-03.                                            SM2024.2
007800             04 TRUE-Q-04 PICTURE A(5) VALUE "DRIVE".             SM2024.2
007900         03 FALSE-Q-03.                                           SM2024.2
008000             04 TRUE-Q-04 PICTURE A(5) VALUE "THROW".             SM2024.2
022800 PROCEDURE DIVISION.                                              SM2024.2
048200 COPY-TEST-17.                                                    SM2024.2
050000                                                       COPY K2PRA SM2024.2
050100              REPLACING FALSE-DATA-1 BY TRUE-Q-04 OF TRUE-Q-03    SM2024.2
050200                                                  IN TRUE-Q-02    SM2024.2
050300                        COPY-WRITE-16 BY COPY-WRITE-17            SM2024.2
050400                        FALSE-DATA-2 BY " TWO FIVE "              SM2024.2
050500                        FALSE-DATA-3 BY Z (2, 1, 1)               SM2024.2
050600                        FALSE-DATA-4 BY +000004.99.               SM2024.2
024000 TERMINATE-CALL.                                                  SM2024.2
024100     STOP     RUN.                                                SM2024.2


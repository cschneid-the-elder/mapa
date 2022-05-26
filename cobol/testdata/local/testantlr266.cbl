       Process DEFINE(GRAYZA,'PGM00001')                                00000001
       Identification Division.                                         00000002
       Program-ID.    testantlr266.                                     00000003
       Data Division.                                                   00000004
       Working-Storage Section.                                         00000005
       01  PGM1 Constant From GRAYZA.                                   00000006
       01  PGM2 Constant As   'PGM00002'.                               00000007
       Procedure Division.                                              00000008
           Call PGM1                                                    00000009
           Call PGM2                                                    00000010
           Goback                                                       00000011
           .                                                            00000012
                                                                        00000013

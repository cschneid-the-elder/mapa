       ID Division.                                                     00000001
       Program-ID. testantlr250.                                        00000002
       Procedure Division.                                              00000003
                                                                        00000004
       >>DEFINE A 1                                                     00000005
       >>DEFINE B 2                                                     00000006
       >>DEFINE C 3                                                     00000007
       >>DEFINE D A + B * C                                             00000008
       >>DEFINE E (A + B) * C                                           00000009
       >>DEFINE F A + (B * C)                                           00000010
                                                                        00000011
           >>EVALUATE D                                                 00000012
           >>WHEN 9                                                     00000013
           CALL 'D#IS#9'                                                00000014
           >>WHEN 7                                                     00000015
           CALL 'D#IS#7'                                                00000016
           >>WHEN OTHER                                                 00000017
           CALL 'WHATTHE#'                                              00000018
           >>END-EVALUATE                                               00000019
                                                                        00000020
           >>EVALUATE E                                                 00000021
           >>WHEN 9                                                     00000022
           CALL 'E#IS#9'                                                00000023
           >>WHEN 7                                                     00000024
           CALL 'E#IS#7'                                                00000025
           >>WHEN OTHER                                                 00000026
           CALL 'WHATTHE#'                                              00000027
           >>END-EVALUATE                                               00000028
                                                                        00000029
           >>EVALUATE F                                                 00000030
           >>WHEN 9                                                     00000031
           CALL 'F#IS#9'                                                00000032
           >>WHEN 7                                                     00000033
           CALL 'F#IS#7'                                                00000034
           >>WHEN OTHER                                                 00000035
           CALL 'WHATTHE#'                                              00000036
           >>END-EVALUATE                                               00000037
                                                                        00000038
                                                                        00000039
           GOBACK.                                                      00000040

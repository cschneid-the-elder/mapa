       ID Division.                                                     00000001
       Program-ID. testantlr258.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  copy         'testantlr258a.cpy'.                            00000005
                                                copy testantlr258b.cpy. 00000006
                                                 copy testantlr258c.cpy 00000007
       replacing ==%comp1le error%== by ====                            00000008
                                                                      . 00000009
                                                 copy testantlr258c.cpy 00000010
       replacing % by ====                                              00000011
        comp1le by ====                                                 00000012
        error by ====                                                   00000013
        ADD by SUBTRACT                                                 00000014
        ==MULTIPLY== BY ==DIVIDE==                                      00000015
        ONE AND TWO AND THREE BY FOUR AND FIVE AND SIX                  00000016
                                                                      . 00000017
                                                 copy testantlr258d.cpy 00000018
       replacing ==%comp1le error1%== by ====                           00000019
                 ==%comp1le error2%== by ====                           00000020
                                                                      . 00000021
                                                 copy testantlr258e.cpy 00000022
       replacing ==:TAG1:== by ==WS-==                                  00000023
       ==:TAG2:== by ==W1-==                                          . 00000024
       Procedure Division.                                              00000025
           DISPLAY 'Julia'. copy testantlr258f.cpy. DISPLAY 'Wicker'    00000026
           DISPLAY 'Eliot'. copy testantlr258f.cpy                      00000027
           replacing ==:Hello:== by ==:Howdy:==                         00000028
           ==:World:== by ==:Planet:==. DISPLAY 'Waugh'                 00000029
           GOBACK.                                                      00000030

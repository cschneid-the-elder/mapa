       ID Division.
       Program-ID. testantlr058.
       Data Division.
       Working-Storage Section.
       01  copy         'testantlr058a.cpy'.
                                                copy testantlr058b.cpy.
                                                 copy testantlr058c.cpy
       replacing ==%comp1le error%== by ====
                                                                      .
                                                 copy testantlr058c.cpy
       replacing % by ====
        comp1le by ====
        error by ====
        ADD by SUBTRACT
        ==MULTIPLY== BY ==DIVIDE==
        ONE AND TWO AND THREE BY FOUR AND FIVE AND SIX
                                                                      .
                                                 copy testantlr058d.cpy
       replacing ==%comp1le error1%== by ====
                 ==%comp1le error2%== by ====
                                                                      .
                                                 copy testantlr058e.cpy
       replacing ==:TAG1:== by ==WS-==
       ==:TAG2:== by ==W1-==                                          .
       Procedure Division.
           DISPLAY 'Julia'. copy testantlr058f.cpy. DISPLAY 'Wicker'
           DISPLAY 'Eliot'. copy testantlr058f.cpy
           replacing ==:Hello:== by ==:Howdy:==
           ==:World:== by ==:Planet:==. DISPLAY 'Waugh'
           GOBACK.

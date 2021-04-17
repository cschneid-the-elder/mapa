000001 ID Division.
000002 Program-ID. testantlr158.
000003 Data Division.
000004 Working-Storage Section.
000005 01  copy         'testantlr158a.cpy'.
000006                                          copy testantlr158b.cpy.
000007                                           copy testantlr158c.cpy
000008 replacing ==%comp1le error%== by ====
000009                                                                .
000010                                           copy testantlr158c.cpy
000011 replacing % by ====
000012  comp1le by ====
000013  error by ====
000014  ADD by SUBTRACT
000015  ==MULTIPLY== BY ==DIVIDE==
000016  ONE AND TWO AND THREE BY FOUR AND FIVE AND SIX
000017                                                                .
000018                                           copy testantlr158d.cpy
000019 replacing ==%comp1le error1%== by ====
000020           ==%comp1le error2%== by ====
000021                                                                .
000022                                           copy testantlr158e.cpy
000023 replacing ==:TAG1:== by ==WS-==
000024 ==:TAG2:== by ==W1-==                                          .
000025 Procedure Division.
000026     DISPLAY 'Julia'. copy testantlr158f.cpy. DISPLAY 'Wicker'
000027     DISPLAY 'Eliot'. copy testantlr158f.cpy
000028     replacing ==:Hello:== by ==:Howdy:==
000029     ==:World:== by ==:Planet:==. DISPLAY 'Waugh'
000030     GOBACK.

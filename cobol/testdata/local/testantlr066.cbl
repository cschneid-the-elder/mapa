       Process DEFINE(GRAYZA,'PGM00001')
       Identification Division.
       Program-ID.    testantlr066.
       Data Division.
       Working-Storage Section.
       01  PGM1 Constant From GRAYZA.
       01  PGM2 Constant As   'PGM00002'.
       Procedure Division.
           Call PGM1
           Call PGM2
           Goback
           .
           

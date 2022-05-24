       PROCESS DEFINE(GRAYZA='PGM00003')
       Identification Division.
       Program-ID. testantlr066.
       Data Division.
       Working-Storage Section.
       >>DEFINE Meeklo 'PGM00002'
       01  Scorpius Constant 'PGM00001'.
       01  Braca Constant From Meeklo.
       01  Mele-On Constant From GRAYZA.
       Procedure Division.
           Call Scorpius
           Call Braca
           Call Mele-On
           GOBACK.


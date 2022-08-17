       ID Division.                                                     00000001
       Program-ID. testantlr267.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  work-areas.                                                  00000005
           05  sub1          pic 9999 Binary.                           00000006
           05  call-table occurs 5.                                     00000007
               10  call-pgm  pic x(008).                                00000008
                                                                        00000009
       Procedure Division.                                              00000010
           Move 'PGM00001' to call-pgm(1)                               00000011
      *    Move 'PGM00002' to call-pgm(2)                               00000012
           Move 'PGM00003' to call-pgm(3)                               00000013
           Move 'PGM00004' to call-pgm(4)                               00000014
           Move 'PGM00005' to call-pgm(5)                               00000015
           perform varying sub1 from 1 by 1 until sub1 > 5              00000016
             call call-pgm(sub1) end-call                               00000017
           end-perform                                                  00000018
           GOBACK.                                                      00000019

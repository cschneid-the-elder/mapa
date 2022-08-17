       ID Division.
       Program-ID. testantlr067.
       Data Division.
       Working-Storage Section.
       01  work-areas.
           05  sub1          pic 9999 Binary.
           05  call-table occurs 5.
               10  call-pgm  pic x(008).
               
       Procedure Division.
           Move 'PGM00001' to call-pgm(1)
      *    Move 'PGM00002' to call-pgm(2)
           Move 'PGM00003' to call-pgm(3)
           Move 'PGM00004' to call-pgm(4)
           Move 'PGM00005' to call-pgm(5)
           perform varying sub1 from 1 by 1 until sub1 > 5
             call call-pgm(sub1) end-call
           end-perform
           GOBACK.

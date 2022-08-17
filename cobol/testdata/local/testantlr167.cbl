000001 ID Division.
000002 Program-ID. testantlr167.
000003 Data Division.
000004 Working-Storage Section.
000005 01  work-areas.
000006     05  sub1          pic 9999 Binary.
000007     05  call-table occurs 5.
000008         10  call-pgm  pic x(008).
000009         
000010 Procedure Division.
000011     Move 'PGM00001' to call-pgm(1)
000012*    Move 'PGM00002' to call-pgm(2)
000013     Move 'PGM00003' to call-pgm(3)
000014     Move 'PGM00004' to call-pgm(4)
000015     Move 'PGM00005' to call-pgm(5)
000016     perform varying sub1 from 1 by 1 until sub1 > 5
000017       call call-pgm(sub1) end-call
000018     end-perform
000019     GOBACK.

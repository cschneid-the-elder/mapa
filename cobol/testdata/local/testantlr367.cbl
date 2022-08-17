000001 ID Division.                                                     00000001
000002 Program-ID. testantlr367.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  work-areas.                                                  00000005
000006     05  sub1          pic 9999 Binary.                           00000006
000007     05  call-table occurs 5.                                     00000007
000008         10  call-pgm  pic x(008).                                00000008
000009                                                                  00000009
000010 Procedure Division.                                              00000010
000011     Move 'PGM00001' to call-pgm(1)                               00000011
000012*    Move 'PGM00002' to call-pgm(2)                               00000012
000013     Move 'PGM00003' to call-pgm(3)                               00000013
000014     Move 'PGM00004' to call-pgm(4)                               00000014
000015     Move 'PGM00005' to call-pgm(5)                               00000015
000016     perform varying sub1 from 1 by 1 until sub1 > 5              00000016
000017       call call-pgm(sub1) end-call                               00000017
000018     end-perform                                                  00000018
000019     GOBACK.                                                      00000019

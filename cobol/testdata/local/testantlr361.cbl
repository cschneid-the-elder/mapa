000001 BASIS testantlr361a.cbl                                          00000001
000002 INSERT 000001                                                    00000002
000003 REPLACE                                                          00000003
000004         ==:PROGRAMID1:== BY ==testantlr361==                     00000004
000005         ==:PROGRAMID2:== BY =='testantlr361'==.                  00000005
000006 DELETE 000011-000014                                             00000006
000007     DISPLAY MYNAME FUNCTION CURRENT-DATE 'Begin Processing'      00000007
000008     CALL 'CEEGTST' USING STUFF END-CALL                          00000008
000009     EXEC CICS XCTL PROGRAM('PGM0061A')                           00000009
000010     END-EXEC                                                     00000010
000011     DISPLAY MYNAME FUNCTION CURRENT-DATE 'End Processing'        00000011
000012 DELETE 000018-000020,000021                                      00000012
000013 INSERT 000022                                                    00000013
000014 CALL 'CEE3ABD'.                                                  00000014
000015 END PROGRAM testantlr361.                                        00000015
000016                                                                  00000016

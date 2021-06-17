       BASIS testantlr261a.cbl                                          00000001
       INSERT 000001                                                    00000002
       REPLACE                                                          00000003
               ==:PROGRAMID1:== BY ==testantlr261==                     00000004
               ==:PROGRAMID2:== BY =='testantlr261'==.                  00000005
       DELETE 000011-000014                                             00000006
           DISPLAY MYNAME FUNCTION CURRENT-DATE 'Begin Processing'      00000007
           CALL 'CEEGTST' USING STUFF END-CALL                          00000008
           EXEC CICS XCTL PROGRAM('PGM0061A')                           00000009
           END-EXEC                                                     00000010
           DISPLAY MYNAME FUNCTION CURRENT-DATE 'End Processing'        00000011
       DELETE 000018-000020,000021                                      00000012
       INSERT 000022                                                    00000013
       CALL 'CEE3ABD'.                                                  00000014
       END PROGRAM testantlr261.                                        00000015
                                                                        00000016

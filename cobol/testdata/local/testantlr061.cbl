       BASIS testantlr061a.cbl
       INSERT 000001
       REPLACE
               ==:PROGRAMID1:== BY ==testantlr061==
               ==:PROGRAMID2:== BY =='testantlr061'==.
       DELETE 000011-000014
           DISPLAY MYNAME FUNCTION CURRENT-DATE 'Begin Processing'
           CALL 'CEEGTST' USING STUFF END-CALL
           EXEC CICS XCTL PROGRAM('PGM0061A')
           END-EXEC
           DISPLAY MYNAME FUNCTION CURRENT-DATE 'End Processing'
       DELETE 000018-000020,000021
       INSERT 000022
       CALL 'CEE3ABD'.
       END PROGRAM testantlr061.
       

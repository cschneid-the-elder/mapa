//COMBINED JOB
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  DISP=(OLD,KEEP),
//             DSN='ELDERBERRY LEAVES',
//             LRECL=255,
//             RECFM=FB,
//             UNIT=(TAPE,,DEFER),
//             VOL=(PRIVATE,RETAIN,2,3,
//             SER=(8675309,314159,EGGS)),
//             MODE=CEOR,BUFNO=20
//DD000002 DD  DISP=OLD,UNIT=AFF=DD000001,
//             DSN='ARTICHOKE ROOTS',VOL=(PRIVATE,
//             ,1,,REF=*.DD000001)
//DD000003 DD  PATH='/temp/goulash',
//             PATHDISP=(KEEP,DELETE),
//             PATHOPTS=(OWRONLY,
//             OCREAT,OEXCL),PATHMODE=(SIRWXU,SIRGRP)
//DD000004 DD  DISP=(NEW,CATLG,DELETE),
//             DSN=&SYSUID..TESTDATA,
//             MGMTCLAS=STD,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//DD000005 DD  DISP=SHR,DSN=CONTROL.CARDS(SRT#0080)
//DD000006 DD  DISP=(NEW,CATLG,DELETE),
//             DSN=ONE.&TWO..THREE.&FOUR,
//             MGMTCLAS=IMSTD,
//             LRECL=80,
//*//             AVGREC=M,
//             AVGREC=K,
//             SPACE=(80,(10,10),RLSE)
//DD000007 DD  DISP=OLD,UNIT=CART ,
//*//             VOL=SER=(1,
//*//             2,
//*//             3,
//*//             4)
//DD000008 DD  DISP=OLD,UNIT=CART,
//             VOL=SER=(1,
//*//             2,
//*//             3,
//             4)
//DD000009 DD  PATH='/temp/goulash',
//             PATHDISP=(KEEP,DELETE),
//             PATHOPTS=(OWRONLY,
//*//             OCREAT,
//             OEXCL),PATHMODE=(SIRWXU,
//*//             SIRWXO,
//             SIRGRP)
//DD000010 DD  OUTPUT=(*.DD1,
//             *.DD2,
//*//             *.DD3A,
//*//             *.DD3B,
//*//             *.DD3C,
//             *.DD4),SYSOUT=*
//DD000011 DD  DISP=(NEW,CATLG,CATLG),
//             DCB=(LRECL=255,
//*//             BLKSIZE=27998,
//             RECFM=FB),DSN=&SYSUID..OUTPUT,
//             SPACE=(TRK,10)
//STEP0002 EXEC PROC=APROC
//PSTEP01.DD000001 DD
//         DD
//         DD  DISP=SHR,DSN=OVERRIDE.LOADLIB
//         DD
//         DD  DISP=SHR,DSN=PATCH.LOADLIB

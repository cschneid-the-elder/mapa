//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14
//STEP001A EXEC PGM=IEFBR14,ADDRSPC=REAL
//STEP001B EXEC PGM=IEFBR14,ADDRSPC=VIRT
//STEP001C EXEC PGM=IEFBR14,
// ADDRSPC=REAL
//STEP001D EXEC PGM=IEFBR14,
// ADDRSPC=VIRT
//STEP001E EXEC PROC=IAYEAYE,ADDRSPC.STEPX=REAL
//STEP001F EXEC PROC=IAYEAYE,ADDRSPC.STEPX=VIRT
//STEP001G EXEC PROC=IAYEAYE,ADDRSPC.STEPX=REAL,ADDRSPC.STEPY=VIRT
//STEP001H EXEC PROC=IAYEAYE,
// ADDRSPC.STEPX=REAL,
// ADDRSPC.STEPY=VIRT
//STEP002  EXEC PGM=IEFBR14,PARM=X,ADDRSPC=REAL
//STEP002A EXEC PGM=IEFBR14,PARM=XX,ADDRSPC=VIRT
//STEP002B EXEC PGM=IEFBR14,PARM=1,ADDRSPC=REAL
//STEP002C EXEC PGM=IEFBR14,PARM=12,ADDRSPC=VIRT
//STEP002D EXEC PGM=IEFBR14,PARM=#,ADDRSPC=REAL
//STEP002E EXEC PGM=IEFBR14,PARM=#$,ADDRSPC=VIRT
//STEP002F EXEC PGM=IEFBR14,PARM=X1,ADDRSPC=REAL
//STEP002G EXEC PGM=IEFBR14,PARM=XX1,ADDRSPC=VIRT
//STEP002H EXEC PGM=IEFBR14,PARM=XX11,ADDRSPC=REAL
//STEP002I EXEC PGM=IEFBR14,PARM=1X,ADDRSPC=VIRT
//STEP002J EXEC PGM=IEFBR14,PARM=11X,ADDRSPC=REAL
//STEP002K EXEC PGM=IEFBR14,PARM=11XX,ADDRSPC=VIRT
//STEP002L EXEC PGM=IEFBR14,PARM=X@,ADDRSPC=REAL
//STEP002M EXEC PGM=IEFBR14,PARM=XX@,ADDRSPC=VIRT
//STEP002N EXEC PGM=IEFBR14,PARM=XX@@,ADDRSPC=REAL
//STEP002O EXEC PGM=IEFBR14,PARM=1@,ADDRSPC=VIRT
//STEP002P EXEC PGM=IEFBR14,PARM=11@,ADDRSPC=REAL
//STEP002Q EXEC PGM=IEFBR14,PARM=11@@,ADDRSPC=VIRT
//STEP002R EXEC PGM=IEFBR14,PARM=X1@,ADDRSPC=REAL
//STEP002S EXEC PGM=IEFBR14,PARM=XX1@,ADDRSPC=VIRT
//STEP002T EXEC PGM=IEFBR14,PARM=XX11@,ADDRSPC=REAL
//STEP002U EXEC PGM=IEFBR14,PARM=XX11@@,ADDRSPC=VIRT
//STEP002V EXEC PGM=IEFBR14,PARM=1X@,ADDRSPC=REAL
//STEP003  EXEC PGM=IEFBR14,PARM='X',ADDRSPC=VIRT
//STEP004  EXEC PGM=IEFBR14,PARM='A1@/STGRPT(ON)',ADDRSPC=REAL
//STEP005  EXEC PGM=IEFBR14,PARM=&A,ADDRSPC=VIRT
//STEP006  EXEC PGM=IEFBR14,PARM=&AB,ADDRSPC=REAL
//STEP007  EXEC PGM=IEFBR14,PARM=&A.1,ADDRSPC=VIRT
//STEP008  EXEC PGM=IEFBR14,PARM=ZZ&A,ADDRSPC=REAL
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,ADDRSPC=VIRT
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',ADDRSPC=REAL
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),ADDRSPC=VIRT
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),ADDRSPC=REAL                         PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),ADDRSPC=VIRT
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),ADDRSPC=REAL
//STEP015  EXEC PGM=IEFBR14,PARM=X,ADDRSPC=VIRT moo
//STEP016  EXEC IAYEAYE,PARM.STEPA=X,ADDRSPC.STEPC=REAL
//STEP017  EXEC IAYEAYE,PARM.STEPA=X,PARM.STEPB=Y,ADDRSPC.STEPC=VIRT
//STEP018  EXEC IAYEAYE,
// PARM.STEPA=(A,B,C),
// PARM.STEPB=(D,E,F),ADDRSPC.STEPC=REAL

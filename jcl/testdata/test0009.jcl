//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14
//STEP001A EXEC PGM=IEFBR14,COND=EVEN
//STEP001B EXEC PGM=IEFBR14,COND=ONLY
//STEP001C EXEC PGM=IEFBR14,COND=(4,GT,STEP001)
//STEP001D EXEC PGM=IEFBR14,COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP001E EXEC PGM=IEFBR14,COND=((8,LT,STEP001),(8,GT,STEP001A))
//STEP001F EXEC PGM=IEFBR14,
// COND=((8,LT,STEP001),(8,GT,STEP001A))
//STEP002  EXEC PGM=IEFBR14,PARM=X,COND=EVEN
//STEP002A EXEC PGM=IEFBR14,PARM=XX,COND=ONLY
//STEP002B EXEC PGM=IEFBR14,PARM=1,COND=(4,GT,STEP001)
//STEP002C EXEC PGM=IEFBR14,PARM=12,COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP002D EXEC PGM=IEFBR14,PARM=#
//STEP002E EXEC PGM=IEFBR14,PARM=#$,COND=EVEN
//STEP002F EXEC PGM=IEFBR14,PARM=X1,COND=ONLY
//STEP002G EXEC PGM=IEFBR14,PARM=XX1,COND=(4,GT,STEP001)
//STEP002H EXEC PGM=IEFBR14,PARM=XX11,COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP002I EXEC PGM=IEFBR14,PARM=1X
//STEP002J EXEC PGM=IEFBR14,PARM=11X,COND=&COND
//STEP002K EXEC PGM=IEFBR14,PARM=11XX,COND=ONLY
//STEP002L EXEC PGM=IEFBR14,PARM=X@,COND=(&S1MAX,GT,STEP001)
//STEP002M EXEC PGM=IEFBR14,PARM=XX@,COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP002N EXEC PGM=IEFBR14,PARM=XX@@
//STEP002O EXEC PGM=IEFBR14,PARM=1@,COND=EVEN
//STEP002P EXEC PGM=IEFBR14,PARM=11@,COND=ONLY
//STEP002Q EXEC PGM=IEFBR14,PARM=11@@,COND=(4,GT,STEP001)
//STEP002R EXEC PGM=IEFBR14,PARM=X1@,COND=((&MAXIMAX,GE),(90,LE,STEP001),ONLY)
//STEP002S EXEC PGM=IEFBR14,PARM=XX1@
//STEP002T EXEC PGM=IEFBR14,PARM=XX11@,COND=EVEN
//STEP002U EXEC PGM=IEFBR14,PARM=XX11@@,COND=ONLY
//STEP002V EXEC PGM=IEFBR14,PARM=1X@,COND=(4,GT,STEP001)
//STEP003  EXEC PGM=IEFBR14,PARM='X',COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP004  EXEC PGM=IEFBR14,PARM='A1@/STGRPT(ON)'
//STEP005  EXEC PGM=IEFBR14,PARM=&A,COND=EVEN
//STEP006  EXEC PGM=IEFBR14,PARM=&AB,COND=ONLY
//STEP007  EXEC PGM=IEFBR14,PARM=&A.1,COND=(4,GT,STEP001)
//STEP008  EXEC PGM=IEFBR14,PARM=ZZ&A,COND=((16,GE),(90,LE,STEP001),ONLY)
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',COND=EVEN
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),COND=ONLY
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),COND=(4,GT,STEP001)                  PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),COND=EVEN
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),COND=ONLY
//STEP015  EXEC PGM=IEFBR14,PARM=X,COND=(4,GT,STEP001) moo
//STEP016  EXEC IAYEAYE,PARM.STEPA=X,
// COND.STEPC=((16,GE),(90,LE,STEP001),ONLY)
//STEP017  EXEC IAYEAYE,PARM.STEPA=X,PARM.STEPB=Y,
// COND.STEPB=(0,NE,STEPA),COND.STEPD=(8,GT,STEPC.STEPX)
//STEP018  EXEC IAYEAYE,
// PARM.STEPA=(A,B,C),
// PARM.STEPB=(D,E,F),COND.STEPC=EVEN
//STEP018  EXEC IAYEAYE,
// PARM.STEPA=(A,B,C),
// PARM.STEPB=(D,E,F),
// COND.STEPC=&CONDC,
// COND.STEPD=(4,LT,STEPC.STEPX)
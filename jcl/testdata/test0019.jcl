//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14,PERFORM=1
//STEP002  EXEC PGM=IEFBR14,PARM=X,PERFORM=12
//STEP002A EXEC PGM=IEFBR14,PARM=XX,PERFORM=123
//STEP002B EXEC PGM=IEFBR14,PARM=1,PERFORM=&PERFORM
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,PERFORM=101
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',PERFORM=101
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),PERFORM=101
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),PERFORM=101                          PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),PERFORM=101
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),PERFORM=101
//STEP015  EXEC PGM=IEFBR14,PARM=X,PERFORM=101 moo
//STEP016  EXEC IAYEAYE,PARM.STEPA=X,PERFORM.STEPA=101
//STEP017  EXEC IAYEAYE,PARM.STEPA=X,PARM.STEPB=Y,PERFORM.STEPC=101
//STEP018  EXEC IAYEAYE,
// PARM.STEPA=(A,B,C),
// PARM.STEPB=(D,E,F),
// PERFORM.STEPC=101
//STEP019  EXEC IAYEAYE,
// PARM.STEPA=(&A1,&B2,&C3),
// PARM.STEPB=(&D4,&E5,&F6),
// PERFORM.STEPC=&PERFORM
//STEP020  EXEC IAYEAYE,
// PARM.STEPA=(&A1,&B2,&C3),
// PARM.STEPB=(&D4,&E5,&F6),
// PARM.STEPC=(&A1,&B2,&C3,&D4),
// PARM.STEPD=(&A1,
// &B2,&C3,&D4,&E5,&F6),
// PERFORM=&PERFORM

//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14,RLSTMOUT=1
//STEP002  EXEC PGM=IEFBR14,PARM=X,RLSTMOUT=12
//STEP002A EXEC PGM=IEFBR14,PARM=XX,RLSTMOUT=123
//STEP002B EXEC PGM=IEFBR14,PARM=1,RLSTMOUT=&RLSTMOUT
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,RLSTMOUT=101
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',RLSTMOUT=101
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),RLSTMOUT=101
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),RLSTMOUT=101                          PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),RLSTMOUT=101
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),RLSTMOUT=101
//STEP015  EXEC PGM=IEFBR14,PARM=X,RLSTMOUT=101 moo

//SYMBOLIC JOB
//*
//GLOBAL   INCLUDE MEMBER=GSET
//*
//AERYN    PROC AENV=D
//*
//PS01     EXEC PGM=CHIANA
//STEPLIB      INCLUDE MEMBER=LIB&AENV Production
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CHIANNA.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//         PEND
//*
//MOYA     PROC
//*
//PS01     EXEC PGM=TALYN
//STEPLIB       INCLUDE MEMBER=LIB&AENV Must be set via SET
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..TALYN.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//         PEND
// SET AENV=P
//*
//JS01     EXEC PGM=CRICHTON
//STEPLIB      INCLUDE MEMBER=LIB&AENV Production
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CRICHTON.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
// SET AENV=Q
//*
//JS02     EXEC PGM=CRICHTON
//STEPLIB      INCLUDE MEMBER=LIB&AENV QA
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CRICHTON.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//JS03     EXEC PROC=AERYN
//*
//JS04     EXEC PROC=AERYN,AENV=P
//*
//JS05     EXEC PROC=MOYA
//*
//JS06     EXEC PROC=MOYA,AENV=Z
//*
//JS02     EXEC PGM=CRAIS
//STEPLIB      INCLUDE MEMBER=LIB&AENV
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CRICHTON.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//PRINT        INCLUDE MEMBER=OUT&A.X&B&C.YZ
//*

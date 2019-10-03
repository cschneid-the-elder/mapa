//SYMBOLIC JOB
//*
//AERYN    PROC AENV=D
//*
//PS01     EXEC PGM=CHIANNA
//STEPLIB      INCLUDE MEMBER=LIB&AENV Production
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CHIANNA.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//         PEND
//*
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

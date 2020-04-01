//SYMBOL01 JOB NOTIFY=&SYSUID
//*
//GLOBAL   INCLUDE MEMBER=GSET
//*
//AERYN    PROC AENV=D,B=7
//*
// SET AENV=Z Nullified by the value set on the PROC statement
//*
//PS01     EXEC PGM=CHIANA
//STEPLIB      INCLUDE MEMBER=LIB&AENV
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CHIANA.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//PRINT        INCLUDE MEMBER=O&A.X&B&C.YZ
//*
//         PEND
//*
//MOYA     PROC
//*
//PS01     EXEC PGM=TALYN
//STEPLIB       INCLUDE MEMBER=LIB&AENV Must be set via SET or EXEC
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..TALYN.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//         PEND
//*
// SET AENV=P
// SET UNUSED1='D''AVIN&&JAQOBIS'
// SET UNUSED2=DUTCH,UNUSED3='LUCY',UNUSED4=JOHNNY
// SET CENV=&AENV
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
//JS06     EXEC PROC=MOYA,AENV=D
//*
// SET A=6
//*
//JS07     EXEC PGM=CRAIS
//STEPLIB      INCLUDE MEMBER=LIB&AENV
//CARDS    DD  DISP=SHR,DSN=CARDS&CENV..APP
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CRAIS.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//PRINT        INCLUDE MEMBER=O&A.X&B&C.YZ
//*
//JS08     EXEC PROC=ZHAAN
//*
//SYMBOL02 JOB
//*
//GLOBAL   INCLUDE MEMBER=GSET
//*
//AERYN    PROC AENV=S,B=7
//*
// SET AENV=Z Nullified by the value set on the PROC statement
//*
//PS01     EXEC PGM=STARK
//STEPLIB      INCLUDE MEMBER=LIB&AENV
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..STARK.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//PRINT        INCLUDE MEMBER=O&A.X&B&C.YZ
//*
//         PEND
//*
//MOYA     PROC
//*
//PS01     EXEC PGM=NORANTI
//STEPLIB       INCLUDE MEMBER=LIB&AENV Must be set via SET or EXEC
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..NORANTI.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//*
//         PEND
//*
// SET AENV=P
// SET CENV=&AENV
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
//JS06     EXEC PROC=MOYA,AENV=Q
//*
// SET A=6
//*
//JS07     EXEC PGM=CRAIS
//STEPLIB      INCLUDE MEMBER=LIB&AENV
//CARDS    DD  DISP=SHR,DSN=CARDS&CENV..APP
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CRAIS.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//PRINT        INCLUDE MEMBER=O&A.X&B&C.YZ
//*


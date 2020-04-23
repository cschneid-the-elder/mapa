//PARMDOT1 JOB
//*
//STEP1    EXEC PGM=&PGM.7
//DD01     DD  DISP=&D.I&S.P,
//             DSN=&SYSUID..JCL.CNTL(&MEM.1),
//             UNIT=(&UNIT.7,&COUNT.0,&DEFER.0,&SMSHONOR.0),
//             LRECL=&L.0,
//             BLKSIZE=&B.0,
//             RECFM=&R.0,
//             AVGREC=&AVG.0,
//             VOL=(&PRIVATE.0,&RETAIN.0,&SEQNB.0,&COUNT.0),
//             SPACE=(&S.1,(&S.2,&S.3),&S.4),
//             MGMTCLAS=&M.0,
//             STORCLAS=&S.0
//*
//DD02     DD  DISP=&D.I&S.P,
//             DSN=&SYSUID..JCL.CNTL(&MEM.1),
//             UNIT=(&UNIT.7,&COUNT.0,&DEFER.0,&SMSHONOR.0),
//             DCB=(LRECL=&L.0,BLKSIZE=&B.0,RECFM=&R.0),
//             AVGREC=&AVG.0,
//             VOL=(&PRIVATE.0,&RETAIN.0,&SEQNB.0,&COUNT.0),
//             SPACE=(&S.1,(&S.2,&S.3),&S.4),
//             MGMTCLAS=&M.0,
//             STORCLAS=&S.0
//*

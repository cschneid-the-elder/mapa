//HIARCHY  JOB 
//*
//STEPYY   EXEC PGM=IEFBR14
//DD01     DD  DISP=(NEW,CATLG,DELETE),
//             DSN=&SYSUID..DD01,
//             DCB=(DSORG=DA,HIARCHY=0)
//DD02     DD  DISP=(NEW,CATLG,DELETE),
//             DSN=&SYSUID..DD02,
//             DCB=(DSORG=DA,HIARCHY=1)
//DD03     DD  DISP=(NEW,CATLG,DELETE),
//             DSN=&SYSUID..DD03,
//             DCB=HIARCHY=1
//DD04     DD  DISP=(NEW,CATLG,DELETE),
//             DSN=&SYSUID..DD04,
//             HIARCHY=1
//*


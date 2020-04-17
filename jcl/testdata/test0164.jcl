//AERYN    PROC AENV=D,B=7
//*
// SET AENV=Z Nullified by the value set on the PROC statement
//*
//PS01     EXEC PGM=CHIANA
//STEPLIB  DD  DISP=SHR,DSN=DEV.LOADLIB
//             INCLUDE MEMBER=SLIBS
//OUTPUT01 DD  DISP=(,CATLG,DELETE),
//             DSN=&SYSUID..CHIANA.&AENV,
//             AVGREC=K,
//             LRECL=80,
//             SPACE=(80,(10,10),RLSE)
//SYSOUT   DD  SYSOUT=* in O1X73YZ
//*
//         PEND

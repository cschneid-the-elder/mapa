//OBSL0091 JOB
//*
//BUFRQ    EXEC PGM=IEFBR14
//DD01     DD  DISP=OLD,
//             DCB=BUFRQ=42
//DD02     DD  DCB=(DSORG=CX,BUFRQ=255)
//*
//CODE     EXEC PGM=IEFBR14
//DD01     DD  SYSOUT=F,DCB=CODE=A
//DD02     DD  DCB=(DSORG=PSU,CODE=I)
//*
//SOWA     EXEC PGM=IEFBR14
//DD01     DD  SYSOUT=G,DCB=SOWA=32768
//DD02     DD  DCB=(DSORG=MQ,SOWA=99)
//*

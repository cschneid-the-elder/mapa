//DCB JOB ,USER=CSCHNEID
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  DCB=(BFALN=F,BFTEK=F,BLKSIZE=27998,BUFIN=1,
// BUFL=1,BUFMAX=2,BUFNO=1,BUFOFF=0,BUFOUT=1,BUFSIZE=1,CPRI=R,
// CYLOFL=1,DEN=1,DIAGNS=TRACE,DSORG=PS,EROPT=ACC,FUNC=X,GNCP=1,
// INTVL=0,IPLTXID=THISONE,KEYLEN=0,LIMCT=7,LRECL=1,MODE=C,NCP=1,
// NTM=1,OPTCD=A,PCI=N,PRTSP=0,RECFM=F,RESERVE=(0,0),RKP=1,STACK=1,
// THRESH=0,TRTCH=C),DSN=AEIOU.ZZZZZZZZ.YYYYYYYY.XXXXXXXX
//DD000002 DD  DSN=&SYSUID..TEST,DCB=(LRECL=80,RECFM=FB,BLKSIZE=8000)
//DD000003 DD  DSN='QUOTED.DSN',DCB=BFALN=&BFALN
//DD000004 DD  DCB=(RECFM=FB,LRECL=&LRECL,BLKSIZE=&BLKSIZE),DSN=A.B.C
//DD000005 DD  DCB=BFTEK=R,
//             DSN=DSN
//DD000006 DD  DCB=(BFALN=&BFALN,BFTEK=&BFTEK,BLKSIZE=27998,BUFIN=1,
// BUFL=1,BUFMAX=2,BUFNO=1,BUFOFF=0,BUFOUT=1,BUFSIZE=1,CPRI=R,
// CYLOFL=1,DEN=1,DIAGNS=TRACE,DSORG=PS,EROPT=ACC,FUNC=X,GNCP=1,
// INTVL=0,IPLTXID=THISONE,KEYLEN=0,LIMCT=7,LRECL=1,MODE=C,NCP=1,
// NTM=1,OPTCD=ABCEFHIJLQRTUWZ,PCI=(N,A),PRTSP=9,RECFM=&RECFM,
// RESERVE=(&RESERVE1,&RESERVE2),RKP=1,STACK=1,
// THRESH=0,TRTCH=C),DSN=A.&SECOND
//DD000006 DD  DCB=BFTEK=D,DSN=B.&SECOND..THIRD
//DD000007 DD  DCB=BFTEK=S,DSN=C.&SECOND..&THIRD
//DD000008 DD  DCB=BFTEK=A,DSN=&FIRST..&SECOND..&THIRD
//DD000009 DD  DCB=BFTEK=&BFTEK,DSN=&A..B.&C..D
//DD000010 DD  DCB=(RECFM=&RECFM,LRECL=&LRECL,BLKSIZE=&BLKSIZE),
//             DSN=A.B.C
//DD000011 DD  DCB=BLKSIZE=27K,DSN=A.B.&C(M)
//DD000012 DD  DCB=BLKSIZE=10M,DSN=A.&B..C(M)
//DD000013 DD  DCB=BLKSIZE=1G,DSN=&A..&B..&C(M)
//DD000014 DD  DCB=BLKSIZE=&BLKSIZE,DSN=&A.B.&B.C.&C.D(&M.M)
//DD000015 DD  DCB=(PCI=(N,A)),DSN=A.B.C(M)
//DD000016 DD  DCB=BUFIN=65535,DSN=A.B.C(&M)
//DD000017 DD  DCB=BUFIN=&BUFIN,DSN=&A..B.C(&M)
//DD000018 DD  DSN=&DSN(&MEMBER),DCB=(RESERVE=(255,255))
//DD000019 DD  BUFL=32760,DSN=#&A..$&B(-1)
//DD000020 DD  DSN=AEIOU(0),BUFL=&BUFL
//DD000021 DD  DSN=&DSN(&MEMBER),DCB=(PCI=(N,&PCI2))
//DD000022 DD  DSN=THIS.IS.A.GDG.G0001V00,DCB=BUFMAX=15
//DD000023 DD  DCB=BUFMAX=255,DSN=THIS.IS.ALSO.A.GDG(+1)
//DD000024 DD  DCB=BUFMAX=&BUFMAX,DSN='QUOTED.DSN'
//DD000025 DD  DSN='QUOTED.DSN',DCB=(RESERVE=(3,&RESERVE2))
//DD000026 DD  DSN=DCB.DATA,DCB=BUFNO=255
//DD000027 DD  DSN=BUFNO.DATA,BUFNO=1000
//DD000028 DD  DCB=BUFNO=&BUFNO,DSN=BUFNO(0)
//DD000029 DD  DCB=(PCI=(A,A),RESERVE=(0,0)),DSN=DCB
//DD000030 DD  DSN=DCB,DCB=BUFOFF=7
//DD000031 DD  DSN=BUFOFF,BUFOFF=99
//DD000032 DD  DCB=(A.B.C)
//DD000033 DD  DCB=(*.DD000001,LRECL=X)
//DD000034 DD  DCB=(A.B.C,RESERVE=(1,1),PCI=(A,A))
//DD000035 DD  DCB=A.B.C
//DD000036 DD  DCB=*.STEP.DD
//DD000037 DD  DCB=*.STEP.PROCSTEP.DD
//DD000038 DD  DCB=(EGGS,RESERVE=(&RESERVE1,&RESERVE2),PCI=(&PCI1,&PCI2))
//DD000039 DD  DCB=(*.STEP.DD,BUFSIZE=255)
//DD000040 DD  DCB=(*.STEP.PROCSTEP.DD,BUFSIZE=65535)
//DD000041 DD  DCB=(&A..&B..&C,BUFSIZE=&BUFSIZE)
//DD000042 DD  DCB=(*.DD,PCI=(A,N),BUFSIZE=255,RESERVE=(5,5))
//DD000043 DD  DCB=(A.B.C,PCI=(A,N),BUFSIZE=255,RESERVE=(5,5))
//DD000044 DD  DCB=(&DSN,PCI=(A,N),BUFSIZE=255,RESERVE=(5,5))
//DD000045 DD  DCB=(&DSN..Q2,PCI=(A,N),BUFSIZE=255,RESERVE=(5,5))
//DD000046 DD  DCB=(*.DD,TRTCH=COMP,PCI=(N,N)),DSN=&X
//DD000047 DD  DCB=CYLOFL=255,DSN=*.DD
//DD000048 DD  DSN=*.DD,DCB=CYLOFL=999999
//DD000049 DD  DCB=CYLOFL=&CYLOFL,DSN=*.STEP.DD
//DD000050 DD  DSN=*.STEP.DD,DCB=(*.STEP.DD,OPTCD=C,RESERVE=(0,0))
//DD000051 DD  DCB=DEN=2,DSN=*.STEP.PROCSTEP.DD
//DD000052 DD  DSN=*.STEP.PROCSTEP.DD,DCB=DEN=3
//DD000057 DD  DCB=(*.DD,
// LRECL=X,OPTCD=C,TRTCH=NOCOMP)
//DD000066 DD  DCB=(*.STEP.DD,
// MODE=R,
// PCI=(N,N))
//DD000079 DD  DCB=(*.STEP.PROCSTEP.DD,MODE=CO,
// RESERVE=(0,0),LRECL=33,PCI=(A,A),FUNC=IR)
//DD000100 DD  DSN=*.STEP.PROCSTEP.DD,DCB=(FUNC=IRPWDXT,
// LRECL=&LRECL,PCI=(&PCI1,&PCI2))
//DD000103 DD  DCB=(GNCP=0,
//             FUNC=RWX,
//             LRECL=84,
//             RECFM=VBS,
//             BLKSIZE=27988),
//             DSN=*.DD
//DD000105 DD  DCB=(INTVL=255,MODE=CO,
//             RECFM=FBA),
//             DSN=*.STEP.DD
//DD000112 DD  DCB=(FUNC=W,
//             LRECL=4K),
//             DSN=*.STEP.PROCSTEP.DD
//DD000121 DD  DCB=(*.DD000112,RESERVE=(0,0),
//             PCI=(A,A))
//DD000130 DD  DCB=(XX,
//             OPTCD=Z,
//             TRTCH=COMP,MODE=CEOR)
//DD000136 DD  DCB=(&&ABC,PCI=(N,N),
//             RESERVE=(0,0))
//DD000144 DD  DCB=(&&ABC,
//             PRTSP=3,
//             OPTCD=B)
//DD000176 DD  DCB=(&&ABC,LRECL=2K,
//             RECFM=U,
//             OPTCD=A)
//DD000183 DD  DCB=(&&ABC,
//             STACK=1,
//             RECFM=U,
//             THRESH=77)
//DD000187 DD  DCB=(&&ABC,TRTCH=ET,
//             RESERVE=(9,9))
//DD000188 DD  DCB=&&ABC
//DD000189 DD  DCB=(&&ABC)

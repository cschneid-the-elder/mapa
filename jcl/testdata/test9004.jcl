//PARAMS JOB
//*
// SET A=A,B=B,C=C,D=D,E=E,F=F,G=G,H=H,I=I
// SET K=K,L=L,M=M,N=N,O=O,P=P,R=R,S=S,T=T,W=W,Z=Z
// SET D1='DISP=SHR,DSN=CSCHNEID.INPUT01'
// SET D2='DISP=(,CATLG',D3='),DSN=CSCHNEID.OUTPUT01'
//*
//PS01    EXEC PGM=IEFBR14
//DD01    DD  &D&I&S&P=(&N&E&W,&C&A&T&L&G,&D&E&L&E&T&E),
//            &D&S&N=&H&E&R&C.03.&T&E&S&T.0005.&D&D.01,
//            &D&C&B=(&R&E&C&F&M=&F&B,&L&R&E&C&L=80,
//            &B&L&K&S&I&Z&E=27840),
//            &S&P&A&C&E=(80,(100,100),&R&L&S&E)
//DD02    DD  &D1
//DD03    DD  &D2&D3
//DD04    DD  &D.I&S.P=&O.L&D,D&S.N=&SYSUID..&T.E&S.T.D&D.04
//*


//ASMFCL   PROC MAC='SYS1.MACLIB',MAC1='SYS1.MACLIB',                           
//         MAC2='SYS1.MACLIB',MAC3='SYS1.MACLIB',SOUT='*'                       
//ASM      EXEC PGM=IFOX00,PARM=OBJ,REGION=128K                                 
//SYSLIB   DD   DSN=&MAC,DISP=SHR                                               
//         DD   DSN=&MAC1,DISP=SHR                                              
//         DD   DSN=&MAC2,DISP=SHR                                              
//         DD   DSN=&MAC3,DISP=SHR                                              
//SYSUT1   DD   DSN=&&SYSUT1,UNIT=SYSSQ,SPACE=(1700,(600,100)),                 
//             SEP=(SYSLIB)                                                     
//SYSUT2   DD   DSN=&&SYSUT2,UNIT=SYSSQ,SPACE=(1700,(300,50)),                  
//             SEP=(SYSLIB,SYSUT1)                                              
//SYSUT3   DD   DSN=&&SYSUT3,UNIT=SYSSQ,SPACE=(1700,(300,50))                   
//SYSPRINT DD   SYSOUT=&SOUT,DCB=BLKSIZE=1089                                   
//SYSPUNCH DD   SYSOUT=B                                                        
//SYSGO    DD   DSN=&&OBJSET,UNIT=SYSSQ,SPACE=(80,(200,50)),                    
//             DISP=(MOD,PASS)                                                  
//LKED     EXEC PGM=IEWL,PARM=(XREF,LET,LIST,NCAL),REGION=128K,                 
//             COND=(8,LT,ASM)                                                  
//SYSLIN   DD   DSN=&&OBJSET,DISP=(OLD,DELETE)                                  
//         DD   DDNAME=SYSIN                                                    
//SYSLMOD  DD   DSN=&&GOSET(GO),UNIT=SYSDA,SPACE=(1024,(50,20,1)),              
//             DISP=(MOD,PASS)                                                  
//SYSUT1   DD   DSN=&&SYSUT1,UNIT=(SYSDA,SEP=(SYSLIN,SYSLMOD)),                 
//             SPACE=(1024,(50,20))                                             
//SYSPRINT DD   SYSOUT=&SOUT                                                    

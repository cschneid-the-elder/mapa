//DLBPROC PROC STEP=,TLIB=TLIB01,PRODUCT=TXXXXX,U1=SYSDA,U2=2400                
//SMP EXEC PGM=HMASMP,PARM='DATE=U',REGION=3000K,TIME=999                       
//*___________________________________________________________________          
//*                                                                             
//*        *****OS/VS2 (MVS) DLIB BUILD PROCEDURE                               
//*                                                                             
//*___________________________________________________________________          
//SYSUT1   DD  UNIT=&U1,SPACE=(1700,(600,100))                                  
//SYSUT2   DD  UNIT=&U1,SPACE=(1700,(600,100))                                  
//SYSUT3   DD  UNIT=&U1,SPACE=(1700,(600,100))                                  
//SYSLIB   DD  DSN=SYS1.SMPMTS,DISP=OLD                                         
//SMPWRK1  DD  UNIT=&U1,SPACE=(CYL,(5,10,84)),DCB=(BLKSIZE=3120,                
//             LRECL=80)                                                        
//SMPWRK2  DD  UNIT=&U1,SPACE=(CYL,(5,10,84)),DCB=(BLKSIZE=3120,                
//             LRECL=80)                                                        
//SMPWRK3  DD  UNIT=&U1,SPACE=(CYL,(5,10,84)),DCB=(BLKSIZE=3120,                
//             LRECL=80)                                                        
//SMPWRK4  DD  UNIT=&U1,SPACE=(CYL,(1,10,84)),DCB=(BLKSIZE=3120,                
//             LRECL=80)                                                        
//SMPWRK5  DD  UNIT=&U1,SPACE=(CYL,(30,10,250))                                 
//SMPTLIB  DD  UNIT=&U1,VOL=SER=&TLIB,DISP=OLD                                  
//SMPCNTL  DD  DSN=SYS1.PROCLIB(&STEP.),DISP=SHR                                
//SMPOUT   DD  SYSOUT=A                                                         
//SYSPRINT DD  SYSOUT=A                                                         
//SYSUDUMP DD  SYSOUT=A                                                         
//SMPPTFIN DD  DSN=SMPMCS,DISP=(SHR,PASS),VOL=SER=&PRODUCT,                     
//             UNIT=(&U2.,,DEFER)                                               
//SMPLOG   DD  DUMMY                                                            
//SMPACDS  DD  DSN=SYS1.SMPACDS,DISP=OLD                                        
//SMPACRQ  DD  DSN=SYS1.SMPACRQ,DISP=OLD                                        
//SMPMTS   DD  DSN=SYS1.SMPMTS,DISP=OLD                                         
//SMPPTS   DD  DSN=SYS1.SMPPTS,DISP=OLD                                         
//SMPSTS   DD  DSN=SYS1.SMPSTS,DISP=OLD                                         
//*   *****  DLIB STMTS .    *********                                          
//ACMDLIB  DD DSN=SYS1.ACMDLIB,DISP=OLD                                         
//AGENLIB  DD DSN=SYS1.AGENLIB,DISP=OLD                                         
//AHELP    DD DSN=SYS1.AHELP,DISP=OLD                                           
//ALPALIB  DD DSN=SYS1.ALPALIB,DISP=OLD                                         
//AMACLIB  DD DSN=SYS1.AMACLIB,DISP=OLD                                         
//AMODGEN  DD DSN=SYS1.AMODGEN,DISP=OLD                                         
//AOSA0    DD DSN=SYS1.AOSA0,DISP=OLD                                           
//AOSA1    DD DSN=SYS1.AOSA1,DISP=OLD                                           
//AOSBN    DD DSN=SYS1.AOSBN,DISP=OLD                                           
//AOSB0    DD DSN=SYS1.AOSB0,DISP=OLD                                           
//AOSB3    DD DSN=SYS1.AOSB3,DISP=OLD                                           
//AOSCA    DD DSN=SYS1.AOSCA,DISP=OLD                                           
//AOSCD    DD DSN=SYS1.AOSCD,DISP=OLD                                           
//AOSCE    DD DSN=SYS1.AOSCE,DISP=OLD                                           
//AOSC2    DD DSN=SYS1.AOSC2,DISP=OLD                                           
//AOSC5    DD DSN=SYS1.AOSC5,DISP=OLD                                           
//AOSC6    DD DSN=SYS1.AOSC6,DISP=OLD                                           
//AOSD0    DD DSN=SYS1.AOSD0,DISP=OLD                                           
//AOSD7    DD DSN=SYS1.AOSD7,DISP=OLD                                           
//AOSD8    DD DSN=SYS1.AOSD8,DISP=OLD                                           
//AOSG0    DD DSN=SYS1.AOSG0,DISP=OLD                                           
//AOSH1    DD DSN=SYS1.AOSH1,DISP=OLD                                           
//AOSH3    DD DSN=SYS1.AOSH3,DISP=OLD                                           
//AOST3    DD DSN=SYS1.AOST3,DISP=OLD                                           
//AOST4    DD DSN=SYS1.AOST4,DISP=OLD                                           
//AOSU0    DD DSN=SYS1.AOSU0,DISP=OLD                                           
//AOS00    DD DSN=SYS1.AOS00,DISP=OLD                                           
//AOS03    DD DSN=SYS1.AOS03,DISP=OLD                                           
//AOS04    DD DSN=SYS1.AOS04,DISP=OLD                                           
//AOS05    DD DSN=SYS1.AOS05,DISP=OLD                                           
//AOS06    DD DSN=SYS1.AOS06,DISP=OLD                                           
//AOS07    DD DSN=SYS1.AOS07,DISP=OLD                                           
//AOS11    DD DSN=SYS1.AOS11,DISP=OLD                                           
//AOS12    DD DSN=SYS1.AOS12,DISP=OLD                                           
//AOS20    DD DSN=SYS1.AOS20,DISP=OLD                                           
//AOS21    DD DSN=SYS1.AOS21,DISP=OLD                                           
//AOS24    DD DSN=SYS1.AOS24,DISP=OLD                                           
//AOS26    DD DSN=SYS1.AOS26,DISP=OLD                                           
//AOS29    DD DSN=SYS1.AOS29,DISP=OLD                                           
//AOS32    DD DSN=SYS1.AOS32,DISP=OLD                                           
//APARMLIB DD DSN=SYS1.APARMLIB,DISP=OLD                                        
//APROCLIB DD DSN=SYS1.APROCLIB,DISP=OLD                                        
//ASAMPLIB DD DSN=SYS1.ASAMPLIB,DISP=OLD                                        
//ATCAMMAC DD DSN=SYS1.ATCAMMAC,DISP=OLD                                        
//ATSOMAC  DD DSN=SYS1.ATSOMAC,DISP=OLD                                         
//AUADS    DD DSN=SYS1.AUADS,DISP=OLD                                           
//HASPSRC  DD DSN=SYS1.HASPSRC,DISP=OLD                                         
//*  *****    END OF DLIB  STMTS   *******                                      

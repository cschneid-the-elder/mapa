//DLBALLOC PROC DLIB1=DLIB01,DLIB2=DLIB02,U1=3330,BLOCK=12960                   
//*_____________________________________________________________________        
//*                                                                             
//*           ALLOCATE ALL DATA SETS NEEDED FOR BASIC MVS DLIBS                 
//*                                                                             
//*_____________________________________________________________________        
//DLBALLOC EXEC PGM=IEFBR14                                                     
//SMPLOG   DD DUMMY                                                             
//SMPACRQ  DD UNIT=3330,DSN=SYS1.SMPACRQ,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(100,100,84)),               
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//SMPMTS   DD UNIT=3330,DSN=SYS1.SMPMTS,DISP=(,CATLG),                           
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(100,100,20)),               
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//SMPPTS   DD UNIT=3330,DSN=SYS1.SMPPTS,DISP=(,CATLG),                           
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(1330,133,500)),             
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//SMPSTS   DD UNIT=3330,DSN=SYS1.SMPSTS,DISP=(,CATLG),                           
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(40,40,20)),                 
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//SMPACDS  DD UNIT=3330,DSN=SYS1.SMPACDS,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(9000,500,3000)),            
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AOS00    DD UNIT=3330,DSN=SYS1.AOS00,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(15,1,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS03    DD UNIT=3330,DSN=SYS1.AOS03,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(35,1,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS04    DD UNIT=3330,DSN=SYS1.AOS04,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(30,1,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS05    DD UNIT=3330,DSN=SYS1.AOS05,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(20,1,7)),                   
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS06    DD UNIT=3330,DSN=SYS1.AOS06,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(75,1,30)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS11    DD UNIT=3330,DSN=SYS1.AOS11,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(80,5,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS12    DD UNIT=3330,DSN=SYS1.AOS12,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(320,10,40)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSB0    DD UNIT=3330,DSN=SYS1.AOSB0,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(9,1,5)),                    
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSB3    DD UNIT=3330,DSN=SYS1.AOSB3,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(320,3,100)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSCA    DD UNIT=3330,DSN=SYS1.AOSCA,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(11,1,6)),                   
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSCD    DD UNIT=3330,DSN=SYS1.AOSCD,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(210,20,51)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSCE    DD UNIT=3330,DSN=SYS1.AOSCE,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(55,5,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSC2    DD UNIT=3330,DSN=SYS1.AOSC2,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(5,2,4)),                    
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSC5    DD UNIT=3330,DSN=SYS1.AOSC5,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(500,20,150)),               
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSC6    DD UNIT=3330,DSN=SYS1.AOSC6,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(20,1,12)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSD0    DD UNIT=3330,DSN=SYS1.AOSD0,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(465,10,150)),               
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSD7    DD UNIT=3330,DSN=SYS1.AOSD7,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(20,1,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSD8    DD UNIT=3330,DSN=SYS1.AOSD8,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(60,2,25)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSU0    DD UNIT=3330,DSN=SYS1.AOSU0,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(610,20,150)),               
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//APARMLIB DD UNIT=3330,DSN=SYS1.APARMLIB,DISP=(,CATLG),                         
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(80,(320,10,17)),                  
//            DCB=(RECFM=F,BLKSIZE=80)                                          
//APROCLIB DD UNIT=3330,DSN=SYS1.APROCLIB,DISP=(,CATLG),                         
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(800,(85,10,17)),                  
//            DCB=(RECFM=FB,BLKSIZE=800,LRECL=80)                               
//ASAMPLIB DD UNIT=3330,DSN=SYS1.ASAMPLIB,DISP=(,CATLG),                         
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(700,15,20)),                
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//ALPALIB  DD UNIT=3330,DSN=SYS1.ALPALIB,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(20,2,15)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AGENLIB  DD UNIT=3330,DSN=SYS1.AGENLIB,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(2000,20,20)),               
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AMACLIB  DD UNIT=3330,DSN=SYS1.AMACLIB,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(7400,100,50)),              
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AMODGEN  DD UNIT=3330,DSN=SYS1.AMODGEN,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(4400,100,50)),              
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AOS07    DD UNIT=3330,DSN=SYS1.AOS07,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(30,1,20)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS20    DD UNIT=3330,DSN=SYS1.AOS20,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(40,2,25)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS21    DD UNIT=3330,DSN=SYS1.AOS21,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(490,20,167)),               
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSG0    DD UNIT=3330,DSN=SYS1.AOSG0,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(20,5,35)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOST3    DD UNIT=3330,DSN=SYS1.AOST3,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(75,5,30)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOST4    DD UNIT=3330,DSN=SYS1.AOST4,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(190,20,35)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//ACMDLIB  DD UNIT=3330,DSN=SYS1.ACMDLIB,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(600,4,40)),                 
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AHELP    DD UNIT=3330,DSN=SYS1.AHELP,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(680,20,17)),                
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//ATCAMMAC DD UNIT=3330,DSN=SYS1.ATCAMMAC,DISP=(,CATLG),                         
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(2000,500,55)),              
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//ATSOMAC  DD UNIT=3330,DSN=SYS1.ATSOMAC,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(1680,(1030,20,17)),               
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AUADS    DD UNIT=3330,DSN=SYS1.AUADS,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(2,1,2)),                    
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AOSA0    DD UNIT=3330,DSN=SYS1.AOSA0,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(140,5,35)),                 
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSA1    DD UNIT=3330,DSN=SYS1.AOSA1,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(10,1,30)),                  
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSH1    DD UNIT=3330,DSN=SYS1.AOSH1,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(5,1,3)),                    
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSH3    DD UNIT=3330,DSN=SYS1.AOSH3,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(100,5,10)),                 
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//HASPSRC  DD UNIT=3330,DSN=SYS1.HASPSRC,DISP=(,CATLG),                          
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(1680,(5000,500,15)),              
//            DCB=(RECFM=FB,BLKSIZE=12960,LRECL=80)                            
//AOS24    DD UNIT=3330,DSN=SYS1.AOS24,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(240,25,50)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS26    DD UNIT=3330,DSN=SYS1.AOS26,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(550,25,160)),               
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS29    DD UNIT=3330,DSN=SYS1.AOS29,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(114,19,27)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOS32    DD UNIT=3330,DSN=SYS1.AOS32,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB01),SPACE=(6144,(200,38,60)),                
//            DCB=(BLKSIZE=6144,RECFM=U)                                        
//AOSBN    DD UNIT=3330,DSN=SYS1.AOSBN,DISP=(,CATLG),                            
//            VOL=(,RETAIN,SER=DLIB02),SPACE=(6144,(130,10,25)),                
//            DCB=(RECFM=U,BLKSIZE=6144)                                        

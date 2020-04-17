//HERC03G JOB CSCHNEID,                                                         
//            NOTIFY=HERC03,                                                    
//            MSGCLASS=1,                                                       
//            MSGLEVEL=(1,1)                                                    
//*                                                                             
//JS01     EXEC PGM=IEBGENER                                                    
//SYSUT2   DD  SYSOUT=(A,INTRDR)                                                
//SYSIN    DD  DUMMY                                                            
//SYSPRINT DD  SYSOUT=*                                                         
//SYSUT1   DD  DATA,DLM=##                                                      
//HERC03Y JOB CSCHNEID,                                                         
//            NOTIFY=HERC03,                                                    
//            MSGCLASS=1,                                                       
//            MSGLEVEL=(1,1)                                                    
//*                                                                             
//JS01     EXEC PGM=IEBGENER                                                    
//SYSUT2   DD  SYSOUT=(A,INTRDR)                                                
//SYSIN    DD  DUMMY                                                            
//SYSPRINT DD  SYSOUT=*                                                         
//SYSUT1   DD  DATA,DLM=$$                                                      
//HERC03Z JOB CSCHNEID,                                                         
//            NOTIFY=HERC03,                                                    
//            MSGCLASS=1,                                                       
//            MSGLEVEL=(1,1)                                                    
//*                                                                             
//JS01     EXEC PGM=IEFBR14                                                     
//*                                                                             
$$                                                                              
//*                                                                             
##                                                                              
//* 

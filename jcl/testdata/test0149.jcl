//COMMAND JOB
//*
// F CICSPROD,SHUT
// F FILEHAND,PEND/DUMP
// START MYTASK
// F CICSPROD,SHUT           transaction to shut down CICS normally
// F FILEHAND,PEND/DUMP      FH function to terminate with a core dump
// START MYTASK              get MYTASK up and running
// START CICS&&SYSCLONE(2:1) start a specific CICS


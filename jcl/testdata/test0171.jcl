//NULLOVRD JOB
//* I nicked this from IBM's JCL Reference for z/OS 2.4 after
//* discovering that APAR OA50881 added the NULLOVRD DD
//* statement parameter.  I hope they're okay with that.
//PROC01  PROC
//PSTEP01 EXEC PGM=PNAME
//DD01    DD   *
Data Line 1
/*
//        DD   *
Data Line 2
/* 
//        DD   *
Data Line 3
//PROC01  PEND
//JSTEP01 EXEC PROC01
//PSTEP01.DD01 DD *
Override Line 1
/*
//             DD NULLOVRD
//             DD *
Override Line 3
/*

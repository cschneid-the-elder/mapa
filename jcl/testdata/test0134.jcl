//NOTIFY   JOB
//NOTIFY01 NOTIFY EMAIL='cschneid@example.com',WHEN='RC!=0'
//NOTIFY02 NOTIFY EMAIL='cschneid@example.com',
//             WHEN='ABEND'
//NOTIFY03 NOTIFY EMAIL='cschneid@example.com',
//             WHEN='ABEND |
//             !RUN'
//NOTIFY04 NOTIFY USER=CSCHNEID,WHEN='RC!=0'
//NOTIFY05 NOTIFY USER=CSCHNEID,
//             WHEN='ABEND'
//NOTIFY06 NOTIFY USER=CSCHNEID,
//             WHEN='ABEND |
//             !RUN'
//NOTIFY11 NOTIFY EMAIL='cschneid@example.com',WHEN='RC!=0',TYPE=EMAIL
//NOTIFY12 NOTIFY EMAIL='cschneid@example.com',
//             WHEN='ABEND',TYPE=EMAIL
//NOTIFY13 NOTIFY EMAIL='cschneid@example.com',
//             WHEN='ABEND |
//             !RUN',TYPE=EMAIL
//NOTIFY14 NOTIFY USER=CSCHNEID,WHEN='RC!=0',TYPE=MSG
//NOTIFY15 NOTIFY USER=CSCHNEID,
//             WHEN='ABEND',TYPE=MSG
//NOTIFY16 NOTIFY USER=CSCHNEID,
//             WHEN='ABEND |
//             !RUN',TYPE=MSG
//NOTIFY21 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL,WHEN='RC!=0'
//NOTIFY22 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL,
//             WHEN='ABEND'
//NOTIFY23 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL,
//             WHEN='ABEND |
//             !RUN'
//NOTIFY24 NOTIFY USER=CSCHNEID,TYPE=MSG,WHEN='RC!=0'
//NOTIFY25 NOTIFY USER=CSCHNEID,TYPE=MSG,
//             WHEN='ABEND'
//NOTIFY26 NOTIFY USER=CSCHNEID,TYPE=MSG,
//             WHEN='ABEND |
//             !RUN'
//NOTIFY30 NOTIFY TYPE=MSG,
//             USER=CSCHNEID,
//             WHEN='ABENDCC=S0C4'
//NOTIFY31 NOTIFY WHEN='ABENDCC=S0C4',
//             TYPE=MSG,
//             USER=CSCHNEID
//NOTIFY32 NOTIFY TYPE=EMAIL,
//             EMAIL='cschneid@example.com',
//             WHEN='ABENDCC=S0C4'
//NOTIFY33 NOTIFY WHEN='ABENDCC=S0C4',
//             TYPE=EMAIL,
//             EMAIL='cschneid@example.com'
//NOTIFY01 NOTIFY EMAIL='cschneid@example.com',WHEN='RC!=0' comment
//NOTIFY02 NOTIFY EMAIL='cschneid@example.com', comment
//             WHEN='ABEND' comment
//NOTIFY03 NOTIFY EMAIL='cschneid@example.com', comment
//             WHEN='ABEND | comment
//             !RUN' comment
//NOTIFY04 NOTIFY USER=CSCHNEID,WHEN='RC!=0' comment
//NOTIFY05 NOTIFY USER=CSCHNEID, comment
//             WHEN='ABEND' comment
//NOTIFY06 NOTIFY USER=CSCHNEID, comment
//             WHEN='ABEND | comment
//             !RUN' comment
//NOTIFY11 NOTIFY EMAIL='cschneid@example.com',WHEN='RC!=0',TYPE=EMAIL comment
//NOTIFY12 NOTIFY EMAIL='cschneid@example.com', comment
//             WHEN='ABEND',TYPE=EMAIL comment
//NOTIFY13 NOTIFY EMAIL='cschneid@example.com', comment
//             WHEN='ABEND | comment
//             !RUN',TYPE=EMAIL comment
//NOTIFY14 NOTIFY USER=CSCHNEID,WHEN='RC!=0',TYPE=MSG comment
//NOTIFY15 NOTIFY USER=CSCHNEID, comment
//             WHEN='ABEND',TYPE=MSG comment
//NOTIFY16 NOTIFY USER=CSCHNEID, comment
//             WHEN='ABEND | comment
//             !RUN',TYPE=MSG comment
//NOTIFY21 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL,WHEN='RC!=0' comment
//NOTIFY22 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL, comment
//             WHEN='ABEND' comment
//NOTIFY23 NOTIFY EMAIL='cschneid@example.com',TYPE=EMAIL, comment
//             WHEN='ABEND | comment
//             !RUN' comment
//NOTIFY24 NOTIFY USER=CSCHNEID,TYPE=MSG,WHEN='RC!=0' comment
//NOTIFY25 NOTIFY USER=CSCHNEID,TYPE=MSG, comment
//             WHEN='ABEND' comment
//NOTIFY26 NOTIFY USER=CSCHNEID,TYPE=MSG, comment
//             WHEN='ABEND | comment
//             !RUN' comment
//NOTIFY30 NOTIFY TYPE=MSG, comment
//             USER=CSCHNEID, comment
//             WHEN='ABENDCC=S0C4' comment
//NOTIFY31 NOTIFY WHEN='ABENDCC=S0C4', comment
//             TYPE=MSG, comment
//             USER=CSCHNEID comment
//NOTIFY32 NOTIFY TYPE=EMAIL, comment
//             EMAIL='cschneid@example.com', comment
//             WHEN='ABENDCC=S0C4' comment
//NOTIFY33 NOTIFY WHEN='ABENDCC=S0C4', comment
//             TYPE=EMAIL, comment
//             EMAIL='cschneid@example.com' comment
//STEP0001 EXEC PGM=IEFBR14

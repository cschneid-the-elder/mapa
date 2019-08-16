//VOLUME JOB
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  VOL=(PRIVATE,
//             RETAIN,
//             1,
//             1,
//             SER=('!CQCQ!',
//             4,
//             8,
//             15,
//             16,
//             23,
//             42))
//DD000002 DD  VOL=(&PRIVATE,
//             &RETAIN,
//             &VOLSEQ,
//             &VOLCOUNT,
//             SER=(&SER,
//             &SER4,
//             &SER8,
//             &SER15,
//             &SER16,
//             &SER23,
//             &SER42))
//DD000011 DD  *,VOL=(PRIVATE,
//             RETAIN,
//             1,
//             1,
//             SER=('!CQCQ!',
//             4,
//             8,
//             15,
//             16,
//             23,
//             42))
//DD000012 DD  *,VOL=(&PRIVATE,
//             &RETAIN,
//             &VOLSEQ,
//             &VOLCOUNT,
//             SER=(&SER,
//             &SER4,
//             &SER8,
//             &SER15,
//             &SER16,
//             &SER23,
//             &SER42))
//DD000021 DD  *,VOL=(PRIVATE, comment
//             RETAIN, comment
//             1, comment
//             1, comment
//             SER=('!CQCQ!', comment
//             4, comment
//             8, comment
//             15, comment
//             16, comment
//             23, comment
//             42)) comment
//DD000022 DD  *,VOL=(&PRIVATE, comment
//             &RETAIN, comment
//             &VOLSEQ, comment
//             &VOLCOUNT, comment
//             SER=(&SER, comment
//             &SER4, comment
//             &SER8, comment
//             &SER15, comment
//             &SER16, comment
//             &SER23, comment
//             &SER42)) comment
//DD000031 DD  *,VOL=(PRIVATE, comment
//             RETAIN, comment
//             1, comment
//             1, comment
//             SER=('!CQCQ!', comment
//             4, comment
//             8, comment
//             15, comment
//             16, comment
//             23, comment
//             42)),LRECL=80 comment
//DD000032 DD  *,VOL=(&PRIVATE, comment
//             &RETAIN, comment
//             &VOLSEQ, comment
//             &VOLCOUNT, comment
//             SER=(&SER, comment
//             &SER4, comment
//             &SER8, comment
//             &SER15, comment
//             &SER16, comment
//             &SER23, comment
//             &SER42)),LRECL=80 comment
//DD000041 DD  *,VOL=(PRIVATE, comment
//             RETAIN, comment
//             1, comment
//             1, comment
//             SER=('!CQCQ!', comment
//             4, comment
//             8, comment
//             15, comment
//             16, comment
//             23, comment
//             42)),LRECL=80 comment
AEIOU
//DD000042 DD  *,VOL=(&PRIVATE, comment
//             &RETAIN, comment
//             &VOLSEQ, comment
//             &VOLCOUNT, comment
//             SER=(&SER, comment
//             &SER4, comment
//             &SER8, comment
//             &SER15, comment
//             &SER16, comment
//             &SER23, comment
//             &SER42)),LRECL=80 comment
AEIOU


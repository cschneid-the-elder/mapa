//KEYLEN JOB
//*
//STEP0001 EXEC PGM=TAPECOPY
//DD000001 DD  KEYLEN=1
//DD000002 DD  KEYLEN=255
//DD000003 DD  KEYLEN=32767
//DD000004 DD  KEYLEN=&KEYLEN
//DD000101 DD  KEYLEN=1 KEYLEN
//DD000102 DD  KEYLEN=255 KEYLEN
//DD000103 DD  KEYLEN=32767 KEYLEN
//DD000104 DD  KEYLEN=&KEYLEN KEYLEN


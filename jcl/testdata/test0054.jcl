//DEST JOB
//*
//STEP0001 EXEC PGM=PRINTER
//DD000001 DD  DEST=1
//DD000002 DD  DEST=12
//DD000003 DD  DEST=123
//DD000004 DD  DEST=1234
//DD000005 DD  DEST=12345
//DD000006 DD  DEST=123456
//DD000007 DD  DEST=1234567
//DD000008 DD  DEST=12345678
//DD000009 DD  DEST=N1R1
//DD000010 DD  DEST=N1R12
//DD000011 DD  DEST=N1R123
//DD000012 DD  DEST=N1R1234
//DD000013 DD  DEST=N1R12345
//DD000014 DD  DEST=N12R1
//DD000015 DD  DEST=N123R1
//DD000016 DD  DEST=N1234R1
//DD000017 DD  DEST=N12345R1
//DD000018 DD  DEST=LOCAL
//DD000019 DD  DEST=ANYLOCAL
//DD000020 DD  DEST=N1234567
//DD000021 DD  DEST=R1234567
//DD000022 DD  DEST=RM123456
//DD000023 DD  DEST=RMT17
//DD000024 DD  DEST=@
//DD000025 DD  DEST=@A#B$C00
//DD000026 DD  DEST=U11
//DD000027 DD  DEST=&DEST
//DD000028 DD  DEST=(AEIOU.31F)
//DD000029 DD  DEST=(DULUTH.IBMUSER1)
//DD000030 DD  DEST=(&DEST)
//DD000031 DD  DEST=(1)
//DD000032 DD  DEST=('1')
//DD000033 DD  DEST=(&DEST1.&DEST2)
//DD000101 DD  DEST=1  DEST
//DD000102 DD  DEST=12  DEST
//DD000103 DD  DEST=123  DEST
//DD000104 DD  DEST=1234  DEST
//DD000105 DD  DEST=12345  DEST
//DD000106 DD  DEST=123456  DEST
//DD000107 DD  DEST=1234567  DEST
//DD000108 DD  DEST=12345678  DEST
//DD000109 DD  DEST=N1R1  DEST
//DD000110 DD  DEST=N1R12  DEST
//DD000111 DD  DEST=N1R123  DEST
//DD000112 DD  DEST=N1R1234  DEST
//DD000113 DD  DEST=N1R12345  DEST
//DD000114 DD  DEST=N12R1  DEST
//DD000115 DD  DEST=N123R1  DEST
//DD000116 DD  DEST=N1234R1  DEST
//DD000117 DD  DEST=N12345R1  DEST
//DD000118 DD  DEST=LOCAL  DEST
//DD000119 DD  DEST=ANYLOCAL  DEST
//DD000120 DD  DEST=N1234567  DEST
//DD000121 DD  DEST=R1234567  DEST
//DD000122 DD  DEST=RM123456  DEST
//DD000123 DD  DEST=RMT17  DEST
//DD000124 DD  DEST=@  DEST
//DD000125 DD  DEST=@A#B$C00  DEST
//DD000126 DD  DEST=U11  DEST
//DD000127 DD  DEST=&DEST  DEST
//DD000128 DD  DEST=(AEIOU.31F)  DEST
//DD000129 DD  DEST=(DULUTH.IBMUSER1)  DEST
//DD000130 DD  DEST=(&DEST)  DEST
//DD000131 DD  DEST=(1)  DEST
//DD000132 DD  DEST=('1')  DEST
//DD000133 DD  DEST=(&DEST1.&DEST2)  DEST

//VOLUME JOB 
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  VOL=PRIVATE
//DD000001 DD  VOLUME=PRIVATE
//DD000013 DD  VOL=(PRIVATE,,,,SER=123)
//DD000014 DD  VOL=(PRIVATE,,,,SER=1-2-3)
//DD000015 DD  VOL=(PRIVATE,,,,SER=ABC)
//DD000016 DD  VOL=(PRIVATE,,,,SER=A-B-C)
//DD000017 DD  VOL=(PRIVATE,,,,SER=VOL)
//DD000018 DD  VOL=(PRIVATE,,,,SER=SER)
//DD000019 DD  VOLUME=(PRIVATE,,,,SER=123)
//DD000020 DD  VOLUME=(PRIVATE,,,,SER=1-2-3)
//DD000021 DD  VOLUME=(PRIVATE,,,,SER=ABC)
//DD000022 DD  VOLUME=(PRIVATE,,,,SER=A-B-C)
//DD000023 DD  VOLUME=(PRIVATE,,,,SER=VOL)
//DD000024 DD  VOLUME=(PRIVATE,,,,SER=SER)
//DD000031 DD  *,VOL=PRIVATE
//DD000032 DD  *,VOLUME=PRIVATE
//DD000113 DD  *,VOL=(PRIVATE,,,,SER=123)
//DD000114 DD  *,VOL=(PRIVATE,,,,SER=1-2-3)
//DD000115 DD  *,VOL=(PRIVATE,,,,SER=ABC)
//DD000116 DD  *,VOL=(PRIVATE,,,,SER=A-B-C)
//DD000117 DD  *,VOL=(PRIVATE,,,,SER=VOL)
//DD000118 DD  *,VOL=(PRIVATE,,,,SER=SER)
//DD000119 DD  *,VOLUME=(PRIVATE,,,,SER=123)
//DD000120 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3)
//DD000121 DD  *,VOLUME=(PRIVATE,,,,SER=ABC)
//DD000122 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C)
//DD000123 DD  *,VOLUME=(PRIVATE,,,,SER=VOL)
//DD000124 DD  *,VOLUME=(PRIVATE,,,,SER=SER)
//DD000131 DD  *,VOL=PRIVATE,MODE=C
//DD000132 DD  *,VOLUME=PRIVATE,MODE=C
//DD000213 DD  *,VOL=(PRIVATE,,,,SER=123),MODE=C
//DD000214 DD  *,VOL=(PRIVATE,,,,SER=1-2-3),MODE=C
//DD000215 DD  *,VOL=(PRIVATE,,,,SER=ABC),MODE=C
//DD000216 DD  *,VOL=(PRIVATE,,,,SER=A-B-C),MODE=C
//DD000217 DD  *,VOL=(PRIVATE,,,,SER=VOL),MODE=C
//DD000218 DD  *,VOL=(PRIVATE,,,,SER=SER),MODE=C
//DD000219 DD  *,VOLUME=(PRIVATE,,,,SER=123),MODE=C
//DD000220 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3),MODE=C
//DD000221 DD  *,VOLUME=(PRIVATE,,,,SER=ABC),MODE=C
//DD000222 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C),MODE=C
//DD000223 DD  *,VOLUME=(PRIVATE,,,,SER=VOL),MODE=C
//DD000224 DD  *,VOLUME=(PRIVATE,,,,SER=SER),MODE=C
//DD001113 DD  *,VOL=(PRIVATE,,,,SER=123)
AEIOU
//DD001114 DD  *,VOL=(PRIVATE,,,,SER=1-2-3)
AEIOU
//DD001115 DD  *,VOL=(PRIVATE,,,,SER=ABC)
AEIOU
//DD001116 DD  *,VOL=(PRIVATE,,,,SER=A-B-C)
AEIOU
//DD001117 DD  *,VOL=(PRIVATE,,,,SER=VOL)
AEIOU
//DD001118 DD  *,VOL=(PRIVATE,,,,SER=SER)
AEIOU
//DD001119 DD  *,VOLUME=(PRIVATE,,,,SER=123)
AEIOU
//DD001120 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3)
AEIOU
//DD001121 DD  *,VOLUME=(PRIVATE,,,,SER=ABC)
AEIOU
//DD001122 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C)
AEIOU
//DD001123 DD  *,VOLUME=(PRIVATE,,,,SER=VOL)
AEIOU
//DD001124 DD  *,VOLUME=(PRIVATE,,,,SER=SER)
AEIOU
//DD001131 DD  *,VOL=PRIVATE
AEIOU
//DD001132 DD  *,VOLUME=PRIVATE
AEIOU
//DD001213 DD  *,VOL=(PRIVATE,,,,SER=123),MODE=C
AEIOU
//DD001214 DD  *,VOL=(PRIVATE,,,,SER=1-2-3),MODE=C
AEIOU
//DD001215 DD  *,VOL=(PRIVATE,,,,SER=ABC),MODE=C
AEIOU
//DD001216 DD  *,VOL=(PRIVATE,,,,SER=A-B-C),MODE=C
AEIOU
//DD001217 DD  *,VOL=(PRIVATE,,,,SER=VOL),MODE=C
AEIOU
//DD001218 DD  *,VOL=(PRIVATE,,,,SER=SER),MODE=C
AEIOU
//DD001219 DD  *,VOLUME=(PRIVATE,,,,SER=123),MODE=C
AEIOU
//DD001220 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3),MODE=C
AEIOU
//DD001221 DD  *,VOLUME=(PRIVATE,,,,SER=ABC),MODE=C
AEIOU
//DD001222 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C),MODE=C
AEIOU
//DD001223 DD  *,VOLUME=(PRIVATE,,,,SER=VOL),MODE=C
AEIOU
//DD001224 DD  *,VOLUME=(PRIVATE,,,,SER=SER),MODE=C
AEIOU
//DD001231 DD  *,VOL=PRIVATE,MODE=C
AEIOU
//DD001232 DD  *,VOLUME=PRIVATE,MODE=C
AEIOU
//DD002001 DD  VOL=PRIVATE VOL=SER
//DD002001 DD  VOLUME=PRIVATE VOL=SER
//DD002013 DD  VOL=(PRIVATE,,,,SER=123) VOL=SER
//DD002014 DD  VOL=(PRIVATE,,,,SER=1-2-3) VOL=SER
//DD002015 DD  VOL=(PRIVATE,,,,SER=ABC) VOL=SER
//DD002016 DD  VOL=(PRIVATE,,,,SER=A-B-C) VOL=SER
//DD002017 DD  VOL=(PRIVATE,,,,SER=VOL) VOL=SER
//DD002018 DD  VOL=(PRIVATE,,,,SER=SER) VOL=SER
//DD002019 DD  VOLUME=(PRIVATE,,,,SER=123) VOL=SER
//DD002020 DD  VOLUME=(PRIVATE,,,,SER=1-2-3) VOL=SER
//DD002021 DD  VOLUME=(PRIVATE,,,,SER=ABC) VOL=SER
//DD002022 DD  VOLUME=(PRIVATE,,,,SER=A-B-C) VOL=SER
//DD002023 DD  VOLUME=(PRIVATE,,,,SER=VOL) VOL=SER
//DD002024 DD  VOLUME=(PRIVATE,,,,SER=SER) VOL=SER
//DD002031 DD  *,VOL=PRIVATE VOL=SER
//DD002032 DD  *,VOLUME=PRIVATE VOL=SER
//DD002113 DD  *,VOL=(PRIVATE,,,,SER=123) VOL=SER
//DD002114 DD  *,VOL=(PRIVATE,,,,SER=1-2-3) VOL=SER
//DD002115 DD  *,VOL=(PRIVATE,,,,SER=ABC) VOL=SER
//DD002116 DD  *,VOL=(PRIVATE,,,,SER=A-B-C) VOL=SER
//DD002117 DD  *,VOL=(PRIVATE,,,,SER=VOL) VOL=SER
//DD002118 DD  *,VOL=(PRIVATE,,,,SER=SER) VOL=SER
//DD002119 DD  *,VOLUME=(PRIVATE,,,,SER=123) VOL=SER
//DD002120 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3) VOL=SER
//DD002121 DD  *,VOLUME=(PRIVATE,,,,SER=ABC) VOL=SER
//DD002122 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C) VOL=SER
//DD002123 DD  *,VOLUME=(PRIVATE,,,,SER=VOL) VOL=SER
//DD002124 DD  *,VOLUME=(PRIVATE,,,,SER=SER) VOL=SER
//DD002131 DD  *,VOL=PRIVATE,MODE=C VOL=SER
//DD002132 DD  *,VOLUME=PRIVATE,MODE=C VOL=SER
//DD002213 DD  *,VOL=(PRIVATE,,,,SER=123),MODE=C VOL=SER
//DD002214 DD  *,VOL=(PRIVATE,,,,SER=1-2-3),MODE=C VOL=SER
//DD002215 DD  *,VOL=(PRIVATE,,,,SER=ABC),MODE=C VOL=SER
//DD002216 DD  *,VOL=(PRIVATE,,,,SER=A-B-C),MODE=C VOL=SER
//DD002217 DD  *,VOL=(PRIVATE,,,,SER=VOL),MODE=C VOL=SER
//DD002218 DD  *,VOL=(PRIVATE,,,,SER=SER),MODE=C VOL=SER
//DD002219 DD  *,VOLUME=(PRIVATE,,,,SER=123),MODE=C VOL=SER
//DD002220 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3),MODE=C VOL=SER
//DD002221 DD  *,VOLUME=(PRIVATE,,,,SER=ABC),MODE=C VOL=SER
//DD002222 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C),MODE=C VOL=SER
//DD002223 DD  *,VOLUME=(PRIVATE,,,,SER=VOL),MODE=C VOL=SER
//DD002224 DD  *,VOLUME=(PRIVATE,,,,SER=SER),MODE=C VOL=SER
//DD001113 DD  *,VOL=(PRIVATE,,,,SER=123) VOL=SER
AEIOU
//DD003114 DD  *,VOL=(PRIVATE,,,,SER=1-2-3) VOL=SER
AEIOU
//DD003115 DD  *,VOL=(PRIVATE,,,,SER=ABC) VOL=SER
AEIOU
//DD003116 DD  *,VOL=(PRIVATE,,,,SER=A-B-C) VOL=SER
AEIOU
//DD003117 DD  *,VOL=(PRIVATE,,,,SER=VOL) VOL=SER
AEIOU
//DD003118 DD  *,VOL=(PRIVATE,,,,SER=SER) VOL=SER
AEIOU
//DD003119 DD  *,VOLUME=(PRIVATE,,,,SER=123) VOL=SER
AEIOU
//DD003120 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3) VOL=SER
AEIOU
//DD003121 DD  *,VOLUME=(PRIVATE,,,,SER=ABC) VOL=SER
AEIOU
//DD003122 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C) VOL=SER
AEIOU
//DD003123 DD  *,VOLUME=(PRIVATE,,,,SER=VOL) VOL=SER
AEIOU
//DD003124 DD  *,VOLUME=(PRIVATE,,,,SER=SER) VOL=SER
AEIOU
//DD003131 DD  *,VOL=PRIVATE VOL=SER
AEIOU
//DD003132 DD  *,VOLUME=PRIVATE VOL=SER
AEIOU
//DD003213 DD  *,VOL=(PRIVATE,,,,SER=123),MODE=C VOL=SER
AEIOU
//DD003214 DD  *,VOL=(PRIVATE,,,,SER=1-2-3),MODE=C VOL=SER
AEIOU
//DD003215 DD  *,VOL=(PRIVATE,,,,SER=ABC),MODE=C VOL=SER
AEIOU
//DD003216 DD  *,VOL=(PRIVATE,,,,SER=A-B-C),MODE=C VOL=SER
AEIOU
//DD003217 DD  *,VOL=(PRIVATE,,,,SER=VOL),MODE=C VOL=SER
AEIOU
//DD003218 DD  *,VOL=(PRIVATE,,,,SER=SER),MODE=C VOL=SER
AEIOU
//DD003219 DD  *,VOLUME=(PRIVATE,,,,SER=123),MODE=C VOL=SER
AEIOU
//DD003220 DD  *,VOLUME=(PRIVATE,,,,SER=1-2-3),MODE=C VOL=SER
AEIOU
//DD003221 DD  *,VOLUME=(PRIVATE,,,,SER=ABC),MODE=C VOL=SER
AEIOU
//DD003222 DD  *,VOLUME=(PRIVATE,,,,SER=A-B-C),MODE=C VOL=SER
AEIOU
//DD003223 DD  *,VOLUME=(PRIVATE,,,,SER=VOL),MODE=C VOL=SER
AEIOU
//DD003224 DD  *,VOLUME=(PRIVATE,,,,SER=SER),MODE=C VOL=SER
AEIOU
//DD003231 DD  *,VOL=PRIVATE,MODE=C VOL=SER
AEIOU
//DD003232 DD  *,VOLUME=PRIVATE,MODE=C VOL=SER
AEIOU


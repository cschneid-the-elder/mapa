000001 ID Division.
000002 Program-ID. testantlr152.
000003 Procedure Division.
000004
000005 >>DEFINE IGY-ARCH 0
000006 >>DEFINE VAR1 0
000007
000008 >>EVALUATE TRUE
000009 >>WHEN IGY-CICS
000010     EXEC CICS 
000011          XCTL 
000012          PROGRAM('IGYCICS1')
000013     END-EXEC
000014 >>WHEN IGY-ARCH > 10
000015     CALL 'IGYARCH1' USING 
000016          X
000017          Y
000018          Z
000019     END-CALL
000020 >>WHEN VAR2 IS DEFINED
000021     CALL 'VAR2#1' USING 
000022          X
000023          Y
000024          Z
000025     END-CALL
000026 >>WHEN VAR1 + 1 = 2
000027     CALL 'VAR1#1' USING 
000028          X
000029          Y
000030          Z
000031     END-CALL
000032 >>WHEN OTHER
000033     CALL 'OTHER#1' USING 
000034          X
000035          Y
000036          Z
000037     END-CALL
000038 >>END-EVALUATE
000039
000040 >>DEFINE VAR1 AS 1
000041
000042 >>EVALUATE TRUE
000043 >>WHEN IGY-CICS
000044     EXEC CICS 
000045          XCTL 
000046          PROGRAM('IGYCICS2')
000047     END-EXEC
000048 >>WHEN IGY-ARCH > 10
000049     CALL 'IGYARCH2' USING 
000050          X
000051          Y
000052          Z
000053     END-CALL
000054 >>WHEN VAR2 IS DEFINED
000055     CALL 'VAR2#2' USING 
000056          X
000057          Y
000058          Z
000059     END-CALL
000060 >>WHEN VAR1 + 1 = 2
000061     CALL 'VAR1#2' USING 
000062          X
000063          Y
000064          Z
000065     END-CALL
000066 >>WHEN OTHER
000067     CALL 'OTHER#2' USING 
000068          X
000069          Y
000070          Z
000071     END-CALL
000072 >>END-EVALUATE
000073
000074 >>DEFINE VAR2
000075
000076 >>EVALUATE TRUE
000077 >>WHEN IGY-CICS
000078     EXEC CICS 
000079          XCTL 
000080          PROGRAM('IGYCICS3')
000081     END-EXEC
000082 >>WHEN IGY-ARCH > 10
000083     CALL 'IGYARCH3' USING 
000084          X
000085          Y
000086          Z
000087     END-CALL
000088 >>WHEN VAR2 IS DEFINED
000089     CALL 'VAR2#3' USING 
000090          X
000091          Y
000092          Z
000093     END-CALL
000094 >>WHEN VAR1 + 1 = 2
000095     CALL 'VAR1#3' USING 
000096          X
000097          Y
000098          Z
000099     END-CALL
000100 >>WHEN OTHER
000101     CALL 'OTHER#3' USING 
000102          X
000103          Y
000104          Z
000105     END-CALL
000106 >>END-EVALUATE
000107
000108 >>DEFINE IGY-ARCH 11
000109
000110 >>EVALUATE TRUE
000111 >>WHEN IGY-CICS
000112     EXEC CICS 
000113          XCTL 
000114          PROGRAM('IGYCICS4')
000115     END-EXEC
000116 >>WHEN IGY-ARCH > 10
000117     CALL 'IGYARCH4' USING 
000118          X
000119          Y
000120          Z
000121     END-CALL
000122 >>WHEN VAR2 IS DEFINED
000123     CALL 'VAR2#4' USING 
000124          X
000125          Y
000126          Z
000127     END-CALL
000128 >>WHEN VAR1 + 1 = 2
000129     CALL 'VAR1#4' USING 
000130          X
000131          Y
000132          Z
000133     END-CALL
000134 >>WHEN OTHER
000135     CALL 'OTHER#4' USING 
000136          X
000137          Y
000138          Z
000139     END-CALL
000140 >>END-EVALUATE
000141
000142 >>DEFINE IGY-CICS
000143
000144 >>EVALUATE TRUE
000145 >>WHEN IGY-CICS
000146     EXEC CICS 
000147          XCTL 
000148          PROGRAM('IGYCICS5')
000149     END-EXEC
000150 >>WHEN IGY-ARCH > 10
000151     CALL 'IGYARCH5' USING 
000152          X
000153          Y
000154          Z
000155     END-CALL
000156 >>WHEN VAR2 IS DEFINED
000157     CALL 'VAR2#5' USING 
000158          X
000159          Y
000160          Z
000161     END-CALL
000162 >>WHEN VAR1 + 1 = 2
000163     CALL 'VAR1#5' USING 
000164          X
000165          Y
000166          Z
000167     END-CALL
000168 >>WHEN OTHER
000169     CALL 'OTHER#5' USING 
000170          X
000171          Y
000172          Z
000173     END-CALL
000174 >>END-EVALUATE
000175
000176
000177     GOBACK.

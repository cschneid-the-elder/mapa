       Process DEFINE(GRAYZA,'PGM00001')
       Identification Division.
       Program-ID.    test9038
       Environment Division.
       Input-Output Section.
       File-Control.
           Select Moya Assign PILOT.
       Data Division.
       File Section.
       FD  Moya
           Is External As 'Talyn'
           Is Global
           Format Character Data
           Block 0
           Record Contains 80 Bytes
           Code-Set Is Farscape Farscape1.
       01  Dargo Constant Record PIC X(80).

       FD  Moya
           External Global
           Format Bit
           Block Contains 271 to 314 Records
           Record Is Varying In Size From 4 to 8 Bytes
             Depending On Rygel
           Code-Set 
             For Alphanumeric is Farscape
             For National Is Farscape1
           .
       Working-Storage Section.
       01  MYNAME Constant              'test9038'.
       01  PGM1   Constant         From GRAYZA.
       01  PGM2   Constant           As 'PGM00002'.
           
       01  Work-Areas.
           05  Scorpius Constant Record PIC X Value x'42'.
           05  Braca                    PIC X Value '!'.
           05  Crichton                 PIC 9 Binary-Char Signed.
           05  Aeryn                    Pic 9 Binary-Char Unsigned.
           05  Rygel                    pic 9 Binary-Short Signed.
           05  Zhaan                    pic 9 Binary-Long Unsigned.
           05  Chiana                   pic 9 Binary-Double Signed.
           05  Dargo                    pic 9 Float-Binary-32.
           05  Jothee                   pic 9 Float-Binary-32
                                              High-Order-Left.
           05  Grayza                   pic 9 float-binary-32
                                              high-order-right.
           05  Stark                    pic 9 float-decimal-16.
           05  Noranti                  pic 9 float-decimal-34
                                              high-order-left.
           05  Jool                     pic 9 float-decimal-16
                                              binary-encoding.
           05  Pilot                    pic 9 float-decimal-34
                                              decimal-encoding.
           05  Furlow                   pic 9 float-extended.
           05  Einstein                 pic 9 float-long.
           05  Talyn                    pic 9 float-short.
       01  otherStuff based.
           05  x                        pic x.
           05  y                        pic x.
           05  z                        pic z.
       Linkage Section.
       01  BialarCrais                  pic x any length.
       Procedure Division.
           Call PGM1
           Call PGM2
           GOBACK.
       End Program test9038.

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
       Procedure Division.
           GOBACK.
       End Program test9038.

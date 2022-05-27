       Identification Division.
       Program-ID.    test9040.
       Data Division.
       Working-Storage Section.
       01  Work-Areas.
           05  Aeryn    Picture Is S9(5) Packed-Decimal Value +1.
           05  Braca    Picture Is S9(5) Packed-Decimal Value +2.
           05  Crichton Picture Is S9(5) Packed-Decimal Value +3.
           05  Dargo    Picture Is S9(5) Packed-Decimal Value +4.
           05  Rygel    Picture Is S9(5) Packed-Decimal Value +0.
           05  Stark    Pointer.
       Procedure Division.
           Add 1 To Aeryn Rounded Mode AWAY-FROM-ZERO
           Add 1 To Aeryn Giving Rygel 
             Rounded Mode NEAREST-AWAY-FROM-ZERO
           Compute Rygel Rounded Mode NEAREST-EVEN = Aeryn * Braca
           Divide Braca Into Dargo Rounded Mode NEAREST-TOWARD-ZERO
           Divide Dargo By Crichton Giving Rygel Rounded Mode PROHIBITED
           Multiply Aeryn By Crichton Rounded Mode TOWARD-GREATER
           Multiply Braca By Crichton Giving Rygel 
             Rounded Mode TRUNCATION

           Add 1 To Aeryn Rounded 
           Add 1 To Aeryn Giving Rygel Rounded 
           Compute Rygel Rounded = Aeryn * Braca
           Divide Braca Into Dargo Rounded 
           Divide Dargo By Crichton Giving Rygel Rounded 
           Multiply Aeryn By Crichton Rounded 
           Multiply Braca By Crichton Giving Rygel Rounded 

           Add 1 To Aeryn  
           Add 1 To Aeryn Giving Rygel  
           Compute Rygel  = Aeryn * Braca
           Divide Braca Into Dargo  
           Divide Dargo By Crichton Giving Rygel  
           Multiply Aeryn By Crichton  
           Multiply Braca By Crichton Giving Rygel 

           Allocate Function Length(Aeryn) Returning Stark
           Goback
           .


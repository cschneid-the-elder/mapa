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
           05  Noranti  Picture Is 1(8).
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
           
           Compute Noranti = B-NOT (Stark B-OR Noranti)
           Compute Noranti = b'10101' b-and b'0101'
           Compute Noranti = Stark B-And b'101'
           Compute Noranti = Crichton B-XOR Scorpius B-AND (Grayza
                             B-OR B-Not Braca)
                             
           Continue
           Continue After 1 + 2 * 3 Seconds
           
           Delete Moya Record
             Invalid Key Display 'Oops'
             Not Invalid Key Display 'All fine'
           End-Delete
           Delete Moya Record
             Retry 2 + 3 Times
             Invalid Key Display 'Oops'
             Not Invalid Key Display 'All fine'
           End-Delete
           Delete Moya Record
             Retry For 2 + 3 Seconds
             Invalid Key Display 'Oops'
             Not Invalid Key Display 'All fine'
           End-Delete
           Delete Moya Record
             Retry Forever
             Invalid Key Display 'Oops'
             Not Invalid Key Display 'All fine'
           End-Delete
           Delete File Moya Talyn
             On Exception Display 'Nope'
             Not On Exception Display 'Yup'
           End-Delete
           Delete File Override Talyn
             On Exception Display 'Nope'
             Not On Exception Display 'Yup'
           End-Delete

           Display Scorpius
           Display 'Harvey = ' Scorpius
           Display theScreen
             At Line 7
           End-Display
           Display theScreen
             At Line Number screenPlacement
             On Exception Call 'ILBOABN0'
           End-Display
           Display theScreen
             At Column Number 4
             Not On Exception Call 'IEFBR14'
           End-Display

           Goback
           .


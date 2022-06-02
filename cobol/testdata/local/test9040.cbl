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
       Declaratives.
       Exceptional-Processing-EC-DATA Section.
           Use After Exception Condition EC-DATA.
           Resume At Recovery-From-EC-DATA
           .
           
       Exceptional-Processing-EC-IO Section.
           Use After Exception Condition EC-IO File Talyn.
           Unlock Talyn Record
           Resume Recovery-From-EC-IO
           .
           
       Exceptional-Processing-EC-OMG Section.
           Use EC 
             EC-BAD-STUFF 
             EC-WORSE-STUFF 
             EC-IO File Moya File Roscinante.
           Unlock Moya Records
           Unlock Roscinante
           Resume OMG-Give-It-Up
           .
           
       Exceptional-Object-Processing Section.
           Use Exception Object Protomolecule.
           Resume Next Statement
           .
           
       Report-Preface-01 Section.
           Use Before Reporting Report-01.
           Suppress Printing
           .
           
       Report-Preface-02 Section.
           Use Global Before Reporting Report-02.
           Suppress
           .
           
       End Declaratives.
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

           Exit Program
           Exit Program Raising Exception EC-Oops
           Exit Program Raising Zhaan
           Exit Program Raising Last
           Exit Program Raising Last Exception

           Goback
           Goback Raising Exception EC-Oops
           Goback Raising Zhaan
           Goback Raising Last
           Goback Raising Last Exception
           Goback With Error Status Stark
           Goback With Normal Status Zhaan
           Goback Error Status x'0001'
           Goback Normal Status x'0000'
           Goback Error Scorpius
           Goback Normal Sikozu

           Initialize Work-Areas Numeric To Value
           Initialize Work-Areas Boolean To Value
           Initialize Work-Areas All Value
             Then Replacing Numeric By Low-Values
                            Boolean By b'0'

           Inspect Backward Backward Tallying Aeryn For All
             Braca After Initial Rygel
           Inspect Backward Backward Tallying Backward For All
             Backward Before Initial Backward
           Inspect Backward Tallying Backward For All
             Backward Before Initial Backward
           
           Invoke SELF Grayza Using By Value Length Of Pilot
             Returning Scorpius
           End-Invoke
           Invoke Moya x'1234' Using Content Crichton + Aeryn
           Invoke Talyn Crais Using Reference Omitted
             On Exception 
               Invoke Moya Pilot Using Content Aeryn End-Invoke
             Not On Exception 
               Invoke Zhaan Chiana Using Reference Dargo End-Invoke
           End-Invoke
           Invoke Super New Using By Reference Omitted
           
           Open Input Sharing All Moya
           Open Input Sharing No Talyn
           Open Input Sharing Read Only Roscinante
           Open Input Sharing With All Moya
           Open Input Sharing With No Talyn
           Open Input Sharing With Read Only Roscinante
           Open Input Sharing All Other Moya
           Open Input Sharing No Other Talyn
           Open Input Sharing With All Other Moya
           Open Input Sharing With No Other Talyn

           Open Input Retry 42 Times Moya
           Open Input Retry 1 + 2 * 3 Times Talyn
           Open Input Retry For 42 Seconds Roscinante
           Open Input Retry For 1 + 2 * 3 Seconds WhiteStar
           Open Input Retry Forever WhiteStar

           Open Input Sharing All Retry 42 Times Moya
           Open Input Sharing No Retry 42 Times Talyn
           Open Input Sharing Read Only Retry 42 Times Roscinante
           Open Input Sharing With All Retry 42 Times Moya
           Open Input Sharing With No Retry 42 Times Talyn
           Open Input Sharing With Read Only Retry 42 Times Roscinante
           Open Input Sharing All Other Retry 42 Times Moya
           Open Input Sharing No Other Retry 42 Times Talyn
           Open Input Sharing With All Other Retry 42 Times Moya
           Open Input Sharing With No Other Retry 42 Times Talyn

           Open Input Sharing All Retry 1 + 2 * 3 Times Moya
           Open Input Sharing No Retry 1 + 2 * 3 Times Talyn
           Open Input Sharing Read Only 
             Retry 1 + 2 * 3 Times Roscinante
           Open Input Sharing With All Retry 1 + 2 * 3 Times Moya
           Open Input Sharing With No Retry 1 + 2 * 3 Times Talyn
           Open Input Sharing With Read Only 
             Retry 1 + 2 * 3 Times Roscinante
           Open Input Sharing All Other Retry 1 + 2 * 3 Times Moya
           Open Input Sharing No Other Retry 1 + 2 * 3 Times Talyn
           Open Input Sharing With All Other Retry 1 + 2 * 3 Times Moya
           Open Input Sharing With No Other Retry 1 + 2 * 3 Times Talyn

           Open Input Sharing All Retry For 42 Seconds Moya
           Open Input Sharing No Retry For 42 Seconds Talyn
           Open Input Sharing Read Only Retry For 42 Seconds Roscinante
           Open Input Sharing With All Retry For 42 Seconds Moya
           Open Input Sharing With No Retry For 42 Seconds Talyn
           Open Input Sharing With Read Only 
             Retry For 42 Seconds Roscinante
           Open Input Sharing All Other Retry For 42 Seconds Moya
           Open Input Sharing No Other Retry For 42 Seconds Talyn
           Open Input Sharing With All Other 
             Retry For 42 Seconds Moya
           Open Input Sharing With No Other 
             Retry For 42 Seconds Talyn

           Open Input Sharing All Retry For 1 + 2 * 3 Seconds Moya
           Open Input Sharing No Retry For 1 + 2 * 3 Seconds Talyn
           Open Input Sharing Read Only 
             Retry For 1 + 2 * 3 Seconds Roscinante
           Open Input Sharing With All 
             Retry For 1 + 2 * 3 Seconds Moya
           Open Input Sharing With No 
             Retry For 1 + 2 * 3 Seconds Talyn
           Open Input Sharing With Read Only 
             Retry For 1 + 2 * 3 Seconds Roscinante
           Open Input Sharing All Other 
             Retry For 1 + 2 * 3 Seconds Moya
           Open Input Sharing No Other 
             Retry For 1 + 2 * 3 Seconds Talyn
           Open Input Sharing With All Other 
             Retry For 1 + 2 * 3 Seconds Moya
           Open Input Sharing With No Other 
             Retry For 1 + 2 * 3 Seconds Talyn

           Open Input Sharing All Retry Forever Moya
           Open Input Sharing No Retry Forever Talyn
           Open Input Sharing Read Only Retry Forever Roscinante
           Open Input Sharing With All Retry Forever Moya
           Open Input Sharing With No Retry Forever Talyn
           Open Input Sharing With Read Only Retry Forever Roscinante
           Open Input Sharing All Other Retry Forever Moya
           Open Input Sharing No Other Retry Forever Talyn
           Open Input Sharing With All Other Retry Forever Moya
           Open Input Sharing With No Other Retry Forever Talyn

           Open Input Sharing All Retry Forever Moya
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing No Retry Forever Talyn
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing Read Only Retry Forever Roscinante
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing With All Retry Forever Moya
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing With No Retry Forever Talyn
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing With Read Only Retry Forever Roscinante
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing All Other Retry Forever Moya
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing No Other Retry Forever Talyn
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing With All Other Retry Forever Moya
             With No Rewind WhiteStar With No Rewind
           Open Input Sharing With No Other Retry Forever Talyn
             With No Rewind WhiteStar With No Rewind

           Perform Paragraph-1 Until Exit
           Perform
               Read Talyn
               Add 1 To Talyn-Field
             When Exception Talyn Display 'Oops'
             When EC-DATA Display 'Also Oops'
             When EC-IO File Talyn Resume Next Statement
             When Other Display 'Other Oops'
             Common Display 'Common Oops'
             Finally Display 'Ultimate Oops'
           End-Perform
           
           Raise Exception EC-PROGRAM-ARG-MISMATCH
           Raise Sikozu
           
           Read Moya Next Record Into Crichton
             Advancing On Lock
             Retry 42 Times
             With Lock
             At End Display 'At End'
             Not At End Display 'Not At End'
           End-Read
           Read Roscinante Previous Into Amos
             Advancing Lock
             Retry For 3 + 4 / 2 Seconds
             Lock
             End Display 'At End'
             Not End Display 'Not At End'
           End-Read
           Read Roscinante Previous Into Amos
             Ignoring Lock
             Retry For 3 + 4 / 2 Seconds
             No Lock
             End Display 'At End'
             Not End Display 'Not At End'
           End-Read
           
           Receive Tachi Giving Canterbury
           Receive From Tachi Giving Canterbury
             Continue 4
           Receive From Tachi Giving Canterbury
             Continue 3 + 4 Seconds
           Receive From Tachi Giving Canterbury
             Continue Message Received
           Receive From Tachi Giving Canterbury
             Continue After 4
           Receive From Tachi Giving Canterbury
             Continue After 3 + 4 Seconds
           Receive From Tachi Giving Canterbury
             Continue After Message Received
           Receive From Tachi Giving Canterbury
             Continue After Message Received
             Exception Display 'Exceptional' End-Display
             Not Exception Display 'Ordinary' End-Display
           End-Receive
           Receive Tachi Giving Canterbury
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue 4
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue 3 + 4 Seconds
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue Message Received
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue After 4
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue After 3 + 4 Seconds
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue After Message Received
           End-Receive
           Receive From Tachi Giving Canterbury
             Continue After Message Received
             Exception Display 'Exceptional' End-Display
             Not Exception Display 'Ordinary' End-Display
           End-Receive
           
           Send x'4815162342' From Crichton
             Returning Aeryn
             Exception Display 'Send failed' End-Display
             Not Exception Display 'Send Succeeded' End-Display
           End-Send
           Send To Roscinante From NaomiNagata
             Returning AmosBurton
           End-Send
           Send To Roscinante From NaomiNagata
             Raising Exception EC-ALL
           End-Send
           Send To Roscinante From NaomiNagata
             Raising Last
           End-Send

           Set Address Of AlexKamal To TheBelt
           Set EarthAlliance Attribute Lowlight On
           
           Stop Run Error
           Stop Run With Error Status 16
           Stop Run With Normal Status 0
           Stop Run With Error
           Stop Run With Error Scorpius
           
           Write File Roscinante
             Retry Forever Lock
           End-Write
           
           Call 'IEFBR14' USING
               Dargo As Fixed Length 4
           End-Call
           .
           
       OMG-Give-It-Up.
           Rollback
           Move 16 To Return-Code
           Goback
           .


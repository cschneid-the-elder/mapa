       Identification Division.
       Class-ID. test30aa.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30aa'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30aa.

       Identification Division.
       Class-ID. test30ba As 'TEST30BA'.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ba'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ba.

       Identification Division.
       Class-ID. test30ca Is Final.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ca'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ca.

       Identification Division.
       Class-ID. test30da Final.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30da'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30da.

       Identification Division.
       Class-ID. test30ea As 'TEST30EA' Final.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ea'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ea.

       Identification Division.
       Class-ID. test30fa As 'TEST30FA' Is Final.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fa'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fa.

       Identification Division.
       Class-ID. test30ab Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ab'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ab.

       Identification Division.
       Class-ID. test30bb As 'TEST30BB' Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bb'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bb.

       Identification Division.
       Class-ID. test30cb Is Final Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cb'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cb.

       Identification Division.
       Class-ID. test30db Final Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30db'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30db.

       Identification Division.
       Class-ID. test30eb As 'TEST30EB' Final Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30eb'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30eb.

       Identification Division.
       Class-ID. test30fb As 'TEST30FB' Is Final Inherits someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fb'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fb.

       Identification Division.
       Class-ID. test30ac Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ac'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ac.

       Identification Division.
       Class-ID. test30bc As 'TEST30BC' Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bc'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bc.

       Identification Division.
       Class-ID. test30cc Is Final Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cc'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cc.

       Identification Division.
       Class-ID. test30dc Final Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dc'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dc.

       Identification Division.
       Class-ID. test30ec As 'TEST30EC' Final Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ec'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ec.

       Identification Division.
       Class-ID. test30fc As 'TEST30FC' Is Final
          Inherits From someClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fc'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fc.

       Identification Division.
       Class-ID. test30ad
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ad'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ad.

       Identification Division.
       Class-ID. test30bd As 'TEST30BD'
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bd'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bd.

       Identification Division.
       Class-ID. test30cd Is Final
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cd'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cd.

       Identification Division.
       Class-ID. test30dd Final
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dd'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dd.

       Identification Division.
       Class-ID. test30ed As 'TEST30ED' Final
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ed'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ed.

       Identification Division.
       Class-ID. test30fd As 'TEST30FD' Is Final
           Inherits someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fd'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fd.

       Identification Division.
       Class-ID. test30ae
           Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ae'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ae.

       Identification Division.
       Class-ID. test30be As 'TEST30BE'
           Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30be'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30be.

       Identification Division.
       Class-ID. test30ce Is Final
           Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ce'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ce.

       Identification Division.
       Class-ID. test30de Final
           Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30de'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30de.

       Identification Division.
       Class-ID. test30ee As 'TEST30EE' Final
           Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ee'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ee.

       Identification Division.
       Class-ID. test30fe As 'TEST30FE' Is Final
          Inherits From someClass someOtherClass.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fe'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fe.

       Identification Division.
       Class-ID. test30af Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30af'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30af.

       Identification Division.
       Class-ID. test30bf As 'TEST30BF' Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bf'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bf.

       Identification Division.
       Class-ID. test30cf Is Final Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cf'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cf.

       Identification Division.
       Class-ID. test30df Final Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30df'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30df.

       Identification Division.
       Class-ID. test30ef As 'TEST30EF' Final Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ef'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ef.

       Identification Division.
       Class-ID. test30ff As 'TEST30FF' Is Final Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ff'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ff.

       Identification Division.
       Class-ID. test30ag Inherits someClass Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ag'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ag.

       Identification Division.
       Class-ID. test30bg As 'TEST30BG' Inherits someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bg'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bg.

       Identification Division.
       Class-ID. test30cg Is Final Inherits someClass Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cg'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cg.

       Identification Division.
       Class-ID. test30dg Final Inherits someClass Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dg'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dg.

       Identification Division.
       Class-ID. test30eg As 'TEST30EG' Final Inherits someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30eg'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30eg.

       Identification Division.
       Class-ID. test30fg As 'TEST30FG' Is Final Inherits someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fg'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fg.

       Identification Division.
       Class-ID. test30ah Inherits From someClass Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ah'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ah.

       Identification Division.
       Class-ID. test30bh As 'TEST30BH' Inherits From someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bh'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bh.

       Identification Division.
       Class-ID. test30ch Is Final Inherits From someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ch'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ch.

       Identification Division.
       Class-ID. test30dh Final Inherits From someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dh'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dh.

       Identification Division.
       Class-ID. test30eh As 'TEST30EH' Final Inherits From someClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30eh'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30eh.

       Identification Division.
       Class-ID. test30fh As 'TEST30FH' Is Final
          Inherits From someClass  Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fh'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fh.

       Identification Division.
       Class-ID. test30ai
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ai'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ai.

       Identification Division.
       Class-ID. test30bi As 'TEST30BI'
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bi'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bi.

       Identification Division.
       Class-ID. test30ci Is Final
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ci'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ci.

       Identification Division.
       Class-ID. test30di Final
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30di'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30di.

       Identification Division.
       Class-ID. test30ei As 'TEST30EI' Final
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ei'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ei.

       Identification Division.
       Class-ID. test30fi As 'TEST30FI' Is Final
           Inherits someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fi'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fi.

       Identification Division.
       Class-ID. test30aj
           Inherits From someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30aj'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30aj.

       Identification Division.
       Class-ID. test30bj As 'TEST30BJ'
           Inherits From someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bj'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bj.

       Identification Division.
       Class-ID. test30cj Is Final
           Inherits From someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cj'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cj.

       Identification Division.
       Class-ID. test30dj Final
           Inherits From someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dj'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dj.

       Identification Division.
       Class-ID. test30ej As 'TEST30EJ' Final
           Inherits From someClass someOtherClass
           Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ej'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ej.

       Identification Division.
       Class-ID. test30fj As 'TEST30FJ' Is Final
          Inherits From someClass someOtherClass
          Using parameter1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fj'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fj.

       Identification Division.
       Class-ID. test30ak Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ak'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ak.

       Identification Division.
       Class-ID. test30bk As 'TEST30BK'
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bk'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bk.

       Identification Division.
       Class-ID. test30ck Is Final
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ck'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ck.

       Identification Division.
       Class-ID. test30dk Final
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dk'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dk.

       Identification Division.
       Class-ID. test30ek As 'TEST30EK' Final
           Using parameter1  parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ek'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ek.

       Identification Division.
       Class-ID. test30fk As 'TEST30FK' Is Final
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fk'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fk.

       Identification Division.
       Class-ID. test30al Inherits someClass 
          Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30al'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30al.

       Identification Division.
       Class-ID. test30bl As 'TEST30BL' Inherits someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bl'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bl.

       Identification Division.
       Class-ID. test30cl Is Final Inherits someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cl'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cl.

       Identification Division.
       Class-ID. test30dl Final Inherits someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dl'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dl.

       Identification Division.
       Class-ID. test30el As 'TEST30EL' Final Inherits someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30el'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30el.

       Identification Division.
       Class-ID. test30fl As 'TEST30FL' Is Final Inherits someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fl'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fl.

       Identification Division.
       Class-ID. test30am Inherits From someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30am'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30am.

       Identification Division.
       Class-ID. test30bm As 'TEST30BM' Inherits From someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bm'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bm.

       Identification Division.
       Class-ID. test30cm Is Final Inherits From someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cm'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cm.

       Identification Division.
       Class-ID. test30dm Final Inherits From someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dm'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dm.

       Identification Division.
       Class-ID. test30em As 'TEST30EM' Final Inherits From someClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30em'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30em.

       Identification Division.
       Class-ID. test30fm As 'TEST30FM' Is Final
          Inherits From someClass  Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fm'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fm.

       Identification Division.
       Class-ID. test30an
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30an'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30an.

       Identification Division.
       Class-ID. test30bn As 'TEST30BN'
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bn'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bn.

       Identification Division.
       Class-ID. test30cn Is Final
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30cn'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30cn.

       Identification Division.
       Class-ID. test30dn Final
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30dn'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30dn.

       Identification Division.
       Class-ID. test30en As 'TEST30EN' Final
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30en'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30en.

       Identification Division.
       Class-ID. test30fn As 'TEST30FN' Is Final
           Inherits someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fn'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fn.

       Identification Division.
       Class-ID. test30ao
           Inherits From someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30ao'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30ao.

       Identification Division.
       Class-ID. test30bo As 'TEST30BO'
           Inherits From someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30bo'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30bo.

       Identification Division.
       Class-ID. test30co Is Final
           Inherits From someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30co'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30co.

       Identification Division.
       Class-ID. test30do Final
           Inherits From someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30do'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30do.

       Identification Division.
       Class-ID. test30eo As 'TEST30EO' Final
           Inherits From someClass someOtherClass
           Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30eo'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30eo.

       Identification Division.
       Class-ID. test30fo As 'TEST30FO' Is Final
          Inherits From someClass someOtherClass
          Using parameter1 parameter2.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test30fo'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       End Class test30fo.


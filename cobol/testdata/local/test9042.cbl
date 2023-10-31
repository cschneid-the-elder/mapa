       Identification Division.
       Function-ID. F1 Is Prototype.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F1.

       Identification Division.
       Function-ID. F2 As 'DOESNADA' Is Prototype.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F2.

       Identification Division.
       Function-ID. F3 As 'DOESNADA' Is Prototype
           Entry-Name Is COMPAT.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F3.

       Identification Division.
       Function-ID. F4 As 'DOESNADA' Is Prototype
           Entry-Name Is LONGUPPER.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F4.

       Identification Division.
       Function-ID. F5 As 'DOESNADA' Is Prototype
           Entry-Name Is LONGMIXED.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F5.

       Identification Division.
       Function-ID. F6 As 'DOESNADA' Is Prototype
           Entry-Name Is COMPAT
           Entry-Interface Is STATIC.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F6.

       Identification Division.
       Function-ID. F7 As 'DOESNADA' Is Prototype
           Entry-Name Is COMPAT
           Entry-Interface Is DYNAMIC.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F7.

       Identification Division.
       Function-ID. F8 As 'DOESNADA' Is Prototype
           Entry-Name Is COMPAT
           Entry-Interface Is DLL.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F8.

       Identification Division.
       Function-ID. F9 As 'DOESNADA' Is Prototype
           Entry-Interface Is DLL.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
       End Function F9.

       Identification Division.
       Program-ID. test9033.
       Environment Division.
       Configuration Section.
       Repository.
           Function F1.
       Procedure Division.
           DISPLAY F1
           GOBACK.
       End Program test9033.


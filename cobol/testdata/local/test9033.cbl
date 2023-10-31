       Identification Division.
       Function-ID. doesnada.
       Data Division.
       Linkage Section.
       77  SOMETHING PIC X(008).
       Procedure Division Returning SOMETHING.
           CALL 'IEFBR14'
           MOVE SPACES TO SOMETHING
           GOBACK.
       End Function test9033.

       Identification Division.
       Program-ID. test9033.
       Environment Division.
       Configuration Section.
       Repository.
           Function doesnada.
       Procedure Division.
           DISPLAY doesnada
           GOBACK.
       End Program test9033.


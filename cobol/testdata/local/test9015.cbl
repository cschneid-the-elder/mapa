       Identification Division.
       Program-ID. test9015.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test9015'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS LINK PROGRAM(PGM-0001) END-EXEC

           EXEC CICS 
                LINK
                PROGRAM(PGM-0001)
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                LINK
                COMMAREA(CONSTANTS)
                PROGRAM(PGM-0001)
           END-EXEC

           EXEC CICS XCTL PROGRAM(PGM-0001) END-EXEC

           EXEC CICS 
                XCTL
                PROGRAM(PGM-0001)
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                XCTL
                COMMAREA(CONSTANTS)
                PROGRAM(PGM-0001)
           END-EXEC

           EXEC CICS LINK PROGRAM('PGMB0001') END-EXEC

           EXEC CICS 
                LINK
                PROGRAM('PGMB0001')
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                LINK
                COMMAREA(CONSTANTS)
                PROGRAM('PGMB0001')
           END-EXEC

           EXEC CICS XCTL PROGRAM('PGMB0001') END-EXEC

           EXEC CICS 
                XCTL
                PROGRAM('PGMB0001')
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                XCTL
                COMMAREA(CONSTANTS)
                PROGRAM('PGMB0001')
           END-EXEC

           EXEC CICS LINK PROGRAM("PGMB0001") END-EXEC

           EXEC CICS 
                LINK
                PROGRAM("PGMB0001")
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                LINK
                COMMAREA(CONSTANTS)
                PROGRAM("PGMB0001")
           END-EXEC

           EXEC CICS XCTL PROGRAM("PGMB0001") END-EXEC

           EXEC CICS 
                XCTL
                PROGRAM("PGMB0001")
                COMMAREA(CONSTANTS)
           END-EXEC

           EXEC CICS 
                XCTL
                COMMAREA(CONSTANTS)
                PROGRAM("PGMB0001")
           END-EXEC

           DISPLAY MYNAME ' End'
           
           GOBACK
           .



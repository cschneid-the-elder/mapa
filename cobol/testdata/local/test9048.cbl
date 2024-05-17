       IDENTIFICATION DIVISION.
       PROGRAM-ID. SAMPLE.                                                 
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       77  SEGKEYA                PIC X(4).
       77  SEGKEYB                PIC X(4).                                
       77  SEGKEYC                PIC X(4).
       77  SEGKEY1                PIC X(4).
       77  SEGKEY2                PIC X(4).
       77  SEGKEY3                PIC X(4).
       77  SEGKEY4                PIC X(4).
       77  CONKEYB                PIC X(8).
       77  SEGNAME                PIC X(8).
       77  SEGLEN                 COMP PIC S9(4).
       77  PCBNUM                 COMP PIC S9(4).
       01  AREAA                  PIC X(80).
      *    DEFINE SEGMENT I/O AREA
       01  AREAB                  PIC X(80).
       01  AREAC                  PIC X(80).                              
       01  AREAG                  PIC X(250).
       01  AREASTAT               PIC X(360).
       PROCEDURE DIVISION.
      *                                                               
           EXEC CICS HANDLE CONDITION ERROR(ERRORS) END-EXEC.             
           EXEC CICS HANDLE ABEND LABEL(ABENDS) END-EXEC.                 
      *
           EXEC CICS RECEIVE MAP ('SAMPMAP') MAPSET('MAPSET') END-EXEC.   
           EXEC DLI SCHD PSB(SAMPLE1) END-EXEC.
           MOVE 'A300' TO SEGKEYA.
           EXEC DLI GU USING PCB(1) SEGMENT(SEGA) INTO(AREAA)
                SEGLENGTH(80) WHERE(KEYA=SEGKEYA)                         
                FIELDLENGTH(4)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.
       GetNextInParent-LOOP.
           EXEC DLI GNP USING PCB(1) INTO(AREAG) SEGLENGTH(250)
           END-EXEC.
           IF DIBSTAT EQUAL TO 'GE' THEN GO TO LOOPDONE.
           PERFORM TEST-DIB THRU OK.
           GO TO GetNextInParent-LOOP.
       LOOPDONE.
 
           MOVE 'Charles Rowland and Edwin Paine' TO AREAA.
           EXEC DLI ISRT USING PCB(1) SEGMENT(SEGA) FROM(AREAA)
                SEGLENGTH(80) END-EXEC.
           PERFORM TEST-DIB THRU OK.

           MOVE 'A200' TO SEGKEYA.
           MOVE 'B240' TO SEGKEYB.
           MOVE 'C241' TO SEGKEYC.
           EXEC DLI GU USING PCB(1)
             SEGMENT(SEGA) WHERE(KEYA=SEGKEYA) FIELDLENGTH(4)             
                INTO(AREAA)
                SEGLENGTH(80)
             SEGMENT(SEGB) WHERE(KEYB=SEGKEYB) FIELDLENGTH(4)
                INTO(AREAB)
                SEGLENGTH(80)
             SEGMENT(SEGC) WHERE(KEYC=SEGKEYC) FIELDLENGTH(4)
                INTO(AREAC)
                SEGLENGTH(80)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.

           EXEC DLI REPL USING PCB(1)
             SEGMENT(SEGA) FROM(AREAA) SEGLENGTH(80)
             SEGMENT(SEGB) FROM(AREAB) SEGLENGTH(80)
             SEGMENT(SEGC) FROM(AREAC) SEGLENGTH(80)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.

           MOVE 'Crystal Palace and Niko Sasaki' TO AREAC.
           MOVE 'A200B240' TO CONKEYB.
           EXEC DLI ISRT USING PCB(1)
             SEGMENT(SEGB) KEYS(CONKEYB) KEYLENGTH(8)
             SEGMENT(SEGC) FROM(AREAC) SEGLENGTH(80)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.

           MOVE 'A200B230' TO CONKEYB.
           EXEC DLI GU USING PCB(1)
             SEGMENT(SEGB)
                KEYS(CONKEYB) KEYLENGTH(8)
                INTO(AREAB) SEGLENGTH(80)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.
           EXEC DLI DLET USING PCB(1)
             SEGMENT(SEGB) SEGLENGTH(80) FROM(AREAB) END-EXEC.
           PERFORM TEST-DIB THRU OK.

           MOVE 'A200B230' TO CONKEYB.
           MOVE 'C520' TO SEGKEYC.
           MOVE 'SEGA' TO SEGNAME.
           MOVE 80 TO SEGLEN.
           MOVE 1 TO PCBNUM.
           EXEC DLI GU USING PCB(PCBNUM)
             SEGMENT((SEGNAME))
                KEYS(CONKEYB) KEYLENGTH(8) SETPARENT
             SEGMENT(SEGC) INTO(AREAC) SEGLENGTH(SEGLEN)
                WHERE(KEYC=SEGKEYC) FIELDLENGTH(4) END-EXEC.
           PERFORM TEST-DIB THRU OK.

           EXEC DLI STAT USING PCB(1) INTO(AREASTAT)
                VSAM FORMATTED LENGTH(360) END-EXEC.
           PERFORM TEST-DIB THRU OK.

           MOVE 'A050' TO SEGKEY1.
           MOVE 'A150' TO SEGKEY2.
           MOVE 'A275' TO SEGKEY3.
           MOVE 'A350' TO SEGKEY4.
           EXEC DLI GU USING PCB(1) SEGMENT(SEGA) INTO(AREAA)
                SEGLENGTH(80) FIELDLENGTH(4,4,4,4)
                WHERE(KEYA > SEGKEY1 AND KEYA < SEGKEY2 OR
                      KEYA > SEGKEY3 AND KEYA < SEGKEY4)
           END-EXEC.
           PERFORM TEST-DIB THRU OK.

             EXEC DLI TERM END-EXEC.                                      

           EXEC CICS SEND MAP('SAMPMAP') MAPSET('MAPSET') END-EXEC.             
           EXEC CICS WAIT TERMINAL END-EXEC.                                    

           EXEC CICS RETURN END-EXEC.                                           

       TEST-DIB.                                                                
           IF DIBSTAT NOT = '  ' THEN GO TO ERRORS.                              
       OK.                                                                
       ERRORS.                                                                  
           EXEC CICS WRITE OPERATOR 
                TEXT('A Bad Thing(TM) has happened')
           END-EXEC.
       ABENDS.                                                                  
           EXEC CICS ABEND ABCODE('X123') END-EXEC.

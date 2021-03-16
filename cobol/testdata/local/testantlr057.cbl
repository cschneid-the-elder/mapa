       ID Division.
       Program-ID. testantlr057.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-POINTER            POINTER VALUE NULL.
           05  WS-COUNT              PIC S9(5) COMP-3 VALUE +0.

       Linkage Section.
       01  SOME-DATA                 PIC X(1024).
       Procedure Division.

           ALLOCATE
             SOME-DATA

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             RETURNING WS-POINTER

           FREE SOME-DATA WS-POINTER

           MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             RETURNING WS-POINTER

           FREE WS-POINTER

           ALLOCATE
             SOME-DATA
             INITIALIZED

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             INITIALIZED
             RETURNING WS-POINTER

           FREE SOME-DATA WS-POINTER

           MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             INITIALIZED
             RETURNING WS-POINTER

           FREE WS-POINTER

           ALLOCATE
             SOME-DATA
             LOC 24

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             LOC 24
             RETURNING WS-POINTER

           FREE SOME-DATA WS-POINTER

           MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             LOC 24
             RETURNING WS-POINTER

           FREE WS-POINTER

           ALLOCATE
             SOME-DATA
             LOC 31

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             LOC 31
             RETURNING WS-POINTER

          FREE SOME-DATA WS-POINTER

          MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             LOC 31
             RETURNING WS-POINTER

           FREE WS-POINTER

           ALLOCATE
             SOME-DATA
             LOC 64

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             LOC 64
             RETURNING WS-POINTER

           FREE SOME-DATA WS-POINTER

           MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             LOC 64
             RETURNING WS-POINTER

           FREE WS-POINTER

           ALLOCATE
             SOME-DATA
             INITIALIZED
             LOC 64

           FREE SOME-DATA

           ALLOCATE
             SOME-DATA
             INITIALIZED
             LOC 64
             RETURNING WS-POINTER

           FREE SOME-DATA WS-POINTER

           MOVE LENGTH OF SOME-DATA TO WS-COUNT
           ALLOCATE
             WS-COUNT CHARACTERS
             INITIALIZED
             LOC 64
             RETURNING WS-POINTER

           FREE WS-POINTER

           GOBACK.

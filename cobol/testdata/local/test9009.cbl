       PROCESS DEFINE(A=B'1'),DEFINE(B=B'0')
       ID Division.
       Program-ID. test9009.
       Procedure Division.
           >>IF A
           CALL 'PGM0001A'
           >>END-IF

           >>IF B
           CALL 'PGM0001B'
           >>END-IF

           >>DEFINE A B'0' OVERRIDE
           >>DEFINE B B'1' OVERRIDE

           >>IF A
           CALL 'PGM0001C'
           >>END-IF

           >>IF B
           CALL 'PGM0001D'
           >>END-IF

           >>DEFINE A AS PARAMETER
           >>DEFINE B AS PARAMETER

           >>IF A
           CALL 'PGM0001E'
           >>END-IF

           >>IF B
           CALL 'PGM0001F'
           >>END-IF

           >>IF A
           COPY test9009.cpy.
           >>END-IF

           >>IF B
           CALL 'PGM0001G'
           >>END-IF

           >>DEFINE B AS PARAMETER

           >>IF B
           CALL 'PGM0001H'
           >>END-IF

           GOBACK.

       ID Division.
       Program-ID. test9024.
       Environment Division.
       Configuration Section.
       Repository.
           FUNCTION 

               ABS
               ACOS
               ANNUITY
               ASIN
               ATAN
               BIT-OF
               BIT-TO-CHAR
               BYTE-LENGTH
               CHAR
               COMBINED-DATETIME
               CONTENT-OF
               COS
               CURRENT-DATE
               DATE-OF-INTEGER
               DATE-TO-YYYYMMDD
               DAY-OF-INTEGER
               DAY-TO-YYYYDDD
               DISPLAY-OF
               E
               EXP
               EXP10
               FACTORIAL
               FORMATTED-CURRENT-DATE
               FORMATTED-DATE
               FORMATTED-DATETIME
               FORMATTED-TIME
               HEX-OF
               HEX-TO-CHAR
               INTEGER
               INTEGER-OF-DATE
               INTEGER-OF-DAY
               INTEGER-OF-FORMATTED-DATE
               INTEGER-PART
               LENGTH
               LOG
               LOG10
               LOWER-CASE
               MAX
               MEAN
               MEDIAN
               MIDRANGE
               MIN
               MOD
               NATIONAL-OF
               NUMVAL
               NUMVAL-C
               NUMVAL-F
               ORD
               ORD-MAX
               ORD-MIN
               PI
               PRESENT-VALUE
               RANDOM
               RANGE
               REM
               REVERSE
               SECONDS-FROM-FORMATTED-TIME
               SECONDS-PAST-MIDNIGHT
               SIGN
               SIN
               SQRT
               STANDARD-DEVIATION
               SUM
               TAN
               TEST-DATE-YYYYMMDD
               TEST-DAY-YYYYDDD
               TEST-FORMATTED-DATETIME
               TEST-NUMVAL
               TEST-NUMVAL-C
               TEST-NUMVAL-F
               TRIM
               ULENGTH
               UPOS
               UPPER-CASE
               USUBSTR
               USUPPLEMENTARY
               UUID4
               UVALID
               UWIDTH
               VARIANCE
               WHEN-COMPILED
               YEAR-TO-YYYY

           INTRINSIC.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           MOVE REVERSE(WORK-AREAS) TO RETURN-CODE
           
           MOVE CONTENT-OF(WS-COUNT) TO WORK-AREAS

           MOVE ABS(WS-COUNT) TO RETURN-CODE

           EXIT PROGRAM.

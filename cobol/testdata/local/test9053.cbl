       ID Division.
      * portions copyright (c) IBM 2025
       Program-ID. test9053.
       Data Division.
       Working-Storage Section.
      * elementary type definition
       01  MY-STRING-T TYPEDEF PIC X(20) JUSTIFIED.

      * type instance definitions
       01  STR1 TYPE MY-STRING-T.
       01  STR2 TYPE MY-STRING-T.

      * define elementary type instance within a group
       01  G9.
           03 S1 TYPE MY-STRING-T.

      * group type definition
       01  MY-GROUP-T TYPEDEF.
           03  S1 TYPE MY-STRING-T. *> elementary type instance
           03  N1 PIC S9(9).
   
      * type instance definitions
       01  G1 TYPE MY-GROUP-T. *> G1 is a group item
       01  G2 TYPE MY-GROUP-T. *> G2 is a group item

       Procedure Division.
           MOVE STR1 TO STR2
           MOVE 'Hello, world!' TO S1

           MOVE G1::S1  TO G2::S1
           COMPUTE G1::N1 = (G1::N1 + G2::N1) * 2
           GOBACK.

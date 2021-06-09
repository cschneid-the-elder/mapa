SELECT
    XMLQUERY(
        'a string'
        PASSING X.C1
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF X.C1
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING
            X.C1
          , X.C2 + X.C3
          , X.C4
          , 'J'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING X.C1
        RETURNING SEQUENCE
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING X.C1
        RETURNING SEQUENCE BY REF
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING X.C1
        EMPTY ON EMPTY
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING X.C1
        RETURNING SEQUENCE BY REF EMPTY ON EMPTY
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1
          , X.C2 + X.C3
          , X.C4
          , 'J'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3 AS 'two'
          , X.C4        AS 'three'
          , 'J'         AS 'four'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3
          , X.C4
          , 'J'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1
          , X.C2 + X.C3 AS 'two'
          , X.C4
          , 'J'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3
          , X.C4        AS 'three'
          , 'J'
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3 AS 'two'
          , X.C4        AS 'three'
          , 'J'         AS 'four'
        RETURNING SEQUENCE BY REF EMPTY ON EMPTY
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3
          , X.C4
          , 'J'
        RETURNING SEQUENCE BY REF EMPTY ON EMPTY
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1
          , X.C2 + X.C3 AS 'two'
          , X.C4
          , 'J'
        RETURNING SEQUENCE BY REF EMPTY ON EMPTY
    )
FROM T1 X
;

SELECT
    XMLQUERY(
        'a string'
        PASSING BY REF
            X.C1        AS 'one'
          , X.C2 + X.C3
          , X.C4        AS 'three'
          , 'J'
        RETURNING SEQUENCE BY REF EMPTY ON EMPTY
    )
FROM T1 X
;



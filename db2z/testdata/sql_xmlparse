CREATE VIEW V1 AS
SELECT A.C1 AS COLUMN1
     , x.X1
     , x.X2
     , DATE(x.X3) AS X3
     , DEC(x.X4, 18, 2) AS X4
     , CASE WHEN x.X5 IS NULL THEN '                                  ' ELSE x.X5 END AS X5
     , x.AAAA
     , DATE(x.BBBB) AS BBBB
     , A.C2 AS COLUMN2
  FROM T1 A
     , XMLTABLE(
           XMLNAMESPACES(default 'urn:iso:std:iso:20022:tech:xsd:abcd.001.002.03')
         , '/Document/qrstuv' PASSING XMLPARSE(DOCUMENT XML_STUFF)
         COLUMNS
             X1   CHAR(034)    PATH 'a/B/c/X1'
           , X2   CHAR(140)    PATH 'A/b/C/d/E/f/X2'
           , X3   VARCHAR(010) PATH 'A/B/C/D/X3'
           , X4   VARCHAR(020) PATH 'a/b/c/d/e/X4'
           , X5   CHAR(034)    PATH 'A/e/I/o/U/X5'
       ) AS x
 WHERE A.C3 = 'DR'
 ;
 
CREATE VIEW V1 AS
SELECT A.C1 AS COLUMN1
     , x.X1
     , x.X2
     , DATE(x.X3) AS X3
     , DEC(x.X4, 18, 2) AS X4
     , CASE WHEN x.X5 IS NULL THEN '                                  ' ELSE x.X5 END AS X5
     , x.AAAA
     , DATE(x.BBBB) AS BBBB
     , A.C2 AS COLUMN2
  FROM T1 A
     , XMLTABLE(
           XMLNAMESPACES(default 'urn:iso:std:iso:20022:tech:xsd:abcd.001.002.03')
         , '/Document/qrstuv' PASSING XMLPARSE(DOCUMENT XML_STUFF STRIP WHITESPACE)
         COLUMNS
             X1   CHAR(034)    PATH 'a/B/c/X1'
           , X2   CHAR(140)    PATH 'A/b/C/d/E/f/X2'
           , X3   VARCHAR(010) PATH 'A/B/C/D/X3'
           , X4   VARCHAR(020) PATH 'a/b/c/d/e/X4'
           , X5   CHAR(034)    PATH 'A/e/I/o/U/X5'
       ) AS x
 WHERE A.C3 = 'DR'
 ;

CREATE VIEW V1 AS
SELECT A.C1 AS COLUMN1
     , x.X1
     , x.X2
     , DATE(x.X3) AS X3
     , DEC(x.X4, 18, 2) AS X4
     , CASE WHEN x.X5 IS NULL THEN '                                  ' ELSE x.X5 END AS X5
     , x.AAAA
     , DATE(x.BBBB) AS BBBB
     , A.C2 AS COLUMN2
  FROM T1 A
     , XMLTABLE(
           XMLNAMESPACES(default 'urn:iso:std:iso:20022:tech:xsd:abcd.001.002.03')
         , '/Document/qrstuv' PASSING XMLPARSE(DOCUMENT XML_STUFF PRESERVE WHITESPACE)
         COLUMNS
             X1   CHAR(034)    PATH 'a/B/c/X1'
           , X2   CHAR(140)    PATH 'A/b/C/d/E/f/X2'
           , X3   VARCHAR(010) PATH 'A/B/C/D/X3'
           , X4   VARCHAR(020) PATH 'a/b/c/d/e/X4'
           , X5   CHAR(034)    PATH 'A/e/I/o/U/X5'
       ) AS x
 WHERE A.C3 = 'DR'
 ;

CREATE VIEW V1 AS
SELECT A.C1 AS COLUMN1
     , x.X1
     , x.X2
     , DATE(x.X3) AS X3
     , DEC(x.X4, 18, 2) AS X4
     , CASE WHEN x.X5 IS NULL THEN '                                  ' ELSE x.X5 END AS X5
     , x.AAAA
     , DATE(x.BBBB) AS BBBB
     , A.C2 AS COLUMN2
  FROM T1 A
     , XMLTABLE(
           XMLNAMESPACES(default 'urn:iso:std:iso:20022:tech:xsd:abcd.001.002.03')
         , '/Document/qrstuv' PASSING XMLPARSE(DOCUMENT :WS-XML-STUFF)
         COLUMNS
             X1   CHAR(034)    PATH 'a/B/c/X1'
           , X2   CHAR(140)    PATH 'A/b/C/d/E/f/X2'
           , X3   VARCHAR(010) PATH 'A/B/C/D/X3'
           , X4   VARCHAR(020) PATH 'a/b/c/d/e/X4'
           , X5   CHAR(034)    PATH 'A/e/I/o/U/X5'
       ) AS x
 WHERE A.C3 = 'DR'
 ;


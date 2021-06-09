--also serves to test XMLNAMESPACES

SELECT S.STAFF# AS "ID",
    XMLSERIALIZE(
        XMLELEMENT(
            NAME "StaffMember"
          , XMLATTRIBUTES(S.FIRST_NAME || ' ' || S.LAST_NAME AS "Name")
          , XMLFOREST(S.HIRE_DATE AS "Hiredate", S.WORK_DEPT AS "Department")
        )
    AS CLOB(100))
AS "Ultimo"
FROM STAFF S
WHERE YEAR(HIRE_DATE) >= '2001'
;

SELECT S.STAFF# AS "ID",
    XMLSERIALIZE(
        XMLELEMENT(
            NAME "StaffMember"
          , XMLATTRIBUTES(S.FIRST_NAME || ' ' || S.LAST_NAME AS "Name")
          , XMLFOREST(
                XMLNAMESPACES(NO DEFAULT)
              , S.HIRE_DATE AS "Hiredate"
              , S.WORK_DEPT AS "Department"
            )
        )
    AS CLOB(100))
AS "Ultimo"
FROM STAFF S
WHERE YEAR(HIRE_DATE) >= '2001'
;

SELECT S.STAFF# AS "ID",
    XMLSERIALIZE(
        XMLELEMENT(
            NAME "StaffMember"
          , XMLATTRIBUTES(S.FIRST_NAME || ' ' || S.LAST_NAME AS "Name")
          , XMLFOREST(
                XMLNAMESPACES(DEFAULT "http://www.example.com")
              , S.HIRE_DATE AS "Hiredate"
              , S.WORK_DEPT AS "Department"
            )
        )
    AS CLOB(100))
AS "Ultimo"
FROM STAFF S
WHERE YEAR(HIRE_DATE) >= '2001'
;

SELECT S.STAFF# AS "ID",
    XMLSERIALIZE(
        XMLELEMENT(
            NAME "StaffMember"
          , XMLATTRIBUTES(S.FIRST_NAME || ' ' || S.LAST_NAME AS "Name")
          , XMLFOREST(
                XMLNAMESPACES(
                    "http://www.example.com/zz9pluralzalpha" AS "example1"
                  , "http://www.example.com/slartibartfast" AS "example2"
                )
              , S.HIRE_DATE AS "Hiredate"
              , S.WORK_DEPT AS "Department"
            )
        )
    AS CLOB(100))
AS "Ultimo"
FROM STAFF S
WHERE YEAR(HIRE_DATE) >= '2001'
;


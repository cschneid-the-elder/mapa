SELECT
    XMLSERIALIZE(
        XMLDOCUMENT(
            XMLELEMENT(
                NAME "Organization"
              , XMLATTRIBUTES ( S.org AS "name" )
              , XMLAGG(
                    XMLELEMENT(NAME "emp", S.lastname) ORDER BY S.lastname
                )
            ) 
        ) AS "org_list"
     AS CLOB(1M))
FROM STAFF S
GROUP BY org;



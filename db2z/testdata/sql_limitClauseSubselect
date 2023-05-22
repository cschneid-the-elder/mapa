UPDATE T1 A SET C1 = CURRENT TIMESTAMP
WHERE  A.C2 = 'no' 
AND    A.C3 != 
       (SELECT B.C3
        FROM  T2 B
        WHERE B.C4 != 'IAH'
        LIMIT 1);

UPDATE T1 A SET C1 = CURRENT TIMESTAMP
WHERE  A.C2 = 'no' 
AND    A.C3 != 
       (SELECT B.C3
        FROM  T2 B
        WHERE B.C4 != 'IAH'
        LIMIT 1 OFFSET 3);

UPDATE T1 A SET C1 = CURRENT TIMESTAMP
WHERE  A.C2 = 'no' 
AND    A.C3 != 
       (SELECT B.C3
        FROM  T2 B
        WHERE B.C4 != 'IAH'
        LIMIT 1,3);


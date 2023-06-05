SET ARAY[NDX] = 4;
SET ARAY[NDX] = 4 * 8;
SET ARAY[NDX] = (SELECT 4 FROM SYSIBM.SYSDUMMY1);
SET A = 4;
SET A.B = 8;
SET A = 4, B = 8;
SET A = NULL, B = DEFAULT;
SET A = (SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1);
SET A = 
    CASE
      WHEN (X = 1) THEN 4
      WHEN (X = 2) THEN 8
      WHEN (X = 3) THEN 15
      WHEN (X = 4) THEN 16
      WHEN (X = 5) THEN 23
      WHEN (X = 6) THEN 42
      ELSE 108
    END
;

SET A = 
    CASE
      WHEN (X = 1) THEN 4
      WHEN (X = 2) THEN 8
      WHEN (X = 3) THEN 15
      WHEN (X = 4) THEN 16
      WHEN (X = 5) THEN 23
      WHEN (X = 6) THEN 42
      ELSE 108
    END CASE
;

SET A =
    CASE
      WHEN ((SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1) = 'IBMUSER') THEN 4
      ELSE 108
    END
;

SET A =
    CASE
      WHEN ('IBMUSER' = (SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1)) THEN 4
      ELSE 108
    END
;

SET A =
    CASE
      WHEN (X = (SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1)) THEN 4
      ELSE 108
    END
;

SET A =
    CASE
      WHEN (T1.X = (SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1)) THEN 4
      WHEN (T1.Y = (SELECT CURRENT_USER FROM SYSIBM.SYSDUMMY1)) THEN 8
      ELSE 108
    END
;

SET T1.A =
    CASE
      WHEN (T1.X = (SELECT MAX(A) FROM T2)) THEN 4
      WHEN (T1.Y = (SELECT MAX(B) FROM T2)) THEN 8
      ELSE 108
    END
;

SET T1.A =
    CASE
      WHEN (T1.X = (SELECT MAX(A) FROM T2 WHERE C = 1)) THEN 4
      WHEN (T1.Y = (SELECT MAX(B) FROM T2 WHERE C = 1)) THEN 8
      ELSE 108
    END
;

SET T1.A =
    CASE
      WHEN (T1.X > (SELECT MAX(A) FROM T2 WHERE C = 1)) THEN '4'
      WHEN (T1.Y < (SELECT MAX(B) FROM T2 WHERE C = 1)) THEN '8'
      ELSE '108'
    END
;

SET T1.A =
    CASE
      WHEN (T1.X > (SELECT MAX(A) FROM T2 WHERE C = 1)) THEN 4
      WHEN (T1.Y < (SELECT MAX(B) FROM T2 WHERE C = 1)) THEN 8
      ELSE 108
    END
;

SET T1.A1 =
    CASE
      WHEN (T1.X > (SELECT MAX(A) FROM T2 WHERE C = 1)) THEN 4
      WHEN (T1.Y < (SELECT MAX(B) FROM T2 WHERE C = 1)) THEN 8
      ELSE 108
    END
;

SET T1.A =
    CASE
      WHEN (T1.X > (SELECT MAX(A) FROM T2 WHERE T1.C = T2.C)) THEN 4
      WHEN (T1.Y < (SELECT MAX(B) FROM T2 WHERE T1.C = T2.C)) THEN 8
      ELSE 108
    END
;

SET T1.A =
    CASE
      WHEN (T1.X > (SELECT MAX(A) FROM T2 WHERE T1.C = T2.C)) THEN 4
      WHEN (T1.Y < (SELECT MAX(B) FROM T2 WHERE T1.C = T2.C)) THEN 8
      WHEN (T1.X > T1.Y) THEN 'C'
      ELSE '?'
    END
;


       SET NEW_T1.C2 =
            CASE
              WHEN (NEW_T1.C1 > (SELECT MAX(C1) FROM T1_ARCHIVE
                                WHERE K1 = NEW_T1.K1
                                  AND DATE(C3) = CURRENT DATE))
              THEN 'A'
              WHEN (NEW_T1.C1 < (SELECT MAX(C1) FROM T1_ARCHIVE
                                WHERE K1 = NEW_T1.K1
                                  AND DATE(C3) = CURRENT DATE))
              THEN 'B'
              WHEN (NEW_T1.C1 > OLD_T1.C1) THEN 'C'
              WHEN (NEW_T1.C1 < OLD_T1.C1) THEN 'D'
              WHEN (NEW_T1.C1 = OLD_T1.C1) THEN 'E'
            END;


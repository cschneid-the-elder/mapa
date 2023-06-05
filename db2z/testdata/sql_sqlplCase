
--#SET TERMINATOR @

CREATE OR REPLACE TRIGGER TRIG001
  BEFORE INSERT ON T1
  REFERENCING NEW AS NEW
  FOR EACH ROW
    P1: BEGIN
      CASE C1
        WHEN 1 THEN SET X = 4;
        WHEN 2 THEN SET X = 8;
        WHEN 3 THEN SET X = 15;
        WHEN 4 THEN SET X = 16;
        WHEN 5 THEN SET X = 23;
        WHEN 6 THEN SET X = 42;
        ELSE        SET X = 108;
      END CASE;
    END
@

CREATE OR REPLACE TRIGGER TRIG001
  BEFORE INSERT ON T1
  REFERENCING NEW AS NEW
  FOR EACH ROW
    P1: BEGIN
      CASE C1
        WHEN 1 THEN SET X = 4;
        WHEN 2 THEN SET X = 8;
        WHEN 3 THEN SET X = 15;
        WHEN 4 THEN SET X = 16;
        WHEN 5 THEN SET X = 23;
        WHEN 6 THEN SET X = 42;
        ELSE        SET X = 108;
      END
      CASE
      ;
    END
@

CREATE OR REPLACE TRIGGER TRIG002
  BEFORE INSERT ON T1
  REFERENCING NEW AS NEW
  FOR EACH ROW
    P1: BEGIN
      CASE C1
        WHEN 1 THEN SET X = 4; SET Y = 44;
        WHEN 2 THEN SET X = 8; SET Y = 88; SET Z = 888;
        WHEN 3 THEN SET X = 15;
        WHEN 4 THEN SET X = 16;
        WHEN 5 THEN SET X = 23;
        WHEN 6 THEN SET X = 42;
        ELSE        SET X = 108;
      END CASE;
    END
@

CREATE OR REPLACE TRIGGER TRIG003
  BEFORE INSERT ON T1
  REFERENCING NEW AS NEW
  FOR EACH ROW
    P1: BEGIN
      P2: CASE
        WHEN NOT C1 IS NULL THEN SET X = 4;
        WHEN C2 BETWEEN CURRENT DATE AND CURRENT DATE - 3 DAYS THEN SET X = 8;
        WHEN EXISTS (SELECT C3 FROM T1 WHERE C4 = CURRENT DATE) THEN SET X = 15;
        ELSE        SET X = 108;
      END CASE;
    END
@

CREATE OR REPLACE TRIGGER TRIG011
  BEFORE INSERT ON T1
  REFERENCING NEW AS NEW
  FOR EACH ROW
  WHEN (NEW.C1 IS NULL OR NEW.C1 > '20:30')
    P1: BEGIN
      CASE
        WHEN (NEW.C1 IS NULL) THEN
          CASE
            WHEN (NEW.C2 IS NULL) THEN
              CASE
                WHEN (NEW.C3 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
                WHEN (NEW.C10 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
              END CASE;
            WHEN (NEW.C11 IS NULL) THEN
              CASE
                WHEN (NEW.C3 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
                WHEN (NEW.C10 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
              END CASE;
          END CASE;
        WHEN (NEW.C12 IS NULL) THEN
          CASE
            WHEN (NEW.C2 IS NULL) THEN
              CASE
                WHEN (NEW.C3 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
                WHEN (NEW.C10 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
              END CASE;
            WHEN (NEW.C11 IS NULL) THEN
              CASE
                WHEN (NEW.C3 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
                WHEN (NEW.C10 IS NULL) THEN
                  CASE
                    WHEN (NEW.C4 IS NULL) THEN
                      CASE
                        WHEN (NEW.C5 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C6 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                    WHEN (NEW.C7 IS NULL) THEN
                      CASE
                        WHEN (NEW.C8 IS NULL) THEN
                          UPDATE T2 SET C1 = 'X' WHERE DATE(C2) = CURRENT DATE;
                        WHEN (NEW.C9 IS NULL) THEN
                          SIGNAL SQLSTATE '86753';
                      END CASE;
                  END CASE;
              END CASE;
          END CASE;
      END CASE;
    END P1
@




--#SET TERMINATOR @

BEGIN
  DECLARE X CHAR(40);
  FOR LOOP_NAME AS
      CURSOR1 CURSOR FOR
   SELECT C1, C2, C3 FROM T1
    DO
      SET X =
          C1 CONCAT ', '
             CONCAT C2
             CONCAT ' '
             CONCAT C3;
      INSERT INTO T2 VALUES ( X );
  END FOR; 
END
@

BEGIN
  DECLARE Y CHAR(40);
  FOR LOOP_NAME AS
      CURSOR1 CURSOR WITH HOLD FOR
   SELECT C1, C2, C3 FROM T1
    DO
      SET Y =
          C1 CONCAT ', '
             CONCAT C2
             CONCAT ' '
             CONCAT C3;
      INSERT INTO T2 VALUES ( Y );
  END FOR; 
END
@

BEGIN
  DECLARE Y CHAR(40);
  FOR LOOP_NAME AS
      CURSOR1 CURSOR WITHOUT HOLD FOR
   SELECT C1, C2, C3 FROM T1
    DO
      SET Y =
          C1 CONCAT ', '
             CONCAT C2
             CONCAT ' '
             CONCAT C3;
      INSERT INTO T2 VALUES ( Y );
  END FOR; 
END
@

BEGIN
  DECLARE Z CHAR(40);
  FOR1: FOR LOOP_NAME AS
      CURSOR1 CURSOR FOR
   SELECT C1, C2, C3 FROM T1
    DO
      SET Z =
          C1 CONCAT ', '
             CONCAT C2
             CONCAT ' '
             CONCAT C3;
      INSERT INTO T2 VALUES ( Z );
  END FOR FOR1;
END
@



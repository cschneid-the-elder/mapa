## DB2 on IBM Z SQL Grammar

This is a partial grammar for DB2 on IBM Z SQL.  It does not include SQL/PL.

My intent is to provide enough support for embedded SQL to add to the COBOL analysis elsewhere in this repository the ability to extract DB2 table actions.

Initially my intent was to provide more robust parsing of SQL to detect CALLs, but sometimes these things get out of hand.

Currently (16-May-2021) a work in progress.  INSERT, UPDATE, DELETE, SELECT, DECLARE CURSOR, and a few other statements are supported.



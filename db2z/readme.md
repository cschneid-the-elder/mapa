## DB2 on IBM Z SQL Grammar

This is a partial grammar for DB2 on IBM Z SQL.  It does not include SQL/PL.

My intent is to provide enough support for embedded SQL to add to the COBOL analysis elsewhere in this repository the ability to extract DB2 table actions.

Initially my intent was to provide more robust parsing of SQL to detect CALLs, but sometimes these things get out of hand.

Currently (07-Jan-2023) a work in progress.  I believe all the embeddable statements are defined and there are tests for all of them.  Martijn Rutte and Maarten van Haasteren have been instrumental in tracking down a number of bugs.  Some toleration for SQL/PL in the ALTER and CREATE PROCEDURE and FUNCTION DDL statements has been added.

There is a left-recursion problem in the tableReference rule with respect to the joinedTable rule.  So this probably won't do arbitrarily complex SQL.

IBM's documentation for version 12 of Db2 for z/OS served as original source material.  This should be up to date with Db2 13 documentation dated 2022-05-26.

This was built on Ubuntu 20.04 LTS with ANTLR 4.9.2 and openjdk version "11.0.15 2022-04-19".



## DB2 on IBM Z SQL Grammar

This is a partial grammar for DB2 on IBM Z SQL.  It does not include SQL/PL.

My intent is to provide enough support for embedded SQL to add to the COBOL analysis elsewhere in this repository the ability to extract DB2 table actions.

Initially my intent was to provide more robust parsing of SQL to detect CALLs, but sometimes these things get out of hand.

Currently (05-Jun-2021) a work in progress.  I believe all the embeddable statements are defined and there are tests for all of them.

There is a left-recursion problem in the tableReference rule with respect to the joinedTable rule.  So this probably won't do arbitrarily complex SQL.

IBM's documentation for version 12 of Db2 for z/OS serves as source material.

This was built on ubuntu 16.04 LTS with ANTLR 4.9.2 and openjdk version "1.8.0_252".



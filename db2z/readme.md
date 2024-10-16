## DB2 on IBM Z SQL Grammar

This is a grammar for DB2 on IBM Z SQL.

Initially my intent was to provide more robust parsing of SQL to detect CALLs, but sometimes these things get out of hand.  The project grew to provide enough support for embedded SQL to add to the COBOL analysis elsewhere in this repository the ability to extract DB2 table actions.  And then I added support for SQL/PL.

Currently (12-May-2024) a work in progress.  I believe all the embeddable statements are defined and there are tests for all of them.  Martijn Rutte and Maarten van Haasteren have been instrumental in tracking down a number of bugs and have contributed code to this project.

There is a mutual left-recursion problem in the tableReference rule with respect to the joinedTable rule.  So this probably won't do arbitrarily complex SQL but it seems to do pretty complex SQL.

IBM's documentation for version 12 of Db2 for z/OS served as original source material.  This should be up to date with Db2 13 documentation dated 2024-04-30.  I do check back with the IBM documentation every three to six months looking for anything new that I should add to the grammars.

This was built on Ubuntu 22.04 LTS with ANTLR 4.13.2 and openjdk version "11.0.24 2024-07-16".



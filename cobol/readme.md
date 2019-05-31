## COBOL Call Tree Analysis

Syntax: `java -jar CallTree.jar -help`

You can download the jar files and execute the above command to get the syntax to run.

Originally I planned to store the list of called modules in a DBMS, but there isn't anything that's both portable and embeddable.  Apache Derby, my first choice, must be installed.  SQLite has different versions for different platforms, but you need the right one.  It's all kind of disappointing.

So you can record the called modules in a tab-delimited flat file and load them into your DBMS of choice.

My recommendation would be to copy your code to z/Unix directories whose names mirror your PDS(E)s where you store your source.  I guess that presumes that the ANTLR runtime code executes on z/OS, which I'm not in a position to check right now.

Things that aren't supported...

 + `BASIS` statement.
 + `COPY REPLACING` and `REPLACE` statements that abuse their authority.  Take a look in SM206A and SM208A in testdata/nist for examples.
 + Free format source.  I presume you're using the classic 80-column layout, with columns 1 - 6 reserved for line numbers, columns 73 - 80 reserved for line numbers, and conforming to the Area A and Area B requirements.
 + Conditional compilation statements.  At least, not yet.



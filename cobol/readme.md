## COBOL Call Tree Analysis

This is not intended to be a validating parser, but an analyzing parser; feed it valid COBOL and it will create a file of "callers" and "callees" to enable you to learn things of interest.

My intent is to provide a mechanism for people to analyze COBOL code and record pertinent facts in some persistent store.

Currently (04-Jul-2020) a work in progress.  Parsing COBOL to extract various sorts of "calls"  seems to be working.  Generating a TSV (which may become a CSV, I'm still thinking) to be loaded into a persistent store seems to be working.

"Seems to be working" means that I've run through some COBOL I've written specifically with an eye towards tripping up my own logic, along with much (but not all) of the NIST COBOL test suite.

"Work in progress" means I'm adding to this as it suits me.  It's a hobby, not intended to ever be finished.

### How To Run

Download the .jar files.

    usage: CallTree [-copy <arg>] [-copyList <arg>] [-file <arg>] [-fileList
           <arg>] [-help] [-logLevel <arg>] [-out <arg>] [-saveTemp]
           [-unitTest]
     -copy <arg>       name of a single path in which to locate copybooks,
                       takes precedence over the copyList option
     -copyList <arg>   name of a file containing a list of paths in which to
                       locate copybooks
     -file <arg>       name of a single file to process, takes precedence over
                       the fileList option
     -fileList <arg>   name of a file containing a list of files to process
     -help             print this message
     -logLevel <arg>   logging level for this run {SEVERE, WARNING, INFO,
                       CONFIG, FINE, FINER, FINEST}
     -out <arg>        name of a file in which to store the CALLs, EXEC CICS
                       LINKs, EXEC CICS XCTLs, and EXEC SQL CALLs
     -saveTemp         save temporary files, used to test lexer, parser,
                       listeners, et. al
     -unitTest         used to test lexer, parser, listeners, et. al

So, you might execute...

    java -jar CallTree.jar -copy /home/cschneid/cblcpy -file /home/cschneid/cblsrc/J8675309 -out J8675309.tsv

...after downloading COBOL program J8675309 to /home/cschneid/cblsrc and any copybooks needed by J8675309 to /home/cschneid/cblcpy.

More generically, I would suggest...

 + Create directories corresponding to each of your libraries containing COBOL source code
 + Download the contents of each library into their respective directory 
 + Create a file list (to use with the `-fileList` option) containing the names of the files in each of your COBOL source code directories, maybe call it myList
 + Create a list of copybook directories (to use with the `-copyList` option) where each line is a directory name containing copybook members you have downloaded.  Maybe call this file myLibs.
 + Execute `java -jar CallTree.jar -fileList myList -copyList myLibs -out myOutput.tsv`

### Bear In Mind

This application will create several temporary files for each COBOL member you parse.  Unless you specify the `-saveTemp` option, and it's just there for debugging purposes, these files will be deleted automatically on normal termination of the JVM.  These files will, however, persist for the length of the run, and there are several created for each piece of source code, so make sure you're not short of space for temporary files.

A log file will be created in the current directory with messages about the current run.  If you use the `-logLevel` option, it applies to these messages.  The log messages output to the screen are at the INFO level or above.

### Build/Execution Environment

This was built on ubuntu 16.04 LTS with ANTLR 4.7.2, openjdk version "1.8.0_252", and Apache Commons CLI 1.4.  I have no idea if this will run on any other OS.  Java is supposed to be extremely portable, give it a try.

### What This Won't Do

 + `BASIS` statement.
 + `COPY REPLACING` and `REPLACE` statements that piss me off.  Take a look in SM206A and SM208A in testdata/nist for examples.
 + Free format source.  I presume you're using the classic 80-column layout, with columns 1 - 6 reserved for line numbers, columns 73 - 80 reserved for line numbers, and conforming to the Area A and Area B requirements.
 + Conditional compilation statements.  At least, not yet.
 + Some of the more recent XML and JSON notation.  At least, not yet.



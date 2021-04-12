## COBOL Call Tree Analysis

This is not intended to be a validating parser, but an analyzing parser; feed it valid COBOL and it will create a file of "callers" and "callees" to enable you to learn things of possible interest.

My intent is to provide a mechanism for people to analyze COBOL code and record pertinent facts in some persistent store.

Currently (12-Apr-2021) a work in progress.  Parsing COBOL to extract various sorts of "calls"  seems to be working.  Generating a CSV to be loaded into a persistent store seems to be working.

"Seems to be working" means that I've run through some COBOL I've written specifically with an eye towards tripping up my own logic, along with all but one of the NIST COBOL test suite.

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
     -defList <arg>    name of a file containing a list of >>DEFINE statements
                       for conditional compilation variables and their values
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

Depending on your build environment, you may want to construct several file lists for your source and copybooks, corresponding to your concatenations.

Note that the content of the file specified with the -defList option must contain `>>DEFINE` statements beginning in area A or area B.

### Bear In Mind

This application will create several temporary files for each COBOL member you parse.  Unless you specify the `-saveTemp` option, and it's just there for debugging purposes, these files will be deleted automatically on normal termination of the JVM.  These files will, however, persist for the length of the run, and there are several created for each piece of source code, so make sure you're not short of space for temporary files.

A log file will be created in the current directory with messages about the current run.  If you use the `-logLevel` option, it applies to these messages.  The log messages output to the screen are at the INFO level or above.

### Output File Format

The file indicated by the `-out` option is a comma separated value (CSV) file containing the "library", caller name, type of call, and called module name.  "Library" in this context is the last node of the path to the file, which I would hope has been named for the library from which the members have been downloaded.

Please note that the type of call may be CALLBYIDENTIFIER which may be a static call or a dynamic call depending on your compile options.

### Build/Execution Environment

This was built on ubuntu 16.04 LTS with ANTLR 4.7.2, openjdk version "1.8.0_252", and Apache Commons CLI 1.4.  I have no idea if this will run on any other OS.  Java is supposed to be extremely portable, give it a try.

### Why This Is Complicated

Consider a program...

       Identification Division.
       Program-ID. MOYA.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(008) VALUE 'MOYA'.

       COPY TALYN.

       Procedure Division.
           CALL PGM-0001
           GOBACK.

...where there exists _more than one_ copybook named TALYN, residing in different libraries, containing different VALUE clauses for a variable named `PGM-0001`.  At compile time, the copybook is resolved according to the compiler invocation.

So now what?  Well, my intention is for _you_ to deal with this by naming the directories containing your source and copybooks as the libraries from whence their contents were downloaded, and assemble your source and copybook file lists accordingly.  Separate runs with these lists _should_ give you the same results as your compile invocation.

Worse, of course, is that in a dynamic call environment, which modules you invoke are controlled by your runtime environment.  Static code analysis, which is what this all is, cannot help you with that.

### What This Won't Do

 + `BASIS` statement.
 + `REPLACE` statements that piss me off.  Specifically SM208A in testdata/nist.
 + The `COPYLOC` compile option and the `OF` and `IN` parameters of the `COPY` compiler directive are not consulted when copybooks are resolved.
 + Free format source.  I presume you're using the classic 80-column layout, with columns 1 - 6 reserved for line numbers, columns 73 - 80 reserved for line numbers, and conforming to the Area A and Area B requirements.



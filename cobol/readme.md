## COBOL Call Tree Analysis

This is not intended to be a validating parser, but an analyzing parser; feed it valid COBOL and it will create a file of "callers" and "callees" and various other bits of data about your source code to enable you to learn things of possible interest.

My intent is to provide a mechanism for people to analyze COBOL code and record pertinent facts in some persistent store.

Currently (10-Feb-2023) a work in progress.  Parsing COBOL to extract various sorts of "calls" and other information of possible interest seems to be working.  Generating a CSV to be loaded into a persistent store seems to be working.

"Seems to be working" means that I've run through some COBOL I've written specifically with an eye towards tripping up my own logic, along with the NIST COBOL test suite albeit with some manual alterations as some of their source is not intended to be processed without preprocessing by other parts of the suite.

"Work in progress" means I'm adding to this as it suits me.  It's a hobby, not intended to ever be finished.  But you might find it useful.

### How To Run

Download the .jar files.  If you have provenance issues feel free to obtain the ANTLR jar from https://www.antlr.org and the commons-cli jar from https://commons.apache.org/proper/commons-cli/. 

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
     -profile          profile ANTLR grammar
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
 + Execute `java -jar CallTree.jar -fileList myList -copyList myLibs -out myOutput.csv`

Depending on your build environment, you may want to construct several file lists for your source and copybooks, corresponding to your concatenations.

Note that the content of the file specified with the -defList option must contain `>>DEFINE` statements beginning in area A or area B.

### Bear In Mind

This application will create several temporary files for each COBOL member you parse.  Unless you specify the `-saveTemp` option, and it's just there for debugging purposes, these files will be deleted automatically on normal termination of the JVM.  These files will, however, persist for the length of the run, and there are several created for each piece of source code, so make sure you're not short of space for temporary files.

A log file will be created in the current directory with messages about the current run.  If you use the `-logLevel` option, it applies to these messages.  The log messages output to the screen are at the INFO level or above.

I don't have a mainframe, so there are compiler behaviors I cannot observe directly.  I've recently added support for what I believe to be the behavior of the BASIS statement and its attendant INSERT and DELETE statements, but as these are IBM extensions I cannot be certain the behavior I've coded is the moral equivalent of what IBM provides.

This is free software, developed by an old man trying to keep busy.  There are no doubt edge cases not handled correctly, and static code analysis is never going to provide a definitive answer.  But we try.

### Output File Format

The file indicated by the `-out` option is a comma separated value (CSV) file containing identifiers for which type of data is on a given line, followed by pertinent data including surrogate keys (UUIDs) to tie a file to a program, a program to its CALLs and DDNames, and so on.

More generically...

| Type | Fields|
| --- | --- |
| FILE | UUID, file being processed, date / time stamp |
| COPY | UUID, file UUID, copybook name |
| BASIS | UUID, file UUID, basis file name |
| PGM | UUID, file UUID, program name, statement count, conditional statement count, cics statement count, sql statement count, sqlims statement count, data description entry type 1 count, data description entry type 2 count, data description entry type 3 count, data description entry type sql count |
| FUNCTION | UUID, file UUID, program name, statement count, conditional statement count, cics statement count, sql statement count, sqlims statement count, data description entry type 1 count, data description entry type 2 count, data description entry type 3 count, data description entry type sql count |
| CLASS | UUID, file UUID, program name, statement count, conditional statement count, cics statement count, sql statement count, sqlims statement count, data description entry type 1 count, data description entry type 2 count, data description entry type 3 count, data description entry type sql count |
| CALL | UUID, program UUID, calling program name, call type (see below), called program name |
| UNRESOLVEDCALL | UUID, program UUID, calling program name, call type (see below), cobol identifier that could not be resolved |
| DD | UUID, program UUID, ddname (see below), cobol file name, open input count, open output count, open i-o count, open extend count |
| DB2TABLE | UUID, program UUID, table name, type of SQL statement |
| SQLINCLUDE | UUID, program UUID, included member name |
| CICSSTARTTRANSID | UUID, program UUID, transaction being started |
| CICSRUNTRANSID | UUID, program UUID, transaction being run asynchronously |
| CICSREAD | UUID, program UUID, file being read |
| CICSDELETE | UUID, program UUID, file whose record(s) are being deleted |
| CICSWRITE | UUID, program UUID, file whose record is being written |
| CICSREWRITE | UUID, program UUID, file whose record is being rewritten |
| CICSSTARTBR | UUID, program UUID, file against which a browse is being started |
| CICSREADNEXT | UUID, program UUID, file being read |
| CICSREADPREV | UUID, program UUID, file being read |

Call types may be CALLBYLITERAL, CALLBYIDENTIFIER, CICSLINKBYLITERAL, CICSLINKBYIDENTIFIER, CICSXCTLBYLITERAL, CICSXCTLBYIDENTIFIER, SQLCALLBYLITERAL, SQLCALLBYIDENTIFIER.  Please note that CALLBYLITERAL may be a static call or a dynamic call depending on your compile options.

The ddname is my mainframe bias showing.  The assignment name in the various flavors of IBM COBOL consists of an optional label followed by a hyphen followed by an optional organization field followed by a hyphen followed by a name.  So everything except the name is optional.  The name usually translates to a DDName in the JCL, except when it translates to an environment variable.

The PGM record contains counts of things that might be interesting and were easy to obtain.  Data description entry type 2 is a level-66 entry, type 3 is a level-88 entry, and type 1 is everything else that isn't enclosed in and `EXEC SQL END-EXEC` block.

The DD record contains counts of how the file is opened.  This might be useful in showing program inputs and outputs, or discovering files that are no longer used.

### Build/Execution Environment

This was built on ubuntu 20.04 LTS with ANTLR 4.11.1, openjdk version "11.0.14.1", and Apache Commons CLI 1.4.  I have no idea if this will run on any other OS.  Java is supposed to be extremely portable, give it a try.

The GNU toolchain is used for building.  If you want to build from scratch, i.e. a repository cloned with git, there are some instructions at the top of the Makefile.

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

Even worse, and why simply doing scans of your source code may be unrevealing, consider a program...

       Identification Division.
       Program-ID. CRAIS.
       Data Division.
       Working-Storage Section.

       01                                                              C
      -                                                                O
      -                                                                N
      -                                                                S
      -                                                                T
      -                                                                A
      -                                                                N
      -                                                                T
      -                                                               S.
           05                                                          P
      -                                                                G
      -                                                                M
                                                                       P
      -                                                                I
      -                                                                C
                                                                       X
      -                                                                (
      -                                                                8
      -                                                                )
                                                                       V
      -                                                                A
      -                                                                L
      -                                                                U
      -                                                                E
                                                                      'B
      -                                                               'R
      -                                                               'A
      -                                                               'C
      -                                                              'A'
           .
       Procedure Division.
                                                                       C
      -                                                                A
      -                                                                L
      -                                                                L
                                                                       P
      -                                                                G
      -                                                                M
                                                                       G
      -                                                                O
      -                                                                B
      -                                                                A
      -                                                                C
      -                                                                K
           .

...which is syntactically correct.

### What This Won't Do

 + The `COPYLOC` compile option and the `OF` and `IN` parameters of the `COPY` compiler directive are not consulted when copybooks are resolved.
 + Free format source.  I presume you're using the classic 80-column layout, with columns 1 - 6 reserved for line numbers, columns 73 - 80 reserved for line numbers, and conforming to the Area A and Area B requirements.

### Up To Date

This should be current with the changes IBM published in their Enterprise COBOL 6.4 documentation dated 2022-05-27 and the ISO COBOL 202x draft standard N=1207 document dated 2020-11-23.


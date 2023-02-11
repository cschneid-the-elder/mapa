## JCL Parser

This is not intended to be a validating parser, but an analyzing parser; feed it valid JCL and it will allow you to examine its various bits to learn things of interest.

My intent is to provide a mechanism for people to analyze JCL and record pertinent facts in some persistent store.

Currently (10-Feb-2023) a work in progress.  Demonstration application using the generated parser seems to be working.  Generating a CSV to be loaded into a persistent store seems to be working.  Generating a "tree" view (TSV) suitable for loading into LibreOffice Calc seems to be working.

"Seems to be working" means that I've run through some JCL I've written specifically with an eye towards tripping up my own logic, along with JCL supplied with the Hercules emulator in its SYS1.PROCLIB and SYS2.PROCLIB libraries.

"Work in progress" means I'm adding to this as it suits me.  It's a hobby, not intended to ever be finished.

The demonstration application is just that, an attempt to demonstrate that the grammars can be used to do something useful.

Grammars for the `AMP DD` statement parm, TSO commands, and the DSN command processor are now included.

### How To Run

Download the .jar files.  If you have provenance issues feel free to obtain the ANTLR jar from https://www.antlr.org and the commons-cli jar from https://commons.apache.org/proper/commons-cli/. 

    usage: Demo01 [-cntlList <arg>] [-file <arg>] [-fileList <arg>] [-help]
           [-include <arg>] [-includeList <arg>] [-logLevel <arg>] [-outcsv
           <arg>] [-outtree <arg>] [-sanity <arg>] [-saveTemp] [-set <arg>]
           [-setList <arg>] [-unitTest]
     -cntlList <arg>      name of a comma-delimited file containing a list of
                          paths in which to locate control statement members
                          and the PDS(E)s to which they correspond
     -file <arg>          name of a single file to process, takes precedence
                          over the fileList option
     -fileList <arg>      name of a file containing a list of files to process
     -help                print this message
     -include <arg>       name of a single path in which to locate cataloged
                          procs and JCL INCLUDEs, takes precedence over the
                          includeList option
     -includeList <arg>   name of a comma-delimited file containing a list of
                          paths in which to locate cataloged procs and JCL
                          INCLUDEs and the PDS(E)s to which they correspond
     -logLevel <arg>      logging level for this run {SEVERE, WARNING, INFO,
                          CONFIG, FINE, FINER, FINEST}
     -outcsv <arg>        name of a file in which to store the gathered
                          information in csv format
     -outtree <arg>       name of a file in which to store the gathered
                          information in "tree" format
     -sanity <arg>        used to limit the number of iterations when
                          resolving INCLUDEs {default = 20}
     -saveTemp            save temporary files, used to test lexer, parser,
                          listeners, et. al
     -set <arg>           symbol=value to be used in resolving symbolics (ex:
                          SYSUID=IBMUSER)
     -setList <arg>       name of a file containing symbol=value pairs (one
                          per line) to be used in resolving symbolics (ex:
                          SYSUID=IBMUSER)
     -unitTest            used to test lexer, parser, listeners, et. al

So, you might execute...

    java -jar JCLParser.jar -fileList sys1.proclib.lst -include /home/cschneid/SYS1.PROCLIB -set SYSUID=CSCHNEID -outtree sys1.proclib.tsv -outcsv sys1.proclib.csv

...after downloading the contents of SYS1.PROCLIB to the directory /home/cschneid/SYS1.PROCLIB.

More generically, I would suggest...

 + Create directories corresponding to each of your libraries containing cataloged procedures, INCLUDEs, SYSTSIN control statements, and execution JCL
 + Download the contents of each library into their respective directory 
 + Create a file list (to use with the `-fileList` option) containing the names of the files in each of your execution JCL directories, maybe call it myList
 + Create a list of cataloged procedure and INCLUDE libraries and their corresponding directories (to use with the `-includeList` option) where each line is a library name followed by a comma followed by its corresponding directory - this will be used in resolving cataloged procedures and INCLUDEs by mapping the libraries on a job's JCLLIB statement to a directory.  You can also include directories corresponding to libraries in the JES PROCxx concatenation by not coding a comma or a library name on that line.  Maybe call this file myLibs.
 + Create a list of control statement libraries used in SYSTSIN DDs and their corresponding directories ( to use with the `-cntlList` option) where each line is a library name followed by a comma followed by its corresponding directory - this will be used in resolving SYSTSIN input.  Maybe call this file cntlList1.
 + Execute `java -jar JCLParser.jar -fileList myList -includeList myLibs -cntlList cntlList1 -outtree myOutput.tsv -outcsv myOutput.csv`

### Bear In Mind

The Demo01 application will create several temporary files for each JCL member you parse.  Unless you specify the `-saveTemp` option, and it's just there for debugging purposes, these files will be deleted automatically on normal termination of the JVM.  These files will, however, persist for the length of the run, and there are several created for each piece of execution JCL and procedure, so make sure you're not short of space for temporary files.

A log file will be created in the current directory with messages about the current run.  If you use the `-logLevel` option, it applies to these messages.  The log messages output to the screen are at the INFO level or above.

Warnings will be logged for PROCs and INCLUDEs that cannot be located.  This may be okay for your purposes, I'm not here to judge, but you may also get a warning indicating a sanity check has failed meaning the demo application tried as hard as it could to resolve something and failed.

### Output File Formats From The Demo

The outtree file is formatted with tab characters to give, once imported into LibreOffice Calc or similar, a tree view of steps executing programs or procedures and the steps in those procedures which may execute other procedures.

The outcsv file has identifiers for which type of data is on a given line, followed by pertinent data including surrogate keys (UUIDs) to tie a file to a job or jobs, a job to its steps, a step to its DD statements, a step to a PROC it may execute, a PROC to its steps, and so on.

More generically...

| Type | Fields|
| --- | --- |
| FILE | file being processed, date / time stamp, UUID |
| JOB | job name, ordinal number of job in file, file UUID, job UUID |
| PROC | proc name, file UUID, proc UUID |
| STEP | step name, ordinal number of step in job or proc, job or proc UUID, step UUID, PGM or PROC, what is being executed |
| DD | ddname, step UUID, dd statement UUID, concatenation number within ddname, file type (Z = z/OS, O = SYSOUT, U = Unix, N = DD *), file or DSN, disp status, disp normal termination disposition, disp abnormal termination disposition |
| TSOCALL | step UUID, TSO CALL statement UUID, program being executed |
| DSNRUN | step UUID, DSN RUN statement UUID, program being executed, DB2 plan for program being executed |
| AMP | dd statement UUID, AMP subparameter UUID, AMP subparameter, AMP subparameter value |

### Build/Execution Environment

This was built on ubuntu 20.04 LTS with ANTLR 4.11.1, openjdk 11.0.13 2021-10-19, and Apache Commons CLI 1.4.  I have no idea if this will run on any other OS.  Java is supposed to be extremely portable, give it a try.

### I Am Not A Java Person

Much of my career was spent doing mainframe development and developer support.  If the Java looks odd, well I last used Java 1.2 for development.  If the ANTLR grammar looks odd, I'm not a compiler person nor am I an ANTLR person; I've never created a grammar before and JCL is _weird_ even to those of us who spent many years coding in it.

### Why This Is Complicated

Consider a job...

    //PLURALZA JOB NOTIFY=&SYSUID
    //*
    // JCLLIB ORDER=(LIB1,LIB2)
    //*
    //PROC1    PROC ENV=P
    //*
    //PS01     EXEC PGM=BILLING&TYPE
    //STEPLIB  INCLUDE MEMBER=EXLIB&ENV
    //INPUT01  DD  DISP=SHR,DSN=&ENV.BILLING&TYPE..INPUT
    //OUTPUT01 DD  DISP=(,CATLG),
    //             DSN=&ENV.BILLING&TYPE..OUTPUT,
    //             LRECL=80,
    //             AVGREC=K,
    //             RECFM=FB,
    //             SPACE=(80,(1,1),RLSE)
    //*
    //         PEND
    //*
    //JS01     EXEC PROC=PROC1,ENV=S,TYPE=01
    //*
    //JS02     EXEC PROC=PROC1,ENV=Q,TYPE=01
    //*
    //JS03     EXEC PROC=PROC2,PROCNB=1
    //*

...where EXLIBS contains...

    //STEPLIB  DD  DISP=SHR,DSN=S.LOADLIB
    //         INCLUDE MEMBER=EEXLIBQ

...and EEXLIBQ contains...

    //STEPLIB  DD  DISP=SHR,DSN=Q.LOADLIB
    //         INCLUDE MEMBER=EEXLIBP

...and EEXLIBP contains...

    //         DD  DISP=SHR,DSN=P.LOADLIB

...and PROC2 contains...

    //AEIOU    PROC
    //*
    // SET TYPE=01
    //*
    //PS01     EXEC PROC=PROC&PROCNB
    //*

This is a relatively simple example.  Now consider...

    //PARAMS JOB
    //*
    // SET A=A,B=B,C=C,D=D,E=E,F=F,G=G,H=H,I=I
    // SET K=K,L=L,M=M,N=N,O=O,P=P,R=R,S=S,T=T,W=W,Z=Z
    // SET D1='DISP=SHR,DSN=CSCHNEID.INPUT01'
    // SET D2='DISP=(,CATLG',D3='),DSN=CSCHNEID.OUTPUT01'
    //*
    //PS01    EXEC PGM=IEFBR14
    //DD01    DD  &D&I&S&P=(&N&E&W,&C&A&T&L&G,&D&E&L&E&T&E),
    //            &D&S&N=&H&E&R&C.03.&T&E&S&T.0005.&D&D.01,
    //            &D&C&B=(&R&E&C&F&M=&F&B,&L&R&E&C&L=80,
    //            &B&L&K&S&I&Z&E=27840),
    //            &S&P&A&C&E=(80,(100,100),&R&L&S&E)
    //DD02    DD  &D1
    //DD03    DD  &D2&D3
    //DD04    DD  &D.I&S.P=&O.L&D,D&S.N=&SYSUID..&T.E&S.T.D&D.04
    //*

...which no one should ever do, but which is syntactically legal.

### What This Won't Do

JES3 control statements.  Probably some elderly syntax that is no longer documented, like the `SEP` parameter of the `DD` statement except I sussed that one.


## JCL Parser

This is not intended to be a validating parser, but an analyzing parser; feed it valid JCL and it will allow you to examine its various bits to learn things of interest.

My intent is to provide a mechanism for people to analyze JCL and record pertinent facts in some persistent store.

Currently (23-Apr-2020) a work in progress.  Demonstration application using the generated parser seems to be working.  Generating a CSV to be loaded into a persistent store seems to be working.  Generating a "tree" view (TSV) suitable for loading into LibreOffice Calc seems to be working.

"Seems to be working" means that I've run through some JCL I've written specifically with an eye towards tripping up my own logic, along with JCL supplied with the Hercules emulator in its SYS1.PROCLIB and SYS2.PROCLIB libraries.

"Work in progress" means I've got more than a bit of cleanup to do along with documentation.

The demonstration application is just that, an attempt to demonstrate that the grammar can be used to do something useful.

### How To Run

Download the .jar files.

    usage: Demo01 [-file <arg>] [-fileList <arg>] [-help] [-include <arg>]
           [-includeList <arg>] [-logLevel <arg>] [-outcsv <arg>] [-outtree
           <arg>] [-sanity <arg>] [-saveTemp] [-set <arg>] [-setList <arg>]
           [-unitTest]
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

...after downloading the contents of SYS1.PROCLIB to some directory and running them through the src/rmvLnNb awk script, and storing the output in directory /home/cschneid/SYS1.PROCLIB.

### Build/Execution Environment

This was built on ubuntu 16.04 LTS with ANTLR 4.7.2, openjdk version "1.8.0_252", and Apache Commons CLI 1.4.  I have no idea if this will run on any other OS.  Java is supposed to be extremely portable, give it a try.

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
    //PS01     EXEC PROC=PROC&PROCNB
    //*

This is a relatively simple example.

### What This Won't Do

Currently unsupported is the exerable JCL construct...

    //JS0103   EXEC PGM=IEFBR14,PARM='&X' THIS-INLINE-COMMENT-IS-CONTINUED X
    // ON THE NEXT LINE VIA THE 'X' IN COLUMN 72.  IN FACT, THIS CAN       X
    // CONTINUE OVER MULTIPLE LINES.  I AM SHOCKED AND APPALLED.

... which I'm simply declaring should be dealt with via normal JCL comment notation, and the obsolete...

    //SYSUT3  DD  DSNAME=&&SYSUT3,UNIT=SYSDA,SPACE=(80,(250,250)),         *00000500
    //             DCB=BLKSIZE=80                                           00000600

...as those line numbers in columns 73 through 80 haven't served a useful purpose since we all stopped using punched cards circa Y2K, and the continuation symbol in column 72 is just more trouble than it's worth.  The src/rmvLnNb awk script will get rid of these.


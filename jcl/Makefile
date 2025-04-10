# Copyright (C) 2021 - 2025 Craig Schneiderwent.
# Portions copyright (C) 2023 - 2024 Maarten van Haasteren.
# All rights reserved.

#
# Makefile for JCL parser which includes several ANTLR grammars and
# attendant Java code for a demonstration application.
#
# if making from scratch, then...
#
# make clean
# make all
#
# The list of available options:
#
# make all        - generate lexer/parser code and compile all java code and create a jar file comprising all class files
# make clean      - delete all generated code 
# make javadoc    - generate javadoc
# make test       - run tests ensuring JCL lexing/parsing seems to work
# make testpp     - run tests ensuring JCL preprocessor lexing/parsing seems to work
# make testtso    - run tests ensuring TSO command lexing/parsing seems to work
# make testamp    - run tests ensuring AMP parm lexing/parsing seems to work
# make testdemo   - run tests ensuring demo app seems to work
# make testrig    - run ANTLR test rig with JCL lexer/parser
# make testrigpp  - run ANTLR test rig with JCL preprocessor lexer/parser
# make testrigtso - run ANTLR test rig with TSO command lexer/parser
# make testrigdsn - run ANTLR test rig with DSN command lexer/parser
# make testrigamp - run ANTLR test rig with AMP parm lexer/parser
# make testsys1   - run tests against downloaded SYS1.PROCLIB - probably only works on my machine
# make testsys2   - run tests against downloaded SYS2.PROCLIB - probably only works on my machine

all: 
	echo `date` $@ >>build.log
	# uses Maven to compile Java and ANTLR grammar in the new package and creates .jar files in the ./target/ directory
	mvn -DperformRelease=true clean install
	# copies executable jar-with-dependencies to the root directory for the Makefile tests
	cp ./target/jcl-parser-*-with-dependencies.jar ./JCLParserCLI.jar
	# Now you can run tests that specified in the Makefile
	# For example:
	# make test
	# make testdemo
	# make testrig n=0002

.PHONY: all clean testrig test testpp testrigpp testdemo ziplogs javadoc lint

clean:
	echo `date` $@ >> build.log
	mvn clean

test:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	./src/tester all x
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) x
endif

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp ./JCLParserCLI.jar org.antlr.v4.gui.TestRig cschneid.mapa.jcl.JCL startRule -gui -tokens < ./testdata/test$(n).jcl

testpp:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	./src/tester all pp
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) pp
endif

testrigpp:
	echo `date` $@ $(n) >> build.log
	java -cp ./JCLParserCLI.jar org.antlr.v4.gui.TestRig cschneid.mapa.jcl.JCLPP startRule -gui -tokens < ./testdata/test$(n).jcl

testrigtso:
	echo `date` $@ $(n) >> build.log
	java -cp ./JCLParserCLI.jar org.antlr.v4.gui.TestRig cschneid.mapa.jcl.TSO startRule -gui -tokens < ./testdata/test$(n).tso

testrigdsn:
	echo `date` $@ $(n) >> build.log
	java -cp ./JCLParserCLI.jar org.antlr.v4.gui.TestRig cschneid.mapa.jcl.DSNTSO startRule -gui -tokens < ./testdata/test$(n).dsn

testrigamp:
	echo `date` $@ $(n) >> build.log
	java -cp ./JCLParserCLI.jar org.antlr.v4.gui.TestRig cschneid.mapa.jcl.JCLDDAMP startRule -gui -tokens < ./testdata/test$(n).amp

testtso:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	./src/tester all tso
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) tso
endif

testamp:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	./src/tester all amp
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) amp
endif

testdemo:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
#	java -jar JCLParserCLI.jar -fileList testdata.lst -include testdata -set SYSUID=CSCHNEID -outtree testdata.tsv -outcsv testdata.csv -cntlList cntlList1
	./src/tester "*" demo
else
	echo `date` $@ $(n) >> build.log
#	java -jar JCLParserCLI.jar -file testdata/test$(n).jcl -include testdata -set SYSUID=CSCHNEID -outtree test$(n).tsv -outcsv test$(n).csv -logLevel FINEST -cntlList cntlList1 -saveTemp
	./src/tester $(n) demo
endif

testsys1:
	echo `date` $@ >> build.log
	java -jar JCLParserCLI.jar -fileList sys1.proclib.download.lst -include ~/craig/SYS1.PROCLIB.DOWNLOAD -set SYSUID=CSCHNEID -outtree sys1.proclib.tsv -outcsv sys1.proclib.csv -cntlList cntlList1

testsys2:
	echo `date` $@ >> build.log
	java -jar JCLParserCLI.jar -fileList sys2.proclib.download.lst -include ~/craig/SYS2.PROCLIB.DOWNLOAD -set SYSUID=CSCHNEID -outtree sys2.proclib.tsv -outcsv sys2.proclib.csv -cntlList cntlList1

ziplogs:
	echo `date` $@ >> build.log
	zip -DjmTv9 demologs Demo01-*.log

javadoc:
	echo `date` $@ >>build.log
	mvn clean javadoc:javadoc
	rm -rf ./javadoc/
	cp -r ./target/reports/apidocs/. ./javadoc/

lint:
	echo `date` $@ >>build.log
	java -jar ~/proguard6.2.2/lib/proguard.jar @usage.pg > proguard.log
	java -jar ~/spotbugs-4.0.2/lib/spotbugs.jar -textui -effort:max -exclude spotbugs-exclude.xml JCLParser.jar > spotbugs.log





#
# Makefile for JCL parser which includes several ANTLR grammars and
# attendant Java code for a demonstration application.
#
# make all        - generate lexer/parser code and compile all java code
# make clean      - delete all generated code
# make cleanmine  - delete non-generated code
# make mine       - compile non-generated java code
# make jar        - create jar file comprising all class files
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
#

JC = javac
CP = "./class:./lib/commons-cli-1.4.jar:./lib/antlr-4.11.1-complete.jar"
JCOPT = -d ./class -g -Xlint:all -cp $(CP)
JCOPT1 = -d ./class -cp $(CP)
AOPT = -visitor -listener
#AOPT = -o ./src -lib ./src -visitor -listener

./class/%.class: ./src/%.java
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./src/%.tokens: ./src/%.g4
	echo `date` $< >>build.log
	java -jar ./lib/antlr-4.11.1-complete.jar $(AOPT) $<
	$(JC) $(JCOPT1) ./src/$**.java
	

all: ./src/JCLLexer.tokens ./src/JCLParser.tokens ./src/JCLPPLexer.tokens ./src/JCLPPParser.tokens ./src/DSNTSOLexer.tokens ./src/DSNTSOParser.tokens ./src/TSOLexer.tokens ./src/TSOParser.tokens ./src/JCLDDAMPLexer.tokens ./src/JCLDDAMPParser.tokens ./class/StdoutLexerErrorListener.class ./class/StdoutParserErrorListener.class ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/KeywordValueType.class ./class/SetSymbolValue.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/JobCardWrapper.class ./class/Job.class ./class/Proc.class ./class/SetSymbolValueListener.class ./class/JobListener.class ./class/SingleOrMultipleValueWrapper.class ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/DsidWrapper.class ./class/TSOCallMemberListener.class ./class/AmpParmWrapper.class ./class/AmpParmListener.class ./class/DdStatement.class ./class/DdStatementAmalgamation.class ./class/JclStep.class ./class/Symbolic.class ./class/EmbeddedEqualityWrapper.class ./class/PPIncludeStatement.class ./class/PPJclStep.class ./class/PPJob.class ./class/PPKeywordValueWrapper.class ./class/PPKeywordOrSymbolicWrapper.class ./class/PPProc.class ./class/PPSetSymbolValue.class ./class/PPDdStatementAmalgamation.class ./class/PPSingleOrMultipleValueWrapper.class ./class/PPSymbolic.class ./class/PPOpType.class ./class/PPOp.class ./class/PPDdStatement.class ./class/PPListener.class ./class/PPSetSymbolValueListener.class ./class/PPEmbeddedEqualityWrapper.class ./class/ParameterString.class ./class/PathDispWrapper.class ./class/DsnRunListener.class ./class/DsnStreamListener.class ./class/DsnStreamWrapper.class ./class/AmpWrapper.class

.PHONY: all clean cleanmine mine jar testrig test testpp testrigpp testdemo ziplogs javadoc lint

clean:
	echo `date` $@ >> build.log
	rm -f ./src/JCLLexer*.java ./class/JCLLexer*.class ./src/JCLLexer*.tokens ./src/JCLLexer*.interp ./src/JCLParser*.java ./class/JCLParser*.class ./src/JCLParser.tokens ./src/JCLParser.interp ./src/JCLPPLexer*.java ./class/JCLPPLexer*.class ./src/JCLPPLexer*.tokens ./src/JCLPPLexer*.interp ./src/JCLPPParser*.java ./class/JCLPPParser*.class ./src/JCLPPParser.tokens ./src/JCLPPParser.interp ./src/DSNTSOLexer*.java ./class/DSNTSOLexer*.class ./src/DSNTSOLexer*.tokens ./src/DSNTSOLexer*.interp ./src/DSNTSOParser*.java ./class/DSNTSOParser*.class ./src/DSNTSOParser.tokens ./src/DSNTSOParser.interp ./src/TSOLexer*.java ./class/TSOLexer*.class ./src/TSOLexer*.tokens ./src/TSOLexer*.interp ./src/TSOParser*.java ./class/TSOParser*.class ./src/TSOParser.tokens ./src/TSOParser.interp ./src/JCLDDAMPLexer*.java ./class/JCLDDAMPLexer*.class ./src/JCLDDAMPLexer*.tokens ./src/JCLDDAMPLexer*.interp ./src/JCLDDAMPParser*.java ./class/JCLDDAMPParser*.class ./src/JCLDDAMPParser.tokens ./src/JCLDDAMPParser.interp

cleanmine:
	echo `date` $@ >> build.log
	rm -f ./class/StdoutLexerErrorListener.class ./class/StdoutParserErrorListener.class ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/KeywordValueType.class ./class/SetSymbolValue.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/JobCardWrapper.class ./class/Job.class ./class/Proc.class ./class/SetSymbolValueListener.class ./class/JobListener.class ./class/JclStep.java ./class/SingleOrMultipleValueWrapper.class ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/DsidWrapper.class ./class/TSOCallMemberListener.class ./class/AmpParmWrapper.class ./class/AmpParmListener.class ./class/DdStatement.class ./class/DdStatementAmalgamation.class ./class/Symbolic.class ./class/EmbeddedEqualityWrapper.class ./class/PPIncludeStatement.class ./class/PPJclStep.class ./class/PPJob.class ./class/PPKeywordValueWrapper.class ./class/PPKeywordOrSymbolicWrapper.class ./class/PPProc.class ./class/PPSetSymbolValue.class ./class/PPDdStatementAmalgamation.class ./class/PPSingleOrMultipleValueWrapper.class ./class/PPSymbolic.class ./class/PPOpType.class ./class/PPOp.class ./class/PPDdStatement.class ./class/PPListener.class ./class/PPSetSymbolValueListener.class ./class/PPEmbeddedEqualityWrapper.class ./class/ParameterString.class ./class/PathDispWrapper.class ./class/DsnRunListener.class ./class/DsnStreamListener.class ./class/DsnStreamWrapper.class ./class/AmpWrapper.class

mine:
	echo `date` $@ >> build.log
	$(JC) $(JCOPT) ./src/StdoutLexerErrorListener.java ./src/StdoutParserErrorListener.java ./src/Demo01.java ./src/TheCLI.java ./src/SetTypeOfSymbolValue.java ./src/KeywordValueType.java ./src/SetSymbolValue.java ./src/KeywordValueWrapper.java ./src/KeywordOrSymbolicWrapper.java ./src/IncludeStatement.java ./src/JobCardWrapper.java ./src/Job.java ./src/Proc.java ./src/SetSymbolValueListener.java ./src/JobListener.java ./src/JclStep.java ./src/SingleOrMultipleValueWrapper.java ./src/DatasetNameWrapper.java ./src/DispWrapper.java ./src/DsidWrapper.java ./src/TSOCallMemberListener.java ./src/AmpParmWrapper.java ./src/AmpParmListener.java ./src/DdStatement.java ./src/DdStatementAmalgamation.java ./src/Symbolic.java ./src/EmbeddedEqualityWrapper.java ./src/PPIncludeStatement.java ./src/PPJclStep.java ./src/PPJob.java ./src/PPKeywordValueWrapper.java ./src/PPKeywordOrSymbolicWrapper.java ./src/PPProc.java ./src/PPSetSymbolValue.java ./src/PPDdStatementAmalgamation.java ./src/PPSingleOrMultipleValueWrapper.java ./src/PPSymbolic.java ./src/PPOpType.java ./src/PPOp.java ./src/PPDdStatement.java ./src/PPListener.java ./src/PPSetSymbolValueListener.java ./src/PPEmbeddedEqualityWrapper.java ./src/ParameterString.java ./src/PathDispWrapper.java ./src/DsnRunListener.java ./src/DsnStreamListener.java ./src/DsnStreamWrapper.java ./src/AmpWrapper.java

jar:
	echo `date` $@ >> build.log
	jar cfm JCLParser.jar manifest -C class .

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
	java -cp ./class:.:./antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test$(n).jcl

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
	java -cp ./class:.:./antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig JCLPP startRule -gui -tokens < ./testdata/test$(n).jcl

testrigtso:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig TSO startRule -gui -tokens < ./testdata/test$(n).tso

testrigdsn:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig DSNTSO startRule -gui -tokens < ./testdata/test$(n).dsn

testrigamp:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig JCLDDAMP startRule -gui -tokens < ./testdata/test$(n).amp

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
#	java -jar JCLParser.jar -fileList testdata.lst -include testdata -set SYSUID=CSCHNEID -outtree testdata.tsv -outcsv testdata.csv -cntlList cntlList1
	./src/tester "*" demo
else
	echo `date` $@ $(n) >> build.log
#	java -jar JCLParser.jar -file testdata/test$(n).jcl -include testdata -set SYSUID=CSCHNEID -outtree test$(n).tsv -outcsv test$(n).csv -logLevel FINEST -cntlList cntlList1 -saveTemp
	./src/tester $(n) demo
endif

testsys1:
	echo `date` $@ >> build.log
	java -jar JCLParser.jar -fileList sys1.proclib.download.lst -include ~/craig/SYS1.PROCLIB.DOWNLOAD -set SYSUID=CSCHNEID -outtree sys1.proclib.tsv -outcsv sys1.proclib.csv -cntlList cntlList1

testsys2:
	echo `date` $@ >> build.log
	java -jar JCLParser.jar -fileList sys2.proclib.download.lst -include ~/craig/SYS2.PROCLIB.DOWNLOAD -set SYSUID=CSCHNEID -outtree sys2.proclib.tsv -outcsv sys2.proclib.csv -cntlList cntlList1

ziplogs:
	echo `date` $@ >> build.log
	zip -DjmTv9 demologs Demo01-*.log

javadoc:
	javadoc -private -d ~/Documents/jcl ./src/Demo01.java ./src/TheCLI.java ./src/SetTypeOfSymbolValue.java ./src/KeywordValueType.java ./src/SetSymbolValue.java ./src/KeywordValueWrapper.java ./src/KeywordOrSymbolicWrapper.java ./src/IncludeStatement.java ./src/JobCardWrapper.java ./src/Job.java ./src/Proc.java ./src/SetSymbolValueListener.java ./src/JobListener.java ./src/JclStep.java ./src/SingleOrMultipleValueWrapper.java ./src/DatasetNameWrapper.java ./src/DispWrapper.java ./src/DsidWrapper.java ./src/TSOCallMemberListener.java ./src/DdStatement.java ./src/DdStatementAmalgamation.java ./src/Symbolic.java ./src/EmbeddedEqualityWrapper.java ./src/PPIncludeStatement.java ./src/PPJclStep.java ./src/PPJob.java ./src/PPKeywordValueWrapper.java ./src/PPKeywordOrSymbolicWrapper.java ./src/PPProc.java ./src/PPSetSymbolValue.java ./src/PPDdStatementAmalgamation.java ./src/PPSingleOrMultipleValueWrapper.java ./src/PPSymbolic.java ./src/PPOpType.java ./src/PPOp.java ./src/PPDdStatement.java ./src/PPListener.java ./src/PPSetSymbolValueListener.java ./src/PPEmbeddedEqualityWrapper.java ./src/ParameterString.java ./src/PathDispWrapper.java ./src/DsnRunListener.java ./src/DsnStreamListener.java ./src/DsnStreamWrapper.java

lint:
	echo `date` $@ >>build.log
	java -jar ~/proguard6.2.2/lib/proguard.jar @usage.pg > proguard.log
	java -jar ~/spotbugs-4.0.2/lib/spotbugs.jar -textui -effort:max -exclude spotbugs-exclude.xml JCLParser.jar > spotbugs.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens

./src/JCLPPParser.tokens: ./src/JCLPPLexer.tokens

./src/DSNTSOParser.tokens: ./src/DSNTSOLexer.tokens

./src/TSOParser.tokens: ./src/TSOLexer.tokens

./src/JCLDDAMPParser.tokens: ./src/JCLDDAMPLexer.tokens

./class/TheCLI.class: 

./class/Demo01.class: ./src/JCLPPLexer.tokens

./class/SingleOrMultipleValueWrapper.class: ./src/SingleOrMultipleValueWrapper.java ./class/EmbeddedEqualityWrapper.class ./class/ParameterString.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./class/PPSingleOrMultipleValueWrapper.class: ./src/PPSingleOrMultipleValueWrapper.java ./class/PPEmbeddedEqualityWrapper.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./class/DdStatement.class: ./src/DdStatement.java ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/PathDispWrapper.class ./class/DsidWrapper.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<




JC = javac
CP = "./class:./lib/commons-cli-1.4.jar:./lib/antlr-4.7.2-complete.jar"
JCOPT = -d ./class -g -Xlint:all -cp $(CP)
JCOPT1 = -d ./class -cp $(CP)
AOPT = -visitor -listener
#AOPT = -o ./src -lib ./src -visitor -listener

./class/%.class: ./src/%.java
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./src/%.tokens: ./src/%.g4
	echo `date` $< >>build.log
	java -jar ./lib/antlr-4.7.2-complete.jar $(AOPT) $<
	$(JC) $(JCOPT1) ./src/$**.java
	

all: ./src/JCLLexer.tokens ./src/JCLParser.tokens ./src/JCLPPLexer.tokens ./src/JCLPPParser.tokens ./src/DSNTSOLexer.tokens ./src/DSNTSOParser.tokens ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/KeywordValueType.class ./class/SetSymbolValue.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/JobCardWrapper.class ./class/Job.class ./class/Proc.class ./class/SetSymbolValueListener.class ./class/JobListener.class ./class/SingleOrMultipleValueWrapper.class ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/DsidWrapper.class ./class/DdStatement.class ./class/DdStatementAmalgamation.class ./class/JclStep.class ./class/Symbolic.class ./class/EmbeddedEqualityWrapper.class ./class/PPIncludeStatement.class ./class/PPJclStep.class ./class/PPJob.class ./class/PPKeywordValueWrapper.class ./class/PPKeywordOrSymbolicWrapper.class ./class/PPProc.class ./class/PPSetSymbolValue.class ./class/PPDdStatementAmalgamation.class ./class/PPSingleOrMultipleValueWrapper.class ./class/PPSymbolic.class ./class/PPOpType.class ./class/PPOp.class ./class/PPDdStatement.class ./class/PPListener.class ./class/PPSetSymbolValueListener.class ./class/PPEmbeddedEqualityWrapper.class ./class/ParameterString.class ./class/PathDispWrapper.class

.PHONY: all clean cleanmine mine jar testrig test testpp testrigpp testdemo ziplogs javadoc lint

clean:
	echo `date` clean >> build.log
	rm -f ./src/JCLLexer*.java ./class/JCLLexer*.class ./src/JCLLexer*.tokens ./src/JCLLexer*.interp ./src/JCLParser*.java ./class/JCLParser*.class ./src/JCLParser.tokens ./src/JCLParser.interp ./src/JCLPPLexer*.java ./class/JCLPPLexer*.class ./src/JCLPPLexer*.tokens ./src/JCLPPLexer*.interp ./src/JCLPPParser*.java ./class/JCLPPParser*.class ./src/JCLPPParser.tokens ./src/JCLPPParser.interp

cleanmine:
	echo `date` cleanmine >> build.log
	rm -f ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/KeywordValueType.class ./class/SetSymbolValue.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/JobCardWrapper.class ./class/Job.class ./class/Proc.class ./class/SetSymbolValueListener.class ./class/JobListener.class ./class/JclStep.java ./class/SingleOrMultipleValueWrapper.class ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/DsidWrapper.class ./class/DdStatement.class ./class/DdStatementAmalgamation.class ./class/Symbolic.class ./class/EmbeddedEqualityWrapper.class ./class/PPIncludeStatement.class ./class/PPJclStep.class ./class/PPJob.class ./class/PPKeywordValueWrapper.class ./class/PPKeywordOrSymbolicWrapper.class ./class/PPProc.class ./class/PPSetSymbolValue.class ./class/PPDdStatementAmalgamation.class ./class/PPSingleOrMultipleValueWrapper.class ./class/PPSymbolic.class ./class/PPOpType.class ./class/PPOp.class ./class/PPDdStatement.class ./class/PPListener.class ./class/PPSetSymbolValueListener.class ./class/PPEmbeddedEqualityWrapper.class ./class/ParameterString.class ./class/PathDispWrapper.class

mine:
	echo `date` mine >> build.log
	$(JC) $(JCOPT) ./src/Demo01.java ./src/TheCLI.java ./src/SetTypeOfSymbolValue.java ./src/KeywordValueType.java ./src/SetSymbolValue.java ./src/KeywordValueWrapper.java ./src/KeywordOrSymbolicWrapper.java ./src/IncludeStatement.java ./src/JobCardWrapper.java ./src/Job.java ./src/Proc.java ./src/SetSymbolValueListener.java ./src/JobListener.java ./src/JclStep.java ./src/SingleOrMultipleValueWrapper.java ./src/DatasetNameWrapper.java ./src/DispWrapper.java ./src/DsidWrapper.java ./src/DdStatement.java ./src/DdStatementAmalgamation.java ./src/Symbolic.java ./src/EmbeddedEqualityWrapper.java ./src/PPIncludeStatement.java ./src/PPJclStep.java ./src/PPJob.java ./src/PPKeywordValueWrapper.java ./src/PPKeywordOrSymbolicWrapper.java ./src/PPProc.java ./src/PPSetSymbolValue.java ./src/PPDdStatementAmalgamation.java ./src/PPSingleOrMultipleValueWrapper.java ./src/PPSymbolic.java ./src/PPOpType.java ./src/PPOp.java ./src/PPDdStatement.java ./src/PPListener.java ./src/PPSetSymbolValueListener.java ./src/PPEmbeddedEqualityWrapper.java ./src/ParameterString.java ./src/PathDispWrapper.java

jar:
	echo `date` jar >> build.log
	jar cfm JCLParser.jar manifest -C class .

test:
ifeq ($(strip $(n)),)
	echo `date` testing >> build.log
	./src/tester all x
else
	echo `date` testing $(n) >> build.log
	./src/tester $(n) x
endif

testrig:
	echo `date` testrig $(n) >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test$(n).jcl

testpp:
ifeq ($(strip $(n)),)
	echo `date` testing >> build.log
	./src/tester all pp
else
	echo `date` testing $(n) >> build.log
	./src/tester $(n) pp
endif

testrigpp:
	echo `date` testrig $(n) >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCLPP startRule -gui -tokens < ./testdata/test$(n).jcl

testdemo:
ifeq ($(strip $(n)),)
	echo `date` testdemo >> build.log
	java -jar JCLParser.jar -fileList testdata.lst -include testdata -set SYSUID=CSCHNEID -outtree testdata.tsv -outcsv testdata.csv
else
	echo `date` testdemo $(n) >> build.log
	java -jar JCLParser.jar -file testdata/test$(n).jcl -include testdata -set SYSUID=CSCHNEID -outtree test$(n).tsv -outcsv test$(n).csv -logLevel FINEST -saveTemp
endif

ziplogs:
	echo `date` ziplogs >> build.log
	zip -DjmTv9 demologs Demo01-*.log

javadoc:
	javadoc -private -d ~/Documents/jcl ./src/Demo01.java ./src/TheCLI.java ./src/SetTypeOfSymbolValue.java ./src/KeywordValueType.java ./src/SetSymbolValue.java ./src/KeywordValueWrapper.java ./src/KeywordOrSymbolicWrapper.java ./src/IncludeStatement.java ./src/JobCardWrapper.java ./src/Job.java ./src/Proc.java ./src/SetSymbolValueListener.java ./src/JobListener.java ./src/JclStep.java ./src/SingleOrMultipleValueWrapper.java ./src/DatasetNameWrapper.java ./src/DispWrapper.java ./src/DsidWrapper.java ./src/DdStatement.java ./src/DdStatementAmalgamation.java ./src/Symbolic.java ./src/EmbeddedEqualityWrapper.java ./src/PPIncludeStatement.java ./src/PPJclStep.java ./src/PPJob.java ./src/PPKeywordValueWrapper.java ./src/PPKeywordOrSymbolicWrapper.java ./src/PPProc.java ./src/PPSetSymbolValue.java ./src/PPDdStatementAmalgamation.java ./src/PPSingleOrMultipleValueWrapper.java ./src/PPSymbolic.java ./src/PPOpType.java ./src/PPOp.java ./src/PPDdStatement.java ./src/PPListener.java ./src/PPSetSymbolValueListener.java ./src/PPEmbeddedEqualityWrapper.java ./src/ParameterString.java ./src/PathDispWrapper.java

lint:
	echo `date` proguard >>build.log
	java -jar ~/proguard6.2.2/lib/proguard.jar @usage.pg > proguard.log
	java -jar ~/spotbugs-4.0.2/lib/spotbugs.jar -textui -effort:max -exclude spotbugs-exclude.xml JCLParser.jar > spotbugs.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens

./src/JCLPPParser.tokens: ./src/JCLPPLexer.tokens

./src/DSNTSOParser.tokens: ./src/DSNTSOLexer.tokens

./class/TheCLI.class: 

./class/Demo01.class:

./class/SingleOrMultipleValueWrapper.class: ./src/SingleOrMultipleValueWrapper.java ./class/EmbeddedEqualityWrapper.class ./class/ParameterString.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./class/PPSingleOrMultipleValueWrapper.class: ./src/PPSingleOrMultipleValueWrapper.java ./class/PPEmbeddedEqualityWrapper.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./class/DdStatement.class: ./src/DdStatement.java ./class/DatasetNameWrapper.class ./class/DispWrapper.class ./class/PathDispWrapper.class ./class/DsidWrapper.class
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<



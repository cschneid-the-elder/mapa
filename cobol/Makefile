
JC = javac
CP = "./class:./lib/commons-cli-1.4.jar:./lib/antlr-4.7.2-complete.jar"
JCOPT = -d ./class -g -Xlint -cp $(CP)
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
	

all: ./src/CobolLexer.tokens ./src/CobolParser.tokens ./src/CobolPreprocessor.tokens ./class/CallEtAlListener.class ./class/DataDescriptionEntryListener.class ./class/SetListener.class ./class/DDNode.class ./class/CallWrapper.class ./class/CopyListener.class ./class/ReplaceListener.class ./class/TheCLI.class ./class/TestIntegration.class ./class/CallType.class ./class/IdDivListener.class ./class/CopyStatementContextWrapper.class ./class/ReplaceStatementContextWrapper.class ./class/DataLocation.class ./class/CompilerOptionsListener.class ./class/CompilerOptionsWrapper.class

.PHONY: all clean cleanmine mine jar testLocal testNist

clean:
	echo `date` $@ >> build.log
	rm -f ./class/CobolLexer*.java ./class/CobolLexer*.class ./class/CobolLexer*.tokens ./class/CobolLexer*.interp ./class/CobolParser*.java ./class/CobolParser*.class ./class/CobolParser.tokens ./class/CobolParser.interp ./class/CobolPreprocessor*.java ./class/CobolPreprocessor*.class ./class/CobolPreprocessor.tokens ./class/CobolPreprocessor.interp

cleanmine:
	echo `date` $@ >> build.log
	rm -f ./class/CallEtAlListener.class ./class/DataDescriptionEntryListener.class ./class/SetListener.class ./class/DDNode.class ./class/CallWrapper.class ./class/CopyListener.class ./class/ReplaceListener.class ./class/TheCLI.class ./class/TestIntegration.class ./class/CallType.class ./class/IdDivListener.class ./class/CopyStatementContextWrapper.class ./class/ReplaceStatementContextWrapper.class ./class/CompilerOptionsListener.class ./class/CompilerOptionsWrapper.class

mine:
	echo `date` $@ >> build.log
	$(JC) $(JCOPT) ./src/CallEtAlListener.java ./src/DataDescriptionEntryListener.java ./src/SetListener.java ./src/DDNode.java ./src/CallWrapper.java ./src/CopyListener.java ./src/ReplaceListener.java ./src/TheCLI.java ./src/CompilerOptionsWrapper.java ./src/CompilerOptionsListener.java ./src/TestIntegration.java ./src/CallType.java ./src/IdDivListener.java ./src/CopyStatementContextWrapper.java ./src/ReplaceStatementContextWrapper.java

jar:
	echo `date` $@ >> build.log
	jar cfm CallTree.jar manifest -C class .

testLocal:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log
else
	echo `date` $@ $(n) >> build.log
	java -jar CallTree.jar -unitTest -file testdata/local/testantlr$(n).cbl -copy /home/craig/mapa/cobol/testdata/local -logLevel FINEST -out callListLocal$(n).log
endif

testNist:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log
else
	echo `date` $@ $(n) >> build.log
	java -jar CallTree.jar -file testdata/nist/$(n) -copy /home/craig/mapa/cobol/testdata/nist -logLevel FINEST -out callListNist$(n).log
endif

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig Cobol startRule -gui -tokens < ./testdata/local/testantlr$(n).cbl

testrigpp:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig CobolPreprocessor startRule -gui -tokens < ./testdata/local/testantlr$(n).cbl

testrigppnist:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig CobolPreprocessor startRule -gui -tokens < ./testdata/nist/$(n)

./src/CobolLexer.tokens: 

./src/CobolParser.tokens: ./src/CobolLexer.tokens

./src/CobolPreprocessor.tokens: 

./class/CallType.class: 

./class/DataLocation.class:

./class/CallEtAlListener.class: ./class/CallWrapper.class

./class/DataDescriptionEntryListener.class: ./class/DataLocation.class

./class/SetListener.class: 

./class/DDNode.class: ./class/DataLocation.class

./class/CallWrapper.class: ./class/CallType.class ./class/DDNode.class

./class/CopyStatementContextWrapper.class: 

./class/ReplaceStatementContextWrapper.class: 

./class/IdDivListener.class: 

./class/CopyListener.class: 

./class/ReplaceListener.class: 

./class/TheCLI.class: 

./class/TestIntegration.class: ./class/CopyStatementContextWrapper.class ./class/TheCLI.class ./class/ReplaceListener.class ./class/CopyListener.class ./class/IdDivListener.class ./class/ReplaceStatementContextWrapper.class ./class/DDNode.class ./class/SetListener.class ./class/DataDescriptionEntryListener.class ./class/CallEtAlListener.class ./class/CompilerOptionsListener.class ./class/CompilerOptionsWrapper.class

./class/CompilerOptionsListener.class: ./class/CompilerOptionsWrapper.class


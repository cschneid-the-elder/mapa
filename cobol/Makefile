
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
	

all: ./src/CobolLexer.tokens ./src/CobolParser.tokens ./src/CobolPreprocessor.tokens ./class/CallEtAlListener.class ./class/DataDescriptionEntryListener.class ./class/SetListener.class ./class/DDNode.class ./class/CallWrapper.class ./class/CopyListener.class ./class/ReplaceListener.class ./class/TheCLI.class ./class/TestIntegration.class ./class/CallType.class ./class/IdDivListener.class ./class/CopyStatementContextWrapper.class ./class/ReplaceStatementContextWrapper.class

.PHONY: all clean cleanmine mine jar testLocal testNist

clean:
	echo `date` clean >> build.log
	cd ./class
	rm -f CobolLexer*.java CobolLexer*.class CobolLexer*.tokens CobolLexer*.interp CobolParser*.java CobolParser*.class CobolParser.tokens CobolParser.interp CobolPreprocessor*.java CobolPreprocessor*.class CobolPreprocessor.tokens CobolPreprocessor.interp
	cd ..

cleanmine:
	echo `date` cleanmine >> build.log
	cd ./class
	rm -f CallEtAlListener.class DataDescriptionEntryListener.class SetListener.class DDNode.class CallWrapper.class CopyListener.class ReplaceListener.class TheCLI.class TestIntegration.class CallType.class IdDivListener.class CopyStatementContextWrapper.class ReplaceStatementContextWrapper.class
	cd ..

mine:
	echo `date` mine >> build.log
	$(JC) $(JCOPT) ./src/CallEtAlListener.java ./src/DataDescriptionEntryListener.java ./src/SetListener.java ./src/DDNode.java ./src/CallWrapper.java ./src/CopyListener.java ./src/ReplaceListener.java ./src/TheCLI.java ./src/TestIntegration.java ./src/CallType.java ./src/IdDivListener.java ./src/CopyStatementContextWrapper.java ./src/ReplaceStatementContextWrapper.java

jar:
	echo `date` jar >> build.log
	jar cfm CallTree.jar manifest -C class .

testLocal:
	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local

testNist:
	java -jar CallTree.jar -unitTest -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist

./src/CobolLexer.tokens: 

./src/CobolParser.tokens: ./src/CobolLexer.tokens

./src/CobolPreprocessor.tokens: 

./class/CallType.class: 

./class/CallEtAlListener.class: ./class/CallWrapper.class

./class/DataDescriptionEntryListener.class: 

./class/SetListener.class: 

./class/DDNode.class: 

./class/CallWrapper.class: ./class/CallType.class ./class/DDNode.class

./class/CopyStatementContextWrapper.class: 

./class/ReplaceStatementContextWrapper.class: 

./class/IdDivListener.class: 

./class/CopyListener.class: 

./class/ReplaceListener.class: 

./class/TheCLI.class: 

./class/TestIntegration.class: ./class/CopyStatementContextWrapper.class ./class/TheCLI.class ./class/ReplaceListener.class ./class/CopyListener.class ./class/IdDivListener.class ./class/ReplaceStatementContextWrapper.class ./class/DDNode.class ./class/SetListener.class ./class/DataDescriptionEntryListener.class ./class/CallEtAlListener.class



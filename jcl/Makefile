
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
	

all: ./src/JCLLexer.tokens ./src/JCLParser.tokens ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/SetSymbolValue.class ./class/SetSymbolValueListener.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/IncludeStatementListener.class ./class/JobCardWrapper.class ./class/JobCardListener.class

.PHONY: all clean cleanmine mine jar testrig

clean:
	echo `date` clean >> build.log
	rm -f ./src/JCLLexer*.java ./class/JCLLexer*.class ./src/JCLLexer*.tokens ./src/JCLLexer*.interp ./src/JCLParser*.java ./class/JCLParser*.class ./src/JCLParser.tokens ./src/JCLParser.interp

cleanmine:
	echo `date` cleanmine >> build.log
	rm -f ./class/Demo01.class ./class/TheCLI.class ./class/SetTypeOfSymbolValue.class ./class/SetSymbolValue.class ./class/SetSymbolValueListener.class ./class/KeywordValueWrapper.class ./class/KeywordOrSymbolicWrapper.class ./class/IncludeStatement.class ./class/IncludeStatementListener.class ./class/JobCardWrapper.class ./class/JobCardListener.class

mine:
	echo `date` mine >> build.log
	$(JC) $(JCOPT) ./src/Demo01.java ./src/TheCLI.java ./src/SetTypeOfSymbolValue.java ./src/SetSymbolValue.java ./src/SetSymbolValueListener.java ./src/KeywordValueWrapper.java ./src/KeywordOrSymbolicWrapper.java ./src/IncludeStatement.java ./src/IncludeStatementListener.java ./src/JobCardWrapper.java ./src/JobCardListener.java

jar:
	echo `date` jar >> build.log
	jar cfm JCLParser.jar manifest -C class .

test:
ifeq ($(strip $(n)),)
	echo `date` testing >> build.log
	./src/tester all
else
	echo `date` testing $(n) >> build.log
	./src/tester $(n)
endif

testrig:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test$(n).jcl

testdemo:
	java -jar JCLParser.jar -file testdata/test$(n).jcl -include testdata -logLevel FINEST

#testNist:
#	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens


./class/TheCLI.class: 

./class/Demo01.class:



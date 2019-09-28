
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
	

all: ./src/JCLLexer.tokens ./src/JCLParser.tokens

.PHONY: all clean cleanmine mine jar testrig

clean:
	echo `date` clean >> build.log
	cd ./class &&\
	rm -f JCLLexer*.java JCLLexer*.class JCLLexer*.tokens JCLLexer*.interp JCLParser*.java JCLParser*.class JCLParser.tokens JCLParser.interp
	cd ..

cleanmine:
	echo `date` cleanmine >> build.log
	cd ./class &&\
#	rm -f 

mine:
	echo `date` mine >> build.log
	$(JC) $(JCOPT) 

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

testrig9001:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test9001.jcl

#testLocal:
#	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log

#testNist:
#	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens


#./class/TheCLI.class: 




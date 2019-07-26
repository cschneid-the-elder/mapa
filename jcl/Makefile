
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
	cd ./class
	rm -f JCLLexer*.java JCLLexer*.class JCLLexer*.tokens JCLLexer*.interp JCLParser*.java JCLParser*.class JCLParser.tokens JCLParser.interp
	cd ..

cleanmine:
	echo `date` cleanmine >> build.log
	cd ./class
#	rm -f 
	cd ..

mine:
	echo `date` mine >> build.log
	$(JC) $(JCOPT) 

jar:
	echo `date` jar >> build.log
	jar cfm JCLParser.jar manifest -C class .

test:
	echo `date` testing >> build.log
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0001.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0002.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0003.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0004.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0005.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0006.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0007.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0008.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0009.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0010.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0011.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0012.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0013.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0014.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0015.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0016.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0017.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0018.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0019.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0020.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0021.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0022.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0023.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0024.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0025.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0026.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0027.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0028.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0029.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0030.jcl | grep -v '^\[' || exit 0

testrig:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0001.jcl

testrig2:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0002.jcl

testrig3:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0003.jcl

testrig4:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0004.jcl

testrig5:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0005.jcl

testrig6:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0006.jcl

testrig7:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0007.jcl

testrig8:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0008.jcl

testrig9:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0009.jcl

testrig10:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0010.jcl

testrig11:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0011.jcl

testrig12:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0012.jcl

testrig13:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0013.jcl

testrig14:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0014.jcl

testrig15:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0015.jcl

testrig16:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0016.jcl

testrig17:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0017.jcl

testrig18:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0018.jcl

testrig19:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0019.jcl

testrig20:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0020.jcl

testrig21:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0021.jcl

testrig22:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0022.jcl

testrig23:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0023.jcl

testrig24:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0024.jcl

testrig25:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0025.jcl

testrig26:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0026.jcl

testrig27:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0027.jcl

testrig28:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0028.jcl

testrig29:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0029.jcl

testrig30:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0030.jcl

testrig9001:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test9001.jcl

#testLocal:
#	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log

#testNist:
#	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens


#./class/TheCLI.class: 




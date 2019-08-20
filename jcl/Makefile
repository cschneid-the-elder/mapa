
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
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0031.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0032.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0033.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0034.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0035.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0036.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0037.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0038.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0039.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0040.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0041.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0042.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0043.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0044.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0045.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0046.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0047.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0048.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0049.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0050.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0051.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0052.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0053.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0054.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0055.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0056.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0057.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0058.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0059.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0060.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0061.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0062.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0063.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0064.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0065.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0066.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0067.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0068.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0069.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0070.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0071.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0072.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0073.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0074.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0075.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0076.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0077.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0078.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0079.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0080.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0081.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0082.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0083.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0084.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0085.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0086.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0087.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0088.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0089.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0090.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0091.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0092.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0093.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0094.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0095.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0096.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0097.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0098.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0099.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0100.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0101.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0102.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0103.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0104.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0105.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0106.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0107.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0108.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0109.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0110.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0111.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0112.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0113.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0114.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0115.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0116.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0117.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0118.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0119.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0120.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0121.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0122.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0123.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0124.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0125.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0126.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0127.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0128.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0129.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0130.jcl | grep -v '^\[' || exit 0
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -tokens < ./testdata/test0131.jcl | grep -v '^\[' || exit 0

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

testrig31:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0031.jcl

testrig32:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0032.jcl

testrig33:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0033.jcl

testrig34:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0034.jcl

testrig35:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0035.jcl

testrig36:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0036.jcl

testrig37:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0037.jcl

testrig38:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0038.jcl

testrig39:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0039.jcl

testrig40:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0040.jcl

testrig41:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0041.jcl

testrig42:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0042.jcl

testrig43:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0043.jcl

testrig44:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0044.jcl

testrig45:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0045.jcl

testrig46:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0046.jcl

testrig47:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0047.jcl

testrig48:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0048.jcl

testrig49:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0049.jcl

testrig50:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0050.jcl

testrig51:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0051.jcl

testrig52:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0052.jcl

testrig53:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0053.jcl

testrig54:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0054.jcl

testrig55:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0055.jcl

testrig56:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0056.jcl

testrig57:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0057.jcl

testrig58:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0058.jcl

testrig59:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0059.jcl

testrig60:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0060.jcl

testrig61:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0061.jcl

testrig62:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0062.jcl

testrig63:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0063.jcl

testrig64:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0064.jcl

testrig65:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0065.jcl

testrig66:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0066.jcl

testrig67:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0067.jcl

testrig68:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0068.jcl

testrig69:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0069.jcl

testrig70:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0070.jcl

testrig71:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0071.jcl

testrig72:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0072.jcl

testrig73:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0073.jcl

testrig74:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0074.jcl

testrig75:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0075.jcl

testrig76:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0076.jcl

testrig77:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0077.jcl

testrig78:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0078.jcl

testrig79:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0079.jcl

testrig80:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0080.jcl

testrig81:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0081.jcl

testrig82:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0082.jcl

testrig83:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0083.jcl

testrig84:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0084.jcl

testrig85:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0085.jcl

testrig86:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0086.jcl

testrig87:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0087.jcl

testrig88:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0088.jcl

testrig89:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0089.jcl

testrig90:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0090.jcl

testrig91:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0091.jcl

testrig92:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0092.jcl

testrig93:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0093.jcl

testrig94:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0094.jcl

testrig95:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0095.jcl

testrig96:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0096.jcl

testrig97:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0097.jcl

testrig98:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0098.jcl

testrig99:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0099.jcl

testrig100:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0100.jcl

testrig101:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0101.jcl

testrig102:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0102.jcl

testrig103:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0103.jcl

testrig104:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0104.jcl

testrig105:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0105.jcl

testrig106:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0106.jcl

testrig107:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0107.jcl

testrig108:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0108.jcl

testrig109:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0109.jcl

testrig110:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0110.jcl

testrig111:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0111.jcl

testrig112:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0112.jcl

testrig113:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0113.jcl

testrig114:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0114.jcl

testrig115:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0115.jcl

testrig116:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0116.jcl

testrig117:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0117.jcl

testrig118:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0118.jcl

testrig119:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0119.jcl

testrig120:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0120.jcl

testrig121:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0121.jcl

testrig122:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0122.jcl

testrig123:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0123.jcl

testrig124:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0124.jcl

testrig125:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0125.jcl

testrig126:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0126.jcl

testrig127:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0127.jcl

testrig128:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0128.jcl

testrig129:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0129.jcl

testrig130:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0130.jcl

testrig131:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0131.jcl

testrig132:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0132.jcl

testrig133:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0133.jcl

testrig134:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0134.jcl

testrig135:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0135.jcl

testrig136:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0136.jcl

testrig137:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0137.jcl

testrig138:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0138.jcl

testrig139:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test0139.jcl

testrig9001:
	java -cp ./class:.:./antlr-4.7.2-complete.jar org.antlr.v4.gui.TestRig JCL startRule -gui -tokens < ./testdata/test9001.jcl

#testLocal:
#	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log

#testNist:
#	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log

./src/JCLLexer.tokens: 

./src/JCLParser.tokens: ./src/JCLLexer.tokens


#./class/TheCLI.class: 




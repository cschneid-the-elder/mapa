SEP = :
ifdef OS
    SEP = ;
endif

JC = javac
CP = "./class$(SEP)./lib/antlr-4.13.1-complete.jar"
JCOPT = -d ./class -g -Xlint -cp $(CP)
#JCOPT = -d ./class -g -cp $(CP)
JCOPT1 = -d ./class -cp $(CP)
AOPT = -visitor -listener
#AOPT = -o ./src -lib ./src -visitor -listener

./class/%.class: ./src/%.java
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./src/%.tokens: ./src/%.g4
	echo `date` $< >>build.log
	java -jar ./lib/antlr-4.13.1-complete.jar $(AOPT) -Xexact-output-dir -o $(dir $<) $<
	$(JC) $(JCOPT1) ./src/$**.java

all: ./src/DB2zSQLLexer.tokens ./src/DB2zSQLParser.tokens ./class/ValidatingListener.class ./class/SQLValidator.class

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig DB2zSQL startRule -gui -tokens < ./testdata/sql_$(n)

testtree:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig DB2zSQL startRule -tree -tokens < ./testdata/sql_$(n)

test:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	echo `date`
	./src/tester all
	echo `date`
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n)
endif

testdsnutil:
	echo `date` $@ $(n) >> build.log
	./src/tester dsnutil

jar:
	echo `date` $@ >> build.log
	jar vcf DB2zSQL.jar -C class DB2zSQL*.class

validatorjar:
	echo `date` $@ >> build.log
	jar vcfm SQLValidator.jar SQLValidatorManifest -C class SQLValidator.class class/ValidatingListener.class

./src/DB2zSQLLexer.tokens: 

./src/DB2zSQLParser.tokens: ./src/DB2zSQLLexer.tokens



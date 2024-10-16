# Copyright (C) 2021 - 2024 Craig Schneiderwent.
# Portions copyright (C) 2023 - 2024 Maarten van Haasteren.
# All rights reserved.

# The authors accept no liability for damages of any kind resulting from the use
# of this software.  Use at your own risk.

# This software may be modified and distributed under the terms
# of the MIT license. See the LICENSE file for details.

# Makefile for DB2z SQL ANTLR lexer and parser.
# 
# make init       - create class directory
# make            - generate lexer and parser, compile
# make clean      - clean out class directory and delete generated source
# 

SEP = :
ifdef OS
    SEP = ;
endif

JC = javac
CP = "./class$(SEP)./lib/antlr-4.13.2-complete.jar"
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
	java -jar ./lib/antlr-4.13.2-complete.jar $(AOPT) -Xexact-output-dir -o $(dir $<) $<
	$(JC) $(JCOPT1) ./src/$**.java

all: ./src/DB2zSQLLexer.tokens ./src/DB2zSQLParser.tokens

clean:
	echo 'cleaning directories'
	echo `date` $@ >>build.log
	rm -fR ./class
	rm -f ./src/*.interp
	rm -f ./src/*.tokens
	rm -f ./src/*.java

init:
	echo `date` $@ $(n) >> build.log
	if [ ! -d class ]; then mkdir class; fi

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig DB2zSQL startRule -gui -tokens < ./testdata/sql_$(n)

testtree:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig DB2zSQL startRule -tree -tokens < ./testdata/sql_$(n)

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
	jar cf DB2zSQL.jar -C class .


./src/DB2zSQLLexer.tokens: 

./src/DB2zSQLParser.tokens: ./src/DB2zSQLLexer.tokens



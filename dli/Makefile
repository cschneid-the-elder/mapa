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
# 

SEP = :
ifdef OS
    SEP = ;
endif

JC = javac
CP = "./class$(SEP)./antlr-4.13.2-complete.jar"
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
	java -jar ./antlr-4.13.2-complete.jar $(AOPT) -Xexact-output-dir -o $(dir $<) $<
	$(JC) $(JCOPT1) ./src/$**.java

all: ./src/DLILexer.tokens ./src/DLIParser.tokens

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
	java -cp "./class$(SEP)./antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig DLI startRule -gui -tokens < ./testdata/dli_$(n)

testtree:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP)./antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig DLI startRule -tree -tokens < ./testdata/dli_$(n)

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

jar:
	echo `date` $@ >> build.log
	jar cf DLI.jar -C class .

oldlexerfile := ./src/DLILexer.g4.$(shell date +%Y%m%d%H%M%S)
gentokens:
	echo `date` $@ >> build.log
# 
# sed '/^#.*$/d'         get rid of comment lines
# sed 's/^[@+]//g'       eliminate control chars
# sed 's/^[|]//g'        eliminate control chars
# sed 's/((.*))//g'      eliminate arguments
# sed 's/(.*)//g'        eliminate arguments
# sed 's/\[.*\]//g'      eliminate optional arguments
# sed 's/[ ]*$//g'       eliminate trailing spaces
# sed '/^$/d'            eliminate blank lines
# sort -u                get unique records
# 
	cat src/apiSource | sed '/^#.*$$/d' | sed 's/^[@+]//g' | sed 's/^[|]//g' | sed 's/((.*))//g' | sed 's/(.*)//g' | sed 's/\[.*\]//g' | sed 's/[ ]*$$//g' | sed '/^$$/d' | sort -u | ./src/genLexerTokens > ./src/testTokens
ifneq ("$(wildcard src/DLIParser.g4)","")
	mv src/DLILexer.g4 $(oldlexerfile)
endif
	cat src/DLILexerTemplate01 src/testTokens src/DLILexerTemplate02 > src/DLILexer.g4

oldparserfile := ./src/DLIParser.g4.$(shell date +%Y%m%d%H%M%S)
genrules:
	echo `date` $@ >> build.log
# 
# grep '^[@+]'           get just control records
# sed 's/(.*)//g'        eliminate arguments
# sed 's/\[.*\]//g'      eliminate optional arguments
# awk                    make @SOME\n+THING into SOME+THING
# ./genParserRules1      generate parser rules
# grep '^[^A-Z]'         eliminate duplicate lines from awk
# sed 's/;/;\n/g'        add blank line for readability
# 
	cat src/apiSource | grep '^[@+]' | sed 's/((.*))//g' | sed 's/(.*)//g' | sed 's/\[.*\]//g' | awk -v RS='^$$' -v ORS= '{gsub(/\n\+/,"+") gsub(/@/,"")} 1' | ./src/genParserRules1 | grep '^[^A-Z]' | sed 's/;/;\n/g' > src/testRules1
# 
# sed '/^#.*$/d'           get rid of comment lines
# sed 's/^[@+]//g'         eliminate control chars
# sed 's/^[|]//g'          eliminate control chars
# sed 's/[ \t]*$//g'       eliminate trailing spaces and tabs
# sed '/^$/d'              eliminate blank lines
# sed 's/((.*))/[arg]/g'   convert arguments to something predictable
# sed 's/(.*)/(arg)/g'     convert arguments to something predictable
# sort -u                  get unique records
# ./genParserRules2        generate parser rules
# 
	cat src/apiSource | sed '/^#.*$$/d' | sed '/^+=.*$$/d' | sed 's/^[@+]//g' | sed 's/^[|]//g' | sed 's/[ \t]*$$//g' | sed '/^$$/d' | sed 's/((.*))/[arg]/g' | sed 's/(.*)/(arg)/g' | sort -u | ./src/genParserRules2 > src/testRules2
	cat src/apiSource | ./src/genParserRules3 > src/testRules3
	cat src/testRules1 | ./src/genParserRules4 > src/testRules4
ifneq ("$(wildcard src/DLIParser.g4)","")
	mv src/DLIParser.g4 $(oldparserfile)
endif
	cat src/DLIParserTemplate01 src/testRules4 src/DLIParserTemplate02 src/testRules1 src/testRules3 src/testRules2 > src/DLIParser.g4

./src/DLILexer.tokens: 

./src/DLIParser.tokens: ./src/DLILexer.tokens



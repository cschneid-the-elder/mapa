# Copyright (C) 2021 - 2024 Craig Schneiderwent.
# Portions copyright (C) 2023 - 2024 Maarten van Haasteren.
# All rights reserved.

# The authors accept no liability for damages of any kind resulting from the use
# of this software.  Use at your own risk.

# This software may be modified and distributed under the terms
# of the MIT license. See the LICENSE file for details.

# Targets:
# 
# gentokens  generate tokens from source, construct lexer grammar
# genrules   generate rules from source, construct parser grammar
# 
# To the extent possible, maintenance should be done on the apiSource
# and spiSource files; and the CICSz*Template* files.
# 
# To build...
# 
# make gentokens
# make genrules
# make
# 

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

all: ./src/CICSzLexer.tokens ./src/CICSzParser.tokens

clean:
	echo 'cleaning directories'
	echo `date` $@ >>build.log
	rm -fR ./class
	rm -f ./src/*.interp
	rm -f ./src/*.tokens
	rm -f ./src/*.java

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig CICSz startRule -gui -tokens < ./testdata/cics_$(n)

testtree:
	echo `date` $@ $(n) >> build.log
	java -cp "./class$(SEP).$(SEP)./lib/antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig CICSz startRule -tree -tokens < ./testdata/cics_$(n)

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
	jar cf CICSz.jar -C class .

oldlexerfile := ./src/CICSzLexer.g4.$(shell date +%Y%m%d%H%M%S)
gentokens:
	echo `date` $@ >> build.log
# 
# sed '/^#.*$/d'         get rid of comment lines
# sed '/^+=.*$/d'        get rid of supplemental control lines
# sed 's/^[@+]//g'       eliminate control chars
# sed 's/(.*)//g'        eliminate arguments
# sed 's/\[.*\]//g'      eliminate optional arguments
# sed 's/[ ]*$//g'       eliminate trailing spaces
# sed '/^$/d'            eliminate blank lines
# sort -u                get unique records
# 
	cat src/apiSource src/spiSource | sed '/^#.*$$/d' | sed '/^+=.*$$/d' | sed 's/^[@+]//g' | sed 's/(.*)//g' | sed 's/\[.*\]//g' | sed 's/[ ]*$$//g' | sed '/^$$/d' | sort -u | ./src/genLexerTokens > ./src/testTokens
ifneq ("$(wildcard src/CICSzParser.g4)","")
	mv src/CICSzLexer.g4 $(oldlexerfile)
endif
	cat src/CICSzLexerTemplate01 src/testTokens src/CICSzLexerTemplate02 > src/CICSzLexer.g4

oldparserfile := ./src/CICSzParser.g4.$(shell date +%Y%m%d%H%M%S)
genrules:
	echo `date` $@ >> build.log
# 
# grep '^[@+]'           get just control records
# sed 's/(.*)//g'        eliminate arguments
# sed 's/\[.*\]//g'      eliminate optional arguments
# awk                    make @SOME\n+THING into SOME+THING
# ./genParserRules1      generate parser rules
# grep '^[^A-Z]\|^$'     eliminate duplicate lines from awk
# 
	cat src/apiSource src/spiSource | grep '^[@+]' | sed 's/(.*)//g' | sed 's/\[.*\]//g' | awk -v RS='^$$' -v ORS= '{gsub(/\n\+/,"+") gsub(/@/,"")} 1' | ./src/genParserRules1 | grep '^[^A-Z]\|^$$' > src/testRules1
# 
# sed '/^#.*$/d'           get rid of comment lines
# sed '/^+=.*$/d'          get rid of supplemental control lines
# sed 's/^[@+]//g'         eliminate control chars
# sed 's/[ \t]*$//g'       eliminate trailing spaces and tabs
# sed '/^$/d'              eliminate blank lines
# sed 's/(.*)/(arg)/g'     convert arguments to something predictable
# sed 's/\[.*\]/\[arg\]/g' convert optional arguments to something predictable
# sort -u                  get unique records
# ./genParserRules2        generate parser rules
# 
	cat src/apiSource src/spiSource | sed '/^#.*$$/d' | sed '/^+=.*$$/d' | sed 's/^[@+]//g' | sed 's/[ \t]*$$//g' | sed '/^$$/d' | sed 's/(.*)/(arg)/g' | sed 's/\[.*\]/\[arg\]/g' | sort -u | ./src/genParserRules2 > src/testRules2
	cat src/apiSource src/spiSource | ./src/genParserRules3 > src/testRules3
	cat src/testRules1 | ./src/genParserRules4 > src/testRules4
	csplit --suppress-matched --elide-empty-files --prefix=src/testRules4_ src/testRules4 /=/ '{*}'
ifneq ("$(wildcard src/CICSzParser.g4)","")
	mv src/CICSzParser.g4 $(oldparserfile)
endif
	cat src/CICSzParserTemplate01 src/testRules4_00 src/CICSzParserTemplate02 src/testRules4_01 src/CICSzParserTemplate03 src/testRules1 src/testRules3 src/testRules2 > src/CICSzParser.g4

./src/CICSzLexer.tokens: 

./src/CICSzParser.tokens: ./src/CICSzLexer.tokens



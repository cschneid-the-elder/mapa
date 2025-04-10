#!/usr/bin/env bash

# these files are obsolete and not used in the original Makefile
mv ./src/JCLNotifyWhenLexer.g4 ./src/JCLNotifyWhenLexer.g4.backup
mv ./src/JCLNotifyWhenParser.g4 ./src/JCLNotifyWhenParser.g4.backup
# moves all Java file and ANTLR grammar files to the new package
./move_java_files_to_package.sh "src" "cschneid.mapa.jcl"
# Internally uses Maven to compile Java and ANTLR grammar in the new package and creates .jar files in the ./target/ directory
make clean
make all


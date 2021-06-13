
JC = javac
CP = "./class:./lib/commons-cli-1.4.jar:./lib/antlr-4.9.2-complete.jar"
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
	java -jar ./lib/antlr-4.9.2-complete.jar $(AOPT) $<
	$(JC) $(JCOPT1) ./src/$**.java
	

all: ./src/CobolLexer.tokens ./src/CobolParser.tokens ./src/CobolPreprocessorLexer.tokens ./src/CobolPreprocessorParser.tokens ./class/TerminalNodeWrapper.class ./class/LiteralWrapper.class ./class/CharDataKeywordWrapper.class ./class/CobolProgram.class ./class/ProgramListener.class ./class/CobolWordWrapper.class ./class/PseudoTextWrapper.class ./class/CharDataWrapper.class ./class/FilenameWrapper.class ./class/CobolPreprocessorParserTerminalNodeListener.class ./class/CharDataLineWrapper.class ./class/CobolPreprocessorParserCharDataLineListener.class ./class/DirectoryPhrase.class ./class/ReplaceClause.class ./class/CobolWord.class ./class/AssignClause.class ./class/Literal.class ./class/CicsKeywordWithArg.class ./class/ExecCicsStatementType.class ./class/ExecCicsStatement.class ./class/CallEtAlListener.class ./class/DataDescriptionEntryListener.class ./class/DDNode.class ./class/CallWrapper.class ./class/TheCLI.class ./class/TestIntegration.class ./class/CallType.class ./class/IdDivListener.class ./class/CopyReplaceParent.class ./class/CopyStatement.class ./class/ReplaceOffStatement.class ./class/ReplaceStatement.class ./class/DataLocation.class ./class/CompilerDirectingStatementListener.class ./class/CompilerOptionsWrapper.class ./class/CondCompToken.class ./class/CondCompCondition.class ./class/CondCompLogicOp.class ./class/CondCompArithOp.class ./class/CondCompGroupOp.class ./class/CondCompVar.class ./class/CondCompComparisonOp.class ./class/CondCompSimpleRelationalCondition.class ./class/CondCompBinaryCondition.class ./class/CondCompDefinedCondition.class ./class/CondCompRelationalCondition.class ./class/CondCompArithmeticAtom.class ./class/CondCompArithmeticExpression.class ./class/CompilerDirectingStatement.class ./class/CondCompStmtIf.class ./class/CondCompStmtElse.class ./class/CondCompStmtEndIf.class ./class/CondCompEvaluateSelection.class ./class/CondCompStmtEvaluate.class ./class/CondCompStmtWhen.class ./class/CondCompStmtEndEvaluate.class ./class/ConditionalCompilationStatement.class ./class/CondCompStmtDefine.class ./class/CobolSource.class ./class/Identifier.class ./class/QualifiedDataName.class ./class/QualifiedDataNameFormat1.class ./class/QualifiedInData.class ./class/DataName.class ./class/InData.class ./class/InTable.class ./class/TableCall.class ./class/MoveStatement.class

.PHONY: all clean cleanmine mine jar testLocal testLocalx testNist testrig testrigpp testrigppx testrigppnist ziplogs

clean:
	echo `date` $@ >> build.log
	rm -f ./src/CobolLexer*.java ./class/CobolLexer*.class ./src/CobolLexer*.tokens ./src/CobolLexer*.interp ./src/CobolParser*.java ./class/CobolParser*.class ./src/CobolParser.tokens ./src/CobolParser.interp ./src/CobolPreprocessor*.java ./class/CobolPreprocessor*.class ./src/CobolPreprocessor*.tokens ./src/CobolPreprocessor*.interp

cleanmine:
	echo `date` $@ >> build.log
	rm -f ./class/TerminalNodeWrapper.class ./class/LiteralWrapper.class ./class/CharDataKeywordWrapper.class /class/CobolProgram.class ./class/ProgramListener.class ./class/CobolWordWrapper.class ./class/PseudoTextWrapper.class ./class/CharDataWrapper.class ./class/FilenameWrapper.class ./class/CobolPreprocessorParserTerminalNodeListener.class ./class/CharDataLineWrapper.class ./class/CobolPreprocessorParserCharDataLineListener.class ./class/DirectoryPhrase.class ./class/ReplaceClause.class ./class/CobolProgram.class ./class/CobolWord.class ./class/AssignClause.class ./class/Literal.class ./class/CicsKeywordWithArg.class ./class/ExecCicsStatementType.class ./class/ExecCicsStatement.class ./class/CallEtAlListener.class ./class/DataDescriptionEntryListener.class ./class/DDNode.class ./class/CallWrapper.class ./class/TheCLI.class ./class/TestIntegration.class ./class/CallType.class ./class/IdDivListener.class ./class/CopyReplaceParent.class ./class/CopyStatement.class ./class/ReplaceOffStatement.class ./class/ReplaceStatement.class ./class/CompilerDirectingStatementListener.class ./class/CompilerOptionsWrapper.class ./class/CondCompToken.class ./class/CondCompCondition.class ./class/CondCompLogicOp.class ./class/CondCompArithOp.class ./class/CondCompGroupOp.class ./class/CondCompVar.class ./class/CondCompComparisonOp.class ./class/CondCompSimpleRelationalCondition.class ./class/CondCompBinaryCondition.class ./class/CondCompDefinedCondition.class ./class/CondCompRelationalCondition.class ./class/CondCompArithmeticAtom.class ./class/CondCompArithmeticExpression.class ./class/CompilerDirectingStatement.class ./class/CondCompStmtIf.class ./class/CondCompStmtElse.class ./class/CondCompStmtEndIf.class ./class/CondCompEvaluateSelection.class ./class/CondCompStmtEvaluate.class ./class/CondCompStmtWhen.class ./class/CondCompStmtEndEvaluate.class ./class/ConditionalCompilationStatement.class ./class/CondCompStmtDefine.class ./class/CobolSource.class ./class/Identifier.class ./class/QualifiedDataName.class ./class/QualifiedDataNameFormat1.class ./class/QualifiedInData.class ./class/DataName.class ./class/InData.class ./class/InTable.class ./class/TableCall.class ./class/MoveStatement.class

mine:
	echo `date` $@ >> build.log
	$(JC) $(JCOPT) ./src/TerminalNodeWrapper.java ./src/LiteralWrapper.java ./src/CharDataKeywordWrapper.java ./src/CobolWordWrapper.java ./src/PseudoTextWrapper.java ./src/CharDataWrapper.java ./src/FilenameWrapper.java ./src/CharDataLineWrapper.java ./src/CobolPreprocessorParserTerminalNodeListener.java ./src/DirectoryPhrase.java ./src/ReplaceClause.java ./src/CobolProgram.java ./src/ProgramListener.java ./src/CobolWord.java ./src/AssignClause.java ./src/Literal.java ./src/CicsKeywordWithArg.java ./src/ExecCicsStatementType.java ./src/ExecCicsStatement.java ./src/CallEtAlListener.java ./src/DataDescriptionEntryListener.java ./src/DDNode.java ./src/CallWrapper.java ./src/TheCLI.java ./src/CompilerOptionsWrapper.java ./src/CompilerDirectingStatementListener.java ./src/TestIntegration.java ./src/CallType.java ./src/IdDivListener.java ./src/CopyReplaceParent.java ./src/CopyStatement.java ./src/ReplaceOffStatement.java ./src/ReplaceStatement.java ./src/DataLocation.java ./src/CondCompToken.java ./src/CondCompCondition.java ./src/CondCompLogicOp.java ./src/CondCompArithOp.java ./src/CondCompGroupOp.java ./src/CondCompVar.java ./src/CondCompComparisonOp.java ./src/CondCompSimpleRelationalCondition.java ./src/CondCompBinaryCondition.java ./src/CondCompDefinedCondition.java ./src/CondCompRelationalCondition.java ./src/CondCompArithmeticAtom.java ./src/CondCompArithmeticExpression.java ./src/CompilerDirectingStatement.java ./src/CondCompStmtIf.java ./src/CondCompStmtElse.java ./src/CondCompStmtEndIf.java ./src/CondCompEvaluateSelection.java ./src/CondCompStmtEvaluate.java ./src/CondCompStmtWhen.java ./src/CondCompStmtEndEvaluate.java ./src/ConditionalCompilationStatement.java ./src/CondCompStmtDefine.java ./src/CobolSource.java ./src/Identifier.java ./src/QualifiedDataName.java ./src/QualifiedDataNameFormat1.java ./src/QualifiedInData.java ./src/DataName.java ./src/InData.java ./src/InTable.java ./src/TableCall.java ./src/MoveStatement.java

evaluate:
	echo `date` $@ >> build.log
	$(JC) $(JCOPT) ./src/CondCompEvaluateSelection.java ./src/CondCompStmtEvaluate.java ./src/CondCompStmtWhen.java ./src/CondCompStmtEndEvaluate.java

qdn:
	echo `date` $@ >> build.log
	$(JC) $(JCOPT) ./src/Identifier.java ./src/QualifiedDataName.java ./src/QualifiedDataNameFormat1.java ./src/QualifiedInData.java ./src/DataName.java ./src/InData.java ./src/InTable.java ./src/TableCall.java

jar:
	echo `date` $@ >> build.log
	jar cfm CallTree.jar manifest -C class .

testLocal:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log
else
	echo `date` $@ $(n) >> build.log
	java -jar CallTree.jar -unitTest -file testdata/local/testantlr$(n).cbl -copy /home/craig/mapa/cobol/testdata/local -logLevel FINEST -saveTemp -out callListLocal$(n).log
endif

testLocalx:
ifeq ($(strip $(n)),)
	#echo `date` $@ >> build.log
	#java -jar CallTree.jar -unitTest -fileList testList90 -copy /home/craig/mapa/cobol/testdata/local -out callListLocal.log
else
	echo `date` $@ $(n) >> build.log
ifeq ($(wildcard /home/craig/mapa/cobol/testdata/local/test$(n).def),)
	java -jar CallTree.jar -file testdata/local/test$(n).cbl -copy /home/craig/mapa/cobol/testdata/local -logLevel FINEST -saveTemp -out callListLocalx$(n).log
else
	java -jar CallTree.jar -file testdata/local/test$(n).cbl -copy /home/craig/mapa/cobol/testdata/local -defList /home/craig/mapa/cobol/testdata/local/test$(n).def -logLevel FINEST -saveTemp -out callListLocalx$(n).log
endif
endif

testNist:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	java -jar CallTree.jar -fileList nistList -copy /home/craig/mapa/cobol/testdata/nist -out callListNist.log
else
	echo `date` $@ $(n) >> build.log
	java -jar CallTree.jar -file testdata/nist/$(n) -copy /home/craig/mapa/cobol/testdata/nist -logLevel FINEST -saveTemp -out callListNist$(n).log
endif

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig Cobol startRule -gui -tokens < ./testdata/local/testantlr$(n).cbl

testrigpp:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig CobolPreprocessor startRule -gui -tokens < ./testdata/local/testantlr$(n).cbl

testrigx:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig Cobol startRule -gui -tokens < ./testdata/local/test$(n).cbl

testrignist:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig Cobol startRule -gui -tokens < ./testdata/nist/$(n)

testrigppx:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig CobolPreprocessor startRule -gui -tokens < ./testdata/local/test$(n).cbl

testrigppnist:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig CobolPreprocessor startRule -gui -tokens < ./testdata/nist/$(n)

ziplogs:
	echo `date` $@ >> build.log
	zip -DjmTv9 testintegrationlogs TestIntegration-*.log

./src/CobolLexer.tokens: 

./src/CobolParser.tokens: ./src/CobolLexer.tokens

./src/CobolPreprocessorLexer.tokens: 

./src/CobolPreprocessorParser.tokens: ./src/CobolPreprocessorLexer.tokens

./class/CallType.class: 

./class/DataLocation.class:

./class/CallEtAlListener.class: ./class/CallWrapper.class ./class/ExecCicsStatement.class 

./class/DataDescriptionEntryListener.class: ./class/DataLocation.class

./class/DDNode.class: ./class/DataLocation.class

./class/CallWrapper.class: ./class/CallType.class ./class/DDNode.class ./class/ExecCicsStatement.class 

./class/ExecCicsStatement.class: ./class/CicsKeywordWithArg.class ./class/ExecCicsStatementType.class

./class/CicsKeywordWithArg.class: ./class/Literal.class

./class/CopyStatement.class: 

./class/IdDivListener.class: 

./class/CobolProgram.class:

./class/CompilerDirectingStatementListener.class:

./class/TheCLI.class ./class/CharDataLineWrapper.class ./class/TerminalNodeWrapper.class ./class/CobolPreprocessorParserTerminalNodeListener.class ./class/CopyReplaceParent.class ./class/CopyStatement.class ./class/ReplaceStatement.class: ./src/CobolPreprocessorParser.java

#./class/CondCompSimpleArithmeticExpression.class:

./class/TestIntegration.class: ./class/CopyStatement.class ./class/TheCLI.class ./class/IdDivListener.class ./class/DDNode.class ./class/DataDescriptionEntryListener.class ./class/CallEtAlListener.class ./class/CompilerDirectingStatementListener.class ./class/CompilerOptionsWrapper.class ./class/CondCompVar.class

./class/CompilerDirectingStatementListener.class: ./class/CompilerDirectingStatement.class ./class/CondCompVar.class ./class/CompilerOptionsWrapper.class ./class/ReplaceStatement.class ./class/ReplaceOffStatement.class ./class/CopyStatement.class ./class/CondCompStmtDefine.class ./class/CondCompStmtIf.class ./class/CondCompStmtElse.class ./class/CondCompStmtEndIf.class ./class/CondCompStmtEvaluate.class ./class/CondCompStmtWhen.class ./class/CondCompStmtEndEvaluate.class

./class/CondCompLogicOp.class ./class/CondCompArithOp.class ./class/CondCompGroupOp.class ./class/CondCompVar.class ./class/CondCompComparisonOp.class ./class/CondCompSimpleRelationalCondition.class ./class/CondCompBinaryCondition.class ./class/CondCompDefinedCondition.class ./class/CondCompRelationalCondition.class ./CondCompArithmeticExpression.class : ./class/CondCompToken.class

./class/CondCompSimpleRelationalCondition.class ./class/CondCompBinaryCondition.class ./class/CondCompDefinedCondition.class ./class/CondCompRelationalCondition.class : ./class/CondCompCondition.class

./class/CondCompVar.class : ./class/CondCompComparisonOp.class

./class/CondCompStmtIf.class ./class/CondCompStmtElse.class ./class/CondCompStmtEndIf.class ./class/CondCompStmtEvaluate.class ./class/CondCompStmtWhen.class ./class/CondCompStmtEndEvaluate.class: ./class/ConditionalCompilationStatement.class

./class/CondCompStmtIf.class: ./class/CondCompStmtElse.class

./class/CompilerOptionsWrapper.class ./class/ReplaceOffStatement.class ./class/ReplaceStatement.class ./class/CopyStatement.class ./class/CondCompStmtDefine.class: ./class/CompilerDirectingStatement.class

./class/ReplaceStatement.class: ./class/ReplaceOffStatement.class

./class/ReplaceStatement.class ./class/CopyStatement.class: ./class/CopyReplaceParent.class


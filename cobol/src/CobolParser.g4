/*
 Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 All rights reserved.

 Portions copyright (C) 2019 - 2022, Craig Schneiderwent.  All rights reserved.

 This software may be modified and distributed under the terms
 of the MIT license. See the LICENSE file for details.
*/

/*
 COBOL Grammar for ANTLR4

 This is a COBOL grammar, which is part of the COBOL parser at
 https://github.com/uwol/proleap-cobol-parser.
*/

parser grammar CobolParser;

options {tokenVocab=CobolLexer;}

@parser::members {

   /*
   The functionNames collection is used to distinguish between a
   tableCall and a function invocation, which are in some cases
   syntactically identical.  The collection is populated in 
   members of the repositoryParagraph rule.
   */
   public java.util.HashSet<String> functionNames = new java.util.HashSet();

}

startRule : compilationUnit | (specialRegister | identifier | literal | constantEntry | dataDescriptionEntry)* EOF;

compilationUnit
   : programUnit*
   ;

programUnit
   : identificationDivision environmentDivision? dataDivision? procedureDivision? programUnit* endProgramUnitStatement? classicCommentEntry*
   ;

classicCommentEntry
    : CLASSIC_COMMENTLINE
    ;

endProgramUnitStatement
   : (endProgramStatement 
   | endClassStatement
   | endFunctionStatement
   | endMethodStatement
   | endInterfaceStatement
   | endFactoryStatement
   | endObjectStatement
   )
   ;
   
endClassStatement
   : END CLASS className (DOT_FS | DOT)
   ;

endFunctionStatement
   : END FUNCTION userFunctionName (DOT_FS | DOT)
   ;

endMethodStatement
   : END METHOD methodName? (DOT_FS | DOT)
   ;

endInterfaceStatement
   : END INTERFACE interfaceName (DOT_FS | DOT)
   ;

endFactoryStatement
   : END FACTORY (DOT_FS | DOT)
   ;

endObjectStatement
   : END OBJECT (DOT_FS | DOT)
   ;

endProgramStatement
   : END PROGRAM programName (DOT_FS | DOT)
   ;

// --- identification division --------------------------------------------------------------------

identificationDivision
   : (IDENTIFICATION | ID) DIVISION (DOT_FS | DOT)
     (programIdParagraph | classIdParagraph | functionIdParagraph | functionPrototypeIdParagraph | interfaceIdParagraph | methodIdParagraph | objectParagraph | factoryParagraph)
     identificationDivisionBody*
   ;

identificationDivisionBody
   : authorParagraph | installationParagraph | dateWrittenParagraph | dateCompiledParagraph | securityParagraph | remarksParagraph | optionsParagraph | entryInterfaceParagraph | entryNameParagraph
   ;

// - program id paragraph ----------------------------------

programIdParagraph
   : PROGRAM_ID (DOT | DOT_FS)
     programName (AS literal)? (IS? (COMMON | INITIAL | LIBRARY | DEFINITION | RECURSIVE | PROTOTYPE) PROGRAM?)? (DOT_FS | DOT)? commentEntry?
   ;

// - class id paragraph --------------------------------

classIdParagraph
   : CLASS_ID (DOT | DOT_FS)
     className (AS literal)?
     (IS? FINAL)?
     (INHERITS FROM? inheritedClassName+)?
     (USING cobolWord+)?
     (DOT | DOT_FS)
   ;

// - factory paragraph ---------------------------------

factoryParagraph
   : FACTORY (DOT | DOT_FS) (IMPLEMENTS interfaceName+ (DOT | DOT_FS))?
   ;

// - function id paragraph -----------------------------

functionIdParagraph
   : FUNCTION_ID (DOT | DOT_FS) 
     userFunctionName (AS literal)?
     (DOT | DOT_FS)
   ;

// - function prototype id paragraph -----------------------------

functionPrototypeIdParagraph
   : FUNCTION_ID (DOT | DOT_FS) 
     functionPrototypeNameClause 
     IS? PROTOTYPE
     entryNameClause?
     entryInterfaceClause?
     (DOT | DOT_FS)
   ;

functionPrototypeNameClause
   : functionPrototypeName (AS literal)?
   ;

entryNameClause
   : ENTRY_NAME IS? (COMPAT | LONGUPPER | LONGMIXED)
   ;

entryInterfaceClause
   : ENTRY_INTERFACE IS? (STATIC | DYNAMIC | DLL)
   ;

// - entry interface paragraph -----------------------------

entryInterfaceParagraph
   : ENTRY_INTERFACE
     (DOT | DOT_FS)
   ;

// - entry name paragraph -----------------------------

entryNameParagraph
   : ENTRY_NAME
     (DOT | DOT_FS)
   ;

// - interface id paragraph ----------------------------

interfaceIdParagraph
   : INTERFACE_ID (DOT | DOT_FS)
     interfaceName (AS literal)?
     (IS? FINAL)?
     (INHERITS FROM? inheritedInterfaceName+)?
     (USING cobolWord+)?
     (DOT | DOT_FS)
   ;

// - method id paragraph -------------------------------

methodIdParagraph
   : METHOD_ID (DOT | DOT_FS)
     ((methodName (AS literal)?)
     | ((GET | SET) PROPERTY propertyName))
     OVERRIDE? (IS? FINAL)?
     (DOT | DOT_FS)
   ;

// - object paragraph ----------------------------------

objectParagraph
   : OBJECT (DOT | DOT_FS) (IMPLEMENTS interfaceName+ (DOT | DOT_FS))?
   ;

// - options paragraph ---------------------------------

optionsParagraph
   : OPTIONS (DOT | DOT_FS) (optionsParagraphBody+ (DOT | DOT_FS))?
   ;

optionsParagraphBody
   : (arithmeticClause
     | defaultRoundedClause
     | entryConventionClause
     | floatBinaryClause
     | floatDecimalClause
     | initializeClause
     | intermediateRoundingClause
     )
   ;
   
arithmeticClause
   : ARITHMETIC IS? (NATIVE | STANDARD_BINARY | STANDARD_DECIMAL)
   ;
   
defaultRoundedClause
   : DEFAULT ROUNDED MODE? IS? roundedMode
   ;

roundedMode
   : (AWAY_FROM_ZERO
     | NEAREST_AWAY_FROM_ZERO
     | NEAREST_EVEN
     | NEAREST_TOWARD_ZERO
     | PROHIBITED
     | TOWARD_GREATER
     | TOWARD_LESSER
     | TRUNCATION
     )
   ;

roundedPhrase
   : ROUNDED (MODE IS? roundedMode)?
   ;

entryConventionClause
   : ENTRY_CONVENTION IS? (COBOL | IDENTIFIER)
   ;

floatBinaryClause
   : FLOAT_BINARY DEFAULT? IS? endiannessPhrase
   ;

floatDecimalClause
   : FLOAT_DECIMAL DEFAULT? IS? (encodingPhrase | endiannessPhrase)
   ;

encodingPhrase
   : (BINARY_ENCODING | DECIMAL_ENCODING)
   ;

endiannessPhrase
   : (HIGH_ORDER_LEFT | HIGH_ORDER_RIGHT)
   ;

initializeClause
   : INITIALIZE 
     (ALL | LOCAL_STORAGE | SCREEN | WORKING_STORAGE) 
     SECTION? TO? 
     ((BINARY ZEROES) | literal | SPACES)
   ;

intermediateRoundingClause
   : ( NEAREST_AWAY_FROM_ZERO
     | NEAREST_EVEN
     | PROHIBITED
     | TRUNCATION
     )
   ;

// - author paragraph ----------------------------------

authorParagraph
   : authorParagraphHeading authorParagraphText*
   ;

authorParagraphHeading
   : AUTHOR_TAG
   ;

authorParagraphText
   : freeFormText
   ;

// - installation paragraph ----------------------------------

installationParagraph
   : INSTALLATION_TAG freeFormText*
   ;

// - date written paragraph ----------------------------------

dateWrittenParagraph
   : DATE_WRITTEN_TAG freeFormText*
   ;

// - date compiled paragraph ----------------------------------

dateCompiledParagraph
   : DATE_COMPILED_TAG freeFormText*
   ;

// - security paragraph ----------------------------------

securityParagraph
   : SECURITY_TAG freeFormText*
   ;

// - remarks paragraph ----------------------------------

remarksParagraph
   : REMARKS_TAG freeFormText*
   ;

// --- environment division --------------------------------------------------------------------

environmentDivision
   : ENVIRONMENT_TAG DIVISION (DOT_FS | DOT) environmentDivisionBody*
   ;

environmentDivisionBody
   : configurationSection | specialNamesParagraph | inputOutputSection
   ;

// -- configuration section ----------------------------------

configurationSection
   : CONFIGURATION SECTION (DOT_FS | DOT) configurationSectionParagraph*
   ;

// - configuration section paragraph ----------------------------------

configurationSectionParagraph
   : sourceComputerParagraph | objectComputerParagraph | specialNamesParagraph | respositoryParagraph
   ;

// - source computer paragraph ----------------------------------

sourceComputerParagraph
   : SOURCE_COMPUTER (DOT_FS | DOT) (computerName (WITH? DEBUGGING MODE)? (DOT_FS | DOT))?
   ;

// - object computer paragraph ----------------------------------

objectComputerParagraph
   : OBJECT_COMPUTER (DOT_FS | DOT) (computerName? objectComputerClause* (DOT_FS | DOT))?
   ;

objectComputerClause
   : memorySizeClause | diskSizeClause | collatingSequenceClause | segmentLimitClause | characterSetClause | characterClassificationClause
   ;

memorySizeClause
   : MEMORY SIZE? (integerLiteral | cobolWord) (WORDS | CHARACTERS | MODULES)?
   ;

diskSizeClause
   : DISK SIZE? IS? (integerLiteral | cobolWord) (WORDS | MODULES)?
   ;

collatingSequenceClause
   : PROGRAM? COLLATING? SEQUENCE ((IS? alphabetName+) | collatingSequenceClauseAlphanumeric | collatingSequenceClauseNational)
   ;

collatingSequenceClauseAlphanumeric
   : FOR? ALPHANUMERIC IS? alphabetName
   ;

collatingSequenceClauseNational
   : FOR? NATIONAL IS? alphabetName
   ;

segmentLimitClause
   : SEGMENT_LIMIT IS? integerLiteral
   ;

characterSetClause
   : CHARACTER SET (DOT_FS | DOT)
   ;

characterClassificationClause
   : CHARACTER? CLASSIFICATION ((IS? localePhrase+) | characterClassificationClauseAlphanumeric | characterClassificationClauseNational)
   ;

characterClassificationClauseAlphanumeric
   : FOR? ALPHANUMERIC IS? localePhrase
   ;

characterClassificationClauseNational
   : FOR? NATIONAL IS? localePhrase
   ;

localePhrase
   : (IDENTIFIER | LOCALE | SYSTEM_DEFAULT | USER_DEFAULT)
   ;

// - special names paragraph ----------------------------------

specialNamesParagraph
   : SPECIAL_NAMES (DOT_FS | DOT) (specialNameClause+ (DOT_FS | DOT))?
   ;

specialNameClause
   : (channelClause 
   | odtClause 
   | alphabetClause 
   | classClause+ 
   | currencySignClause+
   | decimalPointClause 
   | symbolicCharactersClause+ 
   | environmentSwitchNameClause 
   | defaultDisplaySignClause 
   | defaultComputationalSignClause 
   | reserveNetworkClause 
   | xmlSchemaClause+
   | crtStatusClause
   | cursorClause
   | dynamicLengthStructureClause
   | localeClause
   | orderTableClause)
   ;

alphabetClause
   : alphabetClauseFormat1+ | alphabetClauseFormat2+
   ;

alphabetClauseFormat1
   : ALPHABET alphabetName (FOR? ALPHANUMERIC)? IS? ((LOCALE localeName?) | EBCDIC | ASCII | STANDARD_1 | STANDARD_2 | NATIVE | cobolWord | alphabetLiterals+) COMMACHAR?
   ;

alphabetLiterals
   : literal (alphabetThrough | alphabetAlso+)?
   ;

alphabetThrough
   : (THROUGH | THRU) literal
   ;

alphabetAlso
   : ALSO literal+
   ;

alphabetClauseFormat2
   : ALPHABET alphabetName FOR? NATIONAL IS? ((LOCALE localeName?) | NATIVE | (CCSVERSION literal) | UCS_4 | UTF_8 | UTF_16 | IDENTIFIER | alphabetLiterals+)
   ;

channelClause
   : CHANNEL integerLiteral IS? mnemonicName
   ;

classClause
   : CLASS className (FOR? (ALPHANUMERIC | NATIONAL))? IS? classClauseThrough+ (IN alphabetName)?
   ;

classClauseThrough
   : classClauseFrom ((THROUGH | THRU) classClauseTo)?
   ;

classClauseFrom
   : identifier | literal
   ;

classClauseTo
   : identifier | literal
   ;

currencySignClause
   : CURRENCY SIGN? IS? literal (WITH? PICTURE SYMBOL literal)?
   ;

decimalPointClause
   : DECIMAL_POINT IS? COMMA
   ;

defaultComputationalSignClause
   : DEFAULT (COMPUTATIONAL | COMP)? (SIGN IS?)? (LEADING | TRAILING)? (SEPARATE CHARACTER?)
   ;

defaultDisplaySignClause
   : DEFAULT_DISPLAY (SIGN IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
   ;

environmentSwitchNameClause
   : environmentName ((IS? mnemonicName environmentSwitchNameSpecialNamesStatusPhrase?) | environmentSwitchNameSpecialNamesStatusPhrase)
   ;

environmentSwitchNameSpecialNamesStatusPhrase
   : ON STATUS? IS? dataName (OFF STATUS? IS? dataName)? | OFF STATUS? IS? dataName (ON STATUS? IS? dataName)?
   ;

odtClause
   : ODT IS? mnemonicName
   ;

reserveNetworkClause
   : RESERVE WORDS? LIST? IS? NETWORK CAPABLE?
   ;

symbolicCharactersClause
   : SYMBOLIC CHARACTERS? (FOR? (ALPHANUMERIC | NATIONAL))? symbolicCharacters+ (IN alphabetName)?
   ;

symbolicCharacters
   : symbolicCharacter+ (IS | ARE)? integerLiteral+
   ;

xmlSchemaClause
   : XML_SCHEMA identifier IS? (identifier | literal)
   ;

crtStatusClause
   : CRT STATUS IS? dataName
   ;

cursorClause
   : CURSOR IS? dataName
   ;

dynamicLengthStructureClause
   : DYNAMIC LENGTH STRUCTURE? dataName IS?
     ((SIGNED? SHORT? PREFIXED) | DELIMITED | dataName)
   ;

localeClause
   : LOCALE localeName IS? (cobolWord | literal)
   ;

orderTableClause
   : ORDER TABLE cobolWord IS? literal
   ;

// - repository paragraph -----------------------------------

respositoryParagraph
   : REPOSITORY (DOT_FS | DOT) (classIsPhrase | interfaceSpecifier | functionIntrinsicPhrase | programSpecifier | propertySpecifier | userDefinedFunctionSpecifier)* (DOT_FS | DOT)?
   ;

classIsPhrase
   : (CLASS className (IS IDENTIFIER)? (EXPANDS className USING className+)? (DOT_FS | DOT)?)
   ;

interfaceSpecifier
   : (INTERFACE interfaceName (AS literal)? (EXPANDS interfaceName USING className+)? (DOT_FS | DOT)?)
   ;
   
functionIntrinsicPhrase
   : (FUNCTION (ALL | intrinsicFunctionName+) INTRINSIC (DOT_FS | DOT)?)
   {
      if ($ALL.text == null) {
         //functionNames.add($intrinsicFunctionName.text.toUpperCase());
         /*
         This is entirely to cozy with ANTLR internals, but I see no other way.
         */
         for (IntrinsicFunctionNameContext ifnCtx : _localctx.intrinsicFunctionName()) {
         	functionNames.add(ifnCtx.getText().toUpperCase());
         }
      } else {
         /* 
         oh, how I wish it could be otherwise; yes this is a list of
         the intrinsicFunctionNames token values
         */
         List<String> funcs = List.of(
            "ABS"
            ,"ACOS"
            ,"ANNUITY"
            ,"ASIN"
            ,"ATAN"
            ,"BIT-OF"
            ,"BIT-TO-CHAR"
            ,"BYTE-LENGTH"
            ,"CHAR"
            ,"COMBINED-DATETIME"
            ,"COS"
            ,"CURRENT-DATE"
            ,"DATE-OF-INTEGER"
            ,"DATE-TO-YYYYMMDD"
            ,"DAY-OF-INTEGER"
            ,"DAY-TO-YYYYDDD"
            ,"DISPLAY-OF"
            ,"E-FUNC"
            ,"EXP"
            ,"EXP10"
            ,"FACTORIAL"
            ,"FORMATTED-CURRENT-DATE"
            ,"FORMATTED-DATE"
            ,"FORMATTED-DATETIME"
            ,"FORMATTED-TIME"
            ,"HEX-OF"
            ,"HEX-TO-CHAR"
            ,"INTEGER"
            ,"INTEGER-OF-DATE"
            ,"INTEGER-OF-DAY"
            ,"INTEGER-OF-FORMATTED-DATE"
            ,"INTEGER-PART"
            ,"LENGTH"
            ,"LOG"
            ,"LOG10"
            ,"LOWER-CASE"
            ,"MAX"
            ,"MEAN"
            ,"MEDIAN"
            ,"MIDRANGE"
            ,"MIN"
            ,"MOD"
            ,"NATIONAL-OF"
            ,"NUMVAL"
            ,"NUMVAL-C"
            ,"NUMVAL-F"
            ,"ORD"
            ,"ORD-MAX"
            ,"ORD-MIN"
            ,"PI"
            ,"PRESENT-VALUE"
            ,"RANDOM"
            ,"RANGE"
            ,"REM"
            ,"REVERSE"
            ,"SECONDS-FROM-FORMATTED-TIME"
            ,"SECONDS-PAST-MIDNIGHT"
            ,"SIGN"
            ,"SIN"
            ,"SQRT"
            ,"STANDARD-DEVIATION"
            ,"SUM"
            ,"TAN"
            ,"TEST-DATE-YYYYMMDD"
            ,"TEST-DAY-YYYYDDD"
            ,"TEST-FORMATTED-DATETIME"
            ,"TEST-NUMVAL"
            ,"TEST-NUMVAL-C"
            ,"TEST-NUMVAL-F"
            ,"TRIM"
            ,"ULENGTH"
            ,"UPOS"
            ,"UPPER-CASE"
            ,"USUBSTR"
            ,"USUPPLEMENTARY"
            ,"UUID4"
            ,"UVALID"
            ,"UWIDTH"
            ,"VARIANCE"
            ,"WHEN-COMPILED"
            ,"YEAR-TO-YYYY"
            ,"BASECONVERT"
            ,"BOOLEAN-OF-INTEGER"
            ,"CHAR-NATIONAL"
            ,"CONCAT"
            ,"CONTENT-OF"
            ,"CONVERT"
            ,"EXCEPTION-FILE"
            ,"EXCEPTION-FILE-N"
            ,"EXCEPTION-LOCATION"
            ,"EXCEPTION-LOCATION-N"
            ,"EXCEPTION-STATEMENT"
            ,"EXCEPTION-STATUS"
            ,"FIND-STRING"
            ,"FRACTION-PART"
            ,"HIGHEST-ALGEBRAIC"
            ,"INTEGER-OF-BOOLEAN"
            ,"LOCALE-COMPARE"
            ,"LOCALE-DATE"
            ,"LOCALE-TIME"
            ,"LOCAL-TIME-FROM-SECONDS"
            ,"LOWEST-ALGEBRAIC"
            ,"MODULE-NAME"
            ,"SMALLEST-ALGEBRAIC"
            ,"STANDARD-COMPARE"
            ,"SUBSTITUTE"
            );
         functionNames.addAll(funcs);
      }
   }
   ;

programSpecifier
   : (PROGRAM programName (AS literal)? (DOT_FS | DOT)?)
   ;
   
propertySpecifier
   : (PROPERTY propertyName (AS literal)? (DOT_FS | DOT)?)
   ;

userDefinedFunctionSpecifier
   : (FUNCTION functionPrototypeName (AS literal)? (DOT_FS | DOT)?)
   {
      functionNames.add($functionPrototypeName.text.toUpperCase());
   }
   ;

// -- input output section ----------------------------------

inputOutputSection
   : INPUT_OUTPUT SECTION (DOT_FS | DOT) inputOutputSectionParagraph*
   ;

// - input output section paragraph ----------------------------------

inputOutputSectionParagraph
   : fileControlParagraph | ioControlParagraph
   ;

// - file control paragraph ----------------------------------

fileControlParagraph
   : FILE_CONTROL? ((DOT_FS | DOT)? fileControlEntry)* (DOT_FS | DOT)
   ;

fileControlEntry
   : selectClause fileControlClause*
   ;

selectClause
   : SELECT OPTIONAL? fileName
   ;

fileControlClause
   : (assignClause | reserveClause | organizationClause | paddingCharacterClause | recordDelimiterClause | accessModeClause | recordKeyClause | alternateRecordKeyClause | fileStatusClause | passwordClause | relativeKeyClause | lockModeClause | sharingClause | collatingSequenceClause)
   ;

assignClause
   : ASSIGN TO? 
   (((DISK 
     | DISPLAY 
     | KEYBOARD 
     | PORT 
     | PRINTER 
     | READER 
     | REMOTE 
     | TAPE 
     | VIRTUAL 
     | (DYNAMIC | EXTERNAL)? assignClauseName 
     | literal)+ (USING dataName)?)
   | (USING dataName))
   ;

reserveClause
   : RESERVE (NO | integerLiteral) ALTERNATE? (AREA | AREAS)?
   ;

organizationClause
   : (ORGANIZATION IS?)? (LINE | RECORD BINARY | RECORD | BINARY)? (SEQUENTIAL | RELATIVE | INDEXED)
   ;

paddingCharacterClause
   : PADDING CHARACTER? IS? (qualifiedDataName | literal)
   ;

recordDelimiterClause
   : RECORD DELIMITER IS? (STANDARD_1 | IMPLICIT | assignmentName)
   ;

accessModeClause
   : ACCESS MODE? IS? (SEQUENTIAL | RANDOM | DYNAMIC | EXCLUSIVE)
   ;

recordKeyClause
   : RECORD KEY? IS? fileControlQualifiedDataName (SOURCE IS? fileControlQualifiedDataName+)? (WITH? DUPLICATES)? passwordClause?
   ;

alternateRecordKeyClause
   : ALTERNATE RECORD KEY? IS? fileControlQualifiedDataName (SOURCE IS? fileControlQualifiedDataName+)? (WITH? DUPLICATES)? (SUPPRESS WHEN? literal)? passwordClause?
   ;

passwordClause
   : PASSWORD IS? dataName
   ;

fileStatusClause
   : FILE? STATUS IS? qualifiedDataName qualifiedDataName?
   ;

relativeKeyClause
   : RELATIVE KEY? IS? qualifiedDataName
   ;

lockModeClause
   : LOCK MODE? IS? (MANUAL | AUTOMATIC)
     (WITH? LOCK ON MULTIPLE? (RECORD | RECORDS))?
   ;

sharingClause
   : (SHARING WITH? ((ALL OTHER?) | (NO OTHER?) | (READ ONLY)))
   ;


// - io control paragraph ----------------------------------

ioControlParagraph
   : I_O_CONTROL (DOT_FS | DOT) (fileName (DOT_FS | DOT))? (ioControlClause* (DOT_FS | DOT))?
   ;

ioControlClause
   : (rerunClause | sameClause | multipleFileClause | commitmentControlClause | applyCommitClause)
   ;

rerunClause
   : RERUN (ON (assignmentName | fileName))? EVERY (rerunEveryRecords | rerunEveryOf | rerunEveryClock)
   ;

rerunEveryRecords
   : integerLiteral RECORDS
   ;

rerunEveryOf
   : END? OF? (REEL | UNIT) OF fileName
   ;

rerunEveryClock
   : integerLiteral CLOCK_UNITS?
   ;

sameClause
   : SAME (RECORD | SORT | SORT_MERGE)? AREA? FOR? (fileName COMMACHAR?)+
   ;

multipleFileClause
   : MULTIPLE FILE TAPE? CONTAINS? multipleFilePosition+
   ;

multipleFilePosition
   : fileName COMMACHAR? (POSITION integerLiteral COMMACHAR?)?
   ;

commitmentControlClause
   : COMMITMENT CONTROL FOR? fileName
   ;

/*
The applyCommitClause should really read...

     APPLY COMMIT ON? (fileName | dataName)+

...but both fileName and dataName are just aliases of
cobolWord, so only the first one will match and that
just seems misleading.
*/
applyCommitClause
   : APPLY COMMIT ON? cobolWord+
   ;

// --- data division --------------------------------------------------------------------

dataDivision
   : DATA_TAG DIVISION (DOT_FS | DOT) dataDivisionSection*
   ;

dataDivisionSection
   : fileSection | dataBaseSection | workingStorageSection | linkageSection | communicationSection | localStorageSection | screenSection | reportSection | programLibrarySection
   ;

// -- file section ----------------------------------

fileSection
   : FILE SECTION (DOT_FS | DOT) fileDescriptionEntry*
   ;

fileDescriptionEntry
   : (FD | SD) fileName ((DOT_FS | DOT)? fileDescriptionEntryClause)* (DOT_FS | DOT) (constantEntry | dataDescriptionEntry)*
   ;

fileDescriptionEntryClause
   : externalClause | globalClause | formatClause | blockContainsClause | recordContainsClause | labelRecordsClause | valueOfClause | dataRecordsClause | linageClause | codeSetClause | reportClause | recordingModeClause
   ;

externalClause
   : IS? EXTERNAL (AS literal)?
   ;

globalClause
   : IS? GLOBAL
   ;

formatClause
   : FORMAT (BIT | CHARACTER | NUMERIC) DATA?
   ;

blockContainsClause
   : BLOCK CONTAINS? integerLiteral blockContainsTo? (RECORDS | CHARACTERS)?
   ;

blockContainsTo
   : TO integerLiteral
   ;

recordContainsClause
   : RECORD (recordContainsClauseFormat1 | recordContainsClauseFormat2 | recordContainsClauseFormat3)
   ;

recordContainsClauseFormat1
   : CONTAINS? integerLiteral (BYTES | CHARACTERS)?
   ;

recordContainsClauseFormat2
   : IS? VARYING IN? SIZE? (FROM? integerLiteral recordContainsTo? (BYTES | CHARACTERS)?)? (DEPENDING ON? qualifiedDataName)?
   ;

recordContainsClauseFormat3
   : CONTAINS? integerLiteral recordContainsTo (BYTES | CHARACTERS)?
   ;

recordContainsTo
   : TO integerLiteral
   ;

labelRecordsClause
   : LABEL (RECORD IS? | RECORDS ARE?) (OMITTED | STANDARD | dataName+)
   ;

valueOfClause
   : VALUE OF valuePair+
   ;

valuePair
   : systemName IS? (qualifiedDataName | literal)
   ;

dataRecordsClause
   : DATA (RECORD IS? | RECORDS ARE?) dataName+
   ;

linageClause
   : LINAGE IS? (dataName | integerLiteral) LINES? linageAt*
   ;

linageAt
   : linageFootingAt | linageLinesAtTop | linageLinesAtBottom
   ;

linageFootingAt
   : WITH? FOOTING AT? (dataName | integerLiteral)
   ;

linageLinesAtTop
   : LINES? AT? TOP (dataName | integerLiteral)
   ;

linageLinesAtBottom
   : LINES? AT? BOTTOM (dataName | integerLiteral)
   ;

recordingModeClause
   : RECORDING MODE? IS? modeStatement
   ;

modeStatement
   : cobolWord
   ;

codeSetClause
   : CODE_SET (codeSetAlphabetPhrase1 | codeSetAlphabetPhrase2+)
   ;

codeSetAlphabetPhrase1
   : (IS? alphabetName alphabetName?)
   ;

codeSetAlphabetPhrase2
   : (FOR? (ALPHANUMERIC | NATIONAL) IS? alphabetName)
   ;

reportClause
   : (REPORT IS? | REPORTS ARE?) reportName+
   ;

// -- data base section ----------------------------------

dataBaseSection
   : DATA_BASE SECTION (DOT_FS | DOT) dataBaseSectionEntry*
   ;

dataBaseSectionEntry
   : integerLiteral literal INVOKE literal
   ;

// -- working storage section ----------------------------------

workingStorageSection
   : WORKING_STORAGE SECTION (DOT_FS | DOT) (constantEntry | dataDescriptionEntry)*
   ;

// -- linkage section ----------------------------------

linkageSection
   : LINKAGE SECTION (DOT_FS | DOT) (constantEntry | dataDescriptionEntry)*
   ;

// -- communication section ----------------------------------

communicationSection
   : COMMUNICATION SECTION (DOT_FS | DOT) (communicationDescriptionEntry | dataDescriptionEntry)*
   ;

communicationDescriptionEntry
   : communicationDescriptionEntryFormat1 | communicationDescriptionEntryFormat2 | communicationDescriptionEntryFormat3
   ;

communicationDescriptionEntryFormat1
   : CD cdName FOR? INITIAL? INPUT ((symbolicQueueClause | symbolicSubQueueClause | messageDateClause | messageTimeClause | symbolicSourceClause | textLengthClause | endKeyClause | statusKeyClause | messageCountClause) | dataDescName)* (DOT_FS | DOT)
   ;

communicationDescriptionEntryFormat2
   : CD cdName FOR? OUTPUT (destinationCountClause | textLengthClause | statusKeyClause | destinationTableClause | errorKeyClause | symbolicDestinationClause)* (DOT_FS | DOT)
   ;

communicationDescriptionEntryFormat3
   : CD cdName FOR? INITIAL I_O ((messageDateClause | messageTimeClause | symbolicTerminalClause | textLengthClause | endKeyClause | statusKeyClause) | dataDescName)* (DOT_FS | DOT)
   ;

destinationCountClause
   : DESTINATION COUNT IS? dataDescName
   ;

destinationTableClause
   : DESTINATION TABLE OCCURS integerLiteral TIMES (INDEXED BY indexName+)?
   ;

endKeyClause
   : END KEY IS? dataDescName
   ;

errorKeyClause
   : ERROR KEY IS? dataDescName
   ;

messageCountClause
   : MESSAGE? COUNT IS? dataDescName
   ;

messageDateClause
   : MESSAGE DATE IS? dataDescName
   ;

messageTimeClause
   : MESSAGE TIME IS? dataDescName
   ;

statusKeyClause
   : STATUS KEY IS? dataDescName
   ;

symbolicDestinationClause
   : SYMBOLIC? DESTINATION IS? dataDescName
   ;

symbolicQueueClause
   : SYMBOLIC? QUEUE IS? dataDescName
   ;

symbolicSourceClause
   : SYMBOLIC? SOURCE IS? dataDescName
   ;

symbolicTerminalClause
   : SYMBOLIC? TERMINAL IS? dataDescName
   ;

symbolicSubQueueClause
   : SYMBOLIC? (SUB_QUEUE_1 | SUB_QUEUE_2 | SUB_QUEUE_3) IS? dataDescName
   ;

textLengthClause
   : TEXT LENGTH IS? dataDescName
   ;

// -- local storage section ----------------------------------

localStorageSection
   : LOCAL_STORAGE SECTION (DOT_FS | DOT) (LD localName (DOT_FS | DOT))? (constantEntry | dataDescriptionEntry)*
   ;

// -- screen section ----------------------------------

screenSection
   : SCREEN SECTION (DOT_FS | DOT) (constantEntry | screenDescriptionEntry)*
   ;

screenDescriptionEntry
   : INTEGERLITERAL (FILLER | screenName)? (screenDescriptionBlankClause | screenDescriptionBellClause | screenDescriptionBlinkClause | screenDescriptionEraseClause | screenDescriptionLightClause | screenDescriptionGridClause | screenDescriptionReverseVideoClause | screenDescriptionUnderlineClause | screenDescriptionSizeClause | screenDescriptionLineClause | screenDescriptionColumnClause | screenDescriptionForegroundColorClause | screenDescriptionBackgroundColorClause | screenDescriptionControlClause | screenDescriptionValueClause | screenDescriptionPictureClause | (screenDescriptionFromClause | screenDescriptionUsingClause) | screenDescriptionUsageClause | screenDescriptionBlankWhenZeroClause | screenDescriptionJustifiedClause | screenDescriptionSignClause | screenDescriptionAutoClause | screenDescriptionSecureClause | screenDescriptionRequiredClause | screenDescriptionPromptClause | screenDescriptionFullClause | screenDescriptionZeroFillClause)* DOT_FS
   ;

screenDescriptionBlankClause
   : BLANK (SCREEN | LINE)
   ;

screenDescriptionBellClause
   : BELL | BEEP
   ;

screenDescriptionBlinkClause
   : BLINK
   ;

screenDescriptionEraseClause
   : ERASE (EOL | EOS)
   ;

screenDescriptionLightClause
   : HIGHLIGHT | LOWLIGHT
   ;

screenDescriptionGridClause
   : GRID | LEFTLINE | OVERLINE
   ;

screenDescriptionReverseVideoClause
   : REVERSE_VIDEO
   ;

screenDescriptionUnderlineClause
   : UNDERLINE
   ;

screenDescriptionSizeClause
   : SIZE IS? (identifier | integerLiteral)
   ;

screenDescriptionLineClause
   : LINE (NUMBER? IS? (PLUS | PLUSCHAR | MINUSCHAR))? (identifier | integerLiteral)
   ;

screenDescriptionColumnClause
   : (COLUMN | COL) (NUMBER? IS? (PLUS | PLUSCHAR | MINUSCHAR))? (identifier | integerLiteral)
   ;

screenDescriptionForegroundColorClause
   : (FOREGROUND_COLOR | FOREGROUND_COLOUR) IS? (identifier | integerLiteral)
   ;

screenDescriptionBackgroundColorClause
   : (BACKGROUND_COLOR | BACKGROUND_COLOUR) IS? (identifier | integerLiteral)
   ;

screenDescriptionControlClause
   : CONTROL IS? identifier
   ;

screenDescriptionValueClause
   : (VALUE IS?) literal
   ;

screenDescriptionPictureClause
   : (PICTURE | PIC) IS? pictureString
   ;

screenDescriptionFromClause
   : FROM (identifier | literal) screenDescriptionToClause?
   ;

screenDescriptionToClause
   : TO identifier
   ;

screenDescriptionUsingClause
   : USING identifier
   ;

screenDescriptionUsageClause
   : (USAGE IS?) (DISPLAY | DISPLAY_1)
   ;

screenDescriptionBlankWhenZeroClause
   : BLANK WHEN? ZERO
   ;

screenDescriptionJustifiedClause
   : (JUSTIFIED | JUST) RIGHT?
   ;

screenDescriptionSignClause
   : (SIGN IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
   ;

screenDescriptionAutoClause
   : AUTO | AUTO_SKIP
   ;

screenDescriptionSecureClause
   : SECURE | NO_ECHO
   ;

screenDescriptionRequiredClause
   : REQUIRED | EMPTY_CHECK
   ;

screenDescriptionPromptClause
   : PROMPT CHARACTER? IS? (identifier | literal) screenDescriptionPromptOccursClause?
   ;

screenDescriptionPromptOccursClause
   : OCCURS integerLiteral TIMES?
   ;

screenDescriptionFullClause
   : FULL | LENGTH_CHECK
   ;

screenDescriptionZeroFillClause
   : ZERO_FILL
   ;

// -- report section ----------------------------------

reportSection
   : REPORT SECTION (DOT_FS | DOT) reportDescription*
   ;

reportDescription
   : reportDescriptionEntry (constantEntry | reportGroupDescriptionEntry)+
   ;

reportDescriptionEntry
   : RD reportName reportDescriptionGlobalClause? (reportDescriptionPageLimitClause reportDescriptionHeadingClause? reportDescriptionFirstDetailClause? reportDescriptionLastDetailClause? reportDescriptionFootingClause?)? (DOT_FS | DOT)
   ;

reportDescriptionGlobalClause
   : IS? GLOBAL
   ;

reportDescriptionPageLimitClause
   : PAGE (LIMIT IS? | LIMITS ARE?)? integerLiteral (LINE | LINES)?
   ;

reportDescriptionHeadingClause
   : HEADING integerLiteral
   ;

reportDescriptionFirstDetailClause
   : FIRST DETAIL integerLiteral
   ;

reportDescriptionLastDetailClause
   : LAST DETAIL integerLiteral
   ;

reportDescriptionFootingClause
   : FOOTING integerLiteral
   ;

reportGroupDescriptionEntry
   : reportGroupDescriptionEntryFormat1 | reportGroupDescriptionEntryFormat2 | reportGroupDescriptionEntryFormat3
   ;

reportGroupDescriptionEntryFormat1
   : integerLiteral dataName reportGroupLineNumberClause? reportGroupNextGroupClause? reportGroupTypeClause reportGroupUsageClause? (DOT_FS | DOT | DOT_WS)
   ;

reportGroupDescriptionEntryFormat2
   : integerLiteral dataName? reportGroupLineNumberClause? reportGroupUsageClause (DOT_FS | DOT | DOT_WS)
   ;

reportGroupDescriptionEntryFormat3
   : integerLiteral dataName? (reportGroupPictureClause | reportGroupUsageClause | reportGroupSignClause | reportGroupJustifiedClause | reportGroupBlankWhenZeroClause | reportGroupLineNumberClause | reportGroupColumnNumberClause | (reportGroupSourceClause | reportGroupValueClause | reportGroupSumClause | reportGroupResetClause) | reportGroupIndicateClause)* (DOT_FS | DOT | DOT_WS)
   ;

reportGroupBlankWhenZeroClause
   : BLANK WHEN? ZERO
   ;

reportGroupColumnNumberClause
   : (COLUMN | COLUMN_PIC) NUMBER? IS? integerLiteral
   ;

reportGroupIndicateClause
   : GROUP INDICATE?
   ;

reportGroupJustifiedClause
   : (JUSTIFIED | JUST) RIGHT?
   ;

reportGroupLineNumberClause
   : LINE? NUMBER? IS? (reportGroupLineNumberNextPage | reportGroupLineNumberPlus)
   ;

reportGroupLineNumberNextPage
   : integerLiteral (ON? NEXT PAGE)?
   ;

reportGroupLineNumberPlus
   : PLUS integerLiteral
   ;

reportGroupNextGroupClause
   : NEXT GROUP IS? (integerLiteral | reportGroupNextGroupNextPage | reportGroupNextGroupPlus)
   ;

reportGroupNextGroupPlus
   : PLUS integerLiteral
   ;

reportGroupNextGroupNextPage
   : NEXT PAGE
   ;

reportGroupPictureClause
   : (PICTURE | PIC) IS? pictureString
   ;

reportGroupResetClause
   : RESET ON? (FINAL | dataName)
   ;

reportGroupSignClause
   : (SIGN | SIGN_PIC) IS? (LEADING | TRAILING) SEPARATE CHARACTER?
   ;

reportGroupSourceClause
   : (SOURCE | SOURCE_PIC) IS? identifier
   ;

reportGroupSumClause
   : SUM identifier (COMMACHAR? identifier)* (UPON dataName (COMMACHAR? dataName)*)?
   ;

reportGroupTypeClause
   : TYPE IS? (reportGroupTypeReportHeading | reportGroupTypePageHeading | reportGroupTypeControlHeading | reportGroupTypeDetail | reportGroupTypeControlFooting | reportGroupTypePageFooting | reportGroupTypeReportFooting)
   ;

reportGroupTypeReportHeading
   : REPORT HEADING | RH
   ;

reportGroupTypePageHeading
   : PAGE HEADING | PH
   ;

reportGroupTypeControlHeading
   : (CONTROL HEADING | CH) (FINAL | dataName)
   ;

reportGroupTypeDetail
   : DETAIL | DE
   ;

reportGroupTypeControlFooting
   : (CONTROL FOOTING | CF) (FINAL | dataName)
   ;

reportGroupUsageClause
   : ((USAGE | USAGE_PIC) IS?)? (DISPLAY | DISPLAY_1 | DISPLAY_PIC | DISPLAY_1_PIC)
   ;

reportGroupTypePageFooting
   : PAGE FOOTING | PF
   ;

reportGroupTypeReportFooting
   : REPORT FOOTING | RF
   ;

reportGroupValueClause
   : (VALUE | VALUE_PIC) IS? literal
   ;

// -- program library section ----------------------------------

programLibrarySection
   : PROGRAM_LIBRARY SECTION DOT_FS libraryDescriptionEntry*
   ;

libraryDescriptionEntry
   : libraryDescriptionEntryFormat1 | libraryDescriptionEntryFormat2
   ;

libraryDescriptionEntryFormat1
   : LD libraryName EXPORT libraryAttributeClauseFormat1? libraryEntryProcedureClauseFormat1?
   ;

libraryDescriptionEntryFormat2
   : LB libraryName IMPORT libraryIsGlobalClause? libraryIsCommonClause? (libraryAttributeClauseFormat2 | libraryEntryProcedureClauseFormat2)*
   ;

libraryAttributeClauseFormat1
   : ATTRIBUTE (SHARING IS? (DONTCARE | PRIVATE | SHAREDBYRUNUNIT | SHAREDBYALL))?
   ;

libraryAttributeClauseFormat2
   : ATTRIBUTE libraryAttributeFunction? (LIBACCESS IS? (BYFUNCTION | BYTITLE))? libraryAttributeParameter? libraryAttributeTitle?
   ;

libraryAttributeFunction
   : FUNCTIONNAME IS literal
   ;

libraryAttributeParameter
   : LIBPARAMETER IS? literal
   ;

libraryAttributeTitle
   : TITLE IS? literal
   ;

libraryEntryProcedureClauseFormat1
   : ENTRY_PROCEDURE programName libraryEntryProcedureForClause?
   ;

libraryEntryProcedureClauseFormat2
   : ENTRY_PROCEDURE programName libraryEntryProcedureForClause? libraryEntryProcedureWithClause? libraryEntryProcedureUsingClause? libraryEntryProcedureGivingClause?
   ;

libraryEntryProcedureForClause
   : FOR literal
   ;

libraryEntryProcedureGivingClause
   : GIVING dataName
   ;

libraryEntryProcedureUsingClause
   : USING libraryEntryProcedureUsingName+
   ;

libraryEntryProcedureUsingName
   : dataName | fileName
   ;

libraryEntryProcedureWithClause
   : WITH libraryEntryProcedureWithName+
   ;

libraryEntryProcedureWithName
   : localName | fileName
   ;

libraryIsCommonClause
   : IS? COMMON
   ;

libraryIsGlobalClause
   : IS? GLOBAL
   ;

// constant entry ------------------------------------------

constantEntry
   : INTEGERLITERAL constantName (CONSTANT (IS? GLOBAL)? (constantEntryAsPhrase | constantEntryFromPhrase)) (DOT_FS | DOT)
   ;

constantEntryAsPhrase
   : AS? 
     (literal 
     | (BYTE_LENGTH OF? dataName)
     | arithmeticExpression
     | (LENGTH OF? dataName)
     )
   ;

constantEntryFromPhrase
   : FROM dataName
   ;

// data description entry ----------------------------------

dataDescriptionEntry
   : dataDescriptionEntryFormat1 | dataDescriptionEntryFormat2 | dataDescriptionEntryFormat3 | dataDescriptionEntryExecSql
   ;

dataDescriptionEntryFormat1
   : (INTEGERLITERAL | LEVEL_NUMBER_77) (FILLER | dataName)? (dataRedefinesClause | dataIntegerStringClause | dataExternalClause | dataGlobalClause | dataGroupUsageClause | dataTypeDefClause | dataThreadLocalClause | dataPictureClause | dataCommonOwnLocalClause | dataTypeClause | dataUsingClause | dataUsageClause | dataValueClause | dataReceivedByClause | dataOccursClause | dataSignClause | dataSynchronizedClause | dataJustifiedClause | dataBlankWhenZeroClause | dataWithLowerBoundsClause | dataAlignedClause | dataRecordAreaClause | dataDynamicLengthClause | dataConstantRecordClause | dataPropertyClause | dataSameAsClause | dataSelectWhenClause | dataBasedClause | dataAnyLengthClause | dataVolatileClause)* (DOT_WS | DOT_FS | DOT)
   ;

dataDescriptionEntryFormat2
   : LEVEL_NUMBER_66 dataName dataRenamesClause (DOT_FS | DOT)
   ;

dataDescriptionEntryFormat3
   : LEVEL_NUMBER_88 conditionName dataValueClause (DOT_FS | DOT)
   ;

dataDescriptionEntryExecSql
   : execSqlStatement
   ;

dataAlignedClause
   : ALIGNED
   ;

dataAnyLengthClause
   : (ANY LENGTH)
   ;

dataBlankWhenZeroClause
   : (BLANK | BLANK_PIC) WHEN? (ZERO | ZEROS | ZEROES)
   ;

dataBasedClause
   : BASED
   ;

dataCommonOwnLocalClause
   : COMMON | OWN | LOCAL
   ;

dataConstantRecordClause
   : CONSTANT RECORD
   ;

dataDynamicLengthClause
   : DYNAMIC LENGTH? dataName? (LIMIT IS? INTEGERLITERAL)?
   ;

dataExternalClause
   : IS? EXTERNAL ((BY | AS) literal)?
   ;

dataGlobalClause
   : IS? GLOBAL
   ;

dataGroupUsageClause
   : GROUP_USAGE IS? (NATIONAL | UTF_8 | BIT)
   ;

dataIntegerStringClause
   : INTEGER | STRING
   ;

dataJustifiedClause
   : (JUSTIFIED | JUST | JUSTIFIED_PIC | JUST_PIC) RIGHT?
   ;

dataOccursClause
   : (OCCURS | OCCURS_PIC) (identifier | integerLiteral) dataOccursTo? TIMES? dataOccursDepending? (dataOccursSort | dataOccursIndexed)*
   ;

dataOccursTo
   : TO integerLiteral
   ;

dataOccursDepending
   : DEPENDING ON? qualifiedDataName
   ;

dataOccursSort
   : (ASCENDING | DESCENDING) KEY? IS? qualifiedDataName+
   ;

dataOccursIndexed
   : INDEXED BY? LOCAL? (indexName COMMACHAR?)+
   ;

dataPictureClause
   : (PICTURE | PIC) IS? pictureString (BYTE_LENGTH IS? INTEGERLITERAL)? (pictureEditingPhrase | pictureLocalePhrase)?
   ;

pictureString
//   : (pictureChars+ pictureCardinality?)+
   : pictureCharAndCardinality+
   ;

pictureCharAndCardinality
   : (pictureChars pictureCardinality?)
   ;

pictureChars
   : DOLLARCHAR | PICTURE_SYMBOLS | SLASHCHAR | COMMACHAR | DOT | ASTERISKCHAR | DOUBLEASTERISKCHAR | PLUSCHAR | MINUSCHAR | integerLiteral
   ;

pictureCardinality
   : PICTURE_CARDINALITY
   ;

pictureEditingPhrase
   : EDITING EDITING_CHARACTER ((IS? literal) | (FOR? NEGATIVE IS? literal POSITIVE IS? literal))?
   ;

pictureLocalePhrase
   : LOCALE (IS? localeName)? SIZE IS? INTEGERLITERAL
   ;

dataPropertyClause
   : (PROPERTY (WITH? NO (GET | SET))? (IS? FINAL)?)
   ;

dataReceivedByClause
   : RECEIVED? BY? (CONTENT | REFERENCE | REF)
   ;

dataRecordAreaClause
   : RECORD AREA
   ;

dataRedefinesClause
   : REDEFINES dataName
   ;

dataRenamesClause
   : RENAMES qualifiedDataName ((THROUGH | THRU) qualifiedDataName)?
   ;

dataSameAsClause
   : (SAME AS dataName)
   ;

dataSelectWhenClause
   : (SELECT WHEN (OTHER | conditionName))
   ;

dataSignClause
   : ((SIGN | SIGN_PIC) IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
   ;

dataSynchronizedClause
   : (SYNCHRONIZED | SYNC | SYNCHRONIZED_PIC | SYNC_PIC) (LEFT | RIGHT)?
   ;

dataThreadLocalClause
   : IS? THREAD_LOCAL
   ;

dataTypeClause
   : TYPE IS? 
   (SHORT_DATE
   | LONG_DATE
   | NUMERIC_DATE
   | NUMERIC_TIME
   | LONG_TIME
   | CLOB_LOCATOR
   | BLOB_LOCATOR
   | DBCLOB_LOCATOR
   | ROWID
   | (CLOB | BLOB | DBCLOB | VARBINARY (XML AS CLOB)) LPARENCHAR (IDENTIFIER | INTEGERLITERAL) RPARENCHAR)
   ;

dataTypeDefClause
   : IS? TYPEDEF STRONG?
   ;

dataUsageClause
   : ((USAGE | USAGE_PIC) IS?)? 
   ((BINARY | BINARY_PIC) (TRUNCATED | EXTENDED)? 
   | (BINARY_CHAR (SIGNED | UNSIGNED))
   | (BINARY_DOUBLE (SIGNED | UNSIGNED))
   | (BINARY_LONG (SIGNED | UNSIGNED))
   | (BINARY_SHORT (SIGNED | UNSIGNED))
   | BIT 
   | COMP 
   | COMP_1 
   | COMP_2 
   | COMP_3 
   | COMP_4 
   | COMP_5 
   | COMPUTATIONAL 
   | COMPUTATIONAL_1 
   | COMPUTATIONAL_2 
   | COMPUTATIONAL_3 
   | COMPUTATIONAL_4 
   | COMPUTATIONAL_5 
   | CONTROL_POINT 
   | DATE 
   | DISPLAY 
   | DISPLAY_1 
   | DOUBLE 
   | EVENT 
   | (FLOAT_BINARY_32 endiannessPhrase?)
   | (FLOAT_BINARY_64 endiannessPhrase?)
   | (FLOAT_BINARY_128 endiannessPhrase?)
   | (FLOAT_DECIMAL_16 (encodingPhrase | endiannessPhrase)?)
   | (FLOAT_DECIMAL_34 (encodingPhrase | endiannessPhrase)?)
   | FLOAT_EXTENDED
   | FLOAT_LONG
   | FLOAT_SHORT
   | (FUNCTION_POINTER (TO? cobolWord)?)
   | INDEX 
   | KANJI 
   | LOCK 
   | NATIONAL 
   | (PACKED_DECIMAL (WITH? NO SIGN)?)
   | (POINTER (TO dataName)?)
   | POINTER_32 
   | PROCEDURE_POINTER 
   | REAL 
   | SQL 
   | TASK 
   | UTF_8 
   | COMP_PIC 
   | COMP_1_PIC 
   | COMP_2_PIC 
   | COMP_3_PIC 
   | COMP_4_PIC 
   | COMP_5_PIC 
   | COMPUTATIONAL_PIC 
   | COMPUTATIONAL_1_PIC 
   | COMPUTATIONAL_2_PIC 
   | COMPUTATIONAL_3_PIC 
   | COMPUTATIONAL_4_PIC 
   | COMPUTATIONAL_5_PIC 
   | DISPLAY_PIC 
   | DISPLAY_1_PIC 
   | (FUNCTION_POINTER_PIC (TO? cobolWord)?)
   | INDEX_PIC 
   | NATIONAL_PIC 
   | (PACKED_DECIMAL_PIC (WITH? NO SIGN)?)
   | POINTER_PIC 
   | PROCEDURE_POINTER_PIC 
   | (PROGRAM_POINTER (TO? cobolWord)?)
   | MESSAGE_TAG
   | OBJECT_REFERENCE dataUsageObjectReferenceFactoryPhrase?) 
   NATIVE?
   ;

dataUsageObjectReferenceFactoryPhrase
   : ((FACTORY OF?) (interfaceName | ACTIVE_CLASS | (className ONLY?)))
   ;

dataUsingClause
   : USING (LANGUAGE | CONVENTION) OF? (cobolWord | dataName)
   ;

dataValueClause
   : (VALUE_PIC | VALUE | VALUES) 
   (IS | ARE)? 
   dataValueInterval 
   (COMMACHAR? dataValueInterval)* 
   (IN? alphabetName)?
   (WHEN? SET? TO? FALSE IS? literal)?
   ;

dataValueInterval
   : dataValueIntervalFrom dataValueIntervalTo?
   ;

dataValueIntervalFrom
   : literal | cobolWord | continuedLiteral
   ;

dataValueIntervalTo
   : (THROUGH | THRU) literal | continuedLiteral
   ;

dataVolatileClause
   : VOLATILE
   ;

dataWithLowerBoundsClause
   : WITH? LOWER BOUNDS
   ;

// --- procedure division --------------------------------------------------------------------

procedureDivision
   : PROCEDURE DIVISION procedureDivisionUsingClause? procedureDivisionGivingClause? procedureDivisionRaisingClause? (DOT_FS | DOT) procedureDeclaratives? procedureDivisionBody
   ;

procedureDivisionUsingClause
   : (USING | CHAINING) procedureDivisionUsingParameter+
   ;

procedureDivisionGivingClause
   : (GIVING | RETURNING) dataName
   ;

procedureDivisionRaisingClause
   : (RAISING 
     (exceptionName
     | ((FACTORY OF?)? className)
     | interfaceName)+)
   ;

procedureDivisionUsingParameter
   : procedureDivisionByReferencePhrase | procedureDivisionByValuePhrase
   ;

procedureDivisionByReferencePhrase
   : (BY? REFERENCE)? procedureDivisionByReference+
   ;

procedureDivisionByReference
   : (OPTIONAL? (identifier | fileName)) | ANY
   ;

procedureDivisionByValuePhrase
   : BY? VALUE procedureDivisionByValue+
   ;

procedureDivisionByValue
   : identifier | literal | ANY
   ;

procedureDeclaratives
   : DECLARATIVES (DOT_FS | DOT) procedureDeclarative+ END DECLARATIVES (DOT_FS | DOT)
   ;

procedureDeclarative
   : procedureSectionHeader (DOT_FS | DOT) useStatement (DOT_FS | DOT) paragraphs
   ;

procedureSectionHeader
   : sectionName SECTION integerLiteral?
   ;

procedureDivisionBody
   : paragraphs procedureSection*
   ;

// -- procedure section ----------------------------------

procedureSection
   : procedureSectionHeader (DOT_FS | DOT) paragraphs
   ;

paragraphs
   : sentence* paragraph*
   ;

paragraph
   : paragraphName (DOT_FS | DOT)? (alteredGoTo | sentence*)
   ;

sentence
   : statement* (DOT_FS | DOT)
   ;

statement
   : (acceptStatement | addStatement | allocateStatement | alterStatement | callStatement | cancelStatement | closeStatement | commitStatement | computeStatement | continueStatement | deleteStatement | disableStatement | displayStatement | divideStatement | enableStatement | entryStatement | evaluateStatement | exhibitStatement | execCicsStatement | execDliStatement | execSqlStatement | execSqlImsStatement | exitStatement | freeStatement | generateStatement | gobackStatement | goToStatement | ifStatement | initializeStatement | initiateStatement | inspectStatement | invokeStatement | jsonGenerateStatement | jsonParseStatement | mergeStatement | moveStatement | multiplyStatement | nextSentenceStatement | openStatement | performStatement | purgeStatement | raiseStatement | readStatement | receiveStatement | standardReceiveStatement | releaseStatement | resumeStatement | returnStatement | rewriteStatement | rollbackStatement | searchStatement | sendStatement | standardSendStatement | setStatement | sortStatement | startStatement | stopStatement | stringStatement | subtractStatement | suppressStatement | terminateStatement | unlockStatement | unstringStatement | xmlGenerateStatement | xmlParseStatement | writeStatement) COMMACHAR?
   ;

// accept statement

acceptStatement
   : ACCEPT identifier (acceptFromDateStatement | acceptFromEscapeKeyStatement | acceptFromMnemonicStatement | acceptMessageCountStatement | acceptScreenStatement)? onExceptionClause? notOnExceptionClause? END_ACCEPT?
   ;

acceptFromDateStatement
   : FROM (DATE YYYYMMDD? | DAY YYYYDDD? | DAY_OF_WEEK | TIME | TIMER | TODAYS_DATE MMDDYYYY? | TODAYS_NAME | YEAR | YYYYMMDD | YYYYDDD)
   ;

acceptFromMnemonicStatement
   : FROM mnemonicName
   ;

acceptFromEscapeKeyStatement
   : FROM ESCAPE KEY
   ;

acceptMessageCountStatement
   : MESSAGE? COUNT
   ;

acceptScreenStatement
   : (AT (LINE NUMBER? (identifier | integerLiteral)) | ((COLUMN | COL) NUMBER? (identifier | integerLiteral)))
   ;

// add statement

addStatement
   : ADD (addToStatement | addToGivingStatement | addCorrespondingStatement) onSizeErrorPhrase? notOnSizeErrorPhrase? END_ADD?
   ;

addToStatement
   : addFrom+ TO addTo+
   ;

addToGivingStatement
   : addFrom+ (TO addToGiving+)? GIVING addGiving+
   ;

addCorrespondingStatement
   : (CORRESPONDING | CORR) identifier TO addTo
   ;

addFrom
   : identifier | literal
   ;

addTo
   : identifier roundedPhrase? COMMACHAR?
   ;

addToGiving
   : identifier | literal
   ;

addGiving
   : identifier roundedPhrase?
   ;

// allocate statement

allocateStatement
   : ALLOCATE ((arithmeticExpression CHARACTERS) | identifier) INITIALIZED? (LOC integerLiteral)? (RETURNING identifier)?
   ;

// altered go to statement

alteredGoTo
   : GO TO? (DOT_FS | DOT)
   ;

// alter statement

alterStatement
   : ALTER alterProceedTo+
   ;

alterProceedTo
   : procedureName TO (PROCEED TO)? procedureName COMMACHAR?
   ;

// call statement

callStatement
   : CALL (identifier | literal) callUsingPhrase? callGivingPhrase? onOverflowPhrase? onExceptionClause? notOnExceptionClause? END_CALL?
   ;

callUsingPhrase
   : USING callUsingParameter+
   ;

callUsingParameter
   : callByReferencePhrase | callByValuePhrase | callByContentPhrase
   ;

callByReferencePhrase
   : (BY? REFERENCE)? callByReference+
   ;

callByReference
   : (((ADDRESS OF | INTEGER | STRING)? (identifier fixedPhrase?) | literal | fileName) | OMITTED) COMMACHAR?
   ;

callByValuePhrase
   : BY? VALUE callByValue+
   ;

callByValue
   : ((ADDRESS OF | LENGTH OF?)? (identifier | literal)) COMMACHAR?
   ;

callByContentPhrase
   : BY? CONTENT callByContent+
   ;

callByContent
   : ((ADDRESS OF | LENGTH OF?)? (identifier fixedPhrase?) | literal | OMITTED) COMMACHAR?
   ;

callGivingPhrase
   : (GIVING | RETURNING) identifier
   ;

fixedPhrase
   : (AS FIXED LENGTH integerLiteral)
   ;

// cancel statement

cancelStatement
   : CANCEL cancelCall+
   ;

cancelCall
   : libraryName (BYTITLE | BYFUNCTION) | identifier | literal
   ;

// close statement

closeStatement
   : CLOSE (closeFile COMMACHAR?)+
   ;

closeFile
   : fileName (closeReelUnitStatement | closeRelativeStatement | closePortFileIOStatement)?
   ;

closeReelUnitStatement
   : (REEL | UNIT) (FOR? REMOVAL)? (WITH? (NO REWIND | LOCK))?
   ;

closeRelativeStatement
   : WITH? (NO REWIND | LOCK)
   ;

closePortFileIOStatement
   : (WITH? NO WAIT | WITH WAIT) (USING closePortFileIOUsing+)?
   ;

closePortFileIOUsing
   : closePortFileIOUsingCloseDisposition | closePortFileIOUsingAssociatedData | closePortFileIOUsingAssociatedDataLength
   ;

closePortFileIOUsingCloseDisposition
   : CLOSE_DISPOSITION OF? (ABORT | ORDERLY)
   ;

closePortFileIOUsingAssociatedData
   : ASSOCIATED_DATA (identifier | integerLiteral)
   ;

closePortFileIOUsingAssociatedDataLength
   : ASSOCIATED_DATA_LENGTH OF? (identifier | integerLiteral)
   ;

// commit statement

commitStatement
   : COMMIT
   ;

// compute statement

computeStatement
   : COMPUTE computeStore+ (EQUALCHAR | EQUAL) arithmeticExpression onSizeErrorPhrase? notOnSizeErrorPhrase? END_COMPUTE?
   ;

computeStore
   : identifier roundedPhrase?
   ;

// continue statement

continueStatement
   : CONTINUE (AFTER arithmeticExpression SECONDS)?
   ;

// delete statement

deleteStatement
   : deleteStatementFormat1 | deleteStatementFormat2
   ;

deleteStatementFormat1
   : DELETE fileName RECORD? retryPhrase? invalidKeyPhrase? notInvalidKeyPhrase? END_DELETE?
   ;

deleteStatementFormat2
   : DELETE FILE OVERRIDE? fileName+ onExceptionClause? notOnExceptionClause? END_DELETE?
   ;

// disable statement

disableStatement
   : DISABLE (INPUT TERMINAL? | I_O TERMINAL | OUTPUT) cdName WITH? KEY (identifier | literal)
   ;

// display statement

displayStatement
   : displayStatementFormat1 | displayStatementFormat2
   ;

displayStatementFormat1
   : DISPLAY displayOperand+ displayAt? displayUpon? displayWith? onExceptionClause? notOnExceptionClause? END_DISPLAY?
   ;

displayOperand
   : identifier | literal
   ;

displayAt
   : AT (identifier | literal)
   ;

displayUpon
   : UPON (mnemonicName | environmentName)
   ;

displayWith
   : WITH? NO ADVANCING
   ;

displayStatementFormat2
   : DISPLAY screenName displayAtFormat2? onExceptionClause? notOnExceptionClause? END_DISPLAY?
   ;

displayAtFormat2
   : AT ((LINE NUMBER? (identifier | integerLiteral)) | ((COLUMN | COL) NUMBER? (identifier | integerLiteral)))
   ;

// divide statement

divideStatement
   : DIVIDE (identifier | literal) (divideIntoStatement | divideIntoGivingStatement | divideByGivingStatement) divideRemainder? onSizeErrorPhrase? notOnSizeErrorPhrase? END_DIVIDE?
   ;

divideIntoStatement
   : INTO divideInto+
   ;

divideIntoGivingStatement
   : INTO (identifier | literal) divideGivingPhrase?
   ;

divideByGivingStatement
   : BY (identifier | literal) divideGivingPhrase?
   ;

divideGivingPhrase
   : GIVING divideGiving+
   ;

divideInto
   : identifier roundedPhrase?
   ;

divideGiving
   : identifier roundedPhrase?
   ;

divideRemainder
   : REMAINDER identifier
   ;

// enable statement

enableStatement
   : ENABLE (INPUT TERMINAL? | I_O TERMINAL | OUTPUT) cdName WITH? KEY (literal | identifier)
   ;

// entry statement

entryStatement
   : ENTRY literal (USING identifier+)?
   ;

// evaluate statement

evaluateStatement
   : EVALUATE evaluateSelect evaluateAlsoSelect* evaluateWhenPhrase* evaluateWhenOther? END_EVALUATE?
   ;

evaluateSelect
   : identifier | literal | arithmeticExpression | condition
   ;

evaluateAlsoSelect
   : ALSO evaluateSelect
   ;

evaluateWhenPhrase
   : evaluateWhen+ statement*
   ;

evaluateWhen
   : WHEN evaluateCondition evaluateAlsoCondition*
   ;

evaluateCondition
   : ANY | NOT? evaluateValue evaluateThrough? | condition | booleanLiteral
   ;

evaluateThrough
   : (THROUGH | THRU) evaluateValue
   ;

evaluateAlsoCondition
   : ALSO evaluateCondition
   ;

evaluateWhenOther
   : WHEN OTHER statement*
   ;

evaluateValue
   : identifier | literal | arithmeticExpression
   ;

// exec cics statement

cicsCmdStart
	: EXEC_CICS
	;

cicsCmdEnd
	: END_EXEC
	;

execCicsStatement
	: cicsCmdStart
	CICS_TEXT+
	cicsCmdEnd
	;

// exec dli statement

execDliStatement
   : EXEC_DLI DLI_TEXT+ END_EXEC ((DOT NEWLINE?) | DOT_FS)?
   ;

// exec sql statement

execSqlStatement
   : EXEC_SQL SQL_TEXT+ END_EXEC ((DOT NEWLINE?) | DOT_FS)?
   ;

// exec sql ims statement

execSqlImsStatement
   : EXEC_SQLIMS SQL_TEXT+ END_EXEC ((DOT NEWLINE?) | DOT_FS)?
   ;

// exhibit statement

exhibitStatement
   : EXHIBIT NAMED? CHANGED? exhibitOperand+
   ;

exhibitOperand
   : identifier | literal
   ;

// exit statement

exitStatement
   : EXIT ((PROGRAM raisingPhrase?) | (PERFORM CYCLE?) | METHOD | PARAGRAPH | SECTION)?
   ;

raisingPhrase
   : RAISING ((EXCEPTION exceptionName) | identifier | (LAST EXCEPTION?))
   ;

// free statement

freeStatement
   : FREE identifier+
   ;

// generate statement

generateStatement
   : GENERATE reportName
   ;

// goback statement

gobackStatement
   : GOBACK (raisingPhrase | statusPhrase)?
   ;

statusPhrase
   : WITH? (ERROR | NORMAL) STATUS? (identifier | literal)?
   ;

// goto statement

goToStatement
   : GO TO? (goToStatementSimple | goToDependingOnStatement)
   ;

goToStatementSimple
   : procedureName
   ;

goToDependingOnStatement
   : MORE_LABELS | procedureName+ (DEPENDING ON? identifier)?
   ;

// if statement

ifStatement
   : IF condition ifThen ifElse? END_IF?
   ;

ifThen
   : THEN? (NEXT SENTENCE | statement*)
   ;

ifElse
   : ELSE (NEXT SENTENCE | statement*)
   ;

// initialize statement

initializeStatement
   : INITIALIZE identifier+ initializeWithFiller? initializeValuePhrase? initializeReplacingPhrase? initializeDefaultPhrase?
   ;

initializeWithFiller
   : WITH? FILLER
   ;

initializeValuePhrase
   : (ALL | initializeCategoryName) TO? VALUE
   ;

initializeReplacingPhrase
   : THEN? REPLACING initializeReplacingBy+
   ;

initializeReplacingBy
   : initializeCategoryName DATA? BY (identifier | literal)
   ;

initializeDefaultPhrase
   : THEN? TO? DEFAULT
   ;

initializeCategoryName
   : (ALPHABETIC 
   | ALPHANUMERIC 
   | ALPHANUMERIC_EDITED 
   | BOOLEAN 
   | DATA_POINTER 
   | FUNCTION_POINTER 
   | NATIONAL 
   | NATIONAL_EDITED 
   | NUMERIC 
   | NUMERIC_EDITED 
   | OBJECT_REFERENCE 
   | PROGRAM_POINTER 
   | DBCS 
   | EGCS)
   ;

// initiate statement

initiateStatement
   : INITIATE reportName+
   ;

// inspect statement

inspectStatement
   : INSPECT BACKWARD? identifier (inspectTallyingPhrase | inspectReplacingPhrase | inspectTallyingReplacingPhrase | inspectConvertingPhrase)
   ;

inspectTallyingPhrase
   : TALLYING inspectFor+
   ;

inspectReplacingPhrase
   : REPLACING (inspectReplacingCharacters | inspectReplacingAllLeadings)+
   ;

inspectTallyingReplacingPhrase
   : TALLYING inspectFor+ inspectReplacingPhrase+
   ;

inspectConvertingPhrase
   : CONVERTING (identifier | literal) inspectTo inspectBeforeAfter*
   ;

inspectFor
   : identifier FOR (inspectCharacters | inspectAllLeadings)+
   ;

inspectCharacters
   : (CHARACTER | CHARACTERS) inspectBeforeAfter*
   ;

inspectReplacingCharacters
   : (CHARACTER | CHARACTERS) inspectBy inspectBeforeAfter*
   ;

inspectAllLeadings
   : (ALL | LEADING) inspectAllLeading+
   ;

inspectReplacingAllLeadings
   : (ALL | LEADING | FIRST) inspectReplacingAllLeading+
   ;

inspectAllLeading
   : (identifier | literal) inspectBeforeAfter*
   ;

inspectReplacingAllLeading
   : (identifier | literal) inspectBy inspectBeforeAfter*
   ;

inspectBy
   : BY (identifier | literal)
   ;

inspectTo
   : TO (identifier | literal)
   ;

inspectBeforeAfter
   : (BEFORE | AFTER) INITIAL? (identifier | literal)
   ;

// invoke statement

invokeStatement
   : INVOKE (className | SELF | SUPER) (NEW | identifier | literal) 
   (USING (invokeByReferenceClause | invokeByContentClause | invokeByValueClause)+)? 
   invokeReturningClause? onExceptionClause? notOnExceptionClause? 
   END_INVOKE?
   ;

invokeReturningClause
   : RETURNING identifier
   ;

invokeByReferenceClause
   : BY? REFERENCE (identifier | OMITTED)
   ;

invokeByContentClause
   : BY? CONTENT (identifier | literal | arithmeticExpression)
   ;

invokeByValueClause
   : BY? VALUE (((LENGTH OF)? identifier) | literal | arithmeticExpression)
   ;

// json generate statement

jsonGenerateStatement
   : JSON_GENERATE identifier FROM identifier
     jsonGenerateCountPhrase?
     jsonGenerateEncodingPhrase?
     jsonGenerateNamePhrase?
     jsonGenerateSuppressPhrase?
     jsonGenerateConvertingPhrase?
     onExceptionClause?
     notOnExceptionClause?
     jsonGenerateEndJsonPhrase
   ;

jsonGenerateCountPhrase
   : (COUNT IN? identifier)
   ;

jsonGenerateEncodingPhrase
   : (
   ENCODING
   (identifier | literal | (FROM CODEPAGE))
   )
   ;

jsonGenerateNamePhrase
   : (NAME OF? (identifier IS? (literal | OMITTED))+)
   ;

jsonGenerateSuppressPhrase
   : (SUPPRESS ((identifier jsonGenerateWhenPhrase?) | jsonGenerateGenericSupressionPhrase)+)
   ;

jsonGenerateWhenPhrase
   : WHEN jsonGenerateFigurativeConstant (OR? jsonGenerateFigurativeConstant)*
   ;

jsonGenerateFigurativeConstant
   : (ZERO
   | ZEROES
   | ZEROS
   | SPACE
   | SPACES
   | LOW_VALUE
   | LOW_VALUES
   | HIGH_VALUE
   | HIGH_VALUES)
   ;

jsonGenerateGenericSupressionPhrase
   : (EVERY (NUMERIC | NONNUMERIC)?)? jsonGenerateWhenPhrase
   ;

jsonGeneratePhrase1
   : identifier TO? JSON? (BOOLEAN | BOOL) USING? (identifier | literal)
   ;

jsonGenerateConvertingPhrase
   : CONVERTING jsonGeneratePhrase1 (ALSO jsonGeneratePhrase1)*
   ;

jsonGenerateEndJsonPhrase
   : END_JSON
   ;

// json parse statement


jsonParseStatement
   : JSON_PARSE identifier INTO identifier
     jsonParseWithDetailPhrase?
     jsonParseEncodingPhrase?
     jsonParseNamePhrase?
     jsonParseSuppressPhrase?
     jsonParseConvertingPhrase?
     onExceptionClause?
     notOnExceptionClause?
     jsonParseEndJsonPhrase
   ;

jsonParseWithDetailPhrase
   : (WITH? DETAIL)
   ;

jsonParseEncodingPhrase
   : (
   ENCODING
   (identifier | literal | (FROM CODEPAGE))
   )
   ;

jsonParseNamePhrase
   : (NAME OF? (identifier IS? (literal | OMITTED))+)
   ;

jsonParseSuppressPhrase
   : (SUPPRESS identifier+)
   ;

jsonParsePhrase1
   : identifier FROM? JSON? (BOOLEAN | BOOL) jsonParseUsingPhrase1
   ;

jsonParseUsingPhrase1
   : USING? (identifier | literal) (AND? (identifier | literal))?
   ;

jsonParseConvertingPhrase
   : CONVERTING jsonParsePhrase1 (ALSO jsonParsePhrase1)*
   ;

jsonParseEndJsonPhrase
   : END_JSON
   ;

// merge statement

mergeStatement
   : MERGE fileName mergeOnKeyClause+ mergeCollatingSequencePhrase? mergeUsing* mergeOutputProcedurePhrase? mergeGivingPhrase*
   ;

mergeOnKeyClause
   : ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+
   ;

mergeCollatingSequencePhrase
   : COLLATING? SEQUENCE IS? alphabetName+ mergeCollatingAlphanumeric? mergeCollatingNational?
   ;

mergeCollatingAlphanumeric
   : FOR? ALPHANUMERIC IS alphabetName
   ;

mergeCollatingNational
   : FOR? NATIONAL IS? alphabetName
   ;

mergeUsing
   : USING fileName+
   ;

mergeOutputProcedurePhrase
   : OUTPUT PROCEDURE IS? procedureName mergeOutputThrough?
   ;

mergeOutputThrough
   : (THROUGH | THRU) procedureName
   ;

mergeGivingPhrase
   : GIVING mergeGiving+
   ;

mergeGiving
   : fileName (LOCK | SAVE | NO REWIND | CRUNCH | RELEASE | WITH REMOVE CRUNCH)?
   ;

// move statement

moveStatement
   : MOVE ALL? (moveToStatement | moveCorrespondingToStatement)
   ;

moveToStatement
   : moveToSendingArea TO (identifier COMMACHAR?)+
   ;

moveToSendingArea
   : identifier | literal | continuedLiteral
   ;

moveCorrespondingToStatement
   : (CORRESPONDING | CORR) moveCorrespondingToSendingArea TO (identifier COMMACHAR?)+
   ;

moveCorrespondingToSendingArea
   : identifier
   ;

// multiply statement

multiplyStatement
   : MULTIPLY (identifier | literal) BY (multiplyRegular | multiplyGiving) onSizeErrorPhrase? notOnSizeErrorPhrase? END_MULTIPLY?
   ;

multiplyRegular
   : multiplyRegularOperand+
   ;

multiplyRegularOperand
   : identifier roundedPhrase?
   ;

multiplyGiving
   : multiplyGivingOperand GIVING multiplyGivingResult+
   ;

multiplyGivingOperand
   : identifier | literal
   ;

multiplyGivingResult
   : identifier roundedPhrase?
   ;

// next sentence

nextSentenceStatement
   : NEXT SENTENCE
   ;

// open statement

openStatement
   : OPEN (openInputStatement | openOutputStatement | openIOStatement | openExtendStatement)+
   ;

openInputStatement
   : INPUT sharingPhrase? retryPhrase? (openInput COMMACHAR?)+
   ;

openInput
   : fileName (REVERSED | WITH? NO REWIND)?
   ;

openOutputStatement
   : OUTPUT sharingPhrase? retryPhrase? (openOutput COMMACHAR?)+
   ;

openOutput
   : fileName (WITH? NO REWIND)?
   ;

openIOStatement
   : I_O sharingPhrase? retryPhrase? (fileName COMMACHAR?)+
   ;

openExtendStatement
   : EXTEND sharingPhrase? retryPhrase? (fileName COMMACHAR?)+
   ;

sharingPhrase
   : SHARING WITH? ((ALL OTHER?) | (NO OTHER?) | (READ ONLY))
   ;

// perform statement

performStatement
   : PERFORM (performInlineStatement | performProcedureStatement | performWithExceptionCheckingStatement)
   ;

performInlineStatement
   : performType? statement* END_PERFORM
   ;

performProcedureStatement
   : procedureName ((THROUGH | THRU) procedureName)? performType?
   ;

performType
   : performTimes | performUntil | performVarying
   ;

performTimes
   : (identifier | integerLiteral) TIMES
   ;

performUntil
   : performTestClause? UNTIL (condition | EXIT)
   ;

performVarying
   : performTestClause performVaryingClause | performVaryingClause performTestClause?
   ;

performVaryingClause
   : VARYING performVaryingPhrase performAfter*
   ;

performVaryingPhrase
   : (identifier | literal) performFrom performBy performUntil
   ;

performAfter
   : AFTER performVaryingPhrase
   ;

performFrom
   : FROM (identifier | literal | arithmeticExpression)
   ;

performBy
   : BY (identifier | literal | arithmeticExpression)
   ;

performTestClause
   : WITH? TEST (BEFORE | AFTER)
   ;

performWithExceptionCheckingStatement
   : (WITH? LOCATION)?
   statement* 
   performExceptionClause+
   performOtherExceptionClause?
   performCommonExceptionClause?
   performFinallyClause?
   END_PERFORM
   ;

performExceptionClause
   : (WHEN (performExceptionPhrase | exceptionName+ | (exceptionName FILE fileName)+) statement+)
   ;
 
performExceptionPhrase
   : EXCEPTION (fileName+ | INPUT | OUTPUT | I_O | EXTEND)
   ;

performOtherExceptionClause
   : (WHEN OTHER EXCEPTION? statement+)
   ;
   
performCommonExceptionClause
   : (WHEN? COMMON EXCEPTION? statement+)
   ;

performFinallyClause
   : (FINALLY statement+)
   ;

// purge statement

purgeStatement
   : PURGE cdName+
   ;

// raise statement

raiseStatement
   : RAISE ((EXCEPTION exceptionName) | identifier)
   ;

// read statement

readStatement
   : READ fileName (NEXT | PREVIOUS)? RECORD? readInto? readLockPhrase? retryPhrase? readWith? readKey? invalidKeyPhrase? notInvalidKeyPhrase? atEndPhrase? notAtEndPhrase? END_READ?
   ;

readInto
   : INTO identifier
   ;

/*
Neither KEPT nor WAIT are in the current standard, they
are also absent from IBM's current documentation.
*/
readWith
   : WITH? ((KEPT | NO)? LOCK | WAIT)
   ;

readLockPhrase
   : ((ADVANCING ON?) | IGNORING) LOCK
   ;

readKey
   : KEY IS? qualifiedDataName
   ;

// receive statement

/*
Presuming this works with the Communication Section which
is no longer in the standard.
*/
receiveStatement
   : RECEIVE (receiveFromStatement | receiveIntoStatement) onExceptionClause? notOnExceptionClause? END_RECEIVE?
   ;

receiveFromStatement
   : dataName FROM receiveFrom (receiveBefore | receiveWith | receiveThread | receiveSize | receiveStatus)*
   ;

receiveFrom
   : THREAD dataName | LAST THREAD | ANY THREAD
   ;

receiveIntoStatement
   : cdName (MESSAGE | SEGMENT) INTO? identifier receiveNoData? receiveWithData?
   ;

receiveNoData
   : NO DATA statement*
   ;

receiveWithData
   : WITH DATA statement*
   ;

receiveBefore
   : BEFORE TIME? (numericLiteral | identifier)
   ;

receiveWith
   : WITH? NO WAIT
   ;

receiveThread
   : THREAD IN? dataName
   ;

receiveSize
   : SIZE IN? (numericLiteral | identifier)
   ;

receiveStatus
   : STATUS IN? (identifier)
   ;

standardReceiveStatement
   : RECEIVE FROM? dataName GIVING dataName standardReceiveContinuePhrase? onExceptionClause? notOnExceptionClause? END_RECEIVE?
   ;

standardReceiveContinuePhrase
   : CONTINUE AFTER? ((arithmeticExpression SECONDS?) | (MESSAGE RECEIVED))
   ;

// release statement

releaseStatement
   : RELEASE recordName (FROM qualifiedDataName)?
   ;

// resume statement

resumeStatement
   : RESUME AT? ((NEXT STATEMENT) | procedureName)
   ;

// return statement

returnStatement
   : RETURN fileName RECORD? returnInto? atEndPhrase notAtEndPhrase? END_RETURN?
   ;

returnInto
   : INTO qualifiedDataName
   ;

// rewrite statement

rewriteStatement
   : REWRITE recordName rewriteFrom? retryPhrase? lockPhrase? invalidKeyPhrase? notInvalidKeyPhrase? END_REWRITE?
   ;

rewriteFrom
   : FROM identifier
   ;

lockPhrase
   : WITH? NO? LOCK
   ;

// rollback statement

rollbackStatement
   : ROLLBACK
   ;
 
// search statement

searchStatement
   : SEARCH ALL? qualifiedDataName searchVarying? atEndPhrase? searchWhen+ END_SEARCH?
   ;

searchVarying
   : VARYING qualifiedDataName
   ;

searchWhen
   : WHEN condition (NEXT SENTENCE | statement*)
   ;

// send statement

sendStatement
   : SEND (sendStatementSync | sendStatementAsync) onExceptionClause? notOnExceptionClause?
   ;

sendStatementSync
   : (identifier | literal) sendFromPhrase? sendWithPhrase? sendReplacingPhrase? sendAdvancingPhrase?
   ;

sendStatementAsync
   : TO (TOP | BOTTOM) identifier
   ;

sendFromPhrase
   : FROM identifier
   ;

sendWithPhrase
   : WITH (EGI | EMI | ESI | identifier)
   ;

sendReplacingPhrase
   : REPLACING LINE?
   ;

sendAdvancingPhrase
   : (BEFORE | AFTER) ADVANCING? (sendAdvancingPage | sendAdvancingLines | sendAdvancingMnemonic)
   ;

sendAdvancingPage
   : PAGE
   ;

sendAdvancingLines
   : (identifier | literal) (LINE | LINES)?
   ;

sendAdvancingMnemonic
   : mnemonicName
   ;

// standard send statement

standardSendStatement
   : (standardSendStatementFormat1 | standardSendStatementFormat2)
   ;
   
standardSendStatementFormat1
   : SEND TO? (literal | messageServerName) FROM dataName
   RETURNING dataName onExceptionClause? notOnExceptionClause? 
   END_SEND
   ;
   
standardSendStatementFormat2
   : SEND TO? dataName FROM dataName
   (RAISING ((EXCEPTION exceptionName) | (LAST EXCEPTION?)))?
   onExceptionClause? notOnExceptionClause? 
   END_SEND
   ;

// set statement

setStatement
   : SET (setToStatement+ | setUpDownByStatement | setScreenAttributeStatement)
   ;

setToStatement
   : (ADDRESS OF?)? setTo+ TO setToValue+
   ;

setUpDownByStatement
   : setTo+ (UP BY | DOWN BY) setByValue
   ;

setTo
   : identifier
   ;

setToValue
   : ON | OFF | ENTRY (identifier | literal) | identifier | literal
   ;

setByValue
   : identifier | literal
   ;

setScreenAttributeStatement
   : screenName ATTRIBUTE (setScreenAttribute (OFF | ON))+
   ;
   
setScreenAttribute
   : (BELL
     | BLINK
     | HIGHLIGHT
     | LOWLIGHT
     | REVERSE_VIDEO
     | UNDERLINE)
   ;

// sort statement

sortStatement
   : SORT fileName sortOnKeyClause+ sortDuplicatesPhrase? sortCollatingSequencePhrase? sortInputProcedurePhrase? sortUsing* sortOutputProcedurePhrase? sortGivingPhrase*
   ;

sortOnKeyClause
   : ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+
   ;

sortDuplicatesPhrase
   : WITH? DUPLICATES IN? ORDER?
   ;

sortCollatingSequencePhrase
   : COLLATING? SEQUENCE IS? alphabetName+ sortCollatingAlphanumeric? sortCollatingNational?
   ;

sortCollatingAlphanumeric
   : FOR? ALPHANUMERIC IS alphabetName
   ;

sortCollatingNational
   : FOR? NATIONAL IS? alphabetName
   ;

sortInputProcedurePhrase
   : INPUT PROCEDURE IS? procedureName sortInputThrough?
   ;

sortInputThrough
   : (THROUGH | THRU) procedureName
   ;

sortUsing
   : USING fileName+
   ;

sortOutputProcedurePhrase
   : OUTPUT PROCEDURE IS? procedureName sortOutputThrough?
   ;

sortOutputThrough
   : (THROUGH | THRU) procedureName
   ;

sortGivingPhrase
   : GIVING sortGiving+
   ;

sortGiving
   : fileName (LOCK | SAVE | NO REWIND | CRUNCH | RELEASE | WITH REMOVE CRUNCH)?
   ;

// start statement

startStatement
   : START fileName startKey? invalidKeyPhrase? notInvalidKeyPhrase? END_START?
   ;

startKey
   : KEY IS? (EQUAL TO? | EQUALCHAR | GREATER THAN? | MORETHANCHAR | NOT LESS THAN? | NOT LESSTHANCHAR | GREATER THAN? OR EQUAL TO? | MORETHANOREQUAL) qualifiedDataName
   ;

// stop statement

stopStatement
   : STOP (RUN | literal | stopStatementGiving | stopStatementWith)
   ;

stopStatementGiving
   : RUN (GIVING | RETURNING) (identifier | integerLiteral)
   ;

stopStatementWith
   : (RUN WITH? (ERROR | NORMAL) STATUS? (identifier | literal)?)
   ;

// string statement

stringStatement
   : STRING stringSendingPhrase+ stringIntoPhrase stringWithPointerPhrase? onOverflowPhrase? notOnOverflowPhrase? END_STRING?
   ;

stringSendingPhrase
   : stringSending (COMMACHAR? stringSending)* (stringDelimitedByPhrase | stringForPhrase)
   ;

stringSending
   : identifier | literal
   ;

stringDelimitedByPhrase
   : DELIMITED BY? (SIZE | identifier | literal)
   ;

stringForPhrase
   : FOR (identifier | literal)
   ;

stringIntoPhrase
   : INTO identifier
   ;

stringWithPointerPhrase
   : WITH? POINTER qualifiedDataName
   ;

// subtract statement

subtractStatement
   : SUBTRACT (subtractFromStatement | subtractFromGivingStatement | subtractCorrespondingStatement) onSizeErrorPhrase? notOnSizeErrorPhrase? END_SUBTRACT?
   ;

subtractFromStatement
   : subtractSubtrahend+ FROM subtractMinuend+
   ;

subtractFromGivingStatement
   : subtractSubtrahend+ FROM subtractMinuendGiving GIVING subtractGiving+
   ;

subtractCorrespondingStatement
   : (CORRESPONDING | CORR) qualifiedDataName FROM subtractMinuendCorresponding
   ;

subtractSubtrahend
   : identifier | literal
   ;

subtractMinuend
   : identifier roundedPhrase?
   ;

subtractMinuendGiving
   : identifier | literal
   ;

subtractGiving
   : identifier roundedPhrase?
   ;

subtractMinuendCorresponding
   : qualifiedDataName roundedPhrase?
   ;

// suppress statement

suppressStatement
   : SUPPRESS PRINTING?
   ;

// terminate statement

terminateStatement
   : TERMINATE reportName
   ;

// unlock statement

unlockStatement
   : UNLOCK fileName (RECORD | RECORDS)?
   ;

// unstring statement

unstringStatement
   : UNSTRING unstringSendingPhrase unstringIntoPhrase unstringWithPointerPhrase? unstringTallyingPhrase? onOverflowPhrase? notOnOverflowPhrase? END_UNSTRING?
   ;

unstringSendingPhrase
   : identifier (unstringDelimitedByPhrase unstringOrAllPhrase*)?
   ;

unstringDelimitedByPhrase
   : DELIMITED BY? ALL? (identifier | literal)
   ;

unstringOrAllPhrase
   : OR ALL? (identifier | literal)
   ;

unstringIntoPhrase
   : INTO unstringInto+
   ;

unstringInto
   : identifier unstringDelimiterIn? unstringCountIn?
   ;

unstringDelimiterIn
   : DELIMITER IN? identifier
   ;

unstringCountIn
   : COUNT IN? identifier
   ;

unstringWithPointerPhrase
   : WITH? POINTER qualifiedDataName
   ;

unstringTallyingPhrase
   : TALLYING IN? qualifiedDataName
   ;

// use statement

useStatement
   : USE (useAfterClause | useDebugClause | useExceptionNameClause | useExceptionObjectClause | useReportClause)
   ;

useAfterClause
   : GLOBAL? AFTER STANDARD? (EXCEPTION | ERROR) PROCEDURE ON? useAfterOn
   ;

useAfterOn
   : INPUT | OUTPUT | I_O | EXTEND | fileName+
   ;

useDebugClause
   : FOR? DEBUGGING ON? useDebugOn+
   ;

useDebugOn
   : ALL PROCEDURES | ALL REFERENCES? OF? identifier | procedureName | fileName
   ;

useExceptionNameClause
   : AFTER? ((EXCEPTION CONDITION) | EC) (exceptionName | useExceptionNameWithFilePhrase)+
   ;

useExceptionNameWithFilePhrase
   : (exceptionName (FILE fileName)+)
   ;

useExceptionObjectClause
   : AFTER? ((EXCEPTION OBJECT) | EO) (className | interfaceName)
   ;

useReportClause
   : GLOBAL? BEFORE REPORTING identifier
   ;
   
// xml generate statement

xmlGenerateStatement
   : XML_GENERATE identifier FROM identifier 
     xmlGenerateCountInPhrase?
     xmlGenerateEncodingPhrase?
     xmlGenerateDeclarationPhrase?
     xmlGenerateAttributesPhrase?
     xmlGenerateNamespacePhrase?
     xmlGenerateNamespacePrefixPhrase?
     xmlGenerateNamePhrase?
     xmlGenerateTypePhrase?
     xmlGenerateSuppressPhrase?
     onExceptionClause?
     notOnExceptionClause?
     xmlGenerateEndXmlPhrase
   ;

xmlGenerateCountInPhrase
   : COUNT IN? identifier
   ;

xmlGenerateEncodingPhrase
   : WITH? ENCODING (identifier | literal)
   ;

xmlGenerateDeclarationPhrase
   : WITH? XML_DECLARATION
   ;

xmlGenerateAttributesPhrase
   : WITH? ATTRIBUTES
   ;

xmlGenerateNamespacePhrase
   : NAMESPACE IS? (identifier | literal)
   ;

xmlGenerateNamespacePrefixPhrase
   : NAMESPACE_PREFIX IS? (identifier | literal)
   ;

xmlGenerateNamePhrase
   : NAME OF? (identifier IS? literal)+
   ;

xmlGenerateTypePhrase
   : TYPE OF? (identifier IS? xmlGenerateType)+
   ;

xmlGenerateSuppressPhrase
   : SUPPRESS ((identifier xmlGenerateWhenPhrase) | xmlGenerateGenericSuppressionPhrase)+
   ;

xmlGenerateWhenPhrase
   : WHEN xmlGenerateFigurativeConstant (OR xmlGenerateFigurativeConstant)*
   ;

xmlGenerateGenericSuppressionPhrase
   : (EVERY (xmlGenerateGenericSuppressionNumericPhrase | xmlGenerateGenericSuppressionNonNumericPhrase | xmlGenerateType) xmlGenerateWhenPhrase)
   ;

xmlGenerateGenericSuppressionNumericPhrase
   : (NUMERIC xmlGenerateType?)
   ;

xmlGenerateGenericSuppressionNonNumericPhrase
   : (NONNUMERIC xmlGenerateType?)
   ;

xmlGenerateEndXmlPhrase
   : END_XML
   ;

xmlGenerateFigurativeConstant
   : (ZERO
   | ZEROES
   | ZEROS
   | SPACE
   | SPACES
   | LOW_VALUE
   | LOW_VALUES
   | HIGH_VALUE
   | HIGH_VALUES)
   ;

xmlGenerateType
   : (ATTRIBUTE
   | ELEMENT
   | CONTENT)
   ;

// xml parse statement

xmlParseStatement
   : XML_PARSE identifier
     xmlParseEncodingPhrase?
     xmlParseReturningNationalPhrase?
     xmlParseValidatingPhrase?
     xmlParseProcessingProcedurePhrase
     onExceptionClause?
     notOnExceptionClause?
     xmlParseEndXmlPhrase
   ;

xmlParseEncodingPhrase
   : (WITH? ENCODING (identifier | literal))
   ;

xmlParseReturningNationalPhrase
   : (RETURNING NATIONAL)
   ;

xmlParseValidatingPhrase
   : (VALIDATING WITH? (identifier | (FILE identifier)))
   ;

xmlParseProcessingProcedurePhrase
   : (PROCESSING PROCEDURE IS? identifier ((THROUGH | THRU) identifier)?)
   ;

xmlParseEndXmlPhrase
   : END_XML
   ;

// write statement

writeStatement
   : WRITE (recordName | (FILE fileName)) writeFromPhrase? writeAdvancingPhrase? retryPhrase? lockPhrase? writeAtEndOfPagePhrase? writeNotAtEndOfPagePhrase? invalidKeyPhrase? notInvalidKeyPhrase? END_WRITE?
   ;

writeFromPhrase
   : FROM (identifier | literal)
   ;

writeAdvancingPhrase
   : (BEFORE | AFTER) ADVANCING? (writeAdvancingPage | writeAdvancingLines | writeAdvancingMnemonic)
   ;

writeAdvancingPage
   : PAGE
   ;

writeAdvancingLines
   : (identifier | literal) (LINE | LINES)?
   ;

writeAdvancingMnemonic
   : mnemonicName
   ;

writeAtEndOfPagePhrase
   : AT? (END_OF_PAGE | EOP) statement*
   ;

writeNotAtEndOfPagePhrase
   : NOT AT? (END_OF_PAGE | EOP) statement*
   ;

// statement phrases ----------------------------------

atEndPhrase
   : AT? END statement*
   ;

notAtEndPhrase
   : NOT AT? END statement*
   ;

invalidKeyPhrase
   : INVALID KEY? statement*
   ;

notInvalidKeyPhrase
   : NOT INVALID KEY? statement*
   ;

onOverflowPhrase
   : ON? OVERFLOW statement*
   ;

notOnOverflowPhrase
   : NOT ON? OVERFLOW statement*
   ;

onSizeErrorPhrase
   : ON? SIZE ERROR statement*
   ;

notOnSizeErrorPhrase
   : NOT ON? SIZE ERROR statement*
   ;

retryPhrase
   : RETRY 
     ((arithmeticExpression TIMES)
     | (FOR arithmeticExpression SECONDS)
     | FOREVER)
   ;
// statement clauses ----------------------------------

onExceptionClause
   : ON? EXCEPTION statement*
   ;

notOnExceptionClause
   : NOT ON? EXCEPTION statement*
   ;

// arithmetic expression ----------------------------------

/*
Including booleanExpression here is the only way I found to
avoid the abiguity resulting from both arithmeticExpression
and booleanExpression allowing a single identifier or a
single literal.  Keeping them separate and as options in the
computeStatement resulted in parsing problems regardless of
their order.
*/
arithmeticExpression
   : multDivs plusMinus* | booleanExpression
   ;

plusMinus
   : (PLUSCHAR | MINUSCHAR) multDivs
   ;

multDivs
   : powers multDiv*
   ;

multDiv
   : (ASTERISKCHAR | SLASHCHAR) powers
   ;

powers
   : (PLUSCHAR | MINUSCHAR)? basis power*
   ;

power
   : DOUBLEASTERISKCHAR basis
   ;

basis
   : LPARENCHAR arithmeticExpression RPARENCHAR | identifier | literal
   ;

// booleanExpression --------------------------

/*
Enclosing the options within parentheses will get you a
mutual left recursion error for this rule (with itself, ironically).
*/
booleanExpression
   : 
     booleanExpression binaryBooleanOperator booleanExpression 
   | unaryBooleanOperator booleanExpression 
   | (LPARENCHAR booleanExpression RPARENCHAR) 
   | booleanExpression booleanShiftOperator integerLiteral
   | identifier 
   | (ALL? literal) 
   | figurativeZero
   ;

figurativeZero
   : (ZERO | ZEROS | ZEROES)
   ;

// condition ----------------------------------

condition
   : combinableCondition andOrCondition*
   ;

andOrCondition
   : (AND | OR) (combinableCondition | abbreviation+)
   ;

combinableCondition
   : NOT? simpleCondition
   ;

simpleCondition
   : LPARENCHAR condition RPARENCHAR | relationCondition | classCondition | conditionNameReference
   ;

classCondition
   : identifier IS? NOT? (NUMERIC | ALPHABETIC | ALPHABETIC_LOWER | ALPHABETIC_UPPER | DBCS | KANJI | className)
   ;

conditionNameReference
   : conditionName (inData* inFile? conditionNameSubscriptReference* | inMnemonic*)
   ;

conditionNameSubscriptReference
   : LPARENCHAR subscript (COMMACHAR? subscript)* RPARENCHAR
   ;

// relation ----------------------------------

relationCondition
   : relationSignCondition | relationArithmeticComparison | relationCombinedComparison
   ;

relationSignCondition
   : arithmeticExpression IS? NOT? (POSITIVE | NEGATIVE | ZERO)
   ;

relationArithmeticComparison
   : arithmeticExpression relationalOperator arithmeticExpression
   ;

relationCombinedComparison
   : arithmeticExpression relationalOperator LPARENCHAR relationCombinedCondition RPARENCHAR
   ;

relationCombinedCondition
   : arithmeticExpression ((AND | OR) arithmeticExpression)+
   ;

relationalOperator
   : (IS | ARE)? (NOT? (GREATER THAN? | MORETHANCHAR | LESS THAN? | LESSTHANCHAR | EQUAL TO? | EQUALCHAR) | NOTEQUALCHAR | GREATER THAN? OR EQUAL TO? | MORETHANOREQUAL | LESS THAN? OR EQUAL TO? | LESSTHANOREQUAL)
   ;

abbreviation
   : NOT? relationalOperator? (arithmeticExpression | LPARENCHAR arithmeticExpression abbreviation RPARENCHAR)
   ;

// identifier ----------------------------------

identifier
   : functionCall | tableCall | qualifiedDataName | specialRegister //| dfhvalue
   ;

/*
dfhvalue
   : DFHVALUE LPARENCHAR (cicsWord | cobolWord) RPARENCHAR
   ;
*/

tableCall
//   : qualifiedDataName (LPARENCHAR subscript (COMMACHAR? subscript)* RPARENCHAR)* referenceModifier?
   : qualifiedDataName (LPARENCHAR subscript (COMMACHAR? subscript)* RPARENCHAR) referenceModifier?
   ;

functionCall
   : ((FUNCTION cobolWord) | functionName) (LPARENCHAR argument (COMMACHAR? argument)* RPARENCHAR)? referenceModifier?
   ;

referenceModifier
   : LPARENCHAR characterPosition COLONCHAR length? RPARENCHAR
   ;

characterPosition
   : arithmeticExpression
   ;

length
   : arithmeticExpression
   ;

subscript
   : ALL | integerLiteral | qualifiedDataName integerLiteral? | indexName integerLiteral? | arithmeticExpression
   ;

argument
   : literal | identifier | qualifiedDataName integerLiteral? | indexName integerLiteral? | arithmeticExpression
   ;

// qualified data name ----------------------------------

qualifiedDataName
   : qualifiedDataNameFormat1 | qualifiedDataNameFormat2 | qualifiedDataNameFormat3 | qualifiedDataNameFormat4
   ;

qualifiedDataNameFormat1
   : (dataName | conditionName) (qualifiedInData+ inFile? | inFile)? referenceModifier?
   ;

qualifiedDataNameFormat2
   : paragraphName inSection
   ;

qualifiedDataNameFormat3
   : textName inLibrary
   ;

qualifiedDataNameFormat4
   : LINAGE_COUNTER inFile
   ;

/*
Disallow PASSWORD as it was causing File-Control paragraph 
passwordClause to be recognized as an additional qualfiedDataName 
in recordKeyClause and alternateRecordKeyClause.  PASSWORD is a 
reserved word in IBM COBOL, but not in the standard.
*/
fileControlQualifiedDataName
   : {!_input.LT(1).getText().toUpperCase().equalsIgnoreCase("PASSWORD")}?
     qualifiedDataName
   ;

/*
This rule originally read...

   : inData | inFile

...and parsing NC246A from the NIST test suite took ~2 minutes.

Changing the rule to its current form makes parsing NC246
take ~10 seconds.
*/
qualifiedInData
   : (IN | OF) (dataName | fileName)
   ;

// in ----------------------------------

inData
   : (IN | OF) dataName
   ;

inFile
   : (IN | OF) fileName
   ;

inMnemonic
   : (IN | OF) mnemonicName
   ;

inSection
   : (IN | OF) sectionName
   ;

inLibrary
   : (IN | OF) libraryName
   ;

inTable
   : (IN | OF) tableCall
   ;

// names ----------------------------------

alphabetName
   : cobolWord
   ;

/*
Disallow PASSWORD as it was causing File-Control paragraph 
passwordClause to be recognized as an additional assignmentName 
in the assignmentClause.  PASSWORD is a reserved word in IBM 
COBOL, but not in the standard.  Also changed to unique 
assignClauseName to avoid interference in other uses of 
assignmentName.
*/
assignClauseName
   : {!_input.LT(1).getText().toUpperCase().equalsIgnoreCase("PASSWORD")}?
     systemName
   ;

assignmentName
   : systemName
   ;

basisName
   : programName
   ;

cdName
   : cobolWord
   ;

className
   : cobolWord
   ;

computerName
   : systemName
   ;

conditionName
   : cobolWord
   ;

constantName
   : cobolWord
   ;

dataName
   : cobolWord
   ;

dataDescName
   : FILLER | CURSOR | dataName
   ;

environmentName
   : systemName
   ;

exceptionName
   : cobolWord
   ;

fileName
   : cobolWord
   ;

functionName
   : 
   {functionNames.contains(_input.LT(1).getText().toUpperCase())}?
   cobolWord
   ;

functionPrototypeName
   : cobolWord
   ;

indexName
   : cobolWord
   ;

inheritedClassName
   : className
   ;
   
inheritedInterfaceName
   : className
   ;
   
interfaceName
   : cobolWord
   ;
   
languageName
   : systemName
   ;

libraryName
   : cobolWord
   ;

localName
   : cobolWord
   ;

localeName
   : cobolWord
   ;

messageServerName
   : cobolWord
   ;

methodName
   : cobolWord
   ;

mnemonicName
   : cobolWord
   ;

paragraphName
   : cobolWord | integerLiteral
   ;

procedureName
   : paragraphName inSection? | sectionName
   ;

programName
   : NONNUMERICLITERAL | cobolWord
   ;

propertyName
   : NONNUMERICLITERAL | cobolWord
   ;

recordName
   : qualifiedDataName
   ;

reportName
   : qualifiedDataName
   ;

routineName
   : cobolWord
   ;

screenName
   : cobolWord
   ;

sectionName
   : cobolWord | integerLiteral
   ;

systemName
   : cobolWord
   ;

symbolicCharacter
   : cobolWord
   ;

textName
   : cobolWord
   ;

userFunctionName
   : cobolWord
   ;

// literal ----------------------------------

/*
Removed CURSOR from cobolWord as it was causing Special-Names
paragraph cursorClause to be mistaken for environmentSwitchNameClause.
*/
cobolWord
   : IDENTIFIER 
   | ABORT | AS | ASCII | ASSOCIATED_DATA | ASSOCIATED_DATA_LENGTH | ATTRIBUTE | AUTO | AUTO_SKIP
   | BACKGROUND_COLOR | BACKGROUND_COLOUR | BACKWARD | BEEP | BELL | BINARY | BIT | BLINK | BLOB | BOUNDS
   | CAPABLE | CCSVERSION | CHANGED | CHANNEL | CLOB | CLOSE_DISPOSITION | COBOL | COMMITMENT | CONTROL_POINT | CONVENTION | CRUNCH
   | DBCLOB | DEFAULT | DEFAULT_DISPLAY | DEFINITION | DFHRESP | DFHVALUE | DISK | DONTCARE | DOUBLE
   | EBCDIC | EMPTY_CHECK | ENTER | ENTRY_PROCEDURE | EOL | EOS | ERASE | ESCAPE | EVENT | EXCLUSIVE | EXPORT | EXTENDED
   | FOREGROUND_COLOR | FOREGROUND_COLOUR | FULL | FUNCTIONNAME | FUNCTION_POINTER
   | GRID
   | HIGHLIGHT
   | IMPLICIT | IMPORT | INTEGER | INVOKE
   | KEPT | KEYBOARD
   | LANGUAGE | LB | LD | LEFTLINE | LENGTH_CHECK | LIBACCESS | LIBPARAMETER | LIBRARY | LIST | LOCAL | LOCATION | LONG_DATE | LONG_TIME | LOWER | LOWLIGHT
   | MMDDYYYY
   | NAMED | NATIONAL | NATIONAL_EDITED | NETWORK | NEW | NO_ECHO | NORMAL | NUMERIC_DATE | NUMERIC_TIME
   | ODT | ORDERLY | OVERLINE | OWN
   | PASSWORD | PORT | PRINTER | PRIVATE | PROCESS | PROGRAM | PROMPT
   | RAISE | READER | REAL | RECEIVED | RECURSIVE | REF | REMOTE | REMOVE | REQUIRED | RETRY | REVERSE_VIDEO
   | SAVE | SECONDS | SECURE | SHARED | SHAREDBYALL | SHAREDBYRUNUNIT | SHARING | SHORT_DATE | SQL | STATEMENT | STRONG | SYMBOL
   | TASK | THREAD | THREAD_LOCAL | TIMER | TODAYS_DATE | TODAYS_NAME | TRUNCATED | TYPEDEF
   | UNDERLINE
   | VIRTUAL
   | WAIT
   | YEAR | YYYYMMDD | YYYYDDD
   | ZERO_FILL
   | NAME | ROWID | REMARKS
/*
copy of intrinsicFunctionName rule body

This copy is here so that these show up as cobolWord and
not intrisicFunctionName when used as data names.
*/
   | ABS
   | ACOS
   | ANNUITY
   | ASIN
   | ATAN
   | BIT_OF
   | BIT_TO_CHAR
   | BYTE_LENGTH
   | CHAR
   | COMBINED_DATETIME
   | COS
   | CURRENT_DATE
   | DATE_OF_INTEGER
   | DATE_TO_YYYYMMDD
   | DAY_OF_INTEGER
   | DAY_TO_YYYYDDD
   | DISPLAY_OF
   | E_FUNC
   | EXP
   | EXP10
   | FACTORIAL
   | FORMATTED_CURRENT_DATE
   | FORMATTED_DATE
   | FORMATTED_DATETIME
   | FORMATTED_TIME
   | HEX_OF
   | HEX_TO_CHAR
   | INTEGER
   | INTEGER_OF_DATE
   | INTEGER_OF_DAY
   | INTEGER_OF_FORMATTED_DATE
   | INTEGER_PART
   | LENGTH
   | LOG
   | LOG10
   | LOWER_CASE
   | MAX
   | MEAN
   | MEDIAN
   | MIDRANGE
   | MIN
   | MOD
   | NATIONAL_OF
   | NUMVAL
   | NUMVAL_C
   | NUMVAL_F
   | ORD
   | ORD_MAX
   | ORD_MIN
   | PI
   | PRESENT_VALUE
   | RANDOM
   | RANGE
   | REM
   | REVERSE
   | SECONDS_FROM_FORMATTED_TIME
   | SECONDS_PAST_MIDNIGHT
   | SIGN
   | SIN
   | SQRT
   | STANDARD_DEVIATION
   | SUM
   | TAN
   | TEST_DATE_YYYYMMDD
   | TEST_DAY_YYYYDDD
   | TEST_FORMATTED_DATETIME
   | TEST_NUMVAL
   | TEST_NUMVAL_C
   | TEST_NUMVAL_F
   | TRIM
   | ULENGTH
   | UPOS
   | UPPER_CASE
   | USUBSTR
   | USUPPLEMENTARY
   | UUID4
   | UVALID
   | UWIDTH
   | VARIANCE
   | WHEN_COMPILED
   | YEAR_TO_YYYY
   | BASECONVERT
   | BOOLEAN_OF_INTEGER
   | CHAR_NATIONAL
   | CONCAT
   | CONTENT_OF
   | CONVERT
   | EXCEPTION_FILE
   | EXCEPTION_FILE_N
   | EXCEPTION_LOCATION
   | EXCEPTION_LOCATION_N
   | EXCEPTION_STATEMENT
   | EXCEPTION_STATUS
   | FIND_STRING
   | FRACTION_PART
   | HIGHEST_ALGEBRAIC
   | INTEGER_OF_BOOLEAN
   | LOCALE_COMPARE
   | LOCALE_DATE
   | LOCALE_TIME
   | LOCAL_TIME_FROM_SECONDS
   | LOWEST_ALGEBRAIC
   | MODULE_NAME
   | SMALLEST_ALGEBRAIC
   | STANDARD_COMPARE
   | SUBSTITUTE
// end of copy of intrinsicFunctionName rule body
   ;

/*
There are two (count them, two!) copies of the body of this
rule in addition to this one.  I don't like it any better than
you do, but this is where we are.  One copy is in cobolWord
and the other is in functionIntrinsicPhrase.

This list is inclusive of all instrinsic functions listed
in the draft 202x COBOL standard, in addition to those
listed in the IBM Enterprise COBOL 6.4 documentation.
*/
intrinsicFunctionName
   :  ABS
   | ACOS
   | ANNUITY
   | ASIN
   | ATAN
   | BIT_OF
   | BIT_TO_CHAR
   | BYTE_LENGTH
   | CHAR
   | COMBINED_DATETIME
   | COS
   | CURRENT_DATE
   | DATE_OF_INTEGER
   | DATE_TO_YYYYMMDD
   | DAY_OF_INTEGER
   | DAY_TO_YYYYDDD
   | DISPLAY_OF
   | E_FUNC
   | EXP
   | EXP10
   | FACTORIAL
   | FORMATTED_CURRENT_DATE
   | FORMATTED_DATE
   | FORMATTED_DATETIME
   | FORMATTED_TIME
   | HEX_OF
   | HEX_TO_CHAR
   | INTEGER
   | INTEGER_OF_DATE
   | INTEGER_OF_DAY
   | INTEGER_OF_FORMATTED_DATE
   | INTEGER_PART
   | LENGTH
   | LOG
   | LOG10
   | LOWER_CASE
   | MAX
   | MEAN
   | MEDIAN
   | MIDRANGE
   | MIN
   | MOD
   | NATIONAL_OF
   | NUMVAL
   | NUMVAL_C
   | NUMVAL_F
   | ORD
   | ORD_MAX
   | ORD_MIN
   | PI
   | PRESENT_VALUE
   | RANDOM
   | RANGE
   | REM
   | REVERSE
   | SECONDS_FROM_FORMATTED_TIME
   | SECONDS_PAST_MIDNIGHT
   | SIGN
   | SIN
   | SQRT
   | STANDARD_DEVIATION
   | SUM
   | TAN
   | TEST_DATE_YYYYMMDD
   | TEST_DAY_YYYYDDD
   | TEST_FORMATTED_DATETIME
   | TEST_NUMVAL
   | TEST_NUMVAL_C
   | TEST_NUMVAL_F
   | TRIM
   | ULENGTH
   | UPOS
   | UPPER_CASE
   | USUBSTR
   | USUPPLEMENTARY
   | UUID4
   | UVALID
   | UWIDTH
   | VARIANCE
   | WHEN_COMPILED
   | YEAR_TO_YYYY
   | BASECONVERT
   | BOOLEAN_OF_INTEGER
   | CHAR_NATIONAL
   | CONCAT
   | CONTENT_OF
   | CONVERT
   | EXCEPTION_FILE
   | EXCEPTION_FILE_N
   | EXCEPTION_LOCATION
   | EXCEPTION_LOCATION_N
   | EXCEPTION_STATEMENT
   | EXCEPTION_STATUS
   | FIND_STRING
   | FRACTION_PART
   | HIGHEST_ALGEBRAIC
   | INTEGER_OF_BOOLEAN
   | LOCALE_COMPARE
   | LOCALE_DATE
   | LOCALE_TIME
   | LOCAL_TIME_FROM_SECONDS
   | LOWEST_ALGEBRAIC
   | MODULE_NAME
   | SMALLEST_ALGEBRAIC
   | STANDARD_COMPARE
   | SUBSTITUTE
   ;

binaryBooleanOperator
   : (B_AND | B_OR | B_XOR)
   ;

unaryBooleanOperator
   : B_NOT
   ;

booleanShiftOperator
   : (B_SHIFT_L | B_SHIFT_LC | B_SHIFT_R | B_SHIFT_RC)
   ;

booleanOperator
   : (binaryBooleanOperator | unaryBooleanOperator | booleanShiftOperator)
   ;

literal
   : NONNUMERICLITERAL | figurativeConstant | numericLiteral | booleanLiteral | cicsDfhRespLiteral | cicsDfhValueLiteral | continuedLiteral
   ;

continuedLiteral
   : ((CONTINUED_STRINGLITERAL | CONTINUED_DBCSLITERAL | CONTINUED_HEXNUMBER  | CONTINUED_NULLTERMINATED) CLASSIC_CONTINUATION)+ NONNUMERICLITERAL
   ;

booleanLiteral
   : TRUE | FALSE
   ;

numericLiteral
   : NUMERICLITERAL | ZERO | integerLiteral
   ;

integerLiteral
   : INTEGERLITERAL | LEVEL_NUMBER_66 | LEVEL_NUMBER_77 | LEVEL_NUMBER_88
   ;

/*
The END token is here because it is the only valid DFHRESP value
that is also a COBOL reserved word.
*/
cicsDfhRespLiteral
   : DFHRESP LPARENCHAR (cobolWord | literal | END) RPARENCHAR
   ;

cicsDfhValueLiteral
   : DFHVALUE LPARENCHAR (cobolWord | literal) RPARENCHAR
   ;

// keywords ----------------------------------

figurativeConstant
   : ALL literal | HIGH_VALUE | HIGH_VALUES | LOW_VALUE | LOW_VALUES | NULL | NULLS | QUOTE | QUOTES | SPACE | SPACES | ZERO | ZEROS | ZEROES
   ;

specialRegister
   : (ADDRESS OF identifier)
   | DATE | DAY | DAY_OF_WEEK | DEBUG_CONTENTS | DEBUG_ITEM | DEBUG_LINE | DEBUG_NAME | DEBUG_SUB_1 | DEBUG_SUB_2 | DEBUG_SUB_3
   | (LENGTH OF? identifier) | LINAGE_COUNTER | LINE_COUNTER
   | PAGE_COUNTER
   | RETURN_CODE
   | SHIFT_IN | SHIFT_OUT | SORT_CONTROL | SORT_CORE_SIZE | SORT_FILE_SIZE | SORT_MESSAGE | SORT_MODE_SIZE | SORT_RETURN
   | TALLY | TIME
   | WHEN_COMPILED
   ;

// comment entry

commentEntry
   : COMMENTENTRYLINE+
   ;

freeFormText
   : FREE_FORM_TEXT
   ;


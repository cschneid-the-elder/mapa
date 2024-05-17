/*
Copyright (C) 2024 Craig Schneiderwent.  
All rights reserved.

The author(s) accept no liability for damages of any kind resulting from the use
of this software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is intended to be an ANTLR4 grammar for the EXEC DLI interface.

*/


parser grammar DLIParser;

options {tokenVocab=DLILexer;}

startRule
	: (
	execDliCommand 
	)+
	EOF
	;

dliCommandInitiator
	: (
	EXEC_DLI
	)
	;

dliCommandTerminator
	: (
	END_EXEC
	| SEMICOLON
	)
	;

execDliCommand
	: (
	dliCommandInitiator
	dliCommand
	dliCommandTerminator
	)
	;

dliCommand
	: (

	acceptCommand
	| checkpointCommand
	| deqCommand
	| dletCommand
	| getNextCommand
	| getNextInParentCommand
	| getUniqueCommand
	| insertCommand
	| loadCommand
	| logCommand
	| positionCommand
	| queryCommand
	| refreshCommand
	| replaceCommand
	| retrieveCommand
	| rolbCommand
	| rollCommand
	| rolsCommand
	| scheduleCommand
	| setsCommand
	| setuCommand
	| statisticsCommand
	| symchkpCommand
	| terminateCommand
	| xrstCommand
	)
	;

arg
	: LPAREN ARG* RPAREN
	;


acceptCommand
	: (
	 acceptOption acceptOptions*
	)
	;

checkpointCommand
	: (
	(( checkpointOption ) | chkpOption ) checkpointOptions*
	)
	;

deqCommand
	: (
	 deqOption deqOptions*
	)
	;

dletCommand
	: (
	 dletOption dletOptions*
	)
	;

getNextCommand
	: (
	(( getOption nextOption ) | gnOption ) getNextOptions*
	)
	;

getNextInParentCommand
	: (
	(( getOption nextOption inOption parentOption ) | gnpOption ) getNextInParentOptions*
	)
	;

getUniqueCommand
	: (
	(( getOption uniqueOption ) | guOption ) getUniqueOptions*
	)
	;

insertCommand
	: (
	(( insertOption ) | isrtOption ) insertOptions*
	)
	;

loadCommand
	: (
	 loadOption loadOptions*
	)
	;

logCommand
	: (
	 logOption logOptions*
	)
	;

positionCommand
	: (
	(( positionOption ) | posOption ) positionOptions*
	)
	;

queryCommand
	: (
	 queryOption queryOptions*
	)
	;

refreshCommand
	: (
	 refreshOption refreshOptions*
	)
	;

replaceCommand
	: (
	(( replaceOption ) | replOption ) replaceOptions*
	)
	;

retrieveCommand
	: (
	 retrieveOption retrieveOptions*
	)
	;

rolbCommand
	: (
	 rolbOption
	)
	;

rollCommand
	: (
	 rollOption
	)
	;

rolsCommand
	: (
	 rolsOption rolsOptions*
	)
	;

scheduleCommand
	: (
	(( scheduleOption ) | schdOption ) scheduleOptions*
	)
	;

setsCommand
	: (
	 setsOption setsOptions*
	)
	;

setuCommand
	: (
	 setuOption setuOptions*
	)
	;

statisticsCommand
	: (
	(( statisticsOption ) | statOption ) statisticsOptions*
	)
	;

symchkpCommand
	: (
	 symchkpOption symchkpOptions*
	)
	;

terminateCommand
	: (
	(( terminateOption ) | termOption )
	)
	;

xrstCommand
	: (
	 xrstOption xrstOptions*
	)
	;

// 25 rules generated Thu May 16 20:18:16 CDT 2024
acceptOptions
	: (
	statusgroupOption
	)
	;

checkpointOptions
	: (
	idOption
	)
	;

deqOptions
	: (
	lockclassOption
	)
	;

dletOptions
	: (
	usingOption
	| pcbOption
	| variableOption
	| segmentOption
	| seglengthOption
	| fromOption
	| setzeroOption
	)
	;

getNextOptions
	: (
	usingOption
	| pcbOption
	| keyfeedbackOption
	| feedbacklenOption
	| intoOption
	| variableOption
	| firstOption
	| lastOption
	| currentOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| setparentOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	| variableOption
	| firstOption
	| lastOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	)
	;

getNextInParentOptions
	: (
	usingOption
	| pcbOption
	| keyfeedbackOption
	| feedbacklenOption
	| intoOption
	| variableOption
	| firstOption
	| lastOption
	| currentOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| setparentOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	| variableOption
	| firstOption
	| lastOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	)
	;

getUniqueOptions
	: (
	usingOption
	| pcbOption
	| keyfeedbackOption
	| feedbacklenOption
	| intoOption
	| variableOption
	| lastOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| setparentOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	| variableOption
	| lastOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| intoOption
	| lockedOption
	| lockclassOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	)
	;

insertOptions
	: (
	usingOption
	| pcbOption
	| variableOption
	| firstOption
	| lastOption
	| currentOption
	| segmentOption
	| seglengthOption
	| fromOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| whereOption
	| fieldlengthOption
	| keysOption
	| keylengthOption
	| variableOption
	| firstOption
	| lastOption
	| seglengthOption
	| offsetOption
	| movenextOption
	| getfirstOption
	| setOption
	| setcondOption
	| setzeroOption
	| fromOption
	)
	;

loadOptions
	: (
	usingOption
	| pcbOption
	| variableOption
	| segmentOption
	| seglengthOption
	| fromOption
	)
	;

logOptions
	: (
	fromOption
	| lengthOption
	)
	;

positionOptions
	: (
	usingOption
	| pcbOption
	| intoOption
	| keyfeedbackOption
	| feedbacklenOption
	| segmentOption
	| whereOption
	| fieldlengthOption
	)
	;

queryOptions
	: (
	usingOption
	| pcbOption
	)
	;

refreshOptions
	: (
	dbqueryOption
	)
	;

replaceOptions
	: (
	usingOption
	| pcbOption
	| variableOption
	| segmentOption
	| seglengthOption
	| offsetOption
	| fromOption
	| movenextOption
	| setOption
	| setcondOption
	| setzeroOption
	| variableOption
	| seglengthOption
	| offsetOption
	| fromOption
	| movenextOption
	| setOption
	| setcondOption
	| setzeroOption
	)
	;

retrieveOptions
	: (
	usingOption
	| pcbOption
	| keyfeedbackOption
	| feedbacklenOption
	)
	;

rolsOptions
	: (
	usingOption
	| pcbOption
	| tokenOption
	| areaOption
	)
	;

scheduleOptions
	: (
	psbOption
	| psbOption
	| sysserveOption
	| nodhabendOption
	)
	;

setsOptions
	: (
	tokenOption
	| areaOption
	)
	;

setuOptions
	: (
	tokenOption
	| areaOption
	)
	;

statisticsOptions
	: (
	usingOption
	| pcbOption
	| intoOption
	| lengthOption
	| vsamOption
	| nonvsamOption
	| formattedOption
	| unformattedOption
	| summaryOption
	)
	;

symchkpOptions
	: (
	pidOption
	| idOption
	| area1Option
	| area2Option
	| area3Option
	| area4Option
	| area5Option
	| area6Option
	| area7Option
	| length1Option
	| length2Option
	| length3Option
	| length4Option
	| length5Option
	| length6Option
	| length7Option
	)
	;

xrstOptions
	: (
	maxlengthOption
	| idOption
	| area1Option
	| area2Option
	| area3Option
	| area4Option
	| area5Option
	| area6Option
	| area7Option
	| length1Option
	| length2Option
	| length3Option
	| length4Option
	| length5Option
	| length6Option
	| length7Option
	)
	;

// 22 rules generated Thu May 16 20:18:16 CDT 2024

acceptOption
	: (
	ACCEPT
	)
	;

areaOption
	: (
	AREA arg
	)
	;

area1Option
	: (
	AREA1 arg
	)
	;

area2Option
	: (
	AREA2 arg
	)
	;

area3Option
	: (
	AREA3 arg
	)
	;

area4Option
	: (
	AREA4 arg
	)
	;

area5Option
	: (
	AREA5 arg
	)
	;

area6Option
	: (
	AREA6 arg
	)
	;

area7Option
	: (
	AREA7 arg
	)
	;

checkpointOption
	: (
	CHECKPOINT
	)
	;

chkpOption
	: (
	CHKP
	)
	;

currentOption
	: (
	CURRENT
	)
	;

dbqueryOption
	: (
	DBQUERY
	)
	;

deqOption
	: (
	DEQ
	)
	;

dletOption
	: (
	DLET
	)
	;

feedbacklenOption
	: (
	FEEDBACKLEN arg
	)
	;

fieldlengthOption
	: (
	FIELDLENGTH arg
	)
	;

firstOption
	: (
	FIRST
	)
	;

formattedOption
	: (
	FORMATTED
	)
	;

fromOption
	: (
	FROM arg
	)
	;

getOption
	: (
	GET
	)
	;

getfirstOption
	: (
	GETFIRST arg
	)
	;

gnOption
	: (
	GN
	)
	;

gnpOption
	: (
	GNP
	)
	;

guOption
	: (
	GU
	)
	;

idOption
	: (
	ID arg
	)
	;

inOption
	: (
	IN
	)
	;

insertOption
	: (
	INSERT
	)
	;

intoOption
	: (
	INTO arg
	)
	;

isrtOption
	: (
	ISRT
	)
	;

keyfeedbackOption
	: (
	KEYFEEDBACK arg
	)
	;

keylengthOption
	: (
	KEYLENGTH arg
	)
	;

keysOption
	: (
	KEYS arg
	)
	;

lastOption
	: (
	LAST
	)
	;

lengthOption
	: (
	LENGTH arg
	)
	;

length1Option
	: (
	LENGTH1 arg
	)
	;

length2Option
	: (
	LENGTH2 arg
	)
	;

length3Option
	: (
	LENGTH3 arg
	)
	;

length4Option
	: (
	LENGTH4 arg
	)
	;

length5Option
	: (
	LENGTH5 arg
	)
	;

length6Option
	: (
	LENGTH6 arg
	)
	;

length7Option
	: (
	LENGTH7 arg
	)
	;

loadOption
	: (
	LOAD
	)
	;

lockclassOption
	: (
	LOCKCLASS arg
	)
	;

lockedOption
	: (
	LOCKED
	)
	;

logOption
	: (
	LOG
	)
	;

maxlengthOption
	: (
	MAXLENGTH arg
	)
	;

movenextOption
	: (
	MOVENEXT arg
	)
	;

nextOption
	: (
	NEXT
	)
	;

nodhabendOption
	: (
	NODHABEND
	)
	;

nonvsamOption
	: (
	NONVSAM
	)
	;

offsetOption
	: (
	OFFSET arg
	)
	;

parentOption
	: (
	PARENT
	)
	;

pcbOption
	: (
	PCB arg
	)
	;

pidOption
	: (
	PID arg
	)
	;

posOption
	: (
	POS
	)
	;

positionOption
	: (
	POSITION
	)
	;

psbOption
	: (
	PSB arg
	)
	;

queryOption
	: (
	QUERY
	)
	;

refreshOption
	: (
	REFRESH
	)
	;

replOption
	: (
	REPL
	)
	;

replaceOption
	: (
	REPLACE
	)
	;

retrieveOption
	: (
	RETRIEVE
	)
	;

rolbOption
	: (
	ROLB
	)
	;

rollOption
	: (
	ROLL
	)
	;

rolsOption
	: (
	ROLS
	)
	;

schdOption
	: (
	SCHD
	)
	;

scheduleOption
	: (
	SCHEDULE
	)
	;

seglengthOption
	: (
	SEGLENGTH arg
	)
	;

segmentOption
	: (
	SEGMENT arg
	)
	;

setOption
	: (
	SET arg
	)
	;

setcondOption
	: (
	SETCOND arg
	)
	;

setparentOption
	: (
	SETPARENT
	)
	;

setsOption
	: (
	SETS
	)
	;

setuOption
	: (
	SETU
	)
	;

setzeroOption
	: (
	SETZERO arg
	)
	;

statOption
	: (
	STAT
	)
	;

statisticsOption
	: (
	STATISTICS
	)
	;

statusgroupOption
	: (
	STATUSGROUP arg
	)
	;

summaryOption
	: (
	SUMMARY
	)
	;

symchkpOption
	: (
	SYMCHKP
	)
	;

sysserveOption
	: (
	SYSSERVE
	)
	;

termOption
	: (
	TERM
	)
	;

terminateOption
	: (
	TERMINATE
	)
	;

tokenOption
	: (
	TOKEN arg
	)
	;

unformattedOption
	: (
	UNFORMATTED
	)
	;

uniqueOption
	: (
	UNIQUE
	)
	;

usingOption
	: (
	USING
	)
	;

variableOption
	: (
	VARIABLE
	)
	;

vsamOption
	: (
	VSAM
	)
	;

whereOption
	: (
	WHERE arg
	)
	;

xrstOption
	: (
	XRST
	)
	;

// 95 rules generated Thu May 16 20:18:16 CDT 2024


/*
Copyright (C) 2020 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is intended to be an ANTLR4 grammar for DSN, the DB2 command processor
that runs as a TSO command processor.

In parsing JCL, one may encounter an execution of IKJEFT01, IKJEFT1A, or
IKJEFT1B, all of which are entry points in TSO.  It is common to execute
applications with embedded SQL accessing DB2 via the TSO Attachment Facility,
with the SYSTSIN DD pointing at statements such as...

DSN SYSTEM(DB2P)
RUN PROGRAM(J8675309) PLAN(J8675309) -
  PARMS('ABLEBAKERCHARLIEDOGEASYFOX')
END

...causing the execution of the application.

While it is possible to issue some DB2 commands whilst DSN is running,
these commands are of no interest in this context and are ignored.  DB2
commands that can be issued via DSN begin with a dash (or hyphen) "-"
character.

This grammar is part of a project to parse JCL, which itself is part of
a larger project whose aim is to assist in mainframe application portfolio
analysis by making it possible to construct an inventory of programs,
procedures, et. al.

An application might make use of this grammar by detecting execution of
TSO and parsing its SYSTSIN to obtain the actual program(s) being
executed under the TSO monitor program running the DSN command processor.

*/

parser grammar DSNTSOParser;

options {tokenVocab=DSNTSOLexer;}

startRule : dsnCmd* | EOF ;

dsnCmd
	: (abend
	| bind
	| bindQuery
	| dclgen
	| dsn
	| end
	| free
	| rebind
	| rebindTrigger
	| run
	| spufi)
	;

abend
	: ABEND
	;

bind
	: BIND (bindOptions continuation?)+
	;

bindOptions
	: (accelerator
	| accelerationwaitfordata
	| acquire
	| action
	| apcompare
	| applcompat
	| apretaindup
	| apreuse
	| apreusesource
	| archivesensitive
	| bustimesensitive
	| cachesize
	| cics
	| collid
	| concentratestmt
	| concurrentaccessresolution
	| copy
	| copyver
	| currentdata
	| currentserver
	| dbprotocol
	| date
	| dec
	| decdel
	| defer
	| degree
	| deploy
	| description
	| descstat
	| disable
	| disconnect
	| dlibatch
	| dynamicrules
	| enable
	| encoding
	| explain
	| extendedindicator
	| filter
	| flag
	| generic
	| getaccelarchive
	| immedwrite
	| imsbmp
	| imsmpp
	| isolation
	| keepdynamic
	| library
	| member
	| name
	| nodefer
	| nopklist
	| opthint
	| copyoptions
	| owner
	| dsnpackage
	| path
	| pathdefault
	| pklist
	| plan
	| planmgmt
	| progauth
	| qualifier
	| queryacceleration
	| queryid
	| release
	| reopt
	| replver
	| rounding
	| service
	| sqlddname
	| sqlencoding
	| sqlerror
	| sqlrules
	| strdel
	| dsnswitch
	| systimesensitive
	| time
	| validate
	| version)
	;
	
accelerator
	: ACCELERATOR arg
	;

accelerationwaitfordata
	: ACCELERATIONWAITFORDATA arg
	;

acquire
	: ACQUIRE arg
	;

action
	: ACTION arg
	;

apcompare
	: APCOMPARE arg
	;

applcompat
	: APPLCOMPAT arg
	;

apretaindup
	: APRETAINDUP arg
	;

apreuse
	: APREUSE arg
	;

apreusesource
	: APREUSESOURCE arg
	;

archivesensitive
	: ARCHIVESENSITIVE arg
	;

bustimesensitive
	: BUSTIMESENSITIVE arg
	;

cachesize
	: CACHESIZE arg
	;

cics
	: CICS arg
	;

collid
	: COLLID arg
	;

concentratestmt
	: CONCENTRATESTMT arg
	;

concurrentaccessresolution
	: CONCURRENTACCESSRESOLUTION arg
	;

copy
	: COPY arg
	;

copyver
	: COPYVER arg
	;

currentdata
	: CURRENTDATA arg
	;

currentserver
	: CURRENTSERVER arg
	;

dbprotocol
	: DBPROTOCOL arg
	;

date
	: DATE arg
	;

dec
	: DEC arg
	;

decdel
	: DECDEL arg
	;

defer
	: DEFER arg
	;

degree
	: DEGREE arg
	;

deploy
	: DEPLOY arg
	;

description
	: DESCRIPTION arg
	;

descstat
	: DESCSTAT arg
	;

disable
	: DISABLE arg
	;

disconnect
	: DISCONNECT arg
	;

dlibatch
	: DLIBATCH arg
	;

dynamicrules
	: DYNAMICRULES arg
	;

enable
	: ENABLE arg
	;

encoding
	: ENCODING arg
	;

explain
	: EXPLAIN arg
	;

extendedindicator
	: EXTENDEDINDICATOR arg
	;

filter
	: FILTER arg
	;

flag
	: FLAG arg
	;

generic
	: GENERIC arg
	;

getaccelarchive
	: GETACCELARCHIVE arg
	;

immedwrite
	: IMMEDWRITE arg
	;

imsbmp
	: IMSBMP arg
	;

imsmpp
	: IMSMPP arg
	;

isolation
	: ISOLATION arg
	;

keepdynamic
	: KEEPDYNAMIC arg
	;

library
	: (LIB | LIBRARY) libargs
	;

member
	: MEMBER arg
	;

name
	: NAME arg
	;

nodefer
	: NODEFER arg
	;

nopklist
	: NOPKLIST arg
	;

opthint
	: OPTHINT arg
	;

copyoptions
	: OPTIONS arg
	;

owner
	: OWNER arg
	;

dsnpackage
	: PACKAGE arg
	;

path
	: PATH arg
	;

pathdefault
	: PATHDEFAULT arg
	;

pklist
	: PKLIST arg
	;

plan
	: PLAN arg
	;

planmgmt
	: PLANMGMT arg
	;

progauth
	: PROGAUTH arg
	;

qualifier
	: QUALIFIER arg
	;

queryacceleration
	: QUERYACCELERATION arg
	;

queryid
	: QUERYID arg
	;

release
	: RELEASE arg
	;

reopt
	: REOPT arg
	;

replver
	: REPLVER arg
	;

rounding
	: ROUNDING arg
	;

service
	: SERVICE arg
	;

sqlddname
	: SQLDDNAME arg
	;

sqlencoding
	: SQLENCODING arg
	;

sqlerror
	: SQLERROR arg
	;

sqlrules
	: SQLRULES arg
	;

strdel
	: STRDEL arg
	;

dsnswitch
	: SWITCH arg
	;

systimesensitive
	: SYSTIMESENSITIVE arg
	;

time
	: TIME arg
	;

validate
	: VALIDATE arg
	;

version
	: VERSION arg
	;

bindQuery
	: BIND QUERY (bindQueryOptions continuation?)+
	;

bindQueryOptions
	: (lookup
	| explaininputschema)
	;

lookup
	: LOOKUP arg
	;

explaininputschema
	: EXPLAININPUTSCHEMA arg
	;

dclgen
	: DCLGEN (dclgenOptions continuation?)+
	;

dclgenOptions
	: (table
	| owner
	| at
	| action
	| language
	| library
	| names
	| structure
	| apost
	| quote
	| label
	| dbcssymbol
	| dbcsdelim
	| colsuffix
	| indvar
	| rmargin
	| dclbit)
	;

table
	: TABLE arg
	;

at
	: AT arg
	;

language
	: LANGUAGE arg
	;

names
	: NAMES arg
	;

structure
	: STRUCTURE arg
	;

apost
	: APOST
	;

quote
	: QUOTE
	;

label
	: LABEL arg
	;

dbcssymbol
	: DBCSSYMBOL arg
	;

dbcsdelim
	: DBCSDELIM arg
	;

colsuffix
	: COLSUFFIX arg
	;

indvar
	: INDVAR arg
	;

rmargin
	: RMARGIN arg
	;

dclbit
	: DCLBIT arg
	;

dsn
	: DSN (dsnOptions continuation?)+
	;

dsnOptions
	: (system | retry | test | group | asuser)
	;

system
	: SYSTEM arg
	;

retry
	: RETRY arg
	;

test
	: TEST arg
	;

group
	: GROUP arg
	;

asuser
	: ASUSER arg
	;

end
	: END
	;

free
	: FREE (freeOptions continuation?)+
	;

freeOptions
	: (stabilized_dynamic_query
	| dsnpackage
	| plan
	| query
	| service
	| flag
	| planmgmtscope
	| invalidonly
	| filter
	| stblgrp
	| sdqstmtid
	| queryid)
	;

stabilized_dynamic_query
	: STABILIZED continuation* DYNAMIC continuation* QUERY
	;

query
	: QUERY
	;

planmgmtscope
	: PLANMGMTSCOPE arg
	;

invalidonly
	: INVALIDONLY arg
	;

stblgrp
	: STBLGRP arg
	;

sdqstmtid
	: SDQSTMTID arg
	;

rebind
	: REBIND (bindOptions continuation?)+
	;

rebindTrigger
	: REBIND TRIGGER continuation? (bindOptions continuation?)+
	;

run
	: RUN (runOptions continuation?)+
	;

runOptions
	: (program
	| plan
	| cp
	| library
	| parms)
	;

program
	: PROGRAM arg
	;

cp
	: CP
	;

parms
	: PARMS arg
	;

spufi
	: SPUFI
	;

arg
	: LPAREN (LPAREN | ARG+ | QUOTED_STRING_FRAGMENT+ | SQUOTE2+ | RPAREN)* RPAREN
	;

libargs
	: LPAREN ((ARG+ libmember?) | QUOTED_STRING_FRAGMENT+) ARG* RPAREN
	;

libmember
	: (LPAREN ARG+ RPAREN)
	;

continuation
	: (DASH | PLUS)
	;

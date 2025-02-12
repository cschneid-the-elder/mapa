## IBM CICS Transaction Server for z/OS API and SPI Command Grammar

This is a grammar for the Application Programming Interface and System Programming Interface Commands for CICS Transaction Server for z/OS.

CICS Transaction Server for z/OS Version 6.1, 
CICS Transaction Server for z/OS Version 4.2, 
CICS Transaction Server for z/OS 3.1, 
CICS Transaction Server for z/OS 2.3,
CICS/MVS 2.1.2, 
CICS/DOS/VS 1.7, 
and CICS/VS 1.5 
documentation served as the original source material.

The ANTLR lexer and parser grammars are generated from the apiSource, spiSource, CICSzLexerTemplate##, and CICSzParserTemplate## text files via sed, awk, etc.  Maintenance is intended to be done on these text files and not the grammars themselves.  We'll see how well that statement ages.

The generated lexer and parser are probably less useful on their own and more useful in concert with a parser for a programming language with embedded CICS commands.  This would primarily be COBOL, but Assembler, C, and PL/I are also candidates.

The parser doesn't enforce any of the CICS TS API or SPI syntax rules.  For example you can specify `EXEC CICS LINK PROGRAM('ABC') PROGRAM('DEF') END-EXEC` and the parser won't generate an error.  If you want the syntax rules enforced, you'll have to write action blocks or a listener.

The purpose here is to provide grammars useful in analyzing existing code.

This was built on Ubuntu 24.04.1 LTS with ANTLR 4.13.2 and openjdk version "21.0.6" 2025-01-21.

The grammars should be up to date with CICS Transaction Server for z/OS 6.x documentation dated 2025-02-07.


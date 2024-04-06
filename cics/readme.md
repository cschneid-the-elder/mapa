## IBM CICS Transaction Server for z/OS API and SPI Command Grammar

This is a grammar for the Application Programming Interface and System Programming Interface Commands for CICS Transaction Server for z/OS.

CICS Transaction Server for z/OS Version 6.1, CICS Transaction Server for z/OS
Version 3.1, CICS/MVS 2.1.2, CICS/DOS/VS 1.7, and CICS/VS 1.5 documentation 
served as the original source material.

The ANTLR lexer and parser grammars are generated from the apiSource, spiSource, CICSzLexerTemplate##, and CICSzParserTemplate## text files via sed, awk, etc.  Maintenance is intended to be done on these text files and not the grammars themselves.  We'll see how well that statement ages.

The generated lexer and parser are probably less useful on their own and more useful in concert with a parser for a programming language with embedded CICS commands.  This would primarily be COBOL, but Assembler, C, and PL/I are also candidates.

This was built on Ubuntu 22.04 LTS with ANTLR 4.13.1 and openjdk version "11.0.21 2023-10-17".


## IBM IMS EXEC DLI Command Grammar

This is a grammar for the EXEC DLI Application Programming Interface for IBM's IMS DBMS.

IMS Version 15.4 documentation served as the original source material.

The ANTLR lexer and parser grammars are generated from the apiSource, DLILexerTemplate##, and DLIParserTemplate## text files via sed, awk, etc.  Maintenance is intended to be done on these text files and not the grammars themselves.  We'll see how well that statement ages.

The generated lexer and parser are probably less useful on their own and more useful in concert with a parser for a programming language with embedded CICS commands.  This would primarily be COBOL, but Assembler, C, and PL/I are also candidates.

The parser doesn't enforce any of the EXEC DLI syntax rules.  If you want the syntax rules enforced, you'll have to write action blocks or a listener.

The purpose here is to provide grammars useful in analyzing existing code.

This was built on Ubuntu 22.04 LTS with ANTLR 4.13.2 and openjdk version "11.0.24 2024-07-16".


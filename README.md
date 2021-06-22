## Mainframe Application Portfolio Analysis

The intent is to create at least part of what I would have wanted when I was being paid to be a mainframe application development tools person.

I was often asked application impact analysis questions, what runs, how often, which program calls which other programs, et. al.

In the cobol directory you will find a COBOL "call tree" tool, extracting CALLs, EXEC CICS LINKs, EXEC CICS XCTLs, EXEC SQL CALLs, program inputs and outputs and so forth to help give an idea of the "shape" of an application portfolio via static code analysis.

In the jcl directory you will find something analagous for JCL.

In both cases, the intent is to produce a flat file which can be loaded into a DBMS and used as part of a configuration management system.  Supplement with a dump of your CICS definitions and selected entries from your DB2 catalog (triggers, mostly) and you can build yourself a nice map of your portfolio.

There certainly exist commercial products that do this, but they're pricey.  Maybe what I can do for free is good enough.  If it's not then you've got yourself a justification for one of those commercial products.

### Static Code Analysis

Static code analysis looks at the source code.  The process has no knowledge of what happens as the code executes.  For purposes of application portfolio analysis, this results in some representation of what
_could_ happen, not what _does_ happen.  Consider...

    if a = b then call subroutine x

...static analysis has no way of knowing if a is never equal to b due to some business rule and thus subroutine x is never called.

### Runtime Behavior Analysis

Runtime behavior analysis looks at what actually happens as code executes, often through some form of instrumentation.  For purposes of application portfolio analysis, this results in some representation of what _does_ happen, not what _could_ happen, _in that run_.  Consider...

    if a = b then call subroutine x

...runtime behavior analysis only knows that a was never equal to b _in any of the runs analyzed_ and thus subroutine x was never called.  No assertion can be made that subroutine x will never be called.

### Both Have Their Uses

A combination of both static code analysis and runtime behavior analysis is necessary in order to understand an application portfolio.  Simply noting that a given program is never executed is not prima facie evidence that it is obsolete.  Maybe that program is only executed when an error condition occurs; exception processing should, after all, be exceptional.


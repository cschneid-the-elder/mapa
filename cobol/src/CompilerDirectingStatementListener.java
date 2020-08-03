
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerDirectingStatementListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<CompilerDirectingStatement> compDirStmts = null;
	public ArrayList<CondCompVar> compOptDefines = null;
	public ArrayDeque<CondCompStmtIf> ifStmts = new ArrayDeque<>();

	public CompilerDirectingStatementListener(
			ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			) {
		super();
		this.compDirStmts = compDirStmts;
		this.compOptDefines = compOptDefines;
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compDirStmts.add(new CompilerOptionsWrapper(ctx));
	}

	public void enterDefine_opt(CobolPreprocessorParser.Define_optContext ctx) {
		this.compOptDefines.add(new CondCompVar(ctx));
	}

	public void enterCopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) { 
		this.compDirStmts.add(new CopyStatement(ctx));
	}

	public void enterConditionalCompilationIf(CobolPreprocessorParser.ConditionalCompilationIfContext ctx) {
		CondCompStmtIf ifStmt = new CondCompStmtIf(ctx, compOptDefines);
		this.compDirStmts.add(ifStmt);
		this.ifStmts.push(ifStmt);
	}

	/**
	As noted in the documentation at...
	<br><br>
	https://www.ibm.com/support/knowledgecenter/SS6SG3_6.3.0/lr/ref/rldirif.html
	<br><br>
	"The phrases of a given IF directive must be specified all in the same library text or all in source text."
	<br><br>
	...which means the IF to which this ELSE corresponds must have been
	encountered already and must therefore be on the ifStmts deque.  The
	IF cannot be in a separate COPY member.
	<br><br>
	If that link has gone stale, the path is...
	<br>Enterprise COBOL for z/OS 6.3.0 
	<br>	> Language Reference 
	<br>		> Compiler-directing statements and compiler directives
	<br>			> Compiler directives
	<br>				> Conditional compilation
	<br>					> IF
	*/
	public void enterConditionalCompilationElse(CobolPreprocessorParser.ConditionalCompilationElseContext ctx) {
		this.compDirStmts.add(new CondCompStmtElse(ctx, ifStmts.peek()));
	}

	/**
	As noted in the documentation at...
	<br><br>
	https://www.ibm.com/support/knowledgecenter/SS6SG3_6.3.0/lr/ref/rldirif.html
	<br><br>
	"The phrases of a given IF directive must be specified all in the same library text or all in source text."
	<br><br>
	...which means the IF to which this END-IF corresponds must have been
	encountered already and must therefore be on the ifStmts deque.  The
	IF cannot be in a separate COPY member.
	<br><br>
	If that link has gone stale, the path is...
	<br>Enterprise COBOL for z/OS 6.3.0 
	<br>	> Language Reference 
	<br>		> Compiler-directing statements and compiler directives
	<br>			> Compiler directives
	<br>				> Conditional compilation
	<br>					> IF
	*/
	public void enterConditionalCompilationEndIf(CobolPreprocessorParser.ConditionalCompilationEndIfContext ctx) {
		this.compDirStmts.add(new CondCompStmtEndIf(ctx, ifStmts.pop()));
	}

	public void enterReplaceByStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) { 
		this.compDirStmts.add(new ReplaceStatement(ctx));
	}

	public void enterReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx) { 
		this.compDirStmts.add(new ReplaceOffStatement(ctx));
	}

}

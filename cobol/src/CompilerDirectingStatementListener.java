
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerDirectingStatementListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<CompilerDirectingStatement> compDirStmts = null;
	public ArrayList<CondCompVar> compOptDefines = null;
	public ArrayDeque<CondCompStmtIf> ifStmts = new ArrayDeque<>();
	public ArrayDeque<CondCompStmtEvaluate> evaluateStmts = new ArrayDeque<>();
	public ArrayDeque<CondCompStmtWhen> whenStmts = new ArrayDeque<>();
	public ArrayList<ReplaceStatement> replaceStmts = new ArrayList<>();
	public ArrayList<CondCompVar> defines = new ArrayList<>();

	public CompilerDirectingStatementListener(
			ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			) {
		super();
		this.compDirStmts = compDirStmts;
		this.compOptDefines = compOptDefines;
		this.defines.addAll(compOptDefines);
	}

	public void enterEveryRule(ParserRuleContext ctx) {
		TestIntegration.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compDirStmts.add(new CompilerOptionsWrapper(ctx));
	}

	public void enterDefine_opt(CobolPreprocessorParser.Define_optContext ctx) {
		CondCompVar var = new CondCompVar(ctx);
		this.compOptDefines.add(var);
		this.defines.add(var);
	}

	public void enterConditionalCompilationDefine(CobolPreprocessorParser.ConditionalCompilationDefineContext ctx) {
		/*this.defines.add(new CondCompVar(ctx, this.compOptDefines));*/
		CondCompVar var = new CondCompVar(ctx, this.compOptDefines);
		this.compOptDefines.add(var);
		this.defines.add(var);
	}

	public void enterCopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) { 
		this.compDirStmts.add(new CopyStatement(ctx));
	}

	public void enterConditionalCompilationIf(CobolPreprocessorParser.ConditionalCompilationIfContext ctx) {
		CondCompStmtIf ifStmt = new CondCompStmtIf(ctx, defines);
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

	public void exitConditionalCompilationEvaluate(CobolPreprocessorParser.ConditionalCompilationEvaluateContext ctx) {
		evaluateStmts.push(new CondCompStmtEvaluate(ctx, this.defines));
	}

	public void enterConditionalCompilationEndEvaluate(CobolPreprocessorParser.ConditionalCompilationEndEvaluateContext ctx) {
		CondCompStmtEvaluate currEvaluate = evaluateStmts.pop();

		currEvaluate.setEndEvaluate(new CondCompStmtEndEvaluate(ctx, currEvaluate));

		whenStmts.clear();
		if (evaluateStmts.peek() == null) {
			// this EVALUATE was not nested inside another EVALUATE
		} else {
			for (CondCompStmtWhen aWhenStmt: evaluateStmts.peek().getWhenStmts()) {
				whenStmts.push(aWhenStmt);
			}
		}
	}

	public void enterConditionalCompilationWhen(CobolPreprocessorParser.ConditionalCompilationWhenContext ctx) {
		CondCompStmtWhen currWhen = new CondCompStmtWhen(ctx, evaluateStmts.peek(), this.defines);
		evaluateStmts.peek().addWhen(currWhen);
		CondCompStmtWhen prevWhen = whenStmts.peek();
		if (prevWhen == null) {
			// this is the first WHEN of an EVALUATE
		} else {
			prevWhen.setEndLine(currWhen.getLine() - 1);
		}
	}

	public void enterReplaceByStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) { 
		ReplaceStatement rs = new ReplaceStatement(ctx);
		int last = this.replaceStmts.size();

		this.compDirStmts.add(rs);

		if (last == 0) {
		} else {
			ReplaceStatement rs1 = replaceStmts.get(last - 1);
			rs1.setStopLine(rs.getLine());
		}
		this.replaceStmts.add(rs);
	}

	public void enterReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx) { 
		ReplaceOffStatement ros = new ReplaceOffStatement(ctx);
		int last = this.replaceStmts.size();

		this.compDirStmts.add(ros);

		if (last == 0) {
		} else {
			ReplaceStatement rs1 = replaceStmts.get(last - 1);
			rs1.setStopLine(ros.getLine());
		}
	}

}

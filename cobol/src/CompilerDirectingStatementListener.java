
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
	public Logger LOGGER = null;
	public TheCLI CLI = null;

	public CompilerDirectingStatementListener(
			ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.compDirStmts = compDirStmts;
		this.compOptDefines = compOptDefines;
		this.defines.addAll(compOptDefines);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public void enterEveryRule(ParserRuleContext ctx) {
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compDirStmts.add(new CompilerOptionsWrapper(ctx));
	}

	public void enterDefine_opt(CobolPreprocessorParser.Define_optContext ctx) {
		CondCompVar var = new CondCompVar(ctx, this.LOGGER);
		this.compOptDefines.add(var);
		this.defines.add(var);
	}

	public void enterConditionalCompilationDefine(CobolPreprocessorParser.ConditionalCompilationDefineContext ctx) {
		CondCompVar var = new CondCompVar(ctx, this.compOptDefines, this.LOGGER);
		this.compOptDefines.add(var);
		this.defines.add(var);
	}

	public void enterCopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) { 
		this.compDirStmts.add(new CopyStatement(ctx, this.LOGGER, this.CLI));
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
		CondCompStmtEvaluate anEvaluate = new CondCompStmtEvaluate(ctx, this.defines);
		evaluateStmts.push(anEvaluate);
		this.compDirStmts.add(anEvaluate);
	}

	public void enterConditionalCompilationEndEvaluate(CobolPreprocessorParser.ConditionalCompilationEndEvaluateContext ctx) {
		CondCompStmtEvaluate currEvaluate = evaluateStmts.pop();
		CondCompStmtEndEvaluate anEndEvaluate = new CondCompStmtEndEvaluate(ctx, currEvaluate);

		currEvaluate.setEndEvaluate(anEndEvaluate);
		this.compDirStmts.add(anEndEvaluate);

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
		CondCompStmtWhen currWhen = new CondCompStmtWhen(ctx, evaluateStmts.peek(), this.defines, this.LOGGER);
		evaluateStmts.peek().addWhen(currWhen);
		CondCompStmtWhen prevWhen = whenStmts.peek();
		if (prevWhen == null) {
			// this is the first WHEN of an EVALUATE
		} else {
			prevWhen.setEndLine(currWhen.getLine() - 1);
		}
		this.compDirStmts.add(currWhen);
	}

	public void enterReplaceByStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) { 
		ReplaceStatement rs = new ReplaceStatement(ctx, this.LOGGER);
		int last = this.replaceStmts.size();

		this.compDirStmts.add(rs);

		if (last == 0) {
		} else {
			ReplaceStatement rs1 = replaceStmts.get(last - 1);
			rs1.setNextReplaceStatement(rs);
		}
		this.replaceStmts.add(rs);
	}

	public void enterReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx) { 
		ReplaceOffStatement ros = new ReplaceOffStatement(ctx, this.LOGGER);
		int last = this.replaceStmts.size();

		this.compDirStmts.add(ros);

		if (last == 0) {
		} else {
			ReplaceStatement rs1 = replaceStmts.get(last - 1);
			rs1.setReplaceOffStatement(ros);
		}
	}

	public void enterExecSqlStatement(CobolPreprocessorParser.ExecSqlStatementContext ctx) {
		StringBuilder sb = new StringBuilder();

		for (TerminalNode tn: ctx.SQL_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		CharStream aCharStream = CharStreams.fromString(sb.toString());
		DB2zSQLLexer lexer = new DB2zSQLLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		DB2zSQLParser parser = new DB2zSQLParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		SQLIncludeStatementListener listener = 
			new SQLIncludeStatementListener(this.LOGGER, this.CLI);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		if (listener.includeStatement != null) {
			this.compDirStmts.add(
				new CopyStatement(
						listener.includeStatement
						, ctx
						, this.LOGGER
						, this.CLI));
		}
	}

}

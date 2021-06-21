
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CallEtAlListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<CobolProgram> programs = null;
	public String aLib = null;
	public CobolProgram currProgram = null;
	private String currCobolFileName = null;

	public CallEtAlListener(
			ArrayList<CobolProgram> programs
			, String aLib
			, Logger LOGGER) {
		super();
		this.aLib = aLib;
		this.LOGGER = LOGGER;
		this.programs = programs;
	}

	public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		String newProgramName = ctx.getText();
		this.currProgram = null;

		for (CobolProgram pgm: this.programs) {
			if (pgm.hasThisProgramName(newProgramName)) {
				this.currProgram = pgm;
				break;
			}
			CobolProgram newPgm = pgm.nestedProgramNamed(newProgramName);
			if (newPgm != null) {
				this.currProgram = newPgm;
				break;
			}
		}

		if (this.currProgram == null) {
			throw new IllegalArgumentException(
				"program "
				+ newProgramName
				+ " not found in "
				+ this.programs);
		}
	}

	public void enterStatement(CobolParser.StatementContext ctx) {
		currProgram.incrementStatementCounter(ctx);
	}

	public void enterDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx) {
		currProgram.incrementDataDescriptionCounter(ctx);
	}

	public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	@SuppressWarnings({"fallthrough"})
	public void enterExecCicsStatement(CobolParser.ExecCicsStatementContext ctx) {
		switch(ctx.cicsKeyword(0).getText().toUpperCase()) {
			case "LINK":
			case "XCTL": //intentional fall through
				CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
				this.currProgram.addCall(aCall);
				break;
			default:
				break;
		}
	}

	public void enterFileControlEntry(CobolParser.FileControlEntryContext ctx) {
		this.currCobolFileName = ctx.selectClause().fileName().getText();
	}

	public void enterAssignClause(CobolParser.AssignClauseContext ctx) {
		this.currProgram.addAssignClause(new AssignClause(ctx, this.currCobolFileName, this.LOGGER));
	}

	public void enterOpenInputStatement(CobolParser.OpenInputStatementContext ctx) {
		this.currProgram.noteOpenType(ctx);
	}

	public void enterOpenOutputStatement(CobolParser.OpenOutputStatementContext ctx) {
		this.currProgram.noteOpenType(ctx);
	}

	public void enterOpenIOStatement(CobolParser.OpenIOStatementContext ctx) {
		this.currProgram.noteOpenType(ctx);
	}

	public void enterOpenExtendStatement(CobolParser.OpenExtendStatementContext ctx) {
		this.currProgram.noteOpenType(ctx);
	}

	public void enterMoveStatement(CobolParser.MoveStatementContext ctx) {
		this.currProgram.addMoveStatement(new MoveStatement(ctx, this.LOGGER));
	}

	public void enterSetTo(CobolParser.SetToContext ctx) {
		this.currProgram.addSetTo(new Identifier(ctx.identifier(), this.LOGGER));
	}

	public void enterExecSqlStatement(CobolParser.ExecSqlStatementContext ctx) {
		this.LOGGER.finer("enterExecSqlStatement() entry");
		StringBuilder sb = new StringBuilder();

		for (TerminalNode tn: ctx.SQL_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		this.LOGGER.finest("SQL_TEXT = |" + sb + "|");
		CharStream aCharStream = CharStreams.fromString(sb.toString());
		DB2zSQLLexer lexer = new DB2zSQLLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		DB2zSQLParser parser = new DB2zSQLParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		SQLListener listener = 
			new SQLListener(this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.currProgram.addDB2Tables(listener.db2Tables);

		if (listener.db2Call != null) {
			this.currProgram.addCall(
				new CallWrapper(
						listener.db2Call
						, this.currProgram.getProgramName()
						, this.aLib
						, this.LOGGER
						)
			);
		}

		this.LOGGER.finer("enterExecSqlStatement() exit");
	}

}

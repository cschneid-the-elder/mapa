
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

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void setCurrProgram(String newProgramName) { 
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
		
		this.LOGGER.finest("CallEtAlListener currProgram = " + this.currProgram);
	}

	@Override public void enterIdentificationDivision(CobolParser.IdentificationDivisionContext ctx) {
	    if (ctx.programIdParagraph() != null) {
	    	this.setCurrProgram(ctx.programIdParagraph().programName().getText());
	    } else if (ctx.functionIdParagraph() != null) {
	    	this.setCurrProgram(ctx.functionIdParagraph().userFunctionName().getText());
	    } else if (ctx.classIdParagraph() != null) {
	    	this.setCurrProgram(ctx.classIdParagraph().className().getText());
	    }
	    /*
	    Note that other types of Identification Division (Factory, et. al.) do
	    not change the current program.  This is intentional, those other types
	    aren't real changes in the current program.
	    */
	}

	@Override public void enterStatement(CobolParser.StatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.incrementStatementCounter(ctx);
	}

	@Override public void enterDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.incrementDataDescriptionCounter(ctx);
	}

	@Override public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	@SuppressWarnings({"fallthrough"})
	@Override public void enterExecCicsStatement(CobolParser.ExecCicsStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		ExecCicsStatement cicsStmt = new ExecCicsStatement(ctx, this.LOGGER);
		switch(cicsStmt.getType()) {
			case CICSOTHER:
				break;
			case CICSLINK:
			case CICSXCTL: //intentional fall through
				CallWrapper aCall = new CallWrapper(cicsStmt, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
				this.currProgram.addCall(aCall);
				break;
			default:
				this.currProgram.addCicsStatement(cicsStmt);
				break;
		}
	}

	@Override public void enterFileControlEntry(CobolParser.FileControlEntryContext ctx) {
		this.currCobolFileName = ctx.selectClause().fileName().getText();
	}

	@Override public void enterAssignClause(CobolParser.AssignClauseContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.addAssignClause(new AssignClause(ctx, this.currCobolFileName, this.LOGGER));
	}

	@Override public void enterOpenInputStatement(CobolParser.OpenInputStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.noteOpenType(ctx);
	}

	@Override public void enterOpenOutputStatement(CobolParser.OpenOutputStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.noteOpenType(ctx);
	}

	@Override public void enterOpenIOStatement(CobolParser.OpenIOStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.noteOpenType(ctx);
	}

	@Override public void enterOpenExtendStatement(CobolParser.OpenExtendStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.noteOpenType(ctx);
	}

	@Override public void enterMoveStatement(CobolParser.MoveStatementContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.addMoveStatement(new MoveStatement(ctx, this.LOGGER));
	}

	@Override public void enterSetTo(CobolParser.SetToContext ctx) {
		if (this.currProgram == null) {
			/*
			We are processing something other than a program, perhaps a
			function prototype.
			*/
			return;
		}

		this.currProgram.addSetTo(new Identifier(ctx.identifier(), this.LOGGER));
	}

	@Override public void enterExecSqlStatement(CobolParser.ExecSqlStatementContext ctx) {
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
			new SQLListener(this.LOGGER, true);

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

	@Override public void enterExecSqlImsStatement(CobolParser.ExecSqlImsStatementContext ctx) {
		this.LOGGER.finer("enterExecSqlImsStatement() entry");
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
			new SQLListener(this.LOGGER, false);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.currProgram.addImsTables(listener.db2Tables);

		this.LOGGER.finer("enterExecImsSqlStatement() exit");
	}

	@Override public void enterExecDliStatement(CobolParser.ExecSqlImsStatementContext ctx) {
		this.LOGGER.finer("enterExecDliStatement() entry");
		StringBuilder sb = new StringBuilder();

		for (TerminalNode tn: ctx.DLI_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		this.LOGGER.finest("DLI_TEXT = |" + sb + "|");
		CharStream aCharStream = CharStreams.fromString(sb.toString());
		DLILexer lexer = new DLILexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		DLIParser parser = new DLIParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		DLIListener listener = 
			new DLIListener(this.LOGGER, false);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.currProgram.addImsTables(listener.db2Tables);

		this.LOGGER.finer("enterExecDliStatement() exit");
	}

}

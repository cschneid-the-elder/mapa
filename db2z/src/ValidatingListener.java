/*Copyright (C) 2023 Craig Schneiderwent.  All rights reserved.*/

/*
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ValidatingListener extends DB2zSQLParserBaseListener {

	private ArrayList<String> errorMessages = null;
	private ArrayList<String> warningMessages = null;
	private ArrayList<String> informationMessages = null;

	public ValidatingListener(ArrayList<String> errorMessages
							, ArrayList<String> warningMessages
							, ArrayList<String> informationMessages) {
		super();
		this.errorMessages = errorMessages;
		this.warningMessages = warningMessages;
		this.informationMessages = informationMessages;
	}

	/**
	Syntax possibilities:
	
	DSSIZE 4G
	DSSIZE 4 G
	
	If an INTEGERLITERAL is present, it must be a power of 2.
	
	If an INTEGERLITERAL is not present, the SqlIdentifier must begin with an
	integer that is a power of 2.
	
	You can see the available methods for any parameter to a listener method by
	looking in the generated parser Java source.  In this case, do a find for
	"public static class DssizeOptionContext".
	
	The getText() method is very useful, and is inherted from ParserRuleContext.
	
	*/
	@Override public void enterDssizeOption(DB2zSQLParser.DssizeOptionContext ctx) {
		int dssizeInt = -1;
		int line = ctx.DSSIZE().getSymbol().getLine();
		int posn = ctx.DSSIZE().getSymbol().getCharPositionInLine();
		
		if (ctx.sqlidentifier() == null) {
			/*
			This should never happen.  The parser should have either generated an
			error before we got here, or it should have attempted to match a different
			parser rule.
			
			I just don't feel right not checking for this condition, so here it is.  I
			really dislike null pointer exceptions.
			*/
			this.errorMessages.add(
					"Error @" 
					+ line 
					+ ":" 
					+ posn 
					+ " DSSIZE option is syntactically invalid");
		} else {
			String sqlident1 = ctx.sqlidentifier().getText();
			if (sqlident1.endsWith("G")) {
				if (ctx.INTEGERLITERAL() == null) {
					/*
					Since an INTEGERLITERAL is not present, the entire sqlidentifier must
					constitute the DSSIZE value.  First, we must strip off the trailing "G".
					*/
					String sqlident2 = sqlident1.substring(0, sqlident1.length() - 1);
					/*
					The rest of the sqlidentifier must be the numeric portion of the
					DSSIZE value.
					*/
					try {
						dssizeInt = Integer.parseInt(sqlident2.trim());
					} catch (NumberFormatException e) {
						this.errorMessages.add(
								"Error @" 
								+ line 
								+ ":" 
								+ posn 
								+ " DSSIZE contains illegal value " 
								+ sqlident2);
					}
				} else {
					try {
						dssizeInt = Integer.parseInt(ctx.INTEGERLITERAL().getText().trim());
					} catch (NumberFormatException e) {
						this.errorMessages.add(
								"Error @" 
								+ line 
								+ ":" 
								+ posn 
								+ " DSSIZE contains illegal value " 
								+ ctx.INTEGERLITERAL().getText().trim());
					}
				}
			} else {
				this.errorMessages.add(
						"Error @" 
						+ line 
						+ ":" 
						+ posn 
						+ " DSSIZE value must end with G");
			}
		}
		
		if ((dssizeInt & -dssizeInt) == dssizeInt) {
			/*
			The DSSIZE value is a power of 2 and all is right with the world.
			*/
		} else {
			this.errorMessages.add(
					"Error @" 
					+ line 
					+ ":" 
					+ posn 
					+ " DSSIZE value must be a power of 2, not " 
					+ dssizeInt);
		}
	}

	@Override public void enterCreateIndexStatement(DB2zSQLParser.CreateIndexStatementContext ctx) {
		if (ctx.TYPE() != null) {
			int line = ctx.TYPE().getSymbol().getLine();
			int posn = ctx.TYPE().getSymbol().getCharPositionInLine();
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " TYPE has been deprecated as of DB2 8");
		}
	}

	@Override public void enterOrganizationClause(DB2zSQLParser.OrganizationClauseContext ctx) {
		int line = ctx.ORGANIZE().getSymbol().getLine();
		int posn = ctx.ORGANIZE().getSymbol().getCharPositionInLine();
		this.warningMessages.add(
				"Warning @" 
				+ line 
				+ ":" 
				+ posn 
				+ " ORGANIZE has been deprecated as of DB2 12");
	}

	@Override public void enterDsnutilUCSOffposlimitSpec(DB2zSQLParser.DsnutilUCSOffposlimitSpecContext ctx) {
		TerminalNode tn = null;
		
		if (ctx.DSNUTIL_REPORTONLY() != null) {
			tn = ctx.DSNUTIL_REPORTONLY();
		} else if (ctx.DSNUTIL_OFFPOSLIMIT() != null) {
			tn = ctx.DSNUTIL_OFFPOSLIMIT();
		} else if (ctx.DSNUTIL_INDREFLIMIT() != null) {
			tn = ctx.DSNUTIL_INDREFLIMIT();
		}
		
		if (tn != null) {
			int line = tn.getSymbol().getLine();
			int posn = tn.getSymbol().getCharPositionInLine();
			String text = tn.getSymbol().getText();
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " " 
					+ text 
					+ " has been deprecated as of DB2 13");
		}
	}

	@Override public void enterProcedureSQLPLOptionList(DB2zSQLParser.ProcedureSQLPLOptionListContext ctx) {
		if (ctx.externalNameOption1() != null) {
			int line = ctx.externalNameOption1().EXTERNAL().getSymbol().getLine();
			int posn = ctx.externalNameOption1().EXTERNAL().getSymbol().getCharPositionInLine();
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " EXTERNAL has been deprecated as of DB2 13");
	
		}

		if (ctx.fencedOption() != null) {
			int line = ctx.fencedOption().FENCED().getSymbol().getLine();
			int posn = ctx.fencedOption().FENCED().getSymbol().getCharPositionInLine();
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " FENCED has been deprecated as of DB2 13");
		}

		if (ctx.dbinfoOption() != null) {
			int line = ctx.dbinfoOption().DBINFO().getSymbol().getLine();
			int posn = ctx.dbinfoOption().DBINFO().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " DBINFO is tolerated for compatibility purposes only");
		}

		if (ctx.collectionIdOption() != null) {
			/*
			This may be incorrect in the parser.  It's on my TODO list.
			*/
			int line = ctx.collectionIdOption().COLLID().getSymbol().getLine();
			int posn = ctx.collectionIdOption().COLLID().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " COLLID is tolerated for compatibility purposes only");
		}

		if (ctx.stopAfterFailureOption() != null) {
			if (ctx.stopAfterFailureOption().STOP() != null) {
				int line = ctx.stopAfterFailureOption().STOP().getSymbol().getLine();
				int posn = ctx.stopAfterFailureOption().STOP().getSymbol().getCharPositionInLine();
				this.informationMessages.add(
						"Information @" 
						+ line 
						+ ":" 
						+ posn 
						+ " STOP AFTER ... FAILURES is tolerated for compatibility purposes only");
			} else if (ctx.stopAfterFailureOption().CONTINUE() != null) {
				int line = ctx.stopAfterFailureOption().CONTINUE().getSymbol().getLine();
				int posn = ctx.stopAfterFailureOption().CONTINUE().getSymbol().getCharPositionInLine();
				this.informationMessages.add(
						"Information @" 
						+ line 
						+ ":" 
						+ posn 
						+ " CONTINUE AFTER FAILURE is tolerated for compatibility purposes only");
			}
		}

		if (ctx.stayResidentOption() != null) {
			int line = ctx.stayResidentOption().STAY().getSymbol().getLine();
			int posn = ctx.stayResidentOption().STAY().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " STAY RESIDENT is tolerated for compatibility purposes only");
		}

		if (ctx.programTypeOption() != null) {
			int line = ctx.programTypeOption().PROGRAM().getSymbol().getLine();
			int posn = ctx.programTypeOption().PROGRAM().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " PROGRAM TYPE is tolerated for compatibility purposes only");
		}

		if (ctx.securityOption() != null) {
			int line = ctx.securityOption().SECURITY().getSymbol().getLine();
			int posn = ctx.securityOption().SECURITY().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " SECURITY is tolerated for compatibility purposes only");
		}

		if (ctx.runOptionsOption() != null) {
			int line = ctx.runOptionsOption().RUN().getSymbol().getLine();
			int posn = ctx.runOptionsOption().RUN().getSymbol().getCharPositionInLine();
			this.informationMessages.add(
					"Information @" 
					+ line 
					+ ":" 
					+ posn 
					+ " RUN OPTIONS is tolerated for compatibility purposes only");
		}
	}

	@Override public void enterPartitionHashSpace(DB2zSQLParser.PartitionHashSpaceContext ctx) {
		int line = ctx.HASH().getSymbol().getLine();
		int posn = ctx.HASH().getSymbol().getCharPositionInLine();
		this.warningMessages.add(
				"Warning @" 
				+ line 
				+ ":" 
				+ posn 
				+ " HASH SPACEs are deprecated as of DB2 12");
	}

	@Override public void enterAlterHashOrganization(DB2zSQLParser.AlterHashOrganizationContext ctx) {
		int line = -1;
		int posn = -1;
		
		if (ctx.ADD() != null) {
			line = ctx.ADD().getSymbol().getLine();
			posn = ctx.ADD().getSymbol().getCharPositionInLine();
		} else if (ctx.ALTER() != null) {
			line = ctx.ALTER().getSymbol().getLine();
			posn = ctx.ALTER().getSymbol().getCharPositionInLine();
		}
		
		if (line > 0) {
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " HASH SPACEs are deprecated as of DB2 12");
		}
	}

	@Override public void enterDsnutilUCSCorrelationStatsSpec(DB2zSQLParser.DsnutilUCSCorrelationStatsSpecContext ctx) {
		if (ctx.DSNUTIL_KEYCARD() != null) {
			int line = ctx.DSNUTIL_KEYCARD().getSymbol().getLine();
			int posn = ctx.DSNUTIL_KEYCARD().getSymbol().getCharPositionInLine();
			this.warningMessages.add(
					"Warning @" 
					+ line 
					+ ":" 
					+ posn 
					+ " KEYCARD has been deprecated as of DB2 10");
		}
	}

}

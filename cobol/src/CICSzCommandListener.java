
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CICSzCommandListener extends CICSzParserBaseListener {
	private Logger LOGGER = null;
	private ExecCicsStatementType type = ExecCicsStatementType.CICSOTHER;
	private StringBuffer programText = null;
	private StringBuffer transidText = null;
	private StringBuffer fileText = null;

	public CICSzCommandListener(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
	}

	@Override public void enterDatasetOption(CICSzParser.DatasetOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.fileText = sb;
			}
		}
	}

	@Override public void enterFileOption(CICSzParser.FileOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.fileText = sb;
			}
		}
	}

	@Override public void enterProgramOption(CICSzParser.ProgramOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.programText = sb;
			}
		}
	}

	@Override public void enterTransidOption(CICSzParser.TransidOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.transidText = sb;
			}
		}
	}

	@Override public void enterLink(CICSzParser.LinkContext ctx) {
		this.type = ExecCicsStatementType.CICSLINK;
/*
		StringBuffer sb = new StringBuffer();

		if (ctx.linkOptions() != null) {
			for (CICSzParser.LinkOptionsContext oc: ctx.linkOptions()) {
				if (oc.programOption() != null) {
					if (oc.programOption().arg() != null) {
						if (oc.programOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.programOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.programText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterXctl(CICSzParser.XctlContext ctx) {
		type = ExecCicsStatementType.CICSXCTL;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.xctlOptions() != null) {
			for (CICSzParser.XctlOptionsContext oc: ctx.xctlOptions()) {
				if (oc.programOption() != null) {
					if (oc.programOption().arg() != null) {
						if (oc.programOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.programOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.programText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterStart(CICSzParser.StartContext ctx) {
		type = ExecCicsStatementType.CICSSTARTTRANSID;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.startOptions() != null) {
			for (CICSzParser.StartOptionsContext oc: ctx.startOptions()) {
				if (oc.transidOption() != null) {
					if (oc.transidOption().arg() != null) {
						if (oc.transidOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.transidOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.transidText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterStartbr(CICSzParser.StartbrContext ctx) {
		type = ExecCicsStatementType.CICSSTARTBR;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.startbrOptions() != null) {
			for (CICSzParser.StartbrOptionsContext oc: ctx.startbrOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterReadnext(CICSzParser.ReadnextContext ctx) {
		type = ExecCicsStatementType.CICSREADNEXT;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.readnextOptions() != null) {
			for (CICSzParser.ReadnextOptionsContext oc: ctx.readnextOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterReadprev(CICSzParser.ReadprevContext ctx) {
		type = ExecCicsStatementType.CICSREADPREV;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.readprevOptions() != null) {
			for (CICSzParser.ReadprevOptionsContext oc: ctx.readprevOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterDelete(CICSzParser.DeleteContext ctx) {
		type = ExecCicsStatementType.CICSDELETE;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.deleteOptions() != null) {
			for (CICSzParser.DeleteOptionsContext oc: ctx.deleteOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterRead(CICSzParser.ReadContext ctx) {
		type = ExecCicsStatementType.CICSREAD;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.readOptions() != null) {
			for (CICSzParser.ReadOptionsContext oc: ctx.readOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterRewrite(CICSzParser.RewriteContext ctx) {
		type = ExecCicsStatementType.CICSREWRITE;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.rewriteOptions() != null) {
			for (CICSzParser.RewriteOptionsContext oc: ctx.rewriteOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterWrite(CICSzParser.WriteContext ctx) {
		type = ExecCicsStatementType.CICSWRITE;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.writeOptions() != null) {
			for (CICSzParser.WriteOptionsContext oc: ctx.writeOptions()) {
				if (oc.fileOption() != null) {
					if (oc.fileOption().arg() != null) {
						if (oc.fileOption().arg().ARG() != null) {
							for (TerminalNode tn: oc.fileOption().arg().ARG()) {
								sb.append(tn.getSymbol().getText());
							}
							this.fileText = sb;
						}
					}
				}
			}
		}
*/
	}

	@Override public void enterRunTransid(CICSzParser.RunTransidContext ctx) {
		type = ExecCicsStatementType.CICSRUNTRANSID;
/*
		StringBuffer sb = new StringBuffer();
	
		if (ctx.transidOption() != null) {
			if (ctx.transidOption().arg() != null) {
				if (ctx.transidOption().arg().ARG() != null) {
					for (TerminalNode tn: ctx.transidOption().arg().ARG()) {
						sb.append(tn.getSymbol().getText());
					}
					this.transidText = sb;
				}
			}
		}
*/
	}
	
	public ExecCicsStatementType getType() {
		return this.type;
	}

	public StringBuffer getProgramText() {
		return this.programText;
	}
	
	public StringBuffer getTransidText() {
		return this.transidText;
	}
	
	public StringBuffer getFileText() {
		return this.fileText;
	}
	
}

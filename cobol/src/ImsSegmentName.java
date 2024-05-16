
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Representing the IMS Segment Name token in the DLI grammar.
*/
class ImsSegmentName {

	private Logger LOGGER = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private DLIParser.SegmentOptionContext ctx = null;
	private String owningStatement = null;
	private String argText = null;
	private String segmentName = null;
	private Identifier identifier = null;
	private Literal literal = null;
	private int line = -1;
	private ArrayList<String> identifierValues = new ArrayList<>();
	private ArrayList<UUID> identifierValueUUIDs = new ArrayList<>();
	private DDNode dataNode = null;
	private ConstantEntry constantEntry;

	public ImsSegmentName(
			DLIParser.SegmentOptionContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.line = ctx.start.getLine();
		this.getSegmentArg();
		if (this.argText.charAt(0) == '(') {
			/*
			this syntax indicates the SEGMENT() argument is a
			host language identifier and not the segment name itself
			*/
			this.parseSegmentArg();
		} else {
			this.segmentName = this.argText;
		}
		this.getOwningDLIStatement();
	}

	private void getSegmentArg() {
		LOGGER.fine(this.myName + " getSegmentArg()");
		
		StringBuffer sb = new StringBuffer();

		for (TerminalNode tn: this.ctx.arg().ARG()) {
			if (tn.getSymbol().getText() != " ") {
				sb.append(tn.getSymbol().getText());
			}
		}
		this.LOGGER.finest("  argText = |" + sb + "|");
		this.argText = sb.toString();
	}
	
	private void parseSegmentArg() {
		LOGGER.fine(this.myName + " parseSegmentArg()");
		// start the buffer with 12 spaces to get to COBOL area B
		StringBuffer sb = new StringBuffer("            ");
		sb.append(this.argText.substring(1,this.argText.length() - 1));
		
		CharStream aCharStream = 
			CharStreams.fromString(sb.toString());
		CobolLexer lexer = new CobolLexer(aCharStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		IdentifierEtAlListener listener = 
			new IdentifierEtAlListener(this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);
		
		if (listener.getIdentifierCtx() != null) {
			this.identifier = new Identifier(listener.getIdentifierCtx(), this.LOGGER);
			this.LOGGER.finest("  identifier = " + this.identifier);
		} else if (listener.getLiteralCtx() != null) {
			this.literal = new Literal(listener.getLiteralCtx());
			this.LOGGER.finest("  literal = " + this.literal);
		} else {
			this.LOGGER.finest("  neither identifier nor literal was found");
		}
	}
	
	private void getOwningDLIStatement() {
		this.LOGGER.fine(this.myName + " " + " @ " + this.line + " getOwningDLIStatement()");
		ParserRuleContext parent = null;
		ParserRuleContext currCtx = (ParserRuleContext)this.ctx;
		Boolean done = false;

		while (!done) {
			parent = currCtx.getParent();
			String owningStatement = DLIParser.ruleNames[parent.getRuleIndex()];
			this.LOGGER.finest("  owningStatement = |" + owningStatement + "|");
			if (owningStatement.equals("dletCommand")
			|| owningStatement.equals("getNextCommand")
			|| owningStatement.equals("getNextInParentCommand")
			|| owningStatement.equals("getUniqueCommand")
			|| owningStatement.equals("insertCommand")
			|| owningStatement.equals("loadCommand")
			|| owningStatement.equals("positionCommand")
            || owningStatement.equals("replaceCommand")) {
				this.owningStatement = owningStatement;
				done = true;
			}
			if (parent.getRuleIndex() == 0) {
				done = true;
			}
			currCtx = parent;
		}
	}

	/**
	The target of the SEGMENT option represented by this instance may be a COBOL
	<i>identifier</i> where <i>identifier</i> is a field name possibly qualified
	by a QualifiedInDataContext.  A concrete example might take the form
	EXEC DLI DLET SEGMENT((CHARLES)) FROM(ROWLAND) END-EXEC.

	<p>This method runs through a List of DDNode instances, each of which
	represents an identifier in the Data Division, attempting to match
	the <i>identifier</i> and its optional QualifiedInDataContext.
	*/

	public Boolean selectDataNode(List<DDNode> dataNodes) {
		this.LOGGER.fine(this.myName + " " + " @ " + this.line + " selectDataNode()");
		this.LOGGER.finest("  dataNodes = " + dataNodes);
		Boolean found = false;

		for (DDNode node: dataNodes) {
			if (node.matches(this.getIdentifier())) {
				found = true;
				this.dataNode = node;
				this.addIdentifierValue(this.dataNode.getValueInValueClause());
				break;
			}
		}

		if (this.dataNode == null) {
		} else {
			this.LOGGER.finest(
				"  valueInValueClause = |" +
				 this.dataNode.valueInValueClause + "|");
			if (this.dataNode.valueInValueClause == null) {
				this.LOGGER.finest("  valueInValueClause == null");
				if (this.dataNode.redefinesIdentifier != null) {
					this.LOGGER.finest(
						"  redefinesIdentifier = " 
						+ this.dataNode.redefinesIdentifier);
					List<DDNode> list = 
						this.dataNode.parent.findChildrenNamed(
							this
							.dataNode
							.redefinesIdentifier);
					this.LOGGER.finest("  list.size() = " + list.size());
					if (list.size() > 0) {
						this.addIdentifierValue(list.get(0).valueInValueClause);
					}
				}
			}
		}

		return found;
	}

	public Boolean identifierMatches(Identifier identifier) {
		return this.getIdentifier().seemsToMatch(identifier);
	}

	public Boolean selectConstant(List<ConstantEntry> constantEntries) {
		this.LOGGER.fine(this.myName + " " + " @ " + this.line + " selectConstant()");
		this.LOGGER.finest("  constantEntries = " + constantEntries);
		Boolean found = false;

		for (ConstantEntry constant: constantEntries) {
			if (constant.getConstantName().equals(this.getIdentifierName())) {
				this.LOGGER.finest("  found " + constant);
				this.addIdentifierValue(constant.getStringValue());
				this.constantEntry = constant;
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	public int getLine() {
		return this.line;
	}
	
	public Identifier getIdentifier() {
		return this.identifier;
	}

	public String getIdentifierName() {
		if (this.getIdentifier() == null) {
			return null;
		} else {
			return this.getIdentifier().getDataNameText();
		}
	}
		
	public Literal getLiteral() {
		return this.literal;
	}
	
	public DDNode getDataNode() {
		return this.dataNode;
	}
	
	public void addIdentifierValue(String identifierValue) {
		if (identifierValue != null) {
			String aString = identifierValue.replace("'", "");
			aString = aString.replace("\"", "");
			if (!this.identifierValues.contains(aString)) {
				this.identifierValues.add(aString);
				this.identifierValueUUIDs.add(UUID.randomUUID());
			}
		}
		return;
	}

	public void writeOn(PrintWriter out, UUID parentUUID) {
		String label = "IMSSEGMENT";
		
		for (int i = 0; i < identifierValues.size(); i++) {
			out.printf(
				"%s,%s,%s,%s,%s\n"
				, label
				, this.identifierValueUUIDs.get(i).toString()
				, parentUUID.toString()
				, this.identifierValues.get(i)
				, this.owningStatement);
		}
		
		if (identifierValues.size() == 0) {
			out.printf(
				"%s,%s,%s,%s,%s\n"
				, label
				, this.uuid
				, parentUUID.toString()
				, this.segmentName
				, this.owningStatement);
		}
	}

}

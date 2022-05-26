
import java.util.*;
import java.util.stream.Collectors;
import java.util.logging.Logger;

/**
This class represents a constantEntry in the parser.

For the present, the only use we care about is...

<code>
Process DEFINE(COMPVAR,'PGM00002')

01  aConstant Constant 'PGM00001'.
01  bConstant Constant From COMPVAR.

Call aConstant
Call bConstant
</code>

...therefore setting a constant to values such as the
length of another variable or the result of some
arithmetic expressions are not interesting.  For
the present.

*/

class ConstantEntry {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = Logger.getLogger("TestIntegration");
	private CobolParser.ConstantEntryContext ctx = null;
	private CobolProgram program = null;
	private DataLocation locn = null;
	private String programName = null;
	private String constantName = null;
	private String stringValue = null;
	private ArrayList<CondCompVar> finalCompOptDefines = null;
	private CobolParser.ConstantEntryAsPhraseContext asPhrase = null;
	private CobolParser.ConstantEntryFromPhraseContext fromPhrase = null;

	public ConstantEntry(
			CobolProgram program
			, CobolParser.ConstantEntryContext ctx
			, DataLocation locn
			, ArrayList<CondCompVar> finalCompOptDefines
			) {
		this.program = program;
		this.programName = program.getProgramName();
		this.ctx = ctx;
		this.locn = locn;
		this.finalCompOptDefines = finalCompOptDefines;
		this.initialize();
	}

	public void initialize() {
		this.constantName = this.ctx.constantName().getText();
		this.asPhrase = this.ctx.constantEntryAsPhrase();
		this.fromPhrase = this.ctx.constantEntryFromPhrase();
		if (this.asPhrase != null) {
			/*
			Right now, the only use for this is 
			*/
			this.stringValue = this.asPhrase.literal().getText();
		} else {
			String condCompVarName = this.fromPhrase.dataName().getText();
			List<CondCompVar> vars = this.finalCompOptDefines
				.stream()
				.filter(v -> v.varNameIs(condCompVarName))
				.collect(Collectors.toList());
			if (vars.size() > 0) {
				this.stringValue = vars.get(0).getAlnumValue();
			} else {
				this.LOGGER.info(
					myName
					+ " " + constantName
					+ " appears to get its value from compilation variable "
					+ " " + condCompVarName
					+ " which does not appear to have been set"
					);
			}
		}		
	}
	
	public String getConstantName() {
		return this.constantName;
	}
	
	public String getStringValue() {
		return this.stringValue;
	}
	
	public Boolean isGlobal() {
		return this.ctx.GLOBAL() != null;
	}
	
	public String toString() {
		return this.getConstantName() + " [" + this.getStringValue() + "]";
	}

}



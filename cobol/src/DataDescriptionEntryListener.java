
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DataDescriptionEntryListener extends CobolParserBaseListener {
	public ArrayList<DDNode> dataNodes = null;
	public String callingModuleName = null;
	public DDNode parent = null;
	public DDNode prev = null;
	public DataLocation locn = null;

	public DataDescriptionEntryListener(ArrayList<DDNode> al) {
		super();
		dataNodes = al;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		TestIntegration.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		callingModuleName = ctx.getText();
	}

	@Override public void enterFileDescriptionEntry(CobolParser.FileDescriptionEntryContext ctx) {
		this.locn = DataLocation.FILEDESCRIPTION;
	}

	@Override public void enterWorkingStorageSection(CobolParser.WorkingStorageSectionContext ctx) {
		this.locn = DataLocation.WORKINGSTORAGE;
	}

	@Override public void enterLocalStorageSection(CobolParser.LocalStorageSectionContext ctx) {
		this.locn = DataLocation.LOCALSTORAGE;
	}

	@Override public void enterLinkageSection(CobolParser.LinkageSectionContext ctx) {
		this.locn = DataLocation.LINKAGE;
	}

	@Override public void enterDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx) {
		/**
		*/
		DDNode node = new DDNode(callingModuleName, ctx, locn);

		TestIntegration.LOGGER.finer(callingModuleName + " " + node);

		if (node.hasNoParent()) {
			TestIntegration.LOGGER.finer(node + "node.hasNoParent() == true");
			if (node.isNewRoot()) {
				TestIntegration.LOGGER.finer(node + "node.isNewRoot() == true");
				prev = node;
			} else {
				TestIntegration.LOGGER.finer(node + "node.isNewRoot() == false");
				// a 77 level
			}
		} else if (prev == null) {
				TestIntegration.LOGGER.finer(callingModuleName + " " + node + "prev == " + prev);
		} else if (node.level == null) {
				TestIntegration.LOGGER.finer(callingModuleName + " " + node + "node.level == " + node.level);
		} else if (prev.level == null) {
				TestIntegration.LOGGER.finer(callingModuleName + " " + prev);
		} else if (node.level.compareTo(prev.level) == 0) {
				prev.parent.adopt(node);
				node.parent = prev.parent;
				prev = node;
		} else {
				while (node.level.compareTo(prev.level) <= 0) {
					prev = prev.parent;
				}
				prev.adopt(node);
				node.parent = prev;
				if (!node.isSpecialLevel()) {
					prev = node;
				}
		}
		dataNodes.add(node);
	}

}


import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

class CobolWord {

	private String myName = this.getClass().getName();
	private CobolParser.CobolWordContext ctx = null;
	private TerminalNode tn = null;

	public CobolWord(CobolParser.CobolWordContext ctx) {
		this.ctx = ctx;
		this.populateTerminalNode();
	}

	public TerminalNode getTerminalNode() {
		return this.tn;
	}

	public String getText() {
		return this.tn.getSymbol().getText();
	}

	public void populateTerminalNode() {
		/*
		There are a _lot_ of methods of the type we're interested in, and
		they are subject to change.  This is the most future-proof way I
		could think of to deal with the requirement.
		*/
		Method[] allMethods = this.ctx.getClass().getDeclaredMethods();
		for (Method method : allMethods) {
		    if (Modifier.isPublic(method.getModifiers())) {
				if (method.getReturnType() == TerminalNode.class) {
					TerminalNode tn = null;
					try {
						tn = (TerminalNode)method.invoke(this.ctx);
					} catch(Exception e) {
						System.err.println(method.toGenericString());
						e.printStackTrace();
						System.exit(16);
					}
					if (tn != null) {
						this.tn = tn;
						break;
					}
				}
		    }
		}
	}

}


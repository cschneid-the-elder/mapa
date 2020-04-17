
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class JobCardWrapper {

	private JCLParser.JobCardContext ctx = null;
	private String fileName = null;

	public JobCardWrapper(JCLParser.JobCardContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {

	}

	public String toString() {
		return this.ctx.jobName().NAME_FIELD().getSymbol().getText() + " @ " + this.ctx.jobName().NAME_FIELD().getSymbol().getLine() + " in " + this.fileName;
	}
}

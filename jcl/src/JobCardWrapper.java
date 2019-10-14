
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class JobCardWrapper {

	private JCLParser.JobCardContext ctx = null;
	private JCLParser.JcllibStatementContext jcllib = null;
	private ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();
	private String fileName = null;

	public JobCardWrapper(JCLParser.JobCardContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {

	}

	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
		this.jcllib = ctx;
	}
}

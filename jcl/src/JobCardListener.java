

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JobCardListener extends JCLParserBaseListener {

	public ArrayList<JobCardWrapper> jobs = null;
	public String fileName = null;
	public JobCardWrapper currJob = null;

	public JobCardListener(
			ArrayList<JobCardWrapper> jobs
			, String fileName
			) {
		super();
		this.fileName = fileName;
	}

	@Override public void enterJobCard(JCLParser.JobCardContext ctx) {
		this.currJob = new JobCardWrapper(ctx, fileName);
		jobs.add(this.currJob);
	}

	@Override public void enterJcllibStatement(JCLParser.JcllibStatementContext ctx) {
		currJob.addJcllib(ctx);
	}

}

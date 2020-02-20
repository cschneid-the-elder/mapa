
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class Job {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLParser.JobCardContext jobCardCtx = null;
	private JCLParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<Proc> procs  = new ArrayList<>();
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private String fileName = null;
	private String jobName = null;
	private int startLine = -1;
	private int endLine = -1;

	public Job(JCLParser.JobCardContext ctx, String fileName) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.initialize();
		Demo01.LOGGER.finer(this.myName + " " + this.jobName + " instantiated from " + this.fileName);
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.startLine = this.jobCardCtx.JOB().getSymbol().getLine();
		this.jobName = this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText();
	}

	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
		Demo01.LOGGER.finest(this.myName + " addJcllib: " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText());
		List<JCLParser.KeywordOrSymbolicContext> kywdCtxList = ctx.singleOrMultipleValue().keywordOrSymbolic();
		Demo01.LOGGER.finest(this.myName + " addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().keywordOrSymbolic());

		this.jcllibCtx = ctx;
		if (kywdCtxList == null || kywdCtxList.size() == 0) {
			kywdCtxList = ctx.singleOrMultipleValue().parenList().keywordOrSymbolic();
			Demo01.LOGGER.finest(this.myName + " addJcllib ctx.singleOrMultipleValue().parenList().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().parenList().keywordOrSymbolic());
		}

		for (JCLParser.KeywordOrSymbolicContext k: kywdCtxList) {
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k: " + k);
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.KEYWORD_VALUE(): " + k.KEYWORD_VALUE());
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.SYMBOLIC(): " + k.SYMBOLIC());
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT(): " + k.QUOTED_STRING_FRAGMENT());
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
		}

		this.jcllib.addAll(KeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList));
	}

	public void setEndLine(int aLine) {
		this.endLine = aLine;
	}

	public void addInstreamProc(Proc iProc) {
		this.procs.add(iProc);
	}

	public void addSymbolic(SetSymbolValue symbolic) {
		this.symbolics.add(symbolic);
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(JclStep step) {
		this.steps.add(step);
		if (step.isExecProc()) {
			for (Proc p: procs) {
				if (step.getProcExecuted().equals(p.getProcName())) {
					step.setProc(p);
					break;
				}
			}
		}
	}

	public void resolveParmedIncludes(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParmedIncludes " + this + " symbolics = |" + symbolics + "|");
		ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (IncludeStatement i: this.includes) {
			i.resolveParms(mergedSymbolics);
		}
		Demo01.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);

	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParms " + this + " symbolics = |" + symbolics + "|");


		for (JclStep step: this.steps) {
			ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
			for (SetSymbolValue s: this.symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			step.resolveParms(mergedSymbolics);
		}
	}

	public ArrayList<JclStep> stepsInNeedOfProc() {
		ArrayList<JclStep> stepsInNeed = new ArrayList<>();

		for (JclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public Boolean lineIsInInstreamProc(int aLine) {
		Boolean b = false;

		for (Proc p: this.procs) {
			b = p.containsLine(aLine) && (p.getFileName().equals(this.fileName));
			if (b) break;
		}

		return b;
	}

	public Proc instreamProcThisLineIsIn(int aLine) {
		Proc aProc = null;

		for (Proc p: this.procs) {
			if (p.containsLine(aLine) && (p.getFileName().equals(this.fileName))) {
				aProc = p;
				break;
			}
		}

		return aProc;
	}

	public Boolean lineIsInThisJob(int aLine) {
		return ((aLine >= this.startLine) && (aLine <= this.endLine));
	}

	public IncludeStatement includeStatementAt(int aLine) {
		for (IncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public JclStep jclStepAt(int aLine) {
		for (JclStep j: steps) {
			if (j.getLine() == aLine) return j;
		}

		return null;
	}

	public String getFileName() {
		return this.fileName;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String getJobName() {
		return this.jobName;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public ArrayList<JclStep> getSteps() {
		return this.steps;
	}

	public ArrayList<IncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<IncludeStatement> getAllUnresolvedIncludes() {
		IncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(IncludeStatement[]::new);
		return new ArrayList<IncludeStatement>(Arrays.asList(unresolved_includes));
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (KeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}
/*
	public File rewriteWithParmsResolved(File appRootDir, Boolean saveTemp) throws IOException {

	}
*/
	public File rewriteJobWithIncludesResolved(File tmpJobDir, File tmpProcDir, Boolean saveTemp) throws IOException {
		/*
			At this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		Demo01.LOGGER.fine(this.myName + " rewriteJobWithIncludesResolved job = |" + this + "| tmpJobDir = |" + tmpJobDir + "|");

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(tmpJobDir.toString() + File.separator + "job-" + this.getJobName() + "-" + this.getUUID());
		if (saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		Demo01.LOGGER.finest("tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			IncludeStatement i = this.includeStatementAt(src.getLineNumber());
			if (i == null) {
				out.println(inLine);
			} else {
				if (writeTheIncludeContent(i, out, tmpProcDir)) {
				} else {
					out.println(inLine);
				}
			}
		}
		src.close();
		out.close();
		return tmp;
	}

	public Boolean writeTheIncludeContent(
							IncludeStatement i
							, PrintWriter out
							, File tmpProcDir)
						throws IOException {

		Demo01.LOGGER.fine("writeTheIncludeContent i =|" + i + "| tmpProcDir = |" + tmpProcDir.getName() + "|");

		if (i.isResolved()) {
		} else {
			return false;
		}

		Boolean foundIt = true;
		String includeFile = i.getResolvedText();

		String includeFileFull = searchProcPathsFor(includeFile, tmpProcDir);

		if (includeFileFull == null) {
			foundIt = false;
			//Demo01.LOGGER.warning(includeFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(includeFileFull));
			for (String line: list) out.println(line);
		}

		return foundIt;
	}

	public String searchProcPathsFor(String fileName, File tmpProcDir) throws IOException {
		File aFile = new File(tmpProcDir.getName() + File.separator + fileName);
		if (aFile.exists()) {
			Demo01.LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
			return aFile.getCanonicalPath();
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (Demo01.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(Demo01.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					Demo01.LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
					return aFile.getCanonicalPath();
				}
			}
		}

		for (String path: Demo01.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			if (aFile.exists()) {
				Demo01.LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
				return aFile.getCanonicalPath();
			}
		}

		Demo01.LOGGER.warning("searchProcPathsFor() did not find " + fileName);
		return null;
	}

	public File newTempDir(File appRootDir, Boolean saveTemp) throws IOException {
		/*
			It's possible the file permissions are superfluous.  The code would be more
			portable without them.  TODO maybe remove the code setting file permissions.
		*/
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
		FileAttribute<Set<PosixFilePermission>> attr =
			PosixFilePermissions.asFileAttribute(perms);
		File tmpDir = Files.createTempDirectory(appRootDir.toString() + File.separator + this.getJobName() + "-", attr).toFile();

		if (saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	public String toString() {
		return 
			this.getJobName() 
			+ " @ " 
			+ this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() 
			+ " in " 
			+ this.fileName;
	}
}


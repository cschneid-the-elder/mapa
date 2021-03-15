import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TheCLI{
	public String[] args = null;
	private String myName = this.getClass().getName();
	public Options options = new Options();
	public CommandLineParser parser = new DefaultParser();
	public CommandLine line = null;
	public HelpFormatter formatter = new HelpFormatter();
	public ArrayList<String> fileNamesToProcess = new ArrayList<>();
	public ArrayList<String> copyPaths = new ArrayList<>();
	public String outFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;
	public ArrayList<CondCompVar> compOptDefines = new ArrayList<>();

	public TheCLI(String[] args) throws Exception {

		this.args = args;

		Option file = new Option("file", true
			, "name of a single file to process, takes precedence over the fileList option");
		Option fileList = new Option("fileList", true
			, "name of a file containing a list of files to process");
		Option copy = new Option("copy", true
			, "name of a single path in which to locate copybooks, takes precedence over the copyList option");
		Option copyList = new Option("copyList", true
			, "name of a file containing a list of paths in which to locate copybooks");
		Option defList = new Option("defList", true
			, "name of a file containing a list of >>DEFINE statements for conditional compilation variables and their values");
		Option out = new Option("out", true
			, "name of a file in which to store the CALLs, EXEC CICS LINKs, EXEC CICS XCTLs, and EXEC SQL CALLs");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option saveTemp = new Option("saveTemp", false
			, "save temporary files, used to test lexer, parser, listeners, et. al");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(copy);
		this.options.addOption(copyList);
		this.options.addOption(defList);
		this.options.addOption(out);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(saveTemp);
		this.options.addOption(help);

		try {
			this.line = parser.parse( options, args );
		} catch( ParseException exp ) {
			TestIntegration.LOGGER.severe( "Command line parsing failed.  Reason: " + exp.getMessage() );
			System.exit(16);
		}

		if (this.line.hasOption("help")) {
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(0);
		}

		if (this.line.hasOption("file")) {
			this.fileNamesToProcess.add(this.line.getOptionValue("file"));
		} else if (this.line.hasOption("fileList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("fileList")));
			this.fileNamesToProcess.addAll(list);
		} else {
			TestIntegration.LOGGER.config("Either the file or the fileList option must be provided");
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("copy")) {
			this.copyPaths.add(this.line.getOptionValue("copy"));
		} else if (this.line.hasOption("copyList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("copyList")));
			this.copyPaths.addAll(list);
		} else {
			TestIntegration.LOGGER.config("Either the copy or the copyList option must be provided");
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("defList")) {
			this.parseDefines(this.line.getOptionValue("defList"));
		}

		if (this.line.hasOption("out")) {
			this.outFileName = this.line.getOptionValue("out");
		}

		if (this.line.hasOption("logLevel")) {
			switch(this.line.getOptionValue("logLevel")) {
				case "SEVERE":
					TestIntegration.LOGGER.setLevel(Level.SEVERE);
					break;
				case "WARNING":
					TestIntegration.LOGGER.setLevel(Level.WARNING);
					break;
				case "INFO":
					TestIntegration.LOGGER.setLevel(Level.INFO);
					break;
				case "CONFIG":
					TestIntegration.LOGGER.setLevel(Level.CONFIG);
					break;
				case "FINE":
					TestIntegration.LOGGER.setLevel(Level.FINE);
					break;
				case "FINER":
					TestIntegration.LOGGER.setLevel(Level.FINER);
					break;
				case "FINEST":
					TestIntegration.LOGGER.setLevel(Level.FINEST);
					break;
				default:
					TestIntegration.LOGGER.config("Unrecognized logLevel option " + this.line.getOptionValue("LogLevel"));
			}
		} else {
			TestIntegration.LOGGER.setLevel(Level.INFO);
		}

		if (this.line.hasOption("unitTest")) {
			this.unitTest = true;
			if (this.line.hasOption("logLevel")) {
				if (this.line.getOptionValue("logLevel").equals("FINE")
				||  this.line.getOptionValue("logLevel").equals("FINER")
				||  this.line.getOptionValue("logLevel").equals("FINEST")) {
				} else {
					TestIntegration.LOGGER.setLevel(Level.FINE);
					TestIntegration.LOGGER.info("overriding logLevel");
				}
			} else {
				TestIntegration.LOGGER.setLevel(Level.FINE);
			}
			TestIntegration.LOGGER.info("unit testing is in effect");
		}

		if (this.line.hasOption("saveTemp")) {
			this.saveTemp = true;
			TestIntegration.LOGGER.info("temporary files will be preserved");
		}

	}

	private void parseDefines(String fileName) throws Exception {
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();

		TestIntegration.LOGGER.fine("parseDefines");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CompilerDirectingStatementListener listener = 
			new CompilerDirectingStatementListener(compDirStmts, this.compOptDefines);

		TestIntegration.LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		TestIntegration.LOGGER.finest("compOptDefines: " + this.compOptDefines);

	}

	/**
	Used to create temporary directories.  Global.
	*/
	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) {
		File tmpDir = null;
		try {
			tmpDir = Files.createTempDirectory(baseDir.toPath(), prfx).toFile();
		} catch (Exception e) {
			TestIntegration.LOGGER.severe(this.myName + " Exception " + e + " encountered in newTempDir");
			e.printStackTrace();
			System.exit(16);
		}

		this.setPosixAttributes(tmpDir);

		if (saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	/**
	Used to set file attributes if necessary.  Global.
	*/
	public void setPosixAttributes(File aFile) {
		String attr = null;

		if (aFile.isDirectory()) {
			attr = "rwxr-x---";
		} else {
			attr = "rw-r-----";
		}

		if (aFile.toPath().getFileSystem().supportedFileAttributeViews().contains("posix")) {
			Set<PosixFilePermission> perms = PosixFilePermissions.fromString(attr);
			try {
				Files.setPosixFilePermissions(aFile.toPath(), perms);
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(this.myName + " Exception " + e + " encountered in setPosixAttributes");
				e.printStackTrace();
				System.exit(16);
			}
		}
	}	
}

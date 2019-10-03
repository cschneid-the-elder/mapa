import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.*;

public class TheCLI{
	public String[] args = null;
	public Options options = new Options();
	public CommandLineParser parser = new DefaultParser();
	public CommandLine line = null;
	public HelpFormatter formatter = new HelpFormatter();
	public ArrayList<String> fileNamesToProcess = new ArrayList<>();
	public ArrayList<String> copyPaths = new ArrayList<>();
	public String outFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;

	public TheCLI(String[] args) throws Exception {

		this.args = args;

		Option file = new Option("file", true
			, "name of a single file to process, takes precedence over the fileList option");
		Option fileList = new Option("fileList", true
			, "name of a file containing a list of files to process");
		Option include = new Option("include", true
			, "name of a single path in which to locate cataloged procs and JCL INCLUDEs, takes precedence over the includeList option");
		Option includeList = new Option("includeList", true
			, "name of a file containing a list of paths in which to locate cataloged procs and JCL INCLUDEs");
		Option out = new Option("out", true
			, "name of a file in which to store the gathered information");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(include);
		this.options.addOption(includeList);
		this.options.addOption(out);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(help);

		try {
			this.line = parser.parse( options, args );
		} catch( ParseException exp ) {
			Demo01.LOGGER.severe( "Command line parsing failed.  Reason: " + exp.getMessage() );
			System.exit(16);
		}

		if (this.line.hasOption("help")) {
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(0);
		}

		if (this.line.hasOption("file")) {
			this.fileNamesToProcess.add(this.line.getOptionValue("file"));
		} else if (this.line.hasOption("fileList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("fileList")));
			this.fileNamesToProcess.addAll(list);
		} else {
			Demo01.LOGGER.config("Either the file or the fileList option must be provided");
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("include")) {
			this.copyPaths.add(this.line.getOptionValue("include"));
		} else if (this.line.hasOption("includeList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("includeList")));
			this.copyPaths.addAll(list);
		} else {
			Demo01.LOGGER.config("Either the include or the includeList option must be provided");
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("out")) {
			this.outFileName = this.line.getOptionValue("out");
		}

		if (this.line.hasOption("logLevel")) {
			switch(this.line.getOptionValue("logLevel")) {
				case "SEVERE":
					Demo01.LOGGER.setLevel(Level.SEVERE);
					break;
				case "WARNING":
					Demo01.LOGGER.setLevel(Level.WARNING);
					break;
				case "INFO":
					Demo01.LOGGER.setLevel(Level.INFO);
					break;
				case "CONFIG":
					Demo01.LOGGER.setLevel(Level.CONFIG);
					break;
				case "FINE":
					Demo01.LOGGER.setLevel(Level.FINE);
					break;
				case "FINER":
					Demo01.LOGGER.setLevel(Level.FINER);
					break;
				case "FINEST":
					Demo01.LOGGER.setLevel(Level.FINEST);
					break;
				default:
					Demo01.LOGGER.config("Unrecognized logLevel option " + this.line.getOptionValue("LogLevel"));
			}
		} else {
			Demo01.LOGGER.setLevel(Level.INFO);
		}

		if (this.line.hasOption("unitTest")) {
			this.unitTest = true;
			if (this.line.hasOption("logLevel")) {
				if (this.line.getOptionValue("logLevel").equals("FINE")
				||  this.line.getOptionValue("logLevel").equals("FINER")
				||  this.line.getOptionValue("logLevel").equals("FINEST")) {
				} else {
					Demo01.LOGGER.setLevel(Level.FINE);
					Demo01.LOGGER.info("overriding logLevel");
				}
			} else {
				Demo01.LOGGER.setLevel(Level.FINE);
			}
			Demo01.LOGGER.info("unit testing is in effect");
		}


	}
}

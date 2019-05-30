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
	public Boolean unitTest = false;
	public Boolean saveTemp = false;

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
}

package loggers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.BasicConfiguration;

public class runner {

	public static final Logger log = LogManager.getLogger(runner.class);
	
	
	public static void main(String[] args) {
		log.trace("entering app");
		log.trace("exiting app");

	}

}

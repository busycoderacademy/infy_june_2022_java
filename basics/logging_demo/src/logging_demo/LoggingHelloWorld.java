package logging_demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingHelloWorld {

	private static Log logger = LogFactory.getLog(LoggingHelloWorld.class);

	public static void main(String[] args) {
		logger.info("this is a log message");

		try {
			String data = "33A";
			Integer val = Integer.parseInt(data);
			System.out.println(val);
		} 
		catch (NumberFormatException e) {
			logger.error("ex have occured  "+ e);
		}
		
		logger.fatal("connection is not obtain");

	}
}

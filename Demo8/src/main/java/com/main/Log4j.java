package com.main;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class Log4j {
	private static final Logger LOGGER = LogManager.getLogger(Log4j.class);
	public static void main(String[] args) {
		LOGGER.debug("meaning logging = comment ");
		LOGGER.info("Info");
		LOGGER.warn("warning!");
		LOGGER.error("error");
		LOGGER.error("Logging demo");
	}
	
	
}

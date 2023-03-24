package com.andy.usRetail.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jUsables {
	
	private static Logger logger = LogManager.getLogger(Log4jUsables.class);
	
	public static void main(String[] args) {
		System.out.println("\n Hello World...!\n");
		logger.info("This is logger message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		System.out.println("Completed");
		
	}

}

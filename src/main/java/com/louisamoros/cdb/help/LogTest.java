package com.louisamoros.cdb.help;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(LogTest.class);
		logger.debug("Hello world.");

	}

}
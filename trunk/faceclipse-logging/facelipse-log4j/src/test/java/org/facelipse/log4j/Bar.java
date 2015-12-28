package org.facelipse.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Bar {
	static Logger logger = Logger.getLogger(Bar.class);
	static {
		logger.setLevel(Level.DEBUG);
	}

	public void doIt() {
		logger.debug("Did it again!");
	}
}

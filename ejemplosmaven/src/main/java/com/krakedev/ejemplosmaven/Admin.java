package com.krakedev.ejemplosmaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private Logger loggert=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		loggert.info("mensaje de info");
		loggert.warn("mensaje a warn");
		loggert.trace("mensaje a trace");
		loggert.error("mensaje a error");
		loggert.debug("mensaje de debug");
	}
	
}

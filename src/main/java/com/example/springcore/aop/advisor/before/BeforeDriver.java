package com.example.springcore.aop.advisor.before;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BeforeDriver implements Driver {
	
	private static Log log = LogFactory.getLog(BeforeDriver.class);

	@Override
	public void askDestination(String destination) {
		log.info("Driver ask guest the " + destination + ".");
	}

	@Override
	public void driveCar(String name) {
		log.info("Driver drive his car to " + name + ".");
	}

}

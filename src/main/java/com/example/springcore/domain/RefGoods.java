package com.example.springcore.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RefGoods {
	
	private static Log log = LogFactory.getLog(RefGoods.class);
	
	private String name;
	
	private String function;
	
	protected void doGet() {
		log.info("I have " + name + " ,this can do " + function + ".");
	}

}

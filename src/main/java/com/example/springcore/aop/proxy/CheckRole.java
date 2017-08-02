package com.example.springcore.aop.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CheckRole {
	
	private static Log log = LogFactory.getLog(CheckRole.class);
	
	private static ThreadLocal<MethodRole> roleRecord = new ThreadLocal<MethodRole>();

	public static void begin(String method) {
		log.info("begin check role...");
		MethodRole mr = roleRecord.get();
		if(mr == null){
			mr = new MethodRole(method);
			roleRecord.set(mr);
		}else{
			mr.reset(method);	
		}
		log.info("role is include.");
	}

	public static void end() {
		log.info("no exception.");
		MethodRole mr = roleRecord.get();
		mr.printTime();
	}

}

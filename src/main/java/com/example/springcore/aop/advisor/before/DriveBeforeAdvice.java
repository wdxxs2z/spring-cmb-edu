package com.example.springcore.aop.advisor.before;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class DriveBeforeAdvice implements MethodBeforeAdvice {
	
	private static Log log = LogFactory.getLog(DriveBeforeAdvice.class);

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String clientName  = (String)args[0];
		log.info("Hello,i will drive my car to your destination " + clientName + ".");
	}

}

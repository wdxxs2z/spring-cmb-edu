package com.example.springcore.aop.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AppServiceImpl implements AppService{
	
	private static Log log = LogFactory.getLog(AppServiceImpl.class);
	
	public void createApplication(int appId) {
		//CheckRole.begin("com.example.springcore.aop.createApplication");
		log.info("创建应用: " + appId + " ,请稍后，这是个模拟演示。");
		try {
			Thread.currentThread().sleep(20);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		//CheckRole.end();
	}
	
	public void deleteApplication(int appId) {
		//CheckRole.begin("com.example.springcore.aop.deleteApplication");
		log.info("删除应用: " + appId + " ,请稍后，这是个模拟演示。");
		try {
			Thread.currentThread().sleep(50);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		//CheckRole.end();
	}
}

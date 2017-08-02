package com.example.springcore.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ClassLoaderTest {
	
	private static Log log = LogFactory.getLog(ClassLoaderTest.class);

	public static void main(String[] args) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		log.info("现阶段的类加载器为: " + classLoader);
		log.info("其父类加载器为: " + classLoader.getParent());
		log.info("父加载器的加载器为: " + classLoader.getParent().getParent());
	}

}

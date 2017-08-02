package com.example.springcore.aop.advisor.before;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlProxyTest {
	
	@Test
	public void xmlProxyTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("proxy-factory.xml");
		Driver driver = (Driver)ctx.getBean("driver");
		driver.askDestination("科技园");
		driver.driveCar("深南科技园");
	}

}

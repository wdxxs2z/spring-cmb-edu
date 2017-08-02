package com.example.springcore.aop.advisor.before;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class DriverTest {
	
	@Test
	public void before() {
		//定义切点
		Driver driver = new BeforeDriver();
		//定义切面
		BeforeAdvice advice = new DriveBeforeAdvice();
		//Spring提供的代理工厂
		ProxyFactory pf = new ProxyFactory();
		//设置代理目标 设置接口方式，会使用JDK的代理
		//pf.setInterfaces(driver.getClass().getInterfaces());
		pf.setOptimize(true);
		pf.setTarget(driver);
		//设置增强
		pf.addAdvice(advice);
		//生成代理实例
		Driver proxy = (Driver)pf.getProxy();
		proxy.askDestination("科技园");
		proxy.driveCar("深南科技园");
	}

}

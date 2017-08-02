package com.example.springcore.aop.advisor.aspectj;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.example.springcore.aop.advisor.before.BeforeDriver;
import com.example.springcore.aop.advisor.before.Driver;

public class AspectJTest {
	
	@Test
	public void aspectJTest1() {
		//设置代理目标
		Driver target = new BeforeDriver();
		//设置aspectj代理工厂
		AspectJProxyFactory factory = new AspectJProxyFactory();
		//设置工厂属性
		factory.setTarget(target);
		factory.addAspect(DriverInterceptor.class);
		//产生代理类
		Driver proxy = factory.getProxy();
		//通过代理类操作目标方法
		proxy.askDestination("火车站");
		proxy.driveCar("火车北站");
	}

}

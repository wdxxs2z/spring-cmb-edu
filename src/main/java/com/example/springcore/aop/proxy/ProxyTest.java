package com.example.springcore.aop.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {
	
	@Test
	public void proxy() {
		jdkProxy();
		//cglibProxy();		
	}

	private void cglibProxy() {
		CglibProxy proxy = new CglibProxy();
		//通过动态生成的子类的方式创建代理类
		AppServiceImpl appService = (AppServiceImpl)proxy.getObject(AppServiceImpl.class);
		appService.createApplication(123123123);
		appService.deleteApplication(123123123);
	}

	private void jdkProxy() {
		//被代理的目标业务类
		AppService target = new AppServiceImpl();
		//将目标业务类和横切代码编织到一起
		RoleHandler handler = new RoleHandler(target);
		//根据编织了目标业务类逻辑和鉴权横切逻辑的代理实例
		AppService proxyInstance = (AppService) Proxy.newProxyInstance(target.getClass().getClassLoader()
				, target.getClass().getInterfaces()
				, handler);
		//调用代理实例
		proxyInstance.createApplication(234234234);
		proxyInstance.deleteApplication(234234234);		
	}	

}

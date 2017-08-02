package com.example.springcore.aop.proxy;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RoleHandler implements InvocationHandler {
	
	private Object target;
	
	public RoleHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//横切代码
		CheckRole.begin(Target.class.getName()+ "." + method.getName());
		//反射间接调用代码
		Object object = method.invoke(target, args);
		CheckRole.end();
		return object;
	}

}

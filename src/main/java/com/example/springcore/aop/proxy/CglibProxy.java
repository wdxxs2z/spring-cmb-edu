package com.example.springcore.aop.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer();
	public Object getObject(Class clazz) {
		//设置需要创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		//通过字节码技术动态创建子类实例
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		//拦截父类所有方法的调用
		CheckRole.begin(obj.getClass().getName() + "." + method.getName());
		//通过代理类调用父类中的方法
		Object result = proxy.invokeSuper(obj, args);
		CheckRole.end();
		return result;
	}	

}

package com.example.springcore.aop.advisor.aspectj;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * 定义切面
 * */
@Aspect
public class DriverInterceptor {
	
	private static Log log = LogFactory.getLog(DriverInterceptor.class);
	
	//定义切点
	@Pointcut("execution(* askDestination(..))")
    private void askMethod(){}//定义一个切入点  
	
	//定义切点
	@Pointcut("execution(* driveCar(..))")
	private void driveMethod(){}//定义一个切入点
	
	// 前置增强类型
	@Before("askMethod()")
	public void beforeDriving() {
		log.info("How are you!");
		log.info("前置通知完成。。。。");
	}
	
	// 后置增强类型
	@After("driveMethod()")
	public void afterDriving() {
		log.info("check the money.");
		log.info("后置通知完成。。。。");
	}
	
	// 环绕增强类型
	@Around("askMethod()")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
		log.info("进入环绕通知");  
        Object object = pjp.proceed();//执行该方法  
        log.info("退出方法");
        return object;  
    } 
}

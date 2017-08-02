package com.example.springcore.ioc.autoscaling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ioc-strategy.xml");
		Autoscaling autuscaling = appContext.getBean(Autoscaling.class);
		
		double usageValue = 0.65d;
		double strategyBalance = autuscaling.getStrategyBalance(usageValue);
		System.out.println("Strategy Balance is " + strategyBalance);
	}

}

package com.example.springcore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcore.domain.Car;
import com.example.springcore.domain.Goods;
import com.example.springcore.service.impl.PersonService;

public class XmlDefineApplication {
	
	private static ApplicationContext ctx;
	
	private static Log log = LogFactory.getLog(XmlDefineApplication.class);

	public static void main(String[] args) {
		//BeanFactoryPostProcessor
		ctx = new ClassPathXmlApplicationContext("application-example.xml");
		Car car = ctx.getBean("car", Car.class);
		//ContextNamespaceHandler
		log.info("car's name is: " + car.getName() + ",car's color is: " + car.getColor() + ",car's price is: " + car.getPrice());
		Goods goods = ctx.getBean("goods", Goods.class);
		log.info(goods.getName());
		Goods goods2 = ctx.getBean("good", Goods.class);
		log.info(goods2.getName());
		
		//@PostConstruct and @PreDestroy
		PersonService  personService  =  (PersonService)ctx.getBean("personService"); 
        personService.dostory();
	}

}

package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);

		//获取当前定义的bean.
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		
		//加载注解配置上下文，获取相应的Bean
		ctx = new AnnotationConfigApplicationContext(CallPeopleConfig.class);
		People people = ctx.getBean(People.class);
		people.setMessage("Mr jack zhou.");
		people.getSay();
		
		//从配置文件中加载
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"springApplication.xml"});
	}
}

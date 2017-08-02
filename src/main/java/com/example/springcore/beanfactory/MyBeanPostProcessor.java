package com.example.springcore.beanfactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.example.springcore.domain.CarBean;

/*
 * 对配置文件提供的属性设置值进行判断，并执行响应的 补漏操作，类似于出厂前设置，出厂后补漏
 * 这里的补漏其实是在某个切点上做一些处理，BeanPostProcessor在AOP编程中的地位举足轻重
 * */
public class MyBeanPostProcessor implements BeanPostProcessor{
	
	private static Log log = LogFactory.getLog(MyBeanPostProcessor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("carBean")){
			CarBean carBean = (CarBean)bean;
			if(carBean.getColor() == null){
				log.info("调用MyBeanPostProcessor.postProcessBeforeInitialization()，color为空，设置为默认黑色。");
				carBean.setColor("黑色");
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("carBean")){
			CarBean carBean = (CarBean)bean;
			if(carBean.getMaxSpead() == 200){
				log.info("调用MyBeanPostProcessor.postProcessAfterInitialization()，将maxSpeed调整为220。");
				carBean.setMaxSpead(220);
			}
		}
		return bean;
	}
}

package com.example.springcore.beanfactory;

import java.beans.PropertyDescriptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;


/*
 * 通过扩展instantiationAWareBeanPostProcessor的适配器InstantiationAwareBeanPostProcessorAdapter
 * 提供实现
 * */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
	
	private static Log log = LogFactory.getLog(MyInstantiationAwareBeanPostProcessor.class);
	
	//接口调用，在实例化bean前调用
	public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
		//仅对容器种的CarBean处理
		if("carBean".equals(beanName)){
			log.info("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");			
		}		
		return null;
	}

	//接口调用，在实例化bean后调用
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		//仅对容器的CarBean进行处理
		if("carBean".equals(beanName)){
			log.info("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
		}
		return true;
	}

	//接口调用，在设置某个属性时调用
	public PropertyValues postProcessPropertyValues(
			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException {
		//可以通过pdst入参进行过滤，仅对CarBean的某个特定属性进行处理
		if("carBean".equals(beanName)){
			log.info("InstantiationAwareBeanPostProcessor.postProcessPropertyValues");
		}
		return pvs;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}

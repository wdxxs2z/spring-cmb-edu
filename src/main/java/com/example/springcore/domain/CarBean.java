package com.example.springcore.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * Bean完整生命周期演示
 * Bean级别的生命接口
 * */
public class CarBean implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{

	private static Log log = LogFactory.getLog(CarBean.class);
	
	private String color;
	private String brand;
	private int maxSpead;
	
	private BeanFactory beanFactory;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpead() {
		return maxSpead;
	}

	public void setMaxSpead(int maxSpead) {
		this.maxSpead = maxSpead;
	}

	public String getBrand() {
		return brand;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public String getBeanName() {
		return beanName;
	}

	private String beanName;
	
	public CarBean(){
		log.info("调用CarBean()构造函数。");
	}
	
	public void setBrand(String brand) {
		log.info("调用了setBrand函数设置属性。");
		this.brand = brand;
	}
	
	public void introduce() {
		System.out.println();
		log.info("brand: " + brand + ".color: " + color + ".maxspead: " + maxSpead);
	}
	
	//destory方法
	@Override
	public void destroy() throws Exception {
		log.info("调用DisposableBean.destory()方法.");
	}

	//initializingBean接口
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("调用initializingBean.afterPropertiesSet()方法.");
	}

	//BeanNameAware接口方法
	@Override
	public void setBeanName(String beanName) {
		log.info("调用beanNameAware.setBeanName().");
		this.beanName = beanName;
	}

	//BeanFactoryAware接口方法
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		log.info("调用beanfactoryaware.setBeanFactory().");
		this.beanFactory = beanFactory;
	}
	

	public void initMy() {
		log.info("调用init-method所指的initMy方法，将maxSpead设置为220。");
		this.maxSpead = 240;
	}
	

	public void destoryMy() {
		log.info("调用destory-method所指定的destoryMy方法。");
	}

}

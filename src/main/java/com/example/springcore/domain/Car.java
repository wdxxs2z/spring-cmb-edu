package com.example.springcore.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Car {
	
	private static Log log = LogFactory.getLog(Car.class);
	
	private String name;
	
	private String color;
	
	private double price;
	
	public Car() {
		log.info("开始实例化Car......");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

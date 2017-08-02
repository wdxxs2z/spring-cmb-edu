package com.example.springcore.domain;

public class Goods {
	
	private String name;
	
	private double price;
	
	private int level;

	public Goods() {
		super();
	}

	public Goods(String name, double price, int level) {
		super();
		this.name = name;
		this.price = price;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
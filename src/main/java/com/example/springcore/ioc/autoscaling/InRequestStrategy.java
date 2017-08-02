package com.example.springcore.ioc.autoscaling;

public class InRequestStrategy implements AutoscalingStrategy {
	
	private double inRequestStrategy;

	public double getInRequestStrategy() {
		return inRequestStrategy;
	}

	public void setInRequestStrategy(double inRequestStrategy) {
		this.inRequestStrategy = inRequestStrategy;
	}

	@Override
	public double Strategy(double usageValue) {
		return usageValue / this.inRequestStrategy;
	}

}

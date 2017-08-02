package com.example.springcore.ioc.autoscaling;

public class Autoscaling {
	
	private AutoscalingStrategy autoscalingStrategy;

	public AutoscalingStrategy getAutoscalingStrategy() {
		return autoscalingStrategy;
	}

	public void setAutoscalingStrategy(AutoscalingStrategy autoscalingStrategy) {
		this.autoscalingStrategy = autoscalingStrategy;
	}
	
	public double getStrategyBalance(double usageValue) {
		return this.autoscalingStrategy.Strategy(usageValue);
	}

}

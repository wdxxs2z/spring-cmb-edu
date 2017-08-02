package com.example.springcore.ioc.autoscaling;

public class CpuStrategy implements AutoscalingStrategy {
	
	private double cpuThresholdValue;

	public double getCpuThresholdValue() {
		return cpuThresholdValue;
	}

	public void setCpuThresholdValue(double cpuThresholdValue) {
		this.cpuThresholdValue = cpuThresholdValue;
	}

	@Override
	public double Strategy(double usageValue) {
		return usageValue / this.cpuThresholdValue;
	}

}

package com.example.springcore.ioc.autoscaling;

import java.util.Calendar;

public class TimeStrategy implements AutoscalingStrategy {
	
	private AutoscalingStrategy autoscalingStrategy;

	public AutoscalingStrategy getAutoscalingStrategy() {
		return autoscalingStrategy;
	}

	public void setAutoscalingStrategy(AutoscalingStrategy autoscalingStrategy) {
		this.autoscalingStrategy = autoscalingStrategy;
	}

	@Override
	public double Strategy(double usageValue) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		//针对每天9点半之前，平衡值一直为0，即不会触发任何接下来的事件
		//其它时间，按照默认规则走
		if (hour == 9 && minute <= 30) {
			return 0.0;
		}
		return autoscalingStrategy.Strategy(usageValue);
	}

}

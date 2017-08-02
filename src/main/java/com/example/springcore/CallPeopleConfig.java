package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CallPeopleConfig {
	
	@Bean(name="people")
	public People callPeople() {
		return new People();
	}

}

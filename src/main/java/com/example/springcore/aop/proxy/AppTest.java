package com.example.springcore.aop.proxy;

public class AppTest {

	public static void main(String[] args) {
		AppServiceImpl appService = new AppServiceImpl();
		appService.createApplication(1233123123);
		appService.deleteApplication(1239578234);
		

	}

}

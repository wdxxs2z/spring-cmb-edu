package com.example.springcore.aop.proxy;

public class MethodRole {
	
	private long begin;
	private long end;
	private String method;

	public MethodRole(String method) {
		reset(method);
	}

	public void reset(String method) {
		this.method = method;
    	this.begin = System.currentTimeMillis();
	}
	
	public void printTime(){
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(method+"花费"+elapse+"毫秒。");
    }

}

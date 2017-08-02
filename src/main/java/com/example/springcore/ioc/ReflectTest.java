package com.example.springcore.ioc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.example.springcore.domain.RefGoods;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		//装载该类
		Class clazz = classLoader.loadClass("com.example.springcore.domain.RefGoods");
		//实例化该类
		RefGoods refGoods = (RefGoods) clazz.newInstance();
		
		//获取该类的属性name，并设置访问权限，设置属性值
		Field nameField = clazz.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(refGoods, "pen");
		
		//获取该类的属性function，并设置访问权限，设置属性值
		Field functionField = clazz.getDeclaredField("function");
		functionField.setAccessible(true);
		functionField.set(refGoods, "write");
		
		//获取类的方法，并执行
		Method doGetMethod = clazz.getDeclaredMethod("doGet", (Class[])null);
		doGetMethod.setAccessible(true);
		doGetMethod.invoke(refGoods, (Class[])null);
	}

}

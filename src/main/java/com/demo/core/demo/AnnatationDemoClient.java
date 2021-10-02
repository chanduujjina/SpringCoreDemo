package com.demo.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnatationDemoClient {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnatationDemo1 annatationDemo1 = (AnnatationDemo1) applicationContext.getBean("annatationDemo1");
		
		System.out.println(annatationDemo1);
	}
	
	

}

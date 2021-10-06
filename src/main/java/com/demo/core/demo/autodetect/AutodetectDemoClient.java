package com.demo.core.demo.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutodetectDemoClient {

	public static void main(String[] args) {
	
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		AutoDetectDemo autoDetectDemo= (AutoDetectDemo) applicationContext.getBean("autoDetectDemo");
		System.out.println(autoDetectDemo);
		

	}

}

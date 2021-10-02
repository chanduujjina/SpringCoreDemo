package com.demo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDemoClient {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		XmlDemo1 xmlDemo1 = (XmlDemo1) applicationContext.getBean("xmlDemo1");
		System.out.println(xmlDemo1);
		
		XmlDemo3 xmlDemo3 = (XmlDemo3) applicationContext.getBean("xmlDemo3");
		System.out.println(xmlDemo3);
		
		
		XmlDemo5 xmlDemo5 = (XmlDemo5) applicationContext.getBean("xmlDemo5");
		System.out.println(xmlDemo5);
		
		XmlDemo7 xmlDemo7 = (XmlDemo7) applicationContext.getBean("xmlDemo7");
		System.out.println(xmlDemo7);
		
	}

}

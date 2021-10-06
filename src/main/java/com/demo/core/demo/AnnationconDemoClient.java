package com.demo.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnationconDemoClient {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnatationConDIDemo annatationConDIDemo = (AnnatationConDIDemo) applicationContext.getBean("annatationConDIDemo");
		
      System.out.println(annatationConDIDemo);
	}

}

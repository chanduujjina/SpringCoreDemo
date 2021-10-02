package com.demo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoClient {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		SingletonDemo singletonDemo=	(SingletonDemo) applicationContext.getBean("singletonDemo");
		
		SingletonDemo singletonDemo1=	(SingletonDemo) applicationContext.getBean("singletonDemo");
		
		System.out.println(singletonDemo.hashCode());
		System.out.println(singletonDemo1.hashCode());
		
		ProtoTypeDemo protoTypeDemo = (ProtoTypeDemo) applicationContext.getBean("prototypeDemo");
		
		ProtoTypeDemo protoTypeDemo1 = (ProtoTypeDemo) applicationContext.getBean("prototypeDemo");
		
		System.out.println(protoTypeDemo.hashCode());
		System.out.println(protoTypeDemo1.hashCode());

	}

}

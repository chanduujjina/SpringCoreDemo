package com.demo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //define IOC Container
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    	
    	System.out.println(applicationContext.getBeanDefinitionCount());
    	HelloWorld world =	(HelloWorld) applicationContext.getBean("hello");
    	world.sayHello();
    	
    	
    }
}

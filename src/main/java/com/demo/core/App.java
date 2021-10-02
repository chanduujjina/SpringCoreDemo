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
    	
    	Employee employee = (Employee) applicationContext.getBean("emp1");
    
    	System.out.println(employee);
    	
    	Employee2 employee2 = (Employee2) applicationContext.getBean("emp2");
        
    	System.out.println(employee2);
    	
    	HelloWorld1 world1 =	(HelloWorld1) applicationContext.getBean("hello1");
    	System.out.println(world1);
    	world1.sayHello();
    	
    	
    	
    }
}

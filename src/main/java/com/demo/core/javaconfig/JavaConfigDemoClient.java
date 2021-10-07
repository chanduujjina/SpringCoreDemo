package com.demo.core.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.core.javaconfig.autodetect.JavaConfigAutoDetect;
import com.demo.core.javaconfig.autodetect.JavaConfigAutoDetect1;

public class JavaConfigDemoClient {

	public static void main(String[] args) {
	ApplicationContext applicationContext =	new AnnotationConfigApplicationContext(BeanConfiguration.class);
	JavaConfigDemo1 javaConfigDemo1= applicationContext.getBean(JavaConfigDemo1.class);
	System.out.println(javaConfigDemo1);
	
	JavaConfigDemo3 javaConfigDemo3= applicationContext.getBean(JavaConfigDemo3.class);
	System.out.println(javaConfigDemo3);
	
	JavaConfigDemo5 javaConfigDemo5= applicationContext.getBean(JavaConfigDemo5.class);
	System.out.println(javaConfigDemo5);
	
	//auto detect beans
	
	JavaConfigAutoDetect autoDetect =applicationContext.getBean(JavaConfigAutoDetect.class);
	System.out.println(autoDetect);
	
	JavaConfigAutoDetect1 autoDetect1 =applicationContext.getBean(JavaConfigAutoDetect1.class);
	System.out.println(autoDetect1);
	}

}

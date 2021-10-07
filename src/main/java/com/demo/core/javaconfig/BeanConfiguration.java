package com.demo.core.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
@ComponentScan(basePackages="com.demo.core.javaconfig.autodetect")
public class BeanConfiguration {
	
	@Value("${type}")
	private String type;
	
	@Value("${name}")
	private String name;
	
	
	
	@Bean
	public JavaConfigDemo1 getJavaConfigDemo1() {
		JavaConfigDemo1 javaConfigDemo1 = new JavaConfigDemo1();
		javaConfigDemo1.setType("main");
		return javaConfigDemo1;
	}
	
	@Bean(name="demo2")
	public JavaConfigDemo2 getJavaConfigDemo2() {
		JavaConfigDemo2 javaConfigDemo2 = new JavaConfigDemo2();
		javaConfigDemo2.setType("dependent1");
		return javaConfigDemo2;
	}
	
	@Bean(name="demo2_v1")
	public JavaConfigDemo2 getJavaConfigDemo2_v1() {
		JavaConfigDemo2 javaConfigDemo2 = new JavaConfigDemo2();
		javaConfigDemo2.setType("dependent2");
		return javaConfigDemo2;
	}
	
	@Bean
	public JavaConfigDemo3 getJavaConfigDemo3() {
		return new JavaConfigDemo3("main",getJavaConfigDemo4());
		
	}
	
	@Bean
	public JavaConfigDemo4 getJavaConfigDemo4() {
		return new JavaConfigDemo4("dependent");
		
		
	}
	
	@Bean
	public JavaConfigDemo5 getJavaConfigDemo5() {
		return new JavaConfigDemo5(type,name);
		
		
	}
	
	

}

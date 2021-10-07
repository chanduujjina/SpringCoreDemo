package com.demo.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class JavaConfigDemo3 {
	
	
	@Override
	public String toString() {
		return "JavaConfigDemo3 [type=" + type + ", javaConfigDemo4=" + javaConfigDemo4 + "]";
	}


	public String getType() {
		return type;
	}


	public JavaConfigDemo4 getJavaConfigDemo4() {
		return javaConfigDemo4;
	}


	@Autowired
	public JavaConfigDemo3(String type,JavaConfigDemo4 javaConfigDemo4) {
		super();
		this.type = type;
		this.javaConfigDemo4 = javaConfigDemo4;
	}


	private String type;
	
	
	private JavaConfigDemo4 javaConfigDemo4;

}

package com.demo.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class JavaConfigDemo1 {
	
	@Override
	public String toString() {
		return "JavaConfigDemo1 [type=" + type + ", javaConfigDemo2=" + javaConfigDemo2 + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JavaConfigDemo2 getJavaConfigDemo2() {
		return javaConfigDemo2;
	}

	public void setJavaConfigDemo2(JavaConfigDemo2 javaConfigDemo2) {
		this.javaConfigDemo2 = javaConfigDemo2;
	}

	private String type;
	
	@Autowired
	@Qualifier("demo2_v1")
	private JavaConfigDemo2 javaConfigDemo2;

}

package com.demo.core.javaconfig.autodetect;

import org.springframework.stereotype.Component;

@Component
public class JavaConfigAutoDetect1 {
	
	@Override
	public String toString() {
		return "JavaConfigAutoDetect1 [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

}

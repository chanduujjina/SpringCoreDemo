package com.demo.core.javaconfig.autodetect;

import org.springframework.stereotype.Component;

@Component
public class JavaConfigAutoDetect {
	
	@Override
	public String toString() {
		return "JavaConfigAutoDetect [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

}

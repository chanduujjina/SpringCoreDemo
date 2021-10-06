package com.demo.core.demo.autodetect;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoDetectDemo {
	
	
	@Override
	public String toString() {
		return "AutoDetectDemo [type=" + type + ", autoDetectDemo1=" + autoDetectDemo1 + "]";
	}

	public AutoDetectDemo1 getAutoDetectDemo1() {
		return autoDetectDemo1;
	}

	public void setAutoDetectDemo1(AutoDetectDemo1 autoDetectDemo1) {
		this.autoDetectDemo1 = autoDetectDemo1;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
	
	@Autowired
	private AutoDetectDemo1 autoDetectDemo1;

}

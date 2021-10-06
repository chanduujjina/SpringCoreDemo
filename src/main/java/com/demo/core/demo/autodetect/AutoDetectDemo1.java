package com.demo.core.demo.autodetect;

import org.springframework.stereotype.Component;

@Component
public class AutoDetectDemo1 {
	@Override
	public String toString() {
		return "AutoDetectDemo1 [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
}

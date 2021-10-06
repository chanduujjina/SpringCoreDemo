package com.demo.core.demo;

public class AnnatationConDIDemo1 {
	@Override
	public String toString() {
		return "AnnatationConDIDemo1 [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public AnnatationConDIDemo1(String type) {
		super();
		this.type = type;
	}

	private String type;

}

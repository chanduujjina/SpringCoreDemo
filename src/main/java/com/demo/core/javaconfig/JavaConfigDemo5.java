package com.demo.core.javaconfig;

public class JavaConfigDemo5 {
	
	public JavaConfigDemo5(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "JavaConfigDemo5 [type=" + type + ", name=" + name + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String type;
	
	private String name;

}

package com.demo.core;

public class HelloWorld1 {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}
	
	public void sayHello() {
		System.out.println(name);
	}

}

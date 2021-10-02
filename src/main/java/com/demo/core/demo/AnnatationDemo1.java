package com.demo.core.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnatationDemo1 {
	
	@Override
	public String toString() {
		return "AnnatationDemo1 [type=" + type + ", annatationDemo2=" + annatationDemo2 + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AnnatationDemo2 getAnnatationDemo2() {
		return annatationDemo2;
	}

	public void setAnnatationDemo2(AnnatationDemo2 annatationDemo2) {
		this.annatationDemo2 = annatationDemo2;
	}

	private String type;
	
	@Autowired//by Type
	//@Qualifier("annatationDemo4")
	private AnnatationDemo2 annatationDemo2;
}

package com.demo.core.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnatationDemo1 {
	
	private String type;
	
	@Autowired//by type
	private AnnatationDemo2 annatationDemo2;
	
	@Autowired
	@Qualifier("annatationDemo3_v1")//autowire byName
	private AnnatationDemo3 annatationDemo3_v1;
	
	@Autowired
	@Qualifier("annatationDemo3")
	private AnnatationDemo3 annatationDemo3;
	

	private AnnatationDemo4 annatationDemo4;
	
	

	public AnnatationDemo3 getAnnatationDemo3() {
		return annatationDemo3;
	}

	public void setAnnatationDemo3(AnnatationDemo3 annatationDemo3) {
		this.annatationDemo3 = annatationDemo3;
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

	
	@Override
	public String toString() {
		return "AnnatationDemo1 [type=" + type + ", annatationDemo2=" + annatationDemo2 + ", annatationDemo3_v1="
				+ annatationDemo3_v1 + ", annatationDemo3=" + annatationDemo3 + ", annatationDemo4=" + annatationDemo4
				+ "]";
	}

	public AnnatationDemo4 getAnnatationDemo4() {
		return annatationDemo4;
	}
	
	@Autowired
	@Qualifier("annatationDemo4")
	public void setAnnatationDemo4(AnnatationDemo4 annatationDemo4) {
		this.annatationDemo4 = annatationDemo4;
	}

	public AnnatationDemo3 getAnnatationDemo3_v1() {
		return annatationDemo3_v1;
	}

	public void setAnnatationDemo3_v1(AnnatationDemo3 annatationDemo3_v1) {
		this.annatationDemo3_v1 = annatationDemo3_v1;
	}
	
	

	
	
}

package com.demo.core.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnatationConDIDemo {
	
	@Override
	public String toString() {
		return "AnnatationConDIDemo [type=" + type + ", conDIDemo1=" + conDIDemo1 + "]";
	}

	public String getType() {
		return type;
	}

	public AnnatationConDIDemo1 getConDIDemo1() {
		return conDIDemo1;
	}

	@Autowired
	public AnnatationConDIDemo(String type, @Qualifier("annatationConDIDemo1_v1") AnnatationConDIDemo1 conDIDemo1) {
		super();
		this.type = type;//primitive
		this.conDIDemo1 = conDIDemo1;//non primitive
	}

	private String type;
	
	private AnnatationConDIDemo1 conDIDemo1;

}

package com.demo.core.demo;

import javax.annotation.Resource;

public class AnnatationDemo5 {
	
	

	@Override
	public String toString() {
		return "AnnatationDemo5 [type=" + type + ", annatationDemo6=" + annatationDemo6 + "]";
	}

	public AnnatationDemo6 getAnnatationDemo6() {
		return annatationDemo6;
	}

	public void setAnnatationDemo6(AnnatationDemo6 annatationDemo6) {
		this.annatationDemo6 = annatationDemo6;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
	
	@Resource(name="annatationDemo6_v1")
	AnnatationDemo6 annatationDemo6;

}

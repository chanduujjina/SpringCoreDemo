package com.demo.core;

public class XmlDemo3 {
	
	@Override
	public String toString() {
		return "XmlDemo3 [type=" + type + ", xmldemo4=" + xmldemo4 + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public XmlDemo4 getXmldemo4() {
		return xmldemo4;
	}

	public void setXmldemo4(XmlDemo4 xmldemo4) {
		this.xmldemo4 = xmldemo4;
	}

	private String type;
	
	private XmlDemo4 xmldemo4;

}

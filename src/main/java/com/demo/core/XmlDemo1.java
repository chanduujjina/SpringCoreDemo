package com.demo.core;

public class XmlDemo1 {
	
	@Override
	public String toString() {
		return "XmlDemo1 [type=" + type + ", xmlDemo2=" + xmlDemo2 + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public XmlDemo2 getXmlDemo2() {
		return xmlDemo2;
	}

	public void setXmlDemo2(XmlDemo2 xmlDemo2) {
		this.xmlDemo2 = xmlDemo2;
	}

	private String type;
	
	private XmlDemo2 xmlDemo2;

}

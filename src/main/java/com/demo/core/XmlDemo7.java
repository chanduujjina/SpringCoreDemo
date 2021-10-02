package com.demo.core;

public class XmlDemo7 {

	@Override
	public String toString() {
		return "XmlDemo7 [type=" + type + ", xmldemo8=" + xmldemo8 + "]";
	}

	public String getType() {
		return type;
	}

	public XmlDemo8 getXmldemo8() {
		return xmldemo8;
	}

	public XmlDemo7(String type, XmlDemo8 xmldemo8) {
		super();
		this.type = type;
		this.xmldemo8 = xmldemo8;
	}

	private String type;
	
	private XmlDemo8 xmldemo8;

}

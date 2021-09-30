package com.demo.core;

public class Address {
	
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", district=" + district + ", stateName=" + stateName + "]";
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	private String hno;
	
	private String city;
	
	private String district;
	
	private String stateName;

}

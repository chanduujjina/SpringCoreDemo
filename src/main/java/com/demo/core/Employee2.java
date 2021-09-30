package com.demo.core;

public class Employee2 {

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", gender=" + gender + ", unit=" + unit + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public Unit getUnit() {
		return unit;
	}

	public Employee2(int id, String name, String gender, Unit unit) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.unit = unit;
	}

	private int id;
	
	private String name;
	
	private String gender;
	
	private Unit unit;
	
	

}

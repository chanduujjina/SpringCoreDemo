package com.demo.core;

public class Unit {
	
	@Override
	public String toString() {
		return "Unit [unitName=" + unitName + ", description=" + description + "]";
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String unitName;
	
	private String description;

}

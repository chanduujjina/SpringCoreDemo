package com.demo.core;

import java.util.List;
import java.util.Map;

public class Employee {
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", unit=" + unit + ", projectList="
				+ projectList + ", addessList=" + addessList + ", companyClientMap=" + companyClientMap + "]";
	}

	public Map<String, List<String>> getCompanyClientMap() {
		return companyClientMap;
	}

	public void setCompanyClientMap(Map<String, List<String>> companyClientMap) {
		this.companyClientMap = companyClientMap;
	}

	

	public List<String> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<String> projectList) {
		this.projectList = projectList;
	}

	public List<Address> getAddessList() {
		return addessList;
	}

	public void setAddessList(List<Address> addessList) {
		this.addessList = addessList;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	private int id;
	
	private String name;
	
	private String gender;
	
	private Unit unit;
	
	private List<String> projectList;
	
	private List<Address> addessList;
	
	private Map<String,List<String>> companyClientMap;

}

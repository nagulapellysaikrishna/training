package com.model;

import java.util.List;

public class Colleges {
	private String collegeName;
	private int collegeID;
	private String address;
	private List<Departments> department;
	public Colleges() {
		super();
		
	}
	public Colleges(String collegeName, int collegeID, String address, List<Departments> department) {
		super();
		this.collegeName = collegeName;
		this.collegeID = collegeID;
		this.address = address;
		this.department = department;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Departments> getDepartment() {
		return department;
	}
	public void setDepartment(List<Departments> department) {
		this.department = department;
	}
	
}

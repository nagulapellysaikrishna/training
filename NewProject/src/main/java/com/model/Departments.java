package com.model;

public class Departments {
	private String deptName;
	private int deptId;
	private int noOfFaculty;
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departments(String deptName, int deptId, int noOfFaculty) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.noOfFaculty = noOfFaculty;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getNoOfFaculty() {
		return noOfFaculty;
	}
	public void setNoOfFaculty(int noOfFaculty) {
		this.noOfFaculty = noOfFaculty;
	}
	
}

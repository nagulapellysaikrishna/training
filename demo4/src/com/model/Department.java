package com.model;

public class Department {
	private int depId;
	private String depName;
	
	private Employee[] employeeArr;
	
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Employee[] getEmployee() {
		return employeeArr;
	}
	public void setEmployee(Employee[] employee) {
		this.employeeArr = employee;
	}
}

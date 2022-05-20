package com.model;
//POJO plain old java object
public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	
	public Employee(){ 
		empNo = 3;
		empName = "sai";
	}
	public Employee(int empNo, String empName,float salary) { //parameter constructor (constructor overloading)
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}

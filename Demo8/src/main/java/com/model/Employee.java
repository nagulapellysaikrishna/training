package com.model;

public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private int salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}




	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public int compareTo(Employee o) {
		if(age==o.age)  
			return 0;  
			else if(age>o.age)  
			return 1;
			else  
			return -1;  
	}

	
}

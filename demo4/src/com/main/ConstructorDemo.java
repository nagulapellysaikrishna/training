package com.main;

import com.model.Employee;

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getSalary());
		
		Employee employee2 = new Employee(5, "Vishnu", 1456.5f);
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getEmpNo());
		System.out.println(employee2.getSalary());
	}

}

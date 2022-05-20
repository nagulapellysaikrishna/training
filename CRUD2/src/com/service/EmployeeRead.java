package com.service;

import com.model.EmployeModel;

public class EmployeeRead {	
	public static void read(EmployeModel[] employees) {
		for(EmployeModel employee:employees) {
			System.out.println(
					"Name : "+employee.getEmployeName()+ "ID : "+employee.getEmployeeId() + " Employee Salary : "+employee.getSalary());
		}
	}
}
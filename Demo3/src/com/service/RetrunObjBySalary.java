package com.service;

import com.model.Employee;

public class RetrunObjBySalary {
	public Employee[] arrayOfObject(Employee[] employees,int salary) {
		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeSalary()==salary) {
				count++;
			}
		}
		Employee[] employee1 = new Employee[count];
		int count1 = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeSalary()==salary) {
				employee1[count1]=employees[i];
				count1++;
			}
		}
		return employee1;
	}
}

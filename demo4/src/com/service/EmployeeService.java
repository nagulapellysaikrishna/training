package com.service;

import com.model.Employee;

public class EmployeeService {
	public boolean searchByEmployeeId(Employee[] empArray , int id) {
		boolean bool = false;
		for (int i = 0; i < empArray.length; i++) {
			if (id == empArray[i].getEmpNo()) {
				bool = true;
			}
		}
		return bool;
	}
	public Employee[] searchbyemployeename(Employee[] employees,String name) {
		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpName()==name) {
				count++;
			}
		}
		Employee[] employee1 = new Employee[count];
		int count1 = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpName()==name) {
				employee1[count1]=employees[i];
				count1++;
			}
		}
		return employee1;
}
}
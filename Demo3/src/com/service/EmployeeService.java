package com.service;
import java.util.Iterator;

import com.model.Employee;
public class EmployeeService {
	public boolean  searchByEmployeeId(Employee[] empArray , int id) {

		boolean bool = false;
		for (int i = 0; i < empArray.length; i++) {
			if (id == empArray[i].getEmployeeId()) {
				bool = true;
			}
		}
		return bool;
		
	}
	
	public int sumOfSalary(Employee[] empArray) {
		int sum = 0;
		for (int i = 0; i < empArray.length; i++) {
			sum+=empArray[i].getEmployeeSalary();
		}
		return sum;
	}
	
	//greater salary of employee
	public String heightSalary(Employee[] empArray) {
		int great = 0;
		String employeeName="";
		for (int i = 0; i < empArray.length; i++) {
			
			if (empArray[i].getEmployeeSalary() > great) {
				great = empArray[i].getEmployeeSalary(); 
				employeeName = empArray[i].getEmployeeName();
			}
			
		}
		return employeeName;
	}

}

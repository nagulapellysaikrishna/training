package com.service;

import com.model.EmployeModel;

public class EmployeeDelete {
 public void delete(EmployeModel[] employees,int id) {
	 for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeId() == id) {
				employees[i]=null;
			}else {
				System.out.println("Given empoyee is not in the list");
			}
		}
 }

public void delete1(EmployeModel[] employees, int deleteId) {
	 for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeId() == deleteId) {
				employees[i]=null;
			}else {
				System.out.println("Given empoyee is not in the list");
			}
		}
	
}
}

package com.service;

import java.util.ArrayList;

import com.model.EmployeModel;

public class EmployeeRead {	
	

	public void read(ArrayList<EmployeModel> employeelist, int id) {
	for (int i = 0; i < employeelist.size(); i++) {
			
			if (employeelist.get(i).getEmployeeId() == id) {
				System.out.println("Employee Id : "+employeelist.get(i).getEmployeeId());
				System.out.println("Employee Name : "+employeelist.get(i).getEmployeName());
				System.out.println("Employee Salary : "+employeelist.get(i).getSalary());
			}else {
				System.out.println("Given empoyee is not in the list");
			}
	
		
	}
}
}
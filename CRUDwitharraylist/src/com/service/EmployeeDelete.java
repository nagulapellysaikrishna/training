package com.service;

import java.util.ArrayList;

import com.model.EmployeModel;

public class EmployeeDelete {
 public void delete(ArrayList<EmployeModel> employeelist, int id) {
	 for (int i = 0; i < employeelist.size(); i++) {
			if (employeelist.get(i).getEmployeeId() == id) {
				employeelist.remove(i);
			}else {
				System.out.println("Given empoyee is not in the list");
				break;
			}
		}
 }


}

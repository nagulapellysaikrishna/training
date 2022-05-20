package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.EmployeModel;

public class EmployeeUpdate {
	public static void employeeUpdate(ArrayList<EmployeModel> employeelist, int id) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < employeelist.size(); i++) {
			if (employeelist.get(i).getEmployeeId() == id) {
				employeelist.remove(i);
				System.out.print("Enter Employe ID : " );
				int employeeId3 = sc.nextInt();
				System.out.print("Enter Employee Name : " );
				String employeeName3 = sc.next();
				System.out.print("Enter Employee Salary : ");
				float employeeSalary3 =  sc.nextFloat();
				EmployeModel employee3 = new EmployeModel(employeeId3,employeeName3,employeeSalary3);
				employeelist.add(employee3);
			}else {
				System.out.println("Given empoyee is not in the list");
			}
	}
		sc.close();
}
}
package com.service;

import java.util.Scanner;

import com.model.EmployeModel;

public class EmployeeUpdate {
	public static void employeeUpdate(EmployeModel[] employees,int id) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeId() == id) {
				System.out.print("Enter Employe ID : " );
				int employeeId3 = sc.nextInt();
				System.out.print("Enter Employee Name : " );
				String employeeName3 = sc.next();
				System.out.print("Enter Employee Salary : ");
				float employeeSalary3 =  sc.nextFloat();
				EmployeModel employee3 = new EmployeModel(employeeId3,employeeName3,employeeSalary3);
				employees[1]= employee3;
			}else {
				System.out.println("Given empoyee is not in the list");
			}
	}
		sc.close();
}
}
package com.main;
import com.model.*;
import com.service.AddEmployee;
import com.service.EmployeeDelete;
import com.service.EmployeeRead;
import com.service.EmployeeUpdate;

import java.util.Scanner;

public class EmployeeMain {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeModel employeModel = new EmployeModel(0,"admin",0);
			
		EmployeModel[] employees = {employeModel};

		System.out.println("what to what to do : create=1/read=2/update=3/delete=4");
		
		while(sc.hasNextInt()) {
			int operation = sc.nextInt();
			if(operation<1 || operation>4) {
				break;
			}else {
				switch (operation) {
				case 1 :
					System.out.print("Enter Employe ID : " );
					int employeeId1 = sc.nextInt();
					System.out.print("Enter Employee Name : " );
					String employeeName1 = sc.next();
					System.out.print("Enter Employee Salary : ");
					float employeeSalary1 =  sc.nextFloat();
					EmployeModel employeModel1 = new EmployeModel(employeeId1,employeeName1,employeeSalary1);
					employees = AddEmployee.addEmployee(employees, employeModel1);
					break;
					
				case 2:
					
					
					EmployeeRead.read(employees);
					break;
					
				case 3 :
					System.out.print("Which Employee do you want update(employeeId) : ");
					int updateval = sc.nextInt();
					EmployeeUpdate employeeUpdate = new EmployeeUpdate();
					EmployeeUpdate.employeeUpdate(employees,updateval);
					
					break;
				case 4 :
					System.out.print("Which Employee do you want Delete(employeeId) : ");
					int deleteId = sc.nextInt();
					EmployeeDelete employeeDelete  = new EmployeeDelete();
					employeeDelete.delete(employees, deleteId);
					

				default:
					break;
				}
				
			}
		}
		
		
		
	}

}

package com.main;
import com.model.*;
import com.service.EmployeeService;
public class HrApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"Sai",1000f);
//		employee1.setEmpNo(1);
//		employee1.setEmpName("Sai");
//		employee1.setSalary(1000f);
		
		Employee employee2 = new Employee(2,"Krishna",1200f);
		/*
		 * employee2.setEmpNo(2); employee2.setEmpName("Krishna");
		 * employee2.setSalary(1200f);
		 */
		Employee[] employees = new Employee[2]; //one to many relationship
		
		employees[0]=employee1;
		employees[1]=employee2;
		
		
		
		Department department = new Department();
		department.setDepId(11);
		department.setDepName("Development");
		department.setEmployee(employees);
		
		System.out.println("Development TEAM DETAILS");
		
		System.out.println("Department Number : "+department.getDepId());
		System.out.println("Department Name : "+department.getDepName());
		
		Employee[] arrOfEmp = department.getEmployee(); 
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee Number : " +arrOfEmp[i].getEmpNo());
			System.out.println("Employee Name : "+arrOfEmp[i].getEmpName());
		}
		//System.out.println("Employee Number : " +department.getEmployee().length);
		//System.out.println("Employee Name : "+department.getEmployee().length);
		
		Department department2 = new Department();
		department2.setDepId(12);
		department2.setDepName("Testing");
		department2.setEmployee(employees);
		
		System.out.println("TESTEING DEPARTMENT DETAILS");
		
		System.out.println("Department Number : "+department2.getDepId());
		System.out.println("Department Name : "+department2.getDepName());
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee Number : " +employees[i].getEmpNo());
			System.out.println("Employee Name : "+employees[i].getEmpName());
		}
		//System.out.println("Employee Number : " +department2.getEmployee().length);
		//System.out.println("Employee Name : "+department2.getEmployee().length);
		
		EmployeeService employeeService = new EmployeeService();
		 boolean ans = employeeService.searchByEmployeeId(employees, 1);
		 if (ans) {
			 System.out.println("Employee is present");
		 }else {
			 System.out.println("Employee is not present");
		 }
		 // returning emloyee array details
		 Employee[] employee = employeeService.searchbyemployeename(employees, "Sai");
		 for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].getSalary());
		}
		 
		 
		 
		 employee= null;
		 employeeService = null;
		 department2 = null;
		 employees = null;
		 
	}
	
	
	

}

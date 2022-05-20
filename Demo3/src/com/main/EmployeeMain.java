package com.main;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeMain {

		/**
			 * @param args
			 */
	
	/**
		 * @param args
		 */
	
	/**
		 * @param args
		 */
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeName("Sai");
		employee1.setEmployeeId(1);
		employee1.setEmployeeSalary(10000);

		Employee employee2 = new Employee();
		employee2.setEmployeeName("Krishna");
		employee2.setEmployeeId(2);
		employee2.setEmployeeSalary(11000);

		Employee employee3 = new Employee();
		employee3.setEmployeeName("Nani");
		employee3.setEmployeeId(3);
		employee3.setEmployeeSalary(9000);

		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;

		EmployeeService employeeService = new EmployeeService();
		// employee present
		boolean ans = employeeService.searchByEmployeeId(employees, 2);
		if (ans) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is not present");
		}
		// sum of salary
		
		int sumSalary = employeeService.sumOfSalary(employees);
		System.out.println("Sum of Salaries : " + sumSalary);
		
		// highest salary of employee
		String heightSalary = employeeService.heightSalary(employees);
		System.out.println("Height Salary of Employee : " + heightSalary);
		
		
	
		employee1 = null;
		employee2 = null;
		employee3 = null;
	
	}

}

package com.main;
import com.model.Department;
import com.service.DepartmentService;
public class DepartmentMain {

	public static void main(String[] args) {
		Department department = new Department();
		
		department.setDetName("Sai krishna");
		department.setDepId(1);
		department.setDepSalary(30000);
		department.setDepAge(25);
		
		Department department2 = new Department();
		
		department2.setDetName("Jason");
		department2.setDepId(2);
		department2.setDepSalary(45000);
		department2.setDepAge(57);
		
		
		DepartmentService departmentService = new DepartmentService();
		System.out.println("Employe 1 details");
		System.out.println("Employee Name is : " +departmentService.displayDpt(department));//7.return  an object  (Department) 
		System.out.println("Employe 2 details");
		System.out.println("Employee Name is : " +departmentService.displayDpt(department2));
	}
	

}

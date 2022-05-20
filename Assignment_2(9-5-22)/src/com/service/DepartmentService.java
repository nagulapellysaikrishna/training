package com.service;
import com.model.Department;


public class DepartmentService {
	
	public String displayDpt(Department dpt) { //6. pass an object as argument 
		System.out.println("Employe Id : "+dpt.getDepId());
		System.out.println("Employe Age : "+dpt.getDepAge());
		return dpt.getDetName(); //7.return  an object  (Department) 
		
	}
	//8.highest salary
	public void displayHigherSalary(Department dept1, Department dept2) {
		if (dept1.getDepSalary() < dept2.getDepSalary()) {
			System.out.println("Employee Salary : "+dept2.getDepSalary());//8. display who is drawing higher salary between 2 employees
			//9. display name who  is drawing higher salary between 2 employees 
			System.out.println("Higher Salary in department is : "+dept2.getDetName());
		}else {
			System.out.println("Employee Salary : "+dept1.getDepSalary());
			System.out.println("Higher Salary in department is : "+dept1.getDetName());
		}
	}
	public void displayEligibleToWork (Department age) {
		if (age.getDepAge()>=18 && age.getDepAge()<=58 ) {
			System.out.println("Eligible to work ");
		}else {
			System.out.println("Not Eligible to work ");
		}
	}
	
}

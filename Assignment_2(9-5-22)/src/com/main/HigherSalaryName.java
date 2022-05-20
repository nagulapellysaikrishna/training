//8.display name who  is drawing higher salary between 2 employees  
//9.display who is drawing higher salary between 2 employees 

package com.main;
import com.service.DepartmentService;
import com.model.Department;

public class HigherSalaryName {
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
		departmentService.displayHigherSalary(department,department2);
	}

}

package com.main;
import com.model.Employee;
import com.service.RetrunObjBySalary;

public class ArrayOfObjectMain {

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
		employee3.setEmployeeSalary(10000);

		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		RetrunObjBySalary retrunObjBysalary = new RetrunObjBySalary();
		
		Employee[] salaryArr = retrunObjBysalary.arrayOfObject(employees, 10000);
		for (int i = 0; i < salaryArr.length; i++) {
			System.out.println(salaryArr[i].getEmployeeName());
		} 
		
	}

}

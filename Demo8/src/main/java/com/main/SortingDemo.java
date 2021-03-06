package com.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.model.Employee;
public class SortingDemo {

	public static void main(String[] args) {
		
		
		
		
		Employee employee1 = new Employee("Sai", 15, 5000);
		Employee employee2 = new Employee("Krishna",19,600);
		Employee employee3 = new Employee("Vijay", 14, 5000);
		Employee employee4 = new Employee("Mani", 16, 1500);
		
		
		Employee[] employees = new Employee[4];
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		employees[3]=employee4;
		Arrays.sort(employees);
		for (int i = 0; i < employees.length; i++) {
			System.out.println("After Sort Name : "+employees[i].getName() );
		}
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		
		
		for (Employee employee : set) {
			System.out.println(employee.getName());
		}
		
		
		
	}

}

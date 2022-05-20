package com.main;

import java.util.HashMap;
import java.util.Map;

import com.model.Employee;

public class MapDemo{

	public static void main(String[] args) {
		Employee employee1 = new Employee("Sai", 15, 5000);
		Employee employee2 = new Employee("Krishna",19,600);
		Employee employee3 = new Employee("Vijay", 14, 5000);
		Employee employee4 = new Employee("Mani", 16, 1500);
		
		Map<String, Employee> map = new HashMap<String,Employee>();
		map.put("SAI", employee1);
		map.put("Krishna", employee1);
		map.put("Vijay", employee1);
		map.put("Mani", employee1);
		
		Employee sai = map.get("SAI");
		for (Map.Entry<String,Employee> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}

}

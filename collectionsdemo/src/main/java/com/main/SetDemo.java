package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Address;
import com.model.Department;


public class SetDemo {


	public static void main(String[] args) {
		Department department1 = new Department(10, "Developement");
		Department department2 = new Department(11, "TESTING");
		Department department3 = new Department(12, "CLOUD");
		Department department4 = new Department(13, "ADMIN");
		
		Address address1 = new Address(12, "2nd", "Chennai");
		Address address2 = new Address(121, "3rd", "Hyderbad");
		Address address3 = new Address(127, "4th", "CHennai");
		Address address4 = new Address(129, "5th", "Hyderbad");
		
		
		Set set = new HashSet();
		System.out.println("set size : "+set.size());
		set.add(department1);
		set.add(department2);
		set.add(department3);
		set.add(department4);
		
		
		
		set.add(address1);
		
		System.out.println("set size after add : "+set.size());
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			 Object Object = (Object) iterator.next();
			 if (Object instanceof Department) {
					Department new_name = (Department) Object;

					System.out.println(new_name.getDepId());
					System.out.println(new_name.getDepName());
				}
			 
			 if (Object instanceof Address) {
					Address new_name1 = (Address) Object;

					System.out.println(new_name1.getDoorNo());
					System.out.println(new_name1.getStreet());
					System.out.println(new_name1.getCity());
				}
		}

	}

}

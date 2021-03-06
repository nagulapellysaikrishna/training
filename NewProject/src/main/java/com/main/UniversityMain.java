package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Colleges;
import com.model.Departments;
import com.model.University;

public class UniversityMain {
	public static void main(String[] args) {
		Departments department1 = new Departments("CIVIL", 1, 200);
		Departments department2 = new Departments("CSE", 2, 150);
		
		List<Departments> geethanjalilistDep = new ArrayList();
		geethanjalilistDep.add(department2);
		geethanjalilistDep.add(department1);
		
		
		Departments department3 = new Departments("MECH", 2, 56);
		Departments department4 = new Departments("EEE", 4, 178);
		
		List<Departments> tkrlistDep = new ArrayList<Departments>();
		tkrlistDep.add(department3);
		tkrlistDep.add(department4);
		
		Colleges college1 = new Colleges("TKR", 476,"Hyderbad" , tkrlistDep);
		Colleges college2 = new Colleges("Geethanjali", 486,"Hyderbad" , geethanjalilistDep);
		
		
		List<Colleges> collegeslist = new ArrayList<Colleges>();
		collegeslist.add(college1);
		collegeslist.add(college2);
		
		University university = new University("JNTUH", collegeslist);
		
		List<University> universityList = new ArrayList<University>();
		universityList.add(university);
		
		
		for (University university2 : universityList) {
			for (Colleges colleges :university2.getColleges()) {
				System.out.println(colleges.getCollegeID());
				
			}
		}
		
	}
}

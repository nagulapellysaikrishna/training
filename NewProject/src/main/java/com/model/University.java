package com.model;

import java.util.List;

public class University {
	private String universityName;
	private List<Colleges> colleges;
	public University(String universityName, List<Colleges> colleges) {
		super();
		this.universityName = universityName;
		this.colleges = colleges;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public List<Colleges> getColleges() {
		return colleges;
	}
	public void setColleges(List<Colleges> colleges) {
		this.colleges = colleges;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
}

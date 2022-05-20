package com.model;

import java.util.Set;

public class Department {
	private int depId;
	private String depName;
	
	//one to many
	private Set var;
	public Set getVar() {
		return var;
	}
	public void setVar(Set var) {
		this.var = var;
	}
	public Department() {
		super();
		
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Department(int depId, String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}
}

package com.model;

public class Coins {
	private int oneRupee;
	private int twoRupee;
	private int fiveRupee;
	private int tenRupee;
	public Coins() {
		super();
		
	}
	public Coins(int oneRupee, int twoRupee, int fiveRupee, int tenRupee) {
		super();
		this.oneRupee = oneRupee;
		this.twoRupee = twoRupee;
		this.fiveRupee = fiveRupee;
		this.tenRupee = tenRupee;
	}
	public int getOneRupee() {
		return oneRupee;
	}
	public void setOneRupee(int oneRupee) {
		this.oneRupee = oneRupee;
	}
	public int getTwoRupee() {
		return twoRupee;
	}
	public void setTwoRupee(int twoRupee) {
		this.twoRupee = twoRupee;
	}
	public int getFiveRupee() {
		return fiveRupee;
	}
	public void setFiveRupee(int fiveRupee) {
		this.fiveRupee = fiveRupee;
	}
	public int getTenRupee() {
		return tenRupee;
	}
	public void setTenRupee(int tenRupee) {
		this.tenRupee = tenRupee;
	}
	
}

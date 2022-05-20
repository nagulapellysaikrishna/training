package com.model;

import java.awt.List;


public class Wallet {
	private Coins coin;
	private Notes notes;
	private String name;
	public Wallet() {
		super();
		
	}
	public Coins getCoin() {
		return coin;
	}
	public void setCoin(java.util.List coinset) {
		this.coin = (Coins) coinset;
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wallet(Coins coin, Notes notes, String name) {
		super();
		this.coin = coin;
		this.notes = notes;
		this.name = name;
	}
	

}

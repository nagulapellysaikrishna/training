package com.model;

import java.util.Set;

public class Wallet {
	private Set coins;
	private Set notes;
	private String walletName;
	public Wallet() {
		super();
	}
	public Wallet(Set coins, Set notes, String walletName) {
		super();
		this.coins = coins;
		this.notes = notes;
		this.walletName = walletName;
	}
	public Set getCoins() {
		return coins;
	}
	public void setCoins(Set coins) {
		this.coins = coins;
	}
	public Set getNotes() {
		return notes;
	}
	public void setNotes(Set notes) {
		this.notes = notes;
	}
	public String getWalletName() {
		return walletName;
	}
	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	
	

}

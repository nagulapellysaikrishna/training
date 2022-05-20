package com.model;

import java.util.Set;

public class Wallet {
	private Coins coins;
	private Notes notes;
	private String walletName;
	public Wallet() {
		super();
	}
	public Wallet(Coins coins, Notes notes, String walletName) {
		super();
		this.coins = coins;
		this.notes = notes;
		this.walletName = walletName;
	}
	
	public Coins getCoins() {
		return coins;
	}
	public void setCoins(Coins coins) {
		this.coins = coins;
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	public String getWalletName() {
		return walletName;
	}
	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	

}

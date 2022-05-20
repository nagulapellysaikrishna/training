package com.services;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import com.model.Coins;
import com.model.Wallet;

public class CalculationOfWallet {
	public static void addCoins(Set<Wallet> walletSet1) {
		int sumOfCoins = 0;
		for (Wallet wallet1 : walletSet1) {
			sumOfCoins+= wallet1.getCoins().getOneRupee()*1;
			sumOfCoins += wallet1.getCoins().getTwoRupee()*2;
			sumOfCoins += wallet1.getCoins().getFiveRupee()*5;
			sumOfCoins += wallet1.getCoins().getTenRupee()*10;
		}
		System.out.println("Sum of Coins in a Wallet is : "+sumOfCoins);
	}
	public static void addNotes(Set<Wallet> walletSet1) {
		int sumOfNotes = 0;
		for (Wallet wallet1 : walletSet1) {
			sumOfNotes+= wallet1.getNotes().getFiveRupeeNote()*5;
			sumOfNotes += wallet1.getNotes().getTenRupeeNote()*10;
			sumOfNotes += wallet1.getNotes().getHunderedRupeeNote()*100;
			sumOfNotes += wallet1.getNotes().getFivehundredRupeeNote()*500;
			sumOfNotes += wallet1.getNotes().getTwoHunderedRupeeNote()*200;
		}
		System.out.println("Sum of Notes in a Wallet is : "+sumOfNotes);
	}
	public static void sumOfAmount(Set<Wallet> walletSet1) {
		int sumOfNotes = 0;
		for (Wallet wallet1 : walletSet1) {
			sumOfNotes+= wallet1.getNotes().getFiveRupeeNote()*5;
			sumOfNotes += wallet1.getNotes().getTenRupeeNote()*10;
			sumOfNotes += wallet1.getNotes().getHunderedRupeeNote()*100;
			sumOfNotes += wallet1.getNotes().getFivehundredRupeeNote()*500;
			sumOfNotes += wallet1.getNotes().getTwoHunderedRupeeNote()*200;
		}
		int sumOfCoins = 0;
		for (Wallet wallet1 : walletSet1) {
			sumOfCoins+= wallet1.getCoins().getOneRupee()*1;
			sumOfCoins += wallet1.getCoins().getTwoRupee()*2;
			sumOfCoins += wallet1.getCoins().getFiveRupee()*5;
			sumOfCoins += wallet1.getCoins().getTenRupee()*10;
		}
		System.out.println("Sum of total Amount : "+(sumOfCoins+sumOfNotes));
		
	}
	
}

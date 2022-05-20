package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Coins;
import com.model.Notes;
import com.model.Wallet;
import com.services.CalculationOfWallet;

public class WalletMain {

	public static void main(String[] args) {
		
		Coins coins1 = new Coins(2, 5, 2, 2);
		Coins coins2 = new Coins(4, 7, 7, 1);
		
		Notes notes1 = new Notes(1, 2, 1, 1, 0, 2);
		Notes notes2 = new Notes(2, 1, 5, 4, 2, 0);
		
		
		
		Set<Wallet> walletSet= new HashSet();
		
		Set<Coins> coinset = new HashSet();
		
		Set<Notes> noteSet = new HashSet();
		
		Set<Wallet> walletSet1 = new HashSet();
		
		Wallet wallet = new Wallet(coins2, notes2, null);
		coinset.add(coins1);
		coinset.add(coins2);
		
		noteSet.add(notes1);
		noteSet.add(notes2);
		
		walletSet1.add(wallet);
		
		
		CalculationOfWallet.addCoins(walletSet1);
		CalculationOfWallet.addNotes(walletSet1);
		CalculationOfWallet.sumOfAmount(walletSet1);
	}

}

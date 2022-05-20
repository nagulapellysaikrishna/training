package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.model.Coins;
import com.model.Notes;
import com.model.Wallet;
import com.services.CalculationOfAmount;


public class WalletMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Coins coins1 = new Coins(2, 5, 2, 2);
		Coins coins2 = new Coins(4, 7, 7, 1);

		Notes notes1 = new Notes(1, 2, 1, 1, 0, 2);
		Notes notes2 = new Notes(2, 1, 5, 4, 2, 0);

		List coinset = new ArrayList();

		List noteSet =new ArrayList();

		List walletSet1 =new ArrayList();

		coinset.add(coins1);
		coinset.add(coins2);

		noteSet.add(notes1);
		noteSet.add(notes2);

		walletSet1.add(coinset);

		walletSet1.add(noteSet);
		
		
		Wallet wallet =new Wallet();
		wallet.setCoin(coinset);
		wallet.setNotes((Notes) noteSet);
		
		
		walletSet1.add(wallet);
		CalculationOfAmount.addCoins(walletSet1);
		CalculationOfAmount.addNotes(walletSet1);
	}

}

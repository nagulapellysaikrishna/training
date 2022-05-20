package com.services;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.model.Coins;
import com.model.Notes;
import com.model.Wallet;

public class CalculationOfAmount {
	public static void addCoins(List walletSet1) {
		int sum = 0;
		for (Iterator iterator = walletSet1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Set) {
				Set new_name = (Set) object;
				for (Iterator iterator2 = new_name.iterator(); iterator2.hasNext();) {
					Object object1 = (Object) iterator2.next();
					if (object1 instanceof Coins) {
						Coins new_name1 = (Coins) object1;
						sum+=new_name1.getOneRupee()*1;
						sum+=new_name1.getTwoRupee()*2;
						sum+=new_name1.getFiveRupee()*5;
						sum+=new_name1.getTenRupee()*10;
					}
				}
			}
		}System.out.println("Sum of coins in a Wallet : "+sum);
	}
	public static void addNotes(List walletSet1) {
		int sum = 0;
		for (Iterator iterator = walletSet1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Set) {
				Set new_name = (Set) object;
				for (Iterator iterator2 = new_name.iterator(); iterator2.hasNext();) {
					Object object1 = (Object) iterator2.next();
					if (object1 instanceof Notes) {
						Notes new_name1 = (Notes) object1;
						sum+=new_name1.getFiveRupeeNote()*5;
						sum+=new_name1.getTenRupeeNote()*10;
						sum+=new_name1.getFiftyRupeeNote()*50;
						sum+=new_name1.getHunderedRupeeNote()*100;
						sum+=new_name1.getTwoHunderedRupeeNote()*200;
						sum+=new_name1.getFivehundredRupeeNote()*200;
					}
				}
			}
		}System.out.println("Sum of notes in a Wallet : "+sum);
	}
}

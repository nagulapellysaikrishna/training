package com.service;

public class BussinessLogic {
	public int search(int[] searchArray, int searchElement) {
		int count = 0;
		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == searchElement) {
				count += 1;
			}
		}
		return count;
	}

	public int sum(int[] searchArray) {
		int sum = 0;
		for (int i = 0; i < searchArray.length; i++) {
			sum += searchArray[i];
		}
		return sum;
	}
	
	//greater number in array 
	public int greater(int[] searchArray) {
		int great = 0;
		for (int i : searchArray) {
			if (great > i) {
				great=i;
			}
			
		} return great;
	}
}

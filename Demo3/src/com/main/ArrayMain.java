package com.main;

import com.service.BussinessLogic;

public class ArrayMain {

	public static void main(String[] args) {
		//int[] intArray = {1,2,3,4,3};
		int[] intArray = new int[4];
		
		BussinessLogic bussinessLogic = new BussinessLogic();
		//search of value
		int val = bussinessLogic.search(intArray, 3);
		System.out.println("Count of number in Array : "+val);
		int sum = bussinessLogic.sum(intArray); //sum of values
		System.out.println("Sum of Values in Array : "+sum);
		}
	}


package com.main;

import com.model.Calculator;
import com.model.MyCalculator;

public class CalApp {

	public static void main(String[] args) {
		Calculator calculator = new MyCalculator();
		int val = calculator.add(4, 5);
		System.out.println("Addition of 2 no :"+val);
		int result = calculator.sub(9, 4);
		System.out.println("Subtraction of 2 no :" +result);
		
		MyCalculator mycalculator = new MyCalculator();
		mycalculator.mutliply(val, result);
		
		
		
	}

}

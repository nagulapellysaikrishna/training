package com.service;
import com.model.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int addtion = calculator.add(12, 25);
		int subtraction = calculator.sub(52, 250);
		int mutlipy = calculator.mul(12, 6);
		int division = calculator.div(25, 5);
		System.out.println("Sum of the two numbers: "+addtion);
		System.out.println("Sub of the two numbers: "+subtraction);
		System.out.println("Multiply of two numbers: "+mutlipy);
		System.out.println("division of two numbers: "+division);
	}

}

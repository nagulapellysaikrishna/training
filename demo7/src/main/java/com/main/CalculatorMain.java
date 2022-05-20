package com.main;

import com.expections.ManualExpections1;
import com.service.CalaculatorServiceImpl;
import com.service.CalculatorService;

public class CalculatorMain {

	public static void main(String[] args) {

		int num1 = 16;
		int num2 = 4;
		CalculatorService calculatorService = new CalaculatorServiceImpl();
		System.out.println(calculatorService.remainder(num1, num2));
		
	
	}

}

package com.service;

import com.expections.ManualExpections1;

public class CalaculatorServiceImpl implements CalculatorService {
	ManualExpections1 m = new ManualExpections1();
	@Override
	public int add(int num1, int num2) {
		int result = 0;
		try {
			if (num1<0 || num2<0) {
				m.add();
			}else {
				result = num1+num2;
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		
		return num1-num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		
		return num1*num2;
	}

	@Override
	public int division(int num1, int num2) {
		int result = 0;
		try {
			if (num1 <1 || num2<1) {
				m.method();
				
			}else {
				result = num1/num2;
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int remainder(int num1, int num2) {
	
		return num1%num2;
	}

}

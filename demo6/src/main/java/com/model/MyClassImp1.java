package com.model;

public class MyClassImp1 implements InterfaceOne, InterfaceTwo {

	//public MyClassImp1() {
		// TODO Auto-generated constructor stub
	//}

	@Override
	public int sub(int num1, int num2) {
		
		return (num1-num2);
	}

	@Override
	public int add(int num1, int num2) {
		return (num1+num2);
	}

}

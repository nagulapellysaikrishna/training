package com.main;

import com.model.MyinterfaceImp1;

public class MainApp {
 public static void main(String[] args) {
	//interfacename var = new InterfaceImp1()
	 MyinterfaceImp1 myInterface = new MyinterfaceImp1();
	 System.out.println("Addition : "+myInterface.add(4,6));
	 System.out.println("Subtraction : "+myInterface.sub(4,6));
	 System.out.println("Mutiplication : "+myInterface.multiply(4,6));
	 System.out.println("Divison : "+myInterface.div(4,6));
	
	 System.out.println("Remainder : "+myInterface.remainder(4,6));	
	 System.out.println("Square root : "+myInterface.cubrt(27,3));
 }
}

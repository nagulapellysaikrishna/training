package com.expections;


public class ManualExpections1{
	 public void method()throws ArithmeticException {
	  throw new ArithmeticException("Number must be great than 1");
	 }
	 public void add()throws ArithmeticException {
		  System.out.println("Number must be great than 1");
		 }
	}


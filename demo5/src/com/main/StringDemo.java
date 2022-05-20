package com.main;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Good";
		System.out.println("Length String is : "+str1.length());
		System.out.println("Length String is : "+str2.length());
		
		if (str1 == str2) {
			System.out.println("They are same");
		}else {
			System.out.println("They are not same");
		}
	}
}

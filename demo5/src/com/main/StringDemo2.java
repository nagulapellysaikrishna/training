package com.main;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = new String("Happy");
		//System.out.println("Length String is : "+str1.length());
		//String str2 = new String("Good");
		//System.out.println("Length String is : "+str2.length());
		char[]  a = str1.toCharArray();
		String res = "";
		for (int i = 0; i < a.length; i++) {
			res = a[i]+res;
		}
		System.out.println(res);
		/*
		 * if (str1.equals(str2)) { System.out.println("They are same"); }else {
		 * System.out.println("They are not same"); }
		 */
		str1 = null;
		//str2=null;
	}
	
}

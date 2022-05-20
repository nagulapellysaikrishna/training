package com.main;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Happy");
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());
		stringBuffer = null;
	}

}

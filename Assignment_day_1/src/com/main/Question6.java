package com.main;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Letter : ");
		char c = sc.next().charAt(0);
		int asciValue = c;
		sc.close();
		System.out.println("ASCII VALUE OF GIVEN LETTER IS "+asciValue);
	}

}

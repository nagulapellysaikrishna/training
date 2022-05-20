package com.main;

import java.util.Scanner;
//4. Write a Java program to swap two variables.
public class Question4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Second Number : ");
		int secondNumber = sc.nextInt();
		sc.close();
		
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("SWAP NUMBERS");
		System.out.println("first Number : "+firstNumber);
		System.out.println("Second Number : "+secondNumber);
		
	}

}

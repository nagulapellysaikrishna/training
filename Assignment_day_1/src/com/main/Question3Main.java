package com.main;

import java.util.Scanner;

public class Question3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Second Number : ");
		int secondNumber = sc.nextInt();
		System.out.print("Third Number : ");
		int thirdNumber = sc.nextInt();
		
		float ans = (firstNumber + secondNumber + thirdNumber )/3;
		System.out.println("Average of three numbers : "+ans);
		sc.close();
	}

}

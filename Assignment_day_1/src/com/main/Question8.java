package com.main;

import java.util.Scanner;

import com.service.question8service;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if (question8service.checkSum(n) % 2 == 0) {
			System.out.println("Sum of odd digits is even");

		}else {
			System.out.println("Sum of odd digits is odd");
		}
		sc.close();

	}
}

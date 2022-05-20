package com.main;

import java.util.Scanner;

import com.service.question9service;

public class question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = question9service.sumOfSquaresOfEvenDigits(n);
		System.out.println("sum of squares of even digits : "+ans);
	}

}

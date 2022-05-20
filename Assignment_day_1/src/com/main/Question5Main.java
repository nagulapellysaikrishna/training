package com.main;

//import java.util.Iterator;
import java.util.Scanner;

public class Question5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number : ");
		int number = sc.nextInt();
		sc.close();
		int count =0;
		for (int i = 0; i < number; i++) {
			for (int j = 2; j < i; j++) {
				if (number%j == 0) {
					count++;
				}
			}
		}
		if (count==0) {
			System.out.println("GIVEN NUMBER IS PRIME NUMBER");
		}else {
			System.out.println("GIVEN NUMBER IS NOT PRIME NUMBERS");
		}
	}

}

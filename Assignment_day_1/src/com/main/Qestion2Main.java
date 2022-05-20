package com.main;
import com.service.Question2Sevice;
import java.util.Scanner;

public class Qestion2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Second Number : ");
		int secondNumber = sc.nextInt();
		
		Question2Sevice ans = new Question2Sevice();
		System.out.println("Sum of two numbers :"+ans.add(firstNumber, secondNumber));
		System.out.println("Difference of two numbers :"+ans.sub(firstNumber, secondNumber));
		System.out.println("Mutliply of two numbers : "+ans.mutlipy(firstNumber, secondNumber));
		System.out.println("Division of two numbers : "+ans.division(firstNumber, secondNumber));
		System.out.println("Reaminder of two numbers : "+ans.remainder(firstNumber, secondNumber));
		sc.close();
	}

}

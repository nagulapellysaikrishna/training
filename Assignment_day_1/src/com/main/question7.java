package com.main;

public class question7 {

	public static void main(String[] args) {
		int a = 100;
		for (int i = 1; i < a; i++) {
			if(i%3==0) {
				System.out.println(i+" : Fizz");
				if (i%3==0 && i%5==0) {
					System.out.println(i+" : FizzBuzz");
			}
			}else if(i%5==0) {
				System.out.println(i+" : Buzz");
				
			}
			
		}
	}
}

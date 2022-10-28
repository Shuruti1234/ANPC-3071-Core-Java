package com.demo;

import java.util.Scanner;

public class MathematicalOpr {

	private static void printFactorial(int num) {

		long fact = 1;
		for (int i = num; i > 1; i--) {
			fact = fact * i;
			System.out.print(fact + " ");

		}
		System.out.println("The factorial is :" + fact);
		System.out.println();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.print(fact + " ");

		}
		System.out.println("The factorial is :" + fact);

	}

	private static void checkPrime(int num) {

		boolean flag = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number ");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number ");
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(num + "  is a prime number");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = sc.nextInt();
		printFactorial(number);
		checkPrime(number);

		sc.close();

	}

}

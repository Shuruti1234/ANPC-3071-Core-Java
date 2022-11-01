/*
 * Program
 * @Author
 * @date
 */
package com.demo;

import java.util.Scanner;

//declaring a class
public class PalindromeExample {

	// method to check number is palindrome
	static void checkPalindrome(int number) {

		int remainder = 0;
		int reversedNumber = 0; // to store the reversed number
		int temp = number; // copy of original number

		// calculating the reverse number
		while (number > 0) {
			remainder = number % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
			number = number / 10;
		}
		// end of while loop

		// comparing original and reversed number
		if (reversedNumber == temp)

			System.out.println(temp + " is a palindrome");

		else
			System.out.println(temp + " is not a palindrome");

	}

	// end of method

// main method
	public static void main(String[] args) {

		// creating scanner object
		Scanner sc = new Scanner(System.in);
		int originalNumber;

		// taking input
		System.out.println("Enter a number:");
		originalNumber = sc.nextInt();

		// calling checkPalindrome
		checkPalindrome(originalNumber);

		sc.close();

	}

	// main ends

}
//class ends
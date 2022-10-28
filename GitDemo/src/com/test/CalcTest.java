package com.test;

import java.util.Scanner;

import com.demo.Calculator;

public class CalcTest {

	static void menu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter choice :");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;

		float number1, number2, result = 0.0f;

		do {
			System.out.println("Enter first number:");
			number1 = sc.nextFloat();

			System.out.println("Enter second number:");
			number2 = sc.nextFloat();

			menu();

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				result = Calculator.addition(number1, number2);
				break;
			case 2:
				result = Calculator.subtraction(number1, number2);
				break;
			case 3:
				result = Calculator.multiplication(number1, number2);
				break;
			case 4:
				result = Calculator.division(number1, number2);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid input.........");

			}

			System.out.println("The Result is:" + result);
			System.out.println("-----------------------------------");
			System.out.println("Do you want to perform more operation(1=yes/0=no)");
			choice = sc.nextInt();

		} while (choice == 1);

		sc.close();

	}

}

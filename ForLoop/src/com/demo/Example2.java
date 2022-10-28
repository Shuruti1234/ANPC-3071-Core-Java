package com.demo;

public class Example2 {

	static void printEven() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// end if
		}
		// end for loop
	}

	static void infiniteLoop() {
		// infinite for loop
		for (;;) {
			System.out.println("Hello");

		}
	}

	private static void printTable(int num) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printEven();

		printTable(Integer.parseInt(args[0]));

		// infiniteLoop();
	}

}

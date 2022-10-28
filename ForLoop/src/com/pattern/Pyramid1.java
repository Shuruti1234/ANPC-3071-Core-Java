package com.pattern;

public class Pyramid1 {

	// 1
	// 1 2
	// 1 2 3 pattern
	static void pattern1(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
		}
	}

	// 1 2 3
	// 1 2
	// 1

	static void pattern2(int num) {
		for (int i = num; i >= 1; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(6);
		System.out.println("--------------------------------------------");
		pattern2(5);

	}

}

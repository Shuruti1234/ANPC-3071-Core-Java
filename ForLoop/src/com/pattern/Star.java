package com.pattern;

public class Star {

	static void starpattern(int rows) {
		int j;
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			// inner loop for spaces
			for (j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}
		// outer loop ends
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starpattern(9);

	}

}

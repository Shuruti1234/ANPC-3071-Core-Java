package com.demo;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// outer for loop
		outer: for (int i = 1; i <= 3; i++) {
			System.out.println();
			// inner for loop
			for (int j = 1; j <= 3; j++) {
				if (i == j)
					continue outer; // labelled break
				System.out.print(j + " ");

			}
		}
		// end of inner loop

	}
	// end of outer loop

}

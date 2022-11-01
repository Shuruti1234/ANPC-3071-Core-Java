/*
 * 
 */
package com.demo1;

import java.util.Scanner;

//declaring class
public class SBIBank {

	// method to display options
	static void menu() {

		System.out.println("1. Create an account");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw money");
		System.out.println("4. Display Bank details");
		System.out.println("5. Exit");
		System.out.println("Enter Choice:");

	}

//main method
	public static void main(String[] args) {

		// creating an object of account
		Account a1 = new Account();

		// creating Scanner Object
		Scanner sc = new Scanner(System.in);

		// decalring variable
		int ch = 0;

		// creating a loop
		do {
			// calling menu
			menu();
			// taking user choice
			ch = sc.nextInt();

			// switch case
			switch (ch) {
			case 1:
				// to enter details
				System.out.println("enter the details:");
				System.out.println("Account ID:");
				int id = sc.nextInt();
				System.out.println("Accountant Name:");
				String name = sc.next();
				System.out.println("Starting balance:");
				double bal = sc.nextDouble();
				if (bal > 2000) {
					System.out.println("PanCard Number:");
					String pan = sc.next();
					a1.enterBankDetails(id, name, bal, pan);
				} else
					a1.enterBankDetails(id, name, bal);
				break;

			case 2:
				// to deposit money
				System.out.println("enter the amount to be deposited:");
				double amount = sc.nextDouble();
				System.out.println("Balance :" + a1.depositMoney(amount));
				break;
			case 3:
				// to withdraw money
				System.out.println("enter the amount to be withdrawn:");
				amount = sc.nextDouble();
				System.out.println("Balance :" + a1.withdraw(amount));
				break;

			case 4:
				// to print bank details
				a1.printBankDetails();
				break;
			case 5:
				// to exit
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input .........");
			}
			// switch case ends

			// taking input for more operations
			System.out.println("Do you want to perform more operation:(1-yes/0-no)");
			ch = sc.nextInt();

		} while (ch == 1);
		// do while ends

		sc.close();

	}
	// main ends

}
//class ends

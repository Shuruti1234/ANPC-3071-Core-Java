package com.demo1;

//declaring a account class
public class Account {

	// instance variables
	private int accID;
	private String accName;
	private double balance;
	private String panNumber;

	// method to enter bank details
	void enterBankDetails(int id, String name, double bal, String pan) {

		System.out.println("In method 1");
		accID = id;
		accName = name;
		balance = bal;
		panNumber = pan;

	}

	void enterBankDetails(int id, String name, double bal) {

		System.out.println("Method 2");

		accID = id;
		accName = name;
		balance = bal;

	}

	// method to deposit
	double depositMoney(double amount) {
		balance += amount;
		System.out.println("Amount deposited........");
		return balance;
	}

	// method to withdraw
	double withdraw(double amount) {

		// local variable
		double tempBalance = balance;
		tempBalance = tempBalance - amount;

		// condition to check wether we have sufficient balance
		if (tempBalance > 500) // min balance is 500
		{
			balance = tempBalance;
			System.out.println("Withdrawal successfull...........");
		} else
			System.out.println("Your balance is low....");

		return balance;
	}

	// printDetails
	void printBankDetails() {
		System.out.println("Account ID:" + accID);
		System.out.println("Account Name:" + accName);
		System.out.println("Balance :" + balance);
	}

	// to get Pan Number

	String getPanNumber() {

		return panNumber;

	}

}

package com.employee;

public class MyCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.enterDetails(101, "Sonali", 78090.50);// loose coupling
		e1.hikeSalary();
		Employee e2 = new Employee();
		e2.enterDetails(102, "Pranjal", 90876.80);
		e2.hikeSalary(20);

		System.out.println("--------------------------------------");
		e1.printDetails();
		System.out.println("--------------------------------------");
		e2.printDetails();

	}

}

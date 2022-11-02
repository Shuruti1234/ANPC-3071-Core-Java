package com.employee;

public class Employee {

	private int eid;
	private String name;
	private double salary;
	float rate = 5.0f;

	void enterDetails(int id, String n, double sal) {
		eid = id;
		name = n;
		salary = sal;

	}

	void printDetails() {
		System.out.println("Employee Name:" + name);
		System.out.println("Salary:" + salary);
	}

	void hikeSalary() {
		System.out.println("Normal hike.....");
		salary = salary + ((rate / 100) * salary);
	}

	void hikeSalary(float hikeRate) {
		System.out.println("Custom hike........");
		salary = salary + ((hikeRate / 100) * salary);
	}

}

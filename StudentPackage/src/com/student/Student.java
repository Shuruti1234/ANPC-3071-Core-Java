/*
 * Student Class
 * @Author: Shuruti Singhal
 * @Date:26 Oct 2022
 */

//declaring a package
package com.student;

//declaring a class
public class Student {

	// instance variables
	int sid;
	String name;
	String course;

	// method to get the details
	public void getDetails(int id, String n, String c) {
		sid = id;
		name = n;
		course = c;
	}

	// method for printing details
	public void printDetails() {
		System.out.println("Student Details are:");
		System.out.println("Student ID:" + sid);
		System.out.println("Student Name:" + name);
		System.out.println("Student Course:" + course);

	}

}
//end of class
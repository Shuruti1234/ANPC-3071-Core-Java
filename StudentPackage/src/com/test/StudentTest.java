/*
 * Student Test  Class
 * @Author: Shuruti Singhal
 * @Date:26 Oct 2022
 */

//declaring a package
package com.test;

import java.util.Scanner;

// importing Student package
import com.student.Student;

//declaring a class
public class StudentTest {

	// main method
	public static void main(String[] args) {

		// creating object of Student class
		Student s1 = new Student();
		Student s2 = new Student();

		// declaring an object of Scanner
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int id;
		String name, course;

		// taking input
		System.out.println("Enter the student Name:");
		name = sc.next();
		System.out.println("Enter the student Id:");
		id = sc.nextInt();

		System.out.println("Enter the student Course:");
		course = sc.next();

		// call the method getDetails
		s1.getDetails(id, name, course);

		// taking input
		System.out.println("Enter the student Name:");
		name = sc.next();
		System.out.println("Enter the student Id:");
		id = sc.nextInt();

		System.out.println("Enter the student Course:");
		course = sc.next();

		// call the method getDetails
		s2.getDetails(id, name, course);

		// printDetails()

		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");

		s1.printDetails();

		System.out.println("-------------------------------------");
		s2.printDetails();

		sc.close();

	}

}

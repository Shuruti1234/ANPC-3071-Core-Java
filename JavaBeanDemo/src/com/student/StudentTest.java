package com.student;

public class StudentTest {

	public static void main(String[] args) {

		// tight coupling
		Student s1 = new Student(101, "Sujata", 78.4f);
		Student s2 = new Student(102, "Raunak", 88.7f);
		Student s3 = new Student(103, "Abhishek");

		// to copy values of one object to another : through constructor
		Student s5 = new Student(s3);

		// copy the values
		Student s6 = new Student();
		s6 = s5;

		// loose coupling
		Student s4 = new Student();
		s4.setId(104);
		s4.setStName("Ajit");
		s4.setMarks(87.6f);

		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s5);
		System.out.println(s6);

		System.out.println("Student name:" + s4.getStName());

	}

}

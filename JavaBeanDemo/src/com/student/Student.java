package com.student;

//POJO class: Student
public class Student {

	private int id;
	private String stName;
	private float marks;

	// default constructor
	public Student() {
		// calling the Object class
		super(); // can be omitted

		System.out.println("Default............");

	}

	// parameterised constructor
	public Student(int id, String stName, float marks) {
		super();
		System.out.println("Paramterized 1.............");

		// this refers to current object
		this.id = id;
		this.stName = stName;
		this.marks = marks;
	}

	// parameterised constructor
	public Student(int id, String stName) {
		super();
		System.out.println("Paramterized 2.............");

		this.id = id;
		this.stName = stName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", Name=" + stName + ", Marks=" + marks;
	}

}

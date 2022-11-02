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
		this.id = 0;
		this.stName = "Unknown";
		this.marks = 40.0f;
		System.out.println("Default............");

	}

	// parameterised constructor
	public Student(int id, String stName) {
		this(); // constructor chaining
		System.out.println("Paramterized 1.............");
		this.id = id;
		this.stName = stName;

	}

	// parameterised constructor
	public Student(int id, String stName, float marks) {
		this(id, stName);
		System.out.println("Paramterized 2............");
		// this refers to current object
		this.marks = marks;

	}

	// copy constructor

	public Student(Student s) {
		this.id = s.id;
		this.stName = s.stName;
		this.marks = s.marks;
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

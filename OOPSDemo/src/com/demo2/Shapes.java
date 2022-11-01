package com.demo2;

public class Shapes {

	double area;

	// polymorphsm with number of arguments & type
	void calculateArea(float length, float breadth) {
		area = length * breadth;
		System.out.println("The area of rectangle is:" + area);
	}

	void calculateArea(float side) {
		area = side * side;
		System.out.println("The area of square is:" + area);

	}

	void calculateArea(double radius) {
		area = 3.14 * radius * radius;
		System.out.println("The area of circle is:" + area);

	}
}

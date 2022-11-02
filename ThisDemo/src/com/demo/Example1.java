package com.demo;

public class Example1 {

	private String msg;

	Example1() {

		System.out.println("Welcome To Java");
	}

	Example1(String msg) {
		this(); // calling default constructor
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}

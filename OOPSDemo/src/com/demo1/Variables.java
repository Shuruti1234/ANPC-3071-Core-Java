package com.demo1;

public class Variables {

	int instVariable; // 0
	String strVariable; // null
	static int sm; // 0 belongs to class ...

	public static void main(String[] args) {

		int localVar = 0;
		Variables v1 = new Variables();
		System.out.println(v1.instVariable);
		System.out.println(v1.strVariable);
		System.out.println(localVar);
		System.out.println(sm);

	}
}

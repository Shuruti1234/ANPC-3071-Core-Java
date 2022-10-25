/*
 * This is demo class to test package
 * @author: Shuruti Singhal
 * @Date: 25th Oct
 */

//declaring package
package com.mypack;

// importing the package 
import com.loops.Demo;

//declaring a class to test package demo
public class Test1 {

	//main method
	public static void main(String[] args) {
		
	//creating a object of Demo class	
	Demo obj1 = new Demo();
	
	//calling the method
	// all method should be public 
	obj1.printValue();
	
	//calling static directly with name of class: no object required
	Demo.printMessage();
	

	}
	
	//end of main method

}

//end of class


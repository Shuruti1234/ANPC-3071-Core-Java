/*
Program: WAP to understand variable
@author: Shuruti Singhal
@Date: 21 oct 2022  
*/

//import packages 

//local variable : inside a method
// instance variable: class 
// static : only one copy

import java.util.Scanner;
//declaring a class
class VariableDemo

{
	int age ;// instance variable
	static int year;
		
	//main started
	public static void main(String args[])
	{
     //static int m =90; it can not be made inside a class.
	 
	 // System.out.println(age); we cannot call a non static member from static method
	 
	 System.out.println(year);
		    
	}
		
	// end of main
}
// end of class 



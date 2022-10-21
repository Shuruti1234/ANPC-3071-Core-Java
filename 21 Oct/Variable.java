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
class Variable

{
	int age ;// instance variable
	static int year;
	String name;
		
    // assigned default values 
    // int : 0, float = 0.0f, double =0.0, string = null	
		
	//main started
	public static void main(String args[])
	{
     //static int m =90; it can not be made inside a class.
	 
	 // System.out.println(age); we cannot call a non static member from static method
	 
	 System.out.println(year);// static can be called from static method
	 
	 int local;
	 
	 // to call non static
	 Variable v1= new Variable();
	 System.out.println(v1.age);
	 System.out.println(v1.name);
	 
	  //System.out.println(local); has to be intialized
	  
		    
	}
		
	// end of main
}
// end of class 



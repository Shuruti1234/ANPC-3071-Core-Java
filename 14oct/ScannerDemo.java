/*
Program: To understand the input using Scanner
@author: Shuruti Singhal
@Date: 14 oct 2022  
*/

// importing util package for Scanner Class

 import java.util.Scanner;

//declaring a class
class ScannerDemo
{
	//main method
	public static void main(String args[])
	{
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//declaring and initializing local variables
		System.out.println("Enter your name:");
		String name= sc.next(); // to take string input
		
		///////////////////////////////////////////////////////////////
		
		System.out.println("Enter your age:");
		int age = sc.nextInt(); // to take integer input
		
		///////////////////////////////////////////////////////////////
		
		System.out.println("Enter your marks:");
		float marks = sc.nextFloat(); // to take float input
		
		///////////////////////////////////////////////////////////////
		
		System.out.println("Enter your pass(true/false):");
		boolean pass = sc.nextBoolean(); // to take boolean input
		
		///////////////////////////////////////////////////////////////
		
		System.out.println("Enter your gender(M/F):");
		char gender = sc.next().charAt(0); // to take character input
		
		//printing the values of all the variable
		System.out.println("---------------------------------------------------------------");
		System.out.println("Your details are:");
		System.out.println("Name:"+ name);
		System.out.println("Gender:"+ gender);
		System.out.println("Age:"+ age);
		System.out.println("Marks:"+ marks);
		System.out.println("Pass:"+ pass);
				
	}
	// end of main
}
// end of class ScannerDemo



 

  
   
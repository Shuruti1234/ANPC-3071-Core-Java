/*
Program: WAP to print pass and fail according to the marks
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfDemo
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(weight>=50)
				System.out.println("You can donate the blood....");
		    else
				System.out.println("You are underweight... Please start healthy eating habits");
			//end of nested ifelse
			
		}
		else
			System.out.println("You are too young to donate blood... Please wait!" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 


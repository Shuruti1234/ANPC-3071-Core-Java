/*
Program: WAP to print pass and fail according to the marks
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfDemo3
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		char gender;
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			//taking input
			System.out.println("Enter your gender(m/f):");
		    gender= sc.next().charAt(0);
			
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
			   System.out.println("You can donate the blood....");
   
		     else
				  System.out.println("You cannot donate the blood....Better luck next time");
			   
		}
		else
			System.out.println("You are too young to donate blood... Please wait!" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 


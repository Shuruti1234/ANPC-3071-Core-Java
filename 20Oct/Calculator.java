/*
Program: WAP to perform arithmetic operation
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class Calculator
{
	// method to add 2 numbers
	static void add(float n1, float n2) // formal/dummy arguments
	{	
	
	   float result= n1+n2;
	   System.out.println("The result is :"+result);
	
	  
	}
	//end of method 
	
	// method to add 2 numbers
	static void sub(float n1, float n2) // formal/dummy arguments
	{	
	
	   float result= n1-n2;
	   System.out.println("The result is :"+result);
	
	  
	}
	//end of method 
	
	static void mul(float n1, float n2) // formal/dummy arguments
	{	
	
	   float result= n1*n2;
	   System.out.println("The result is :"+result);
	
	  
	}
	//end of method 
	
	static void div(float n1, float n2) // formal/dummy arguments
	{	
	
	   float result= n1/n2;
	   System.out.println("The result is :"+result);
	
	  
	}
	//end of method 
	
	
	
	//main started
	public static void main(String args[])
	{
	
	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float num1,num2;
		int choice;
		
		// input 2 numbers
		System.out.println("Enter the two numbers:");
		num1= sc.nextFloat();
		num2= sc.nextFloat();
		
		// menu
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Exit ");
		System.out.println("Enter the choice:");
		choice= sc.nextInt();
		//switch case
	   switch(choice)
	   {
		   case 1:add(num1,num2);
		          break;
		   case 2:sub(num1,num2);
		          break;
		   case 3:mul(num1,num2);
		          break;
		   case 4:div(num1,num2);
		          break;
		   case 5:System.exit(0);
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
		
		
	//end of switch case
		
		    
	}
		
	// end of main
}
// end of class 


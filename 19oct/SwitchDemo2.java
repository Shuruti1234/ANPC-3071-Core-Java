/*
Program: WAP to print the remarks according to grade
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class SwitchDemo2
{
	// method to print the remarks
	static void printRemarks(char gr) // formal/dummy arguments
	{	
	
	   //switch case
	   switch(gr)
	   {
		   case 'A':System.out.println("Excellent performance...");
		          break;
		   case 'B':System.out.println("Very Good...");
		          break;
		   case 'C':System.out.println("Good...can do better");
		          break;
		   case 'D':System.out.println("Fair.. Need to work very hard");
		          break;
		   case 'F':System.out.println("Fail... Better luck next time");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	// end of switchcase
	
	  
	}
	//end of method printRemarks
	
	//main started
	public static void main(String args[])
	{
	
	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		char grade;
		System.out.println("Enter the grade:");
		grade= sc.next().charAt(0);
		
		//calling method to print remarks
		printRemarks(grade);	
		    
	}
		
	// end of main
}
// end of class 


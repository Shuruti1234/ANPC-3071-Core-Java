/*
Program: WAP to print the day according to number
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class SwitchDemo
{
	// method to print the day
	static void printDay(int d) // formal/dummy arguments
	{	
	
	   //switch case
	   switch(d)
	   {
		   case 1:System.out.println("Monday");
		          break;
		   case 2:System.out.println("Tuesday");
		          break;
		   case 3:System.out.println("Wednesday");
		          break;
		   case 4:System.out.println("Thursday");
		          break;
		   case 5:System.out.println("Friday");
		          break;
		  case 6:System.out.println("Saturday");
		          break;
		  case 7:System.out.println("Sunday");
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	// end of switchcase
	
	  
	}
	//end of method printDay
	
	//main started
	public static void main(String args[])
	{
	
	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int day;
		System.out.println("Enter the day number:");
		day= sc.nextInt();
		
		//calling method to print day
		printDay(day);
		
	
		
		    
	}
		
	// end of main
}
// end of class 


/*
Program: WAP to print number of days in a month
@author: Shuruti Singhal
@Date: 21 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class MonthDays

{
	//method to print ftype of language
	static void printNoDays(String month)
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		// start of switch
		 switch(month)
	   {
		   //expression level
		   case "january":
           case "march"	:
           case "may":
           case "july":
           case "august":
           case "october":
           case "december": System.out.println("No of days in "+month+ " are 31 days");
                             break;	

           case "april":
           case "june":
           case "september":
           case "november":	System.out.println("No of days in "+month+ " are 30 days");
                             break;		 
           case "february": System.out.println("Enter the year:");
		                    int year= sc.nextInt();
							
							// condition to check leap year
		                     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			                   System.out.println("No of days in "+month+ " are 29 days");  
                             else
                                System.out.println("No of days in "+month+ " are 28 days"); 
                             break;
          default: System.out.println("Month not exists........"); 							 
                             			   
          						
	   } 
	   //end of switch
		
	}	
		
		
	//main started
	public static void main(String args[])
	{
       // switch case with string
	   String input;
	   
	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any month:");
		input= sc.next().toLowerCase();// converting the input to lowercase
	   
	   //calling method
	  printNoDays(input);
	  
	  
		    
	}
		
	// end of main
}
// end of class 


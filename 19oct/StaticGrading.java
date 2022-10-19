/*
Program: WAP to print the grade according to the percentage
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class StaticGrading
{
	// method to calculate grade
	static void calcGrade(float percentage) // formal/dummy arguments
	{	
	  char grade;
		//checking percentage to cal grade
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F'; // assigning

						 
			   			
		//end of ifelse	
        if(grade=='F') // comparing
	      System.out.println("Sorry!! You have failed... Work hard next time");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		   
		
	}
	//end of method calcGrade
	
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float per;
			
		//taking input
		System.out.println("Enter the percentage:");
		percentage= sc.nextFloat();
		
		//calling method 
		calcGrade(per);// actual arguments
		
		    
	}
		
	// end of main
}
// end of class 


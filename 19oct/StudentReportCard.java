/*
Program: WAP to print report card
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class StudentReportCard
{
	
	static void calcPercentage(float m1,float m2, float m3)
	{
		float percentage;
		//calculating percentage
		percentage= ((m1+m2+m3)/300)*100;
		
		//checking the student has cleared the exam or not
		
		//calling method to cal grade
		calcGrade(percentage);
		
		
		//end of ifelse
		
	}
	
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
	      System.out.println("Sorry!! You have failed..");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		

        //calling method to calGrade
		printRemarks(grade);
		
	}
	//end of method calcGrade
		
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
		   case 'F':System.out.println(" Better luck next time");
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
		
		//declaring 3 variables to store marks 
		float marks1,marks2,marks3;
		
		//taking input
		System.out.println("Enter the marks of subject1:");
		marks1= sc.nextFloat();
		System.out.println("Enter the marks of subject2:");
		marks2= sc.nextFloat();
		System.out.println("Enter the marks of subject3:");
		marks3= sc.nextFloat();
		
		//calling methof to calcPercentage
		calcPercentage(marks1,marks2,marks3);
		
		
		    
	}
		
	// end of main
}
// end of class 


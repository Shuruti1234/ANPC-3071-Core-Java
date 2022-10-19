/*
Program: WAP to print pass and fail according to the marks
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class PassFailDemo
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring 3 variables to store marks and percentage
		float marks1,marks2,marks3,percentage;
		
		//taking input
		System.out.println("Enter the marks of subject1:");
		marks1= sc.nextFloat();
		System.out.println("Enter the marks of subject2:");
		marks2= sc.nextFloat();
		System.out.println("Enter the marks of subject3:");
		marks3= sc.nextFloat();
		
		//calculating percentage
		percentage= ((marks1+marks2+marks3)/300)*100;
		
		//checking the student has cleared the exam or not
		
		if(percentage>=40)
			System.out.println("Congratulations!!  You have cleared the exam");
		else
			System.out.println("Sorry!!  You have failed");
		
		//end of ifelse
		    
	}
		
	// end of main
}
// end of class 


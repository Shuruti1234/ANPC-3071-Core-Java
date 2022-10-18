/*
Program: To understand data types
@author: Shuruti Singhal
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class DataTypeDemo
{
	public static void main(String args[])
	{
		//creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		//taking the character input 
		char charValue = sc.next().charAt(0);
		
		//converting char to asciiValue
		int asciiValue= charValue;
	    // print ASCii Value
		System.out.println("The Ascii value of "+ charValue + " is: "+asciiValue );
		
		int num1=9;
		num1= num1+1; // new value 10
		
		//num1++  //post increment : value is used and then incremented
		//++num1 // pre increment : value is incremented and then used
		
		int number1= 67;
		int sum= number1++;
		System.out.println("value of sum using number1++ :"+ sum);
		
		int number2= 67;
		 sum= ++number2;
		System.out.println("value of sum using ++number2 :"+ sum);
		
		int n=1;
		System.out.println("Not n :"+ ~n);
		
		boolean status = true;
		System.out.println("!Status : "+ !status);
		
		//decrement 
		//num1=num1-1
		//num1--
		//--num1
		//~ tlide: negative of each number
		// The negative of 0 is -1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	// end of main
}
// end of class 


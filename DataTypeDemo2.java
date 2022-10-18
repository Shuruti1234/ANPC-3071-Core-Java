/*
Program: To understand data types
@author: Shuruti Singhal
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class DataTypeDemo2
{
	public static void main(String args[])
	{
	  int num1=92;
	  int d= 6;
	  
	  System.out.println("Quotient :"+num1/d);
	  System.out.println("Remainder :"+num1%d); // modulus operator
	  
	  System.out.println(num1>92);
	  
	 //a=3  : n output assigning the value to the variable a : 
	 //a==3 : compare the value of a to 3 : true / false
	 
	 // a!=3
	 
	 
	 int x=6,y=8;
	 System.out.println("And:"+ (x&y)); // here int is converted to the binary equivalent
	 System.out.println("OR:"+ (x|y));
	 System.out.println("Not:"+ (~x));
	 System.out.println("XOR:"+ (x^y));
	 
	 boolean status;
	 System.out.println(status= (true&&false));
	 
	System.out.println( (x>=5)||(y>=10));
	
	System.out.println(20<<3);// left shift(20 *(2^3)) 
	System.out.println(20>>3);// right shift(20/ (2^3))
		
	}
		
	
	// end of main
}
// end of class 


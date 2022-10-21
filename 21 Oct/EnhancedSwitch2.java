/*
Program: WAP to implement enhanced switch case
@author: Shuruti Singhal
@Date: 21 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class EnhancedSwitch2
{
	//method to print ftype of language
	static void printLang(String lang)
	{
		 switch(lang)
	   {
		   //expression level
		   case "c","c++","java",".net" ->System.out.println("Programming language");		               
           case "sql","oracle" ->System.out.println("DBMS language");		              		
           case "php","javascript","html"-> System.out.println("Web based laguage");		               	
           default-> System.out.println("Wrong input");						
	   } 
		
	}	
		
		
	//main started
	public static void main(String args[])
	{
       // switch case with string
	   String inputLang;
	   
	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter an computer language:");
		inputLang= sc.next().toLowerCase();// converting the input to lowercase
	   
	   //calling method
	  printLang(inputLang);
	  
	  
		    
	}
		
	// end of main
}
// end of class 


/*
Program: To understand commandline arguments
@author: Shuruti Singhal
@Date: 14 oct 2022  
*/

//declaring a class
class AdditionDemo
{
	//main method
	public static void main(String args[])
	{
		//declaring local variables
	   //int number1= Integer.parseInt(args[0]);
		//int number2= Integer.parseInt(args[1]);
		
		// parsing String to Float
		float number1= Float.parseFloat(args[0]);
		float number2= Float.parseFloat(args[1]);
		
		//calculating the sum
		float sum = number1+ number2;
		System.out.println("The sum is :"+sum); // printing the value of sum
		
		
	}
	// end of main
}
// end of class AdditionDemo


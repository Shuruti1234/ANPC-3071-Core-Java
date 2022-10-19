/*
Program: WAP to print pass and fail according to the marks
@author: Shuruti Singhal
@Date: 19 oct 2022  
*/


//declaring a class
class PassFailArgDemo
{
	//main started
	public static void main(String args[])
	{
		float marks1,marks2,marks3,percentage;
		
		//taking input
		marks1= Float.parseFloat(args[0]);
		marks2= Float.parseFloat(args[1]);
		marks3= Float.parseFloat(args[2]);
		
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


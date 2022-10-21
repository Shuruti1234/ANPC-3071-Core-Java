/*
Program: WAP to make a vegetable store
@author: Shuruti Singhal
@Date: 21 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class GroceryStore
{
	//menu method
    static void menu()
	{
		System.out.println("---------------Grocery Store--------------");
		System.out.println("1. Apples: Rs 100/kg");
		System.out.println("2. Biscuits: Rs 50 per packet");
		System.out.println("3. Chips: Rs 200 per packet");
		System.out.println("4. Cheese: Rs 100 per packet");
		System.out.println("5. Juice: Rs 250 per packet");
		
	}
     // end of method
	
	// method to buy item
	static void buyItem()
	{
		 //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		//calling menu method
		menu();
		
		//declaring variables
		int choice;
		float totalBill=0.0f, dicountedBill=0.0f;
		float quantity;
		
		// taking input
		System.out.println("Enter the choice of item:");
		choice= sc.nextInt();
		
		
		//switch case
	   switch(choice)
	   {
		   case 1:System.out.println("Enter the qty of apples:");
		          quantity= sc.nextFloat();
				  //calculating total bill
				  totalBill= 100* quantity;
		          break;
		   case 2:System.out.println("Enter the packets of biscuits:");
		         quantity= sc.nextFloat();
				   //calculating total bill
				  totalBill= 50* quantity;
		          break;
		   case 3:System.out.println("Enter the packets of chips:");
		          quantity= sc.nextFloat();
				   //calculating total bill
				  totalBill= 200* quantity;
		          break;
		   case 4:System.out.println("Enter the packets of cheese:");
		          quantity= sc.nextFloat();
				   //calculating total bill
				  totalBill= 100* quantity;
		          break;
		   case 5:System.out.println("Enter the boxes of juice:");
		         quantity= sc.nextFloat();
				   //calculating total bill
				  totalBill= 250* quantity;
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
		// calling calculateDiscount
		float discount= calculateDiscount(totalBill);
		System.out.println("---Total Bill:---"+ totalBill);
		
		dicountedBill= totalBill-discount;
		if(discount>0)
			System.out.println("---Discounted Bill:---"+ dicountedBill);
			
		
	//end of switch case
		
		
		
	}
	//method to calculate discount
   static float calculateDiscount(float amount)
   {
	   //variable to store discount
	   float disc;
	   if(amount>2000)
		   disc= 0.2f*amount;
	    else if(amount>500)
		   disc= 0.1f* amount;
	        else if(amount>250)
				disc= 0.05f* amount;
			     else
					 disc=0.0f;
				 
    return disc;      	   
	   
   }

	
	//main started
	public static void main(String args[])
	{

		buyItem();
		    
	}
		
	// end of main
}
// end of class 


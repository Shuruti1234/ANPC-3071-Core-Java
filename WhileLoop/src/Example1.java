import java.util.Scanner;

public class Example1 {

	private static String fruit;

	public static void main(String[] args) {

//		int i = 0;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}

		Scanner sc = new Scanner(System.in);
		boolean ch = false;

		do // ch==true
		{
			System.out.println("Enter a fruit:");
			fruit = sc.next();
			System.out.println("Do you want to enter more (true/false):");
			ch = sc.nextBoolean();
		} while (ch);

		sc.close();

	}

}

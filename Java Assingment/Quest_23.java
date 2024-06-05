package Assignment;

import java.util.Scanner;

/*
 *  WAP to reverse an array of integer values.
 */
public class Quest_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			Scanner input = new Scanner(System.in);        
			System.out.print("Enter the Digits :");
			int num = input.nextInt(); 
			int a = num;
			int rev = 0;
			int rem = 0;        
			while(num>0)
			{
				rem = num % 10;
				rev = rev * 10 + rem;
				num /= 10;
			}
			System.out.println("Given Digits :" + a);
			System.out.println("Reverse Digits :" + rev);
		}
	}

}

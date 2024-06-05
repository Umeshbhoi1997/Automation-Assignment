package Assignment;

import java.util.Scanner;

/*
 *  WAP to find the maximum and minimum value of an array
 */

public class Quest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the Array Limit :");
			int l =input.nextInt();
			int [] a =new int[l];
			int max=0,min=0;
			for(int i=0;i<l;i++)
			{
				System.out.printf("Element of a[%d] :",i);
				a[i]=input.nextInt();
			}		
			max=a[0];
			min=a[0];
			for(int i=0;i<l;i++)
			{
				if(max<a[i])
					max=a[i];
				if(min>a[i])
					min=a[i];
			}
			System.out.println("Maximum Element of Array : "+max);
			System.out.println("Minimum Element of Array : "+min);
	    }
}

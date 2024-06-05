package Assignment;

import java.util.Scanner;

/*
 *  WAP to Copy one array into another
 */
public class Quest_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{   
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the Array Limit :");
			int l =input.nextInt();
			int [] a =new int[l];
			int [] c =new int[l];
			int sum = 0;
			for(int i=0;i<l;i++)
			{
				System.out.printf("Element of a[%d] :",i);
				a[i]=input.nextInt();
			}
			for(int i=0;i<l;i++)
			{
				c[i] = a[i];
			}
			System.out.print("\nOriginal Array Elements...");	
			for(int i=0;i<l;i++)
			{
				System.out.printf("\na[%d] = %d",i,a[i]);
			}
			System.out.print("\n\nCopy Array Elements one to Another Array...");	
			for(int i=0;i<l;i++)
			{
				System.out.printf("\nc[%d] = %d",i,c[i]);
			}
	    }
	}

}

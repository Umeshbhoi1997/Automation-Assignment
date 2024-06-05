package Assignment;

import java.util.Iterator;

/*
 * 
 *  W.A.J.P to Print pattern Given Below.
1)
1
12
123
1234
12345

2)
1
12
123
1234
12345

3)3)
1
01
101
01010
101010

4)
   1
  2 2
 3 3 3
4 4 4 4

5)
5)
    *
  * * *
* * * * *
  * * *
    *
 */

public class Quest_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

	// Eg. 1)	
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		
     // Eg.2)
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		
		
		// Eg.3)
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
		
		
		//Eg.4)
		
		for(int i=0; i<=4;i++) {
			for (int k=i; k<=5;k++)
			{
				System.out.print(" ");
			}
		
		for(int j=1;j<=i;j++)
	     {
	    	 System.out.print(" "+j);
	    	 
	     }
		System.out.println();
		}
		
		
		
		
		// Eg.5)
		for (int i=1; i<=3; i++)
		{
			for (int k=i; k<=3;k++)
				
			{
				System.out.print(" ");   // data purn eka ch line madhe print karaycha rahto tevha "print" ch lihito "println" he next line vr print karnya sathi use karto 
		    }
			for (int j=1; j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i=2; i>=1; i--)
		{
			for (int k=i; k<=3;k++)
				
			{
				System.out.print(" ");
		    }
			for (int j=i*2-1; j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}

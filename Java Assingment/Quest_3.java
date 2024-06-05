package Assignment;

import java.util.Iterator;

/*
 *  W.A.J.P to find factorial for Given Number.
 */
public class Quest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,fact=1,num=4;
		for (i=1; i<=num;i++) 
		{
			
			fact=fact*i;
			}
		System.out.println("Factor of "+num+" is :"+fact);
	}

}

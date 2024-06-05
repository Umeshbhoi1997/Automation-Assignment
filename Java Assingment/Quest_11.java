package Assignment;

/*
 *  WAP to find the index of an array element
 */

public class Quest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = { 5, 8, 3, 7 };
		int Element = 3;
		int Index  ;

		for (int i = 0; i < Array.length; i++)
		{
		     if (Element == Array[i])
		     {
		         Index = i;
		         System.out.println(+i);
		     }
		    
		}
		

	}

}

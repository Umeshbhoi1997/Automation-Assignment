package Assignment;

/*
 *  WAP to sum values of an array.
 */

public class Quest_9 {
	
	  static int a[] = { 12, 3, 4, 15 };
		 
	    
	    static int sum()
	    {
	        int sum = 0; 
	        int i;
	 
	        for (i = 0; i < a.length; i++)
	            sum += a[i];
	 
	        return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    {
		        System.out.println("Sum of given array is "+ sum());
		    }
		}
}

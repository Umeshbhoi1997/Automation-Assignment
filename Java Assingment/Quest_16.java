package Assignment;


/*
 *  WAP to demonstrate multiple catch blocks
 */
public class Quest_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	         int a[] = new int[2];
	         int b = 0;
	         int c = 1/b;
	         System.out.println("Access element three :" + a[3]);
	      }
	      catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
	      }catch (Exception e) {
	          System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	   }
}

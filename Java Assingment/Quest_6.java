package Assignment;

/*
 *  W.A.J.P for create Fibonacci Series.
 */

public class Quest_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{    
			 int n1=0,n2=1,n3,i;    
			 
			    
			 for(i=0;i<10;++i)//loop starts from 2 because 0 and 1 are already printed 
				 
				 
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;     
			  n2=n3;    
			 }    
			  
			}
	}

}

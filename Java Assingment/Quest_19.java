package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/*
 *  WAP to iterate through all elements in an array list
 */

public class Quest_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		{
			 
	        // Creating an ArrayList
	        ArrayList<Integer> al = new ArrayList<Integer>();
	 
	        // Adding elements to ArrayList
	        al.add(34);
	        al.add(12);
	        al.add(34);
	        al.add(23);
	        al.add(54);
	 
	        // Getting an enumeration object
	        Enumeration<Integer> e
	            = Collections.enumeration(al);
	 
	        // Till elements are there
	        while (e.hasMoreElements())
	 
	            // Print elements using nextElement() method
	            System.out.println(e.nextElement());
		}

	}

}

package Assignment;

import java.util.ArrayList;

/*
 *  WAP to remove the third element from a array list.
 */
public class Quest_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 {
				ArrayList<String> fru_list = new ArrayList<String>();
				fru_list.add("Pineapple"); 
				fru_list.add("Papaya");
				fru_list.add("Mulberry");
				fru_list.add("Apple");
				fru_list.add("Banana");
				fru_list.add("Cherry");
				fru_list.add("Guava");
				fru_list.add("Watermelon");
				System.out.println("Given ArrayList : "+fru_list);
		 
				
				fru_list.remove("Mulberry");
		 
				 
				fru_list.remove("Guava");
		 
				System.out.println("\nRemove the given Element from an ArrayList..");
				System.out.println(fru_list);
		    }

	}

}

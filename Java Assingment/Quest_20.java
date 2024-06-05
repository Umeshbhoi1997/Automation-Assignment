package Assignment;

import java.util.ArrayList;
import java.util.List;

/*
 *  WAP to update specific array element by given element
 */
public class Quest_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			List<String> list_Col = new ArrayList<String>();
			list_Col.add("Black");
			list_Col.add("Red");
			list_Col.add("Orange");
			list_Col.add("White");
			list_Col.add("Green");
			System.out.println(list_Col);
			list_Col.set(1, "Pink");
			list_Col.set(4, "Blue");
			System.out.println(list_Col);
		}

	}

}

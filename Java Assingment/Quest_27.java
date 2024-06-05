package Assignment;

/*
 * W.A.J.P. which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks
entered as below:
Marks Grade
91-100  AA
81-90   AB
71-80   BB
61-70   BC
51-60   CD
41-50   DD
<=40   Fail

 */
public class Quest_27 {

	public static void main(String[] args) {
		 
		        // Store marks of all the subjects in an array
		        int marks[] = { 25, 65, 46, 98, 78, 65 };
		 
		        // Max marks will be 100 * number of subjects
		        int max_marks = marks.length * 100;
		 
		        // Initialize student's total marks to 0
		        int total = 0;
		 
		        // Initialize student's grade marks to F
		        String grade = "FF";
		 
		        // Traverse though the marks array to find the sum.
		        for (int i = 0; i < marks.length; i++) {
		            total += marks[i];
		        }
		 
		        // Calculate the percentage.
		        // Since all the marks are integer,
		        // typecast the calculation to double.
		        double percentage
		            = ((double)(total) / max_marks) * 100;
		 
		        // Nested if else
		        if (percentage >= 90) {
		            grade = "AA";
		        }
		        else {
		            if (percentage >= 80 && percentage <= 89) {
		                grade = "AB";
		            }
		            else {
		                if (percentage >= 60 && percentage <= 79) {
		                    grade = "BC";
		                }
		                else {
		                    if (percentage >= 33 && percentage <= 59) {
		                        grade = "CD";
		                    }
		                    else {
		                        grade = "FF";
		                    }
		                }
		            }
		        }
		        
		 
		        System.out.println(grade);
		        
	}

}

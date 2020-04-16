package Lesson6.java;

import java.util.Scanner;

/**
calculates exams average mark
A class of students took an exam. Develop an application that takes an
arbitrary number of marks (i.e. we do not know the exact number of marks,
that is the user decides when there are no marks to be entered) and calculates
and displays the average mark of the entire class on the exam. The marks
are integers in the range [0,100].
TODO: Compile, then run the application to test it for different marks values.
*/
public class ExamMarks {

	public static void main (String[] args) {
		
		int sum = 0, counter = 
				0;
		double average;
		
		String ans = "yes";
		
		Scanner sc = new Scanner(System.in);
		
		while (ans.equals("yes")) {//loop conditions
			System.out.println("Please enter the mark");
			int mark = sc.nextInt();
			//add to current sumthe new mark
			sum +=mark;
			//increment the number of marks entered so far
			counter ++;
			
			System.out.println("Do you enter another mark, type yes");
			ans = sc.next();
			
			ans = ans.toLowerCase();
		}
		
		//at this stage all teh marks have been entered, and compute average mark
		average = (double) sum/counter;
		System.out.println("average" + average);
		
	}//main
}//class

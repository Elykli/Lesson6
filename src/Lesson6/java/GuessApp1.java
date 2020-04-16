package Lesson6.java;

import java.util.*;
public class GuessApp1 {
	
	public static void main(String[] args) {
	int guess;
	
	Scanner input = new Scanner(System.in);
	GuessNumber checker = new GuessNumber();
	
	for(int i = 0; i<3; i++) {
		//input
		System.out.println("enter the guess number;");
		guess = input.nextInt();
		checker.setGuess(guess);
		
		//processing
		checker.compute();
		
		//output
		
		String m = checker.getMessage();
		System.out.println(m);
		
		if(m.equals("congrats")) {
			break;
		}
		
	}	//for
	
		int s = checker.getSecret();
		System.out.println("secret" +s);
	}//main
	
	}//class


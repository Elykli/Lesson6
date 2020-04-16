package Lesson6.java;
/**
Problem 
GuessApp3 
	uses the instantiable class GuessNumber
	allows the user to guess the number, and then ask the user whether would they like to guess again. If they answer yes, the application should run again, if they answer no, the application should end.
*/
import java.util.*;
public class GuessApp3 {
	 public static void main(String[] args) {

	        //declare a local variables
	        int guess;
	        String ans = "yes";

	        Scanner input = new Scanner(System.in);
	        GuessNumber checker = new GuessNumber();

	        while (ans.equals("yes")){
	            //input
	            System.out.println("enter to guess the number: ");
	            guess = input.nextInt();
	            checker.setGuess(guess);

	            //processing
	            checker.compute();

	            //output
	            String m =checker.getMessage();
	            System.out.println(m);

	            if(m.equals("congrats")){
	                break;
	            }
	            System.out.println("Do you want to guess again? (type yes to continue)");
	            ans = input.next().toLowerCase();
	        }//end while

	        int s = checker.getSecret();
	        System.out.println("secret: " +s);

	    }//end main

}//class

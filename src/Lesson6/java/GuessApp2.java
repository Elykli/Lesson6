package Lesson6.java;
/**
Problem 2
GuessApp2 
	uses the instantiable class GuessNumber
	allows the user to guess the number. User can enter the guess number!
*/
import java.util.*;
public class GuessApp2 {
	public static void main(String[] args) {

        //declare a local variables
        int guess;

        Scanner input = new Scanner(System.in);
        GuessNumber checker = new GuessNumber();

        System.out.println("please enter how many attempts you have to guess the number: ");
        int attempts = input.nextInt();

        for(int i = 0; i < attempts; i++){
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
        }//end for

        int s = checker.getSecret();
        System.out.println("secret: " +s);


    }//end main



}//class

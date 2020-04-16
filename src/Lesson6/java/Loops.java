package Lesson6.java;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		
		//for loop example
		
		//starting
		for(int i1 = 5; i1<10; i1++){
		System.out.println(i1);	
		}
		for(int i1 = 100; i1>10; i1/=2){
			System.out.println(i1);	
			}
		
		int n = 4;
		int m = 3;
		for(int i1 = 0; i1<=n; i1++){
			System.out.println("outer loop" +i1);
			for(int j = 0; j<=n; j++){
				System.out.println("inner loop" +i1);
			}
			System.out.println();
			}
		
		
		//while loop example
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number, or 0 to exit the scanner: ");
		number = sc.nextInt();
		
			while( number!=0) {
				sum = sum +number;
				System.out.println("Enter a number, or 0 to exit the scanner: ");
				number = sc.nextInt();
			
			}
			System.out.println("total sum:" + sum);
			System.out.println("++++++++++++");
			
			//do while loop example
			int x= 100;
			do {
				System.out.println("DO");
				x/=2;
			}while (x>10);
			
	}//main

}//class

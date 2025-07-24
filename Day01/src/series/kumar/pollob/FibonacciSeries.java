package series.kumar.pollob;

import java.util.Scanner;

/**
 * This program prints the Fibonacci series up to a given number of terms.
 * In Fibonacci series, each number is the sum of the previous two numbers.
 * Example: 0 1 1 2 3 5 8 ...
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int x=0, y=1;  //First two terms of the series. (index=0)term-1 & (index=1)term-2
		int sum, terms;  //'sum' for adding previous two numbers.  'terms' = how many terms to print
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first number: ");
		terms=scan.nextInt();
		
		System.out.print("Fibonacci Series: " + x + " " + y + " "); //Print first two terms
		
		 //Start from 3rd(index=2) term since first two are already printed
		for(int i=2; i<terms; i++) {
		sum=x+y;
		System.out.print(sum+" ");
		x=y;  
		y=sum;
		}
		
		scan.close();
	}
}
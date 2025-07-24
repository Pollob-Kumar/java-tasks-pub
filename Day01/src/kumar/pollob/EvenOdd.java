package kumar.pollob;

import java.util.Scanner;

/**
 * This program checks whether a given number is even or odd.
 * An even number is divisible by 2 with no remainder.
 * An odd number leaves a remainder of 1 when divided by 2.
 */
public class EvenOdd{
	public static void main(String args[]) {
		int X;
		
	     // Create a Scanner object to take input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		X=scan.nextInt();
		
		//If remainder is zero, then the number is Even otherwise Odd.
		if(X%2==0) {
			System.out.println(X+" is an even number");
		}
		else {
			System.out.println(X+" is an Odd number");
		}
		scan.close(); // Close the scanner
	}
}
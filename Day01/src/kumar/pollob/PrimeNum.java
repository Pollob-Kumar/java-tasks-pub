package kumar.pollob;

import java.util.Scanner;

/**
 * This program checks whether a number is a prime number or not.
 * A prime number is only divisible by 1 and itself.
 */
public class PrimeNum{
	public static void main(String[] args) {
		int number;
		int check=0;  // This variable counts how many times the number is divisible (other than 1 and itself)
		Scanner scan=new Scanner(System.in); //create scanner obj
		System.out.println("Enter your number: ");
		
		number=scan.nextInt(); 
		for(int i=2; i<=number-1; i++) { //i=2 because 1 not a prime number.
			if(number%i==0) { 
				check=check+1; //Count if number is divisible
			}	
		}
		
		// If no number divides it
		if(check==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.print("Not a Prime number");
		}
		
		scan.close();
	}
}
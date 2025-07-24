package kumar.pollob;

import java.util.Scanner;

/**
 * This program checks for Goldbach number pairs.
 * Goldbach Conjecture: Every even number greater than 2
 * can be written as the sum of two odd prime numbers.
 */
public class GoldbachNumber {
	public static void main(String[] args) { // main method
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an even number greater than 2: "); //
		 n=scan.nextInt();
		 
		 if(n%2==0 && n>2) { //when user input is valid
			 
		     System.out.println("PRIME PAIRS ARE:");
		      // Start from 3, because 1 is not prime and 2 is even
		     for(int i=3; i<=n/2; i++) { 
			 int a=i;
			 int b=n-i;
			 
			 if(isPrime(a) && isPrime(b))  //if both numbers are prime
				 System.out.println(a+"+"+b+" = "+n);
		     }
		 }
		 
		 else { //when user input is invalid
			 System.out.println("Enter a valid even number");
		 }
		 
		 scan.close();
	}

	
	// Added 'static' because method called without creating object
	static boolean isPrime(int n) { //this function for check prime number. 
		int check=0;
		
		// A prime number is only divisible by 1 and itself
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				check++;
		 }
		
		if(check==2) { // If exactly 2 divisors, then it's prime
			return true;
		}
		else {
			return false;
		}
	}
	
}

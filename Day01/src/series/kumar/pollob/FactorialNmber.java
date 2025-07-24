package series.kumar.pollob;

import java.util.Scanner;

/**
 * This program calculates the factorial of a given number.
 * Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
public class FactorialNmber {
	public static void main(String[] args) {
		int num; int check=1;  //Start with 1 because multiplying by 0, the result always 0
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		num=scan.nextInt();
		
		// Calculate factorial using a loop
		for(int i=num; i>=1; i--) {
			 check=check*i;
		}
		System.out.println("factorial of "+num+" is: "+check);
		scan.close();
	}
}
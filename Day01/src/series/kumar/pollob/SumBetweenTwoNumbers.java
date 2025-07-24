package series.kumar.pollob;

import java.util.Scanner;

/**
 * This program calculates the sum of all numbers between two given numbers.
 */
public class SumBetweenTwoNumbers {
	public static void main(String[] args) {
		int starN, endN;
		int sum=0;

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter stating number: ");
		starN=scan.nextInt();
		
		System.out.println("Enter ending number: ");
		endN=scan.nextInt();
		
		// Calculate the sum from startN to endN
		for(int i=starN; i<=endN; i++) {
			sum=sum+i;
		}
		System.out.print("Total sum is: "+sum);
		scan.close();
	}
}
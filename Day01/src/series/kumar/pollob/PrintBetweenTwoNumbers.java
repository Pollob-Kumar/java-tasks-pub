package series.kumar.pollob;

import java.util.Scanner;

/**
 * This program prints all numbers between two given numbers (including both).
 * Example: If input is 5 and 10 → output will be 5 6 7 8 9 10
 */
public class PrintBetweenTwoNumbers {
	public static void main(String[] args) {
		int starN, endN;
		
		Scanner scan=new Scanner(System.in); //scanner obj
		System.out.println("Enter stating number: ");
		starN=scan.nextInt();
		
		System.out.println("Enter ending number: ");
		endN=scan.nextInt();
		
		 // Print all numbers from startN to endN
		for(int i=starN; i<=endN; i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}
}
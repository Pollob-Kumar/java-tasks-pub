package series.kumar.pollob;

import java.util.Scanner;

/**
 * This program prints all even numbers between two given numbers.
 */
public class EvenBetweenTwoNumbers {
public static void main(String[] args) {
	int starN, endN;

	Scanner scan=new Scanner(System.in); //create scanner obj
	System.out.println("Enter stating number: ");
	starN=scan.nextInt();
	
	System.out.println("Enter ending number: ");
	endN=scan.nextInt();
	
	// Loop through the range and print even numbers
	for(int i=starN; i<=endN; i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	System.out.print("<--all are even number");
	scan.close();
 }
}
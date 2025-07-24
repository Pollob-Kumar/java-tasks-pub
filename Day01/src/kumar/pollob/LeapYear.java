package kumar.pollob;

import java.util.Scanner;

/**
 * This program checks whether a given year is a leap year or not.
 * A year is a leap year if:
 * - It is divisible by 400, OR
 * - It is divisible by 4 but not by 100
 */
public class LeapYear{
	public static void main(String[] args){
		int year; // Variable to store the year
		
		Scanner scan=new Scanner(System.in);	// Create a Scanner object
		System.out.println("Enter a Year: ");
		year=scan.nextInt();                     // Read user input (note: int=nextInt(), String=nextLine(), float=nextFloat() e.t.c) 
			
		if((year%400==0)||(year%4==0 && year%100!=0)) { // Check if the year is a leap year
			System.out.println( year+" "+"is a Leap year.");
		}
		else {
			System.out.println(year+" "+"Not a leap year.");
		}
		scan.close(); // Close Scanner
	}
}
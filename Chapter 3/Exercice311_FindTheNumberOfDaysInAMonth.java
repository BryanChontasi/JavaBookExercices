package section3;

import java.util.Scanner;

public class Exercice311_FindTheNumberOfDaysInAMonth {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter the month and year and
		 * displays the number of days in the month. For example, if the user entered
		 * month 2 and year 2012, the program should display that February 2012 has 29
		 * days. If the user entered month 3 and year 2015, the program should display
		 * that March 2015 has 31 days.
		 * 
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month = input.nextInt();
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		//this boolean formula is to check if is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch (month) {
		case 1:
			System.out.println("January " + year + " had 31 days");
			break;
		case 2:
			System.out.print("February " + year + " had ");
			System.out.println(isLeapYear ? "29 days" : "28 Days");
			break;
		case 3:
			System.out.println("March " + year + " had 30 days");
			break;
		case 4:
			System.out.println("April " + year + " had 31 days");
			break;
		case 5:
			System.out.println("May " + year + " had 30 days");
			break;
		case 6:
			System.out.println("June " + year + " had 30 days");
			break;
		case 7:
			System.out.println("July " + year + " had 31 days");
			break;
		case 8:
			System.out.println("August " + year + " had 31 days");
			break;
		case 9:
			System.out.println("September " + year + " had 30 days");
			break;
		case 10:
			System.out.println("October " + year + " had 31 days");
			break;
		case 11:
			System.out.println("November " + year + " had 30 days");
			break;
		case 12:
			System.out.println("December " + year + " had 31 days");
			break;
		}
	}
}

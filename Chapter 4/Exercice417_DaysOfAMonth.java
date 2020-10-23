package Chapter4;

import java.util.Scanner;

public class Exercice417_DaysOfAMonth {

	public static void main(String[] args) {
		/*
		 * (Days of a month) Write a program that prompts the user to enter the year and
		 * the first three letters of a month name (with the first letter in uppercase)
		 * and displays the number of days in the month. If the input for month is
		 * incorrect, display a message as presented in the following sample runs:
		 * 
		 * Enter a year: 2001 
		 * Enter a month: Jan 
		 * Jan 2001 has 31 days
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter a month: ");
		String month = input.next();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch (month) {
		case "Feb":
			System.out.println(
					isLeapYear ? (month + " " + year + " has 29 days") : (month + " " + year + " has 28 days"));
			break;
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(month + " " + year + " has 30 days");
			break;
		default:
			System.out.println(month + " is not a correct month name");
			break;

		}

	}

}

package section3;

import java.util.Scanner;

public class Exercice35_FindFutureDates {

	public static void main(String[] args) {

		/*
		 * Find future dates) Write a program that prompts the user to enter an integer
		 * for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday
		 * is 6). Also prompt the user to enter the number of days after today for a
		 * future day and display the future day of the week.
		 * 
		 * Result: Enter today’s day: 1 Enter the number of days elapsed since today: 3
		 * 
		 * Today is Monday and the future day is Thursday
		 */

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter filing status
		System.out.print("Enter today’s day: ");
		int numberDay = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int numberDayFuture = input.nextInt();

		int futureDays = (numberDay + numberDayFuture) % 7;

		String day = "";

		switch (numberDay) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
		}

		String dayInFuture = "";

		switch (futureDays) {
		case 0:
			dayInFuture = "Sunday ";
			break;
		case 1:
			dayInFuture = "Monday ";
			break;
		case 2:
			dayInFuture = "Tuesday ";
			break;
		case 3:
			dayInFuture = "Wednesday ";
			break;
		case 4:
			dayInFuture = "Thursday ";
			break;
		case 5:
			dayInFuture = "Friday ";
			break;
		case 6:
			dayInFuture = "Saturday ";
			break;
		default:
			dayInFuture = "Number too big";
		}
		System.out.print(
				"Today is " + day + " and the future day is " + dayInFuture + ((numberDay + numberDayFuture) % 7));
	}

}

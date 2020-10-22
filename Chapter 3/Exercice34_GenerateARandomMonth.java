package section3;

import java.util.Scanner;

public class Exercice34_GenerateARandomMonth {
	public static void main(String[] args) {

		/*
		 * (Random month) Write a program that randomly generates an integer between 1
		 * and 12 and displays the English month names January, February, . . . ,
		 * December for the numbers 1, 2, . . . , 12, accordingly.
		 * 
		 */

		int monthNumber = (int) (Math.random() * 12 + 1);
		String monthName = "";

		switch (monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;

		}
		System.out.print("the mandatory random month generated is " + monthName + " number " + monthNumber);

	}

}

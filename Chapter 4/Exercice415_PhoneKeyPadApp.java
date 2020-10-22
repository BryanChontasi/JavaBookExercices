package Chapter4;

import java.util.Scanner;

public class Exercice415_PhoneKeyPadApp {

	public static void main(String[] args) {
		/*
		 * The international standard letter/number mapping found on the telephone is
		 * shown below:
		 * 1 2 3
		 * 4 5 6
		 * * 0 #
		 * 
		 * Write a program that prompts the user to enter a lowercase or uppercase
		 * letter and displays its corresponding number. For a nonletter input, display
		 * invalid input.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char ch = input.next().toUpperCase().charAt(0);

		// Display its corresponding number
		int number = 0;
		if (Character.isLetter(ch)) {

			if (ch >= 'W' && ch >= 'Z')
				number = 9;
			else if (ch >= 'T')
				number = 8;
			else if (ch >= 'P')
				number = 7;
			else if (ch >= 'M')
				number = 6;
			else if (ch >= 'J')
				number = 5;
			else if (ch >= 'G')
				number = 4;
			else if (ch >= 'D')
				number = 3;
			else if (ch >= 'A')
				number = 2;

			System.out.println("The corresponding number is " + number);
		} else {
			System.out.println(ch + " is an invalid input");
		}

	}

}

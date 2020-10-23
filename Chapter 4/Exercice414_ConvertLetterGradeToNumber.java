package Chapter4;

import java.util.Scanner;

public class Exercice414_ConvertLetterGradeToNumber {

	public static void main(String[] args) {
		/*
		 * (Convert letter grade to number) Write a program that prompts the user to
		 * enter a letter grade A, B, C, D, or F and displays its corresponding numeric
		 * value 4, 3, 2, 1, or 0. For other input, display invalid grade. Here is a
		 * sample run:
		 * 
		 * Enter a letter grade: B 
		 * The numeric value for grade B is 3
		 * 
		 * Enter a letter grade: T 
		 * T is an invalid grade
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		char character = input.next().toUpperCase().charAt(0);

		String chars = "ABCDF"; // index of 4
		int position = chars.indexOf(character);

		if (position == -1) { // if we insert another character index will go to -1
			System.out.println(character + " is an invalid grade");
		} else {
			System.out.println("The numeric value for grade " + character + " is " + (4 - position));

		}

	}
}

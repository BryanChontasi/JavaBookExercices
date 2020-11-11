package Chapter5;

import java.util.Scanner;

public class Exercice517_DisplayPyramid {

	public static void main(String[] args) {
		/*
		 * (Display pyramid) Write a program that prompts the user to enter an integer
		 * from 1 to 15 and displays a pyramid, as shown in the following sample run;
		 * 
		 * Enter the numbers of lines: 7 
		 * 7 6 5 4 3 2 1 2 3 4 5 6 7
		 * 6 5 4 3 2 1 2 3 4 5 6
		 * 5 4 3 2 1 2 3 4 5 
		 * 4 3 2 1 2 3 4 
		 * 3 2 1 2 3 
		 * 2 1 2 
		 * 1
		 * 
		 * Bryan Chontasi
		 */

		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numnber of lines: ");
		int numberOfLines = input.nextInt();
		int lastNumber = numberOfLines;

		while (numberOfLines >= 1) { //until reach line 1
			lastNumber = numberOfLines; //to play with the next function
			for (; lastNumber > 1; lastNumber--) { //to count from big to small
				System.out.print(lastNumber + " ");
			}
			for (; lastNumber <= numberOfLines; lastNumber++) {//to count from small to big
				System.out.print(lastNumber + " ");
			}
			numberOfLines--;
			System.out.println();
		}
	}
}

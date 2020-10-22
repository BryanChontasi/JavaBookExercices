package section3;

import java.util.Scanner;

public class Exercice326_DivisibleTrueOrFalse {

	public static void main(String[] args) {
		/*
		 * (Use the &&, || and ^ operators) Write a program that prompts the user to
		 * enter an integer and determines whether it is divisible by 4 and 5, whether
		 * it is divisible by 4 or 5, and whether it is divisible by 4 or 5 but not
		 * both. 
		 * 
		 * Example:
		 * Enter an integer: 10
		 * 
		 * Is 10 divisible by 4 and 5? false
		 * Is 10 divisible by 4 or 5? true
		 * Is 10 divisible by 4 or 5 but not both? true
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		boolean isDivAnd = (number % 5 == 0) && (number % 4 == 0);
		boolean isDivOr = (number % 5 == 0) || (number % 4 == 0);
		boolean isDivXor = (number % 5 == 0) ^ (number % 4 == 0);

		System.out.println("Is " + number + " divisible by 5 and 4? " + isDivAnd);
		System.out.println("Is " + number + " divisible by 5 or 4? " + isDivOr);
		System.out.println("Is " + number + " divisible by 5 or 4, but not both? " + isDivXor);
	}
}

package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0064_DisplayAnIntegerReversed {

	public static void main(String[] args) {
		/*
		 * (Display an integer reversed) Write a method with the following header to
		 * display an integer in reverse order:
		 * 
		 * public static void reverse(int number)
		 * 
		 * 
		 * For example, reverse(3456) displays 6543. Write a test program that prompts
		 * the user to enter an integer then displays its reversal.
		 * 
		 * 
		 * Bryan Chontasi 24/11/2020
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to reverse: ");
		int number = input.nextInt();
		reverse(number);
	}

	public static void reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		System.out.print("The reverse is: " + reverse);
	}
}

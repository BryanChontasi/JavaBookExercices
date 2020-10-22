package section3;

import java.util.Scanner;

public class Exercice312_PalindromeInteger {

	public static void main(String[] args) {
		/*
		 * (Palindrome integer) Write a program that prompts the user to enter a
		 * three-digit integer and determines whether it is a palindrome integer. An
		 * integer is palindrome if it reads the same from right to left and from left
		 * to right. A negative integer is treated the same as a positive integer.
		 * 
		 * 
		 * Result
		 * 
		 * Enter a three-digit integer: 121 121 is a palindrome
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three digit intiger: ");
		int number = input.nextInt();

		int first = number % 10;

		int last = number / 100;

		if (first == last) {
			System.out.print(number + " is a palindrome");

		} else {
			System.out.print(number + " is not a palindrome");
		}

	}

}

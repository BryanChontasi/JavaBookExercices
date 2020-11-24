package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0063_PalindromeInteger {

	public static void main(String[] args) {
		/*
		 * (Palindrome integer) Write the methods with the following headers:
		 * 
		 * // Return the reversal of an integer, e.g., reverse(456) returns 654 public
		 * static int reverse(int number)
		 * 
		 * // Return true if number is a palindrome public static boolean
		 * isPalindrome(int number)
		 * 
		 * Use the reverse method to implement isPalindrome. A number is a palindrome if
		 * its reversal is the same as itself. Write a test program that prompts the
		 * user to enter an integer and reports whether the integer is a palindrome.
		 * 
		 * 
		 * Bryan Chontasi 24/11/2020
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("The digit: " + number + " is " + isPalindrome(number));

	}

	// Return the reversal of an integer, e.g., reverse(456) returns 654
	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + number % 10;
			number = number / 10;
		}
		return (reverse);
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

}

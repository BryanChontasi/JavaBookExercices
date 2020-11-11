package Chapter5;

import java.util.Scanner;

public class Exercice0546_ReverseString {

	public static void main(String[] args) {
		/*
		 * (Reverse a string) Write a program that prompts the user to enter a string
		 * and displays the string in reverse order.
		 * 
		 * 	EXAMPLE: 	
		 	Enter a string: ABCD
			The reversed string is: DCBA
		 * 
		 * Bryan Chontasi 11/11/2020
		 */
		// create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String newStr = input.next();

		String reverseStr = ""; //to store reversed string

		for (int i = newStr.length() - 1; i >= 0; i--) {
			reverseStr += newStr.charAt(i); //take the last character of the string and add it on the reverse

		}
		System.out.print("The reversed string is: " + reverseStr);
	}
}

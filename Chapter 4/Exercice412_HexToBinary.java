package Chapter4;

import java.util.Scanner;

public class Exercice412_HexToBinary {

	public static void main(String[] args) {

		/*
		 * (Hex to binary) Write a program that prompts the user to enter a hex digit
		 * and displays its corresponding binary number. For an incorrect input, display
		 * invalid input. Here is a sample run:
		 * 
		 * Enter a hex digit: B
		 * The binary value is 1011
		 * 
		 * Enter a hex digit: G
		 * G is an invalid input
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");
		String chars = input.next().toUpperCase();

		char character = chars.charAt(0);

		//combination of all hexadecimal digits
		String digits = "0123456789ABCDEF";

		int decVal = digits.indexOf(character);

		if (decVal == -1) {
			System.out.println(character + " is an invalid input");
		} else {
			String binVal = Integer.toBinaryString(decVal);
			System.out.println("The binary value is " + binVal);
		}
	}

package Chapter4;

import java.util.Scanner;

public class Exercice411_BinaryToDecimals {
	public static void main(String[] args) {

		/*
		 * (Binary to decimal) Write a program that prompts the user to enter binary
		 * digits and displays its corresponding decimal value. Here are some sample
		 * runs:
		 * 
		 *  Enter binary digits (0000 to 1111): 0111
		 *  The decimal value is 7
		 *  
		 *  Enter binary digits (0000 to 1111): 1001
		 *  The decimal value is 9
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary digits (0000 to 1111): ");
		String binaryString = input.nextLine();

		
		//Integer.parseInt(binaryString, 2) formula to convert to binary
		System.out.println("Output: " + Integer.parseInt(binaryString, 2));

	}
}

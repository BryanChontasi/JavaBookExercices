package Chapter5;

import java.util.Scanner;

public class Exercice537_DecimalToBinary {

	public static void main(String[] args) {
		/*
		 * (Decimal to binary) Write a program that prompts the user to enter a decimal
		 * integer then displays its corresponding binary value. Don’t use Java’s
		 * Integer .toBinaryString(int) in this program.
		 * 
		 * 
		 * Bryan Chontasi 11/11/2020
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal interger: ");
		int decimal = input.nextInt();

		// Convert the decimal number to a binary number
		String binary = "";	// Holds the binary value
		for (int i = decimal; i > 0; i /= 2) {
			binary += i % 2  ; 
		}
		// Display the  binary value 
		System.out.println("The binary value is: " + binary);
		//System.out.println(50 /=2 );
	}
} 

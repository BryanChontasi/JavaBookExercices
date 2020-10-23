package Chapter4;

import java.util.Scanner;

public class Exercice48_FindCharactersOfASCIIcode {

	public static void main(String[] args) {
		/*
		 * (Find the character of an ASCII code) Write a program that receives a
		 * character and displays its ASCII code (an integer between 0 and 127). Here is
		 * a sample run:
		 * 
		 *  Enter a character: E
		 *  The ASCII code for character E is 69
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		//charAt(0) takes the first character in the index in form of char
		char character = input.next().charAt(0);
		
		//char value if converted to int number
		int ascii = character;

		System.out.println("The ASCII code for character " + character + " is " + ascii);

	}

}

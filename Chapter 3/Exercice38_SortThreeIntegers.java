package section3;

import java.util.Scanner;

public class Exercice38_SortThreeIntegers {

	public static void main(String[] args) {

		/*
		 * (Sort three integers) Write a program that prompts the user to enter three
		 * integers and display the integers in non-decreasing order.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter digit 1: ");
		int digit1 = input.nextInt();
		System.out.print("Enter digit 2: ");
		int digit2 = input.nextInt();
		System.out.print("Enter digit 3: ");
		int digit3 = input.nextInt();

		int temp;

		if (digit1 > digit2) {
			temp = digit1;
			digit1 = digit2;
			digit2 = temp;
		}
		if (digit2 > digit3) {
			temp = digit2;
			digit2 = digit3;
			digit3 = temp;
		}
		if (digit1 > digit2) {
			temp = digit2;
			digit1 = digit2;
			digit2 = temp;
		}
		System.out.println("The integers in non-decreasing order: " + digit1 + " " + digit2 + " " + digit3);
	}

}

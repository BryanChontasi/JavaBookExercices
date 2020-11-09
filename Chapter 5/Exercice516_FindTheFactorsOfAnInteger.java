package Chapter5;

import java.util.Scanner;

public class Exercice516_FindTheFactorsOfAnInteger {

	public static void main(String[] args) {
		/*
		 * (Find the factors of an integer) Write a program that reads an integer and
		 * displays all its smallest factors in an increasing order. For example, if the
		 * input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
		 * 
		 * Bryan Chontasi
		 */
		// create a scanner to insert an intefer
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int factNumber = 2; // to test numbers as factors,always starting by 2

		while (factNumber < number) { // the factor must be always smaller than the number.
			if (number % factNumber == 0) {
				System.out.print(factNumber + ", ");
				number /= factNumber;
			} else {
				factNumber++; // to increase one the factor and check
			}
		}
		System.out.print(number + ".");
	}
}

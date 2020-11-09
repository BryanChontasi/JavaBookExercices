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
		
		// create a scanner to insert an integer
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int factNumber = 2; // to test numbers as factors,always starting by 2

		while (factNumber < number) { //you can do fact <= number too, but then you need to delete the System.out.print at the end. (no necessary)
			if (number % factNumber == 0) {
				System.out.print(factNumber + ", ");
				number /= factNumber;
			} else {
				factNumber++; // to increase one the factor and check
			}
		}
		System.out.print(number + "."); // to insert a dot at the end of the results, adding the number remaining instead of the last factor.
	}
}

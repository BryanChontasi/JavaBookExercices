package Chapter5;

public class Exercice510_FindNumbersDivisibleBy3and4 {
	public static void main(String[] args) {

		/*
		 * (Find numbers divisible by 3 and 4) Write a program that displays all the
		 * numbers from 100 to 1,000, ten per line, that are divisible by 3 and 4.
		 * Numbers are separated by exactly one space.
		 * 
		 */

		final int numberPerLine = 10; // ten numbers per line
		int counter = 0; // counts how many numbers per line

		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 4 == 0) { // to check if numbers are divisible
				counter++;
				if (counter % numberPerLine == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}

	}

}

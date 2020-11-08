package Chapter5;

public class Exercice511_FindNumbersDivisibleBy3OR4 {

	public static void main(String[] args) {
		/*
		 * (Find numbers divisible by 3 or 4, but not both) Write a program that
		 * displays all the numbers from 100 to 200, ten per line, that are divisible by
		 * 3 or 4, but not both. Numbers are separated by exactly one space.
		 * 
		 * Bryan Chontasi
		 */

		final int numbersPerLine = 10;
		int counter = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				counter++;
				if (counter % numbersPerLine == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + "  ");
				}
			}
		}

	}

}

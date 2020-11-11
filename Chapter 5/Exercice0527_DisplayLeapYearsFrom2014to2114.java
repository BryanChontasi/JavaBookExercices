package Chapter5;

public class Exercice527_DisplayLeapYearsFrom2014to2114 {

	public static void main(String[] args) {
		/*
		 * (Display leap years) Write a program that displays all the leap years, ten
		 * per line, from 2014 to 2114, separated by exactly one space. Also display the
		 * number of leap years in this period.
		 * 
		 * 
		 * Bryan Chontasi
		 */

		System.out.println("The Leap Years from 2014 to 2114 are: ");
		int counter = 0;// count how many years per line

		for (int i = 2014; i <= 2114; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) { // formula to check Leap Years
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) { // ten per line
					System.out.println();
				}
			}
		}
	}
}

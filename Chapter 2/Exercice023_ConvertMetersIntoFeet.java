import java.util.Scanner;

public class Exercice023_ConvertMetersIntoFeet {
	public static void main(String[] args) {
		/*
		 * (Convert meters into feet) Write a program that reads a number in meters,
		 * converts it to feet, and displays the result. One meter is 3.2786 feet.
		 *
		 * Example: 10 meters = 32.786 feet
		 **/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for meter: ");
		double meter = input.nextDouble();

		double result = meter * 3.2786;

		System.out.println(meter + " meters is " + result + " feet");
	}

}

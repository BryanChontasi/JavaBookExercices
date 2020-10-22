 import java.util.Scanner;

public class Exercice024_ConvertSquareMeterIntoPing {
	public static void main(String[] args) {

		/*
		 * Write a program that converts square meter into ping. The program prompts the
		 * user to enter a number in square meter, converts it to ping, and displays the
		 * result. One square meter is 0.3025 ping.
		 *
		 * Example: 50 square meters = 14.125 pings
		 **/

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in square meters: ");
		double squareMeter = input.nextDouble();

		double result = squareMeter * 0.3025;

		System.out.println(squareMeter + " square meters is " + result + " pings");
	}
}

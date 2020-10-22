import java.util.Scanner;

public class Exercice0223_CostOfDriving {

	private static Scanner input;

	public static void main(String[] args) {
		/*
		 * (Cost of driving) Write a program that prompts the user to enter the distance
		 * to drive, the fuel efficiency of the car in miles per gallon, and the price
		 * per gallon then displays the cost of the trip.
		 * 
		 */
		input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double cost = (distance / miles) * price;
		System.out.println("The cost of driving is £" + (int) (cost * 100) / 100.0);
	}

}

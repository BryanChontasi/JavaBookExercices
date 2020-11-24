package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0065_SortThreeNumbers {

	public static void main(String[] args) {
		/*
		 * (Sort three numbers) Write a method with the following header to display
		 * three numbers in decreasing order:
		 * 
		 *  ublic static void displaySortedNumbers(
		 * 		double num1, double num2, double num3) 
		 * 
		 * Write a test program that prompts the user to enter three numbers and 
		 * invokes the method to display them in decreasing order.
		 * 
		 * Bryan Chontasi 24/11/2020
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = input.nextDouble();
		System.out.print("Enter third number: ");
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3); //calls the method
		
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp = 0; //to hold swap
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 < num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}

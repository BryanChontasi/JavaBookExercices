package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0066_DisplayPatterns {

	public static void main(String[] args) {
		/*
		 * Display patterns) Write a method to display a pattern as follows:
			1
			1 2
			1 2 3
			...
			The method header is
			public static void displayPattern(int n)

		 *
		 * Bryan Chontasi 24/11/2020
		 */
		//prompt the user to insert input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		displayPattern(num); //calls the method
	}
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }
}

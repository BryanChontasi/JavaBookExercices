package section3;

import java.util.Scanner;

public class Exercice36_HealthAppBMIImproved {

	public static void main(String[] args) {
		/*
		 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
		 * let the user enter weight, feet, and inches. For example, if a person is 5
		 * feet and 10 inches, you will enter 5 for feet and 10 for inches.
		 * 
		 * Result:
		 * Enter weight in pounds: 140
		 * Enter feet: 5
		 * Enter inches: 10
		 * 
		 * BMI is 20.087702275404553 Normal
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();

		System.out.print("Enter feet: ");
		double feet = input.nextDouble();

		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		double heightInInches = feet * 12 + inches;

		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant

		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		double heightInMeters = heightInInches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

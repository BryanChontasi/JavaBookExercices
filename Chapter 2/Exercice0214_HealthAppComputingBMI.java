import java.util.Scanner;

public class Exercice0214_HealthAppComputingBMI {

	public static void main(String[] args) {
		/*Body Mass Index (BMI) is a measure of health on weight. 
		 * It can be calculated by taking your weight in kilograms and dividing,
		 * by the square of your height in meters. 
		 * Write a program that prompts the user to enter a weight in pounds and height in inches 
		 * and displays the BMI. 
		 * 
		 * Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
		 * 
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		double kilo = pounds * 0.45359237;
		double meters = inches * 0.0254;
		double bmi = kilo / Math.pow(meters, 2);
		System.out.println("BMI IS: " + (int) (bmi * 10000) / 10000.0);
	}
}

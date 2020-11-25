package Chapter_6_Methods;

public class Exercice0069_ConversionsBetweenPoundsAndKilograms {

	public static void main(String[] args) {
		/*
		 * (Conversions between pounds and kilograms) Write a class that contains the
		 * following two methods:
		 * 
		 * // Convert from pounds to kilograms public static double
		 * poundToKilogram(double pound)
		 * 
		 * //Convert from kilograms to pounds public static double
		 * kilogramToPound(double kilogram)
		 * 
		 * The formula for the conversion is:
		 * 
		 * pound = 0.453 * kilogram kilogram = 2.204 * pound
		 * 
		 * Write a test program that invokes these methods to display the following
		 * tables:
		 * 
			Kilograms      Pounds         |    Pounds         Kilograms      
			-----------------------------------------------------------
			1              2.2            |      20              9.06
			3              6.6            |      25             11.33
			...
			197            434.2          |     510            231.03
			199            438.6          |     515            233.30

		 * 
		 * Bryan Chontasi 25/11/2020
		 */

		// create table
		System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		System.out.println("-----------------------------------------------------------");

		// loop for print kilograms and pounds in the table
		for (int i = 0; i <= 99; i++) {
			System.out.printf("%-15d%-14.1f%2s%8d%18.2f\n", 1 + i * 2, kilogramToPound(1 + i * 2), "|", 20 + 5 * i,
					poundTokilograms(20 + 5 * i));
		}

	}

	// method to convert pound to kilo
	public static double poundTokilograms(double pound) {
		return 0.453 * pound;
	}

	// method to convert kilo to pound
	public static double kilogramToPound(double kilogram) {
		return 2.204 * kilogram;
	}
}

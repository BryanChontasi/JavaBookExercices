package Chapter5;

public class Exercice53_ConvertionCelciusFarenheit {

	public static void main(String[] args) {
		/*
		 * (Conversion from C to F) Write a program that displays the following table
		 * (note that farenheit = celsius * 9/5 + 32):
		 * 
		 * Celsius Fahrenheit 0 32.0 2 35.6 ... 98 208.4 100 212.0
		 * 
		 * by Bryan Chontasi
		 */

		double celsius = 0; // to start from 0
		double newF = 0; // to save farenheit results

		System.out.print("Celsius 		Farenheit");
		do {
			newF = celsius * 9 / 5 + 32;
			System.out.print("\n" + (int) celsius + " 		" + newF);
			celsius++;
		}
		while (celsius <= 100);
		{
		}
	}
}

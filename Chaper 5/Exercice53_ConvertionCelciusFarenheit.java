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

		System.out.println("Celsius 		Farenheit");
		do {
			newF = celsius * 9 / 5 + 32;
			System.out.printf("%-3.0f%22.1f\n",  celsius , newF); //"%-3.0f%22.1f\n" organizates the results in printf
			celsius++;
		}
		while (celsius <= 100);
		{
		}
	}
}

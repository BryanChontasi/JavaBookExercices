package Chapter5;

public class Exercice55_ConversionCelsiusToFarenheitAndViceVersa {
	public static void main(String[] args) {
		/*
		 * (Conversion from Co to Fo and Fo to Co) Write a program that displays the
		 * following two tables side by side:
		 * Celsius  Fahrenheit 	| Fahrenheit 	Celsius
		 * 0 			32.000 	| 20				−6.667
		 * 2 			35.600 	| 25 			−3.889
		 * ... 					  
		 * 98 			208.400 	| 265  			129.444
		 * 100 			212.000 	| 270   			132.222
		 * 
		 * Bryan Chontasi
		 */
		double celsius = 0; // to start from 0
		double farenheit = 20;
		double newF = 0; // to save farenheit results
		double count = 0;
		double newC = 0;

		System.out.println("Celsius		Farenheit	|	Celsius		Farenheit");
		do {
			newF = celsius * 9 / 5 + 32; //formula C to F
			newC = (farenheit - 32) * 5/9; //formula F to C
			System.out.printf("%-3.0f%22.3f	|	%-3.0f%22.3f\n", celsius, newF, farenheit, newC); // "%-3.0f%22.3f	|	%-3.0f%22.3f\n" organise the results in the table
			celsius++;
			farenheit += 5;
			count++; // add 1 to the count in while
		} while (count <= 100);{
		}
	}
}

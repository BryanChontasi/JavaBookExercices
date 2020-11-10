package Chapter5;

public class Exercice524_SumASeriesOfFractions {

	public static void main(String[] args) {
		/*
		 * (Sum a series) Write a program to compute the following summation: 
		 * 1/3 + 3/5 + 5/7 + 9/11 + 11/13 ... + 95/97 + 97/99
		 * 
		 * Bryan Chontasi
		 */
  
		double result = 0; //to store the final result
    
		for (double i = 1.0; i <= 97.0; i += 2) {
			result +=  i / (i + 2);
		}
		System.out.print("The result of the serie (1/3 + 3/5 + 5/7 + 9/11 + 11/13 ... + 95/97 + 97/99) is: \n" + result);
	}
}

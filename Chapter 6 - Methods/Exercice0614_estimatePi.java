package Chapter_6_Methods;

public class Exercice0614_estimatePi {

	public static void main(String[] args) {
		/* 
		 * (Estimate pi) pi can be computed using the following summation:
		 
		   	m(i) = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ((-1)^(i+1))/(2*i-1))
		  
		 * Write a method that returns m(i) for a given i and write a test program that 
		 * displays the following table:
		 * 
		 * 
		 * Bryan Chontasi 26/11/2020
		 */
		
		//Create table
		System.out.println("i      m(i)");
		System.out.println("------------");
		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%-5d%.4f\n", i, estimatePi(i)); //calls method
		}
	}
	//method for estimate Pi
	public static double estimatePi(int i) {
		double sum = 0.0; //to sum the estimaate pi for each calculation
		
		for(int j= 1; j <= i; j++) {
            sum += 4 * (Math.pow(-1, j + 1) / (2 * j - 1));
		}
		return sum;
	}
}

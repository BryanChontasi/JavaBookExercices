package Chapter_6_Methods;

public class Exercice0610_UseIsPrimeMethod {
	
	public static void main(String[] args) {
		/*
		 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
		 * isPrime(int number) method for testing whether a number is prime. Use this
		 * method to find the number of prime numbers less than 10000.
		 * 
		 * 
		 * Bryan Chontasi 25/11/2020
		 */
		int numberOfPrimes = 0;	// Counts the number of prime numbers

		// Find the number of prime numbers less than 10000
		for (int i = 1; i < 1000; i++) {
			if (isPrime(i))
				numberOfPrimes++; // Increament 
		}

		// Display result
		System.out.println(
			"The number of prime numbers less than 10000: " + numberOfPrimes);
	}
	
	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime
	}
}

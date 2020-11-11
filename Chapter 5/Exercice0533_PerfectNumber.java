package Chapter5;

public class Exercice533_PerfectNumber {

	public static void main(String[] args) {
		/*
		 * (Perfect number) A positive integer is called a perfect number if it is equal
		 * to the sum of all of its positive divisors, excluding itself. For example, 6
		 * is the first perfect numberbecause6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4
		 * + 2 + 1.There are four perfect numbers <10,000 Write a program to find all
		 * these four numbers.
		 * 
		 * Bryan Chontasi
		 */
		
		System.out.println("The four perfect numbers < 10,000 are: ");
		//lop to generate numbers from 1 to 10,000
		for (int i = 1; i <= 10000; i++) {
			// the number and divisor are the number i in the loop
			int number = i; 
			int divisor = i;
			int sumOfDivisors = 0;

			while (divisor > 0) {
				if (number % divisor == 0 && number != divisor) {
					sumOfDivisors += divisor;
				}
				divisor--;//to compare each number bigger than 0 and smaller than the number
			}
			if (number == sumOfDivisors) {
				System.out.println(number);
			}
		}
	}
}

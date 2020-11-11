package Chapter5;

import java.util.Scanner;

public class Exercice0541_OcurrenceOfMaxNumbers {

	public static void main(String[] args) {
		/*
		 * (Occurrence of max numbers) Write a program that reads integers, finds the
		 * largest of them, and counts its occurrences. Assume the input ends with
		 * number 0. Sup- pose you entered 3 5 2 5 5 5 0; the program finds that the
		 * largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain two
		 * variables, max and count. max stores the current max number and count stores
		 * its occurrences. Initially, assign the first number to max and 1 to count.
		 * Compare each subsequent number with max. If the number is greater than max,
		 * assign it to max and reset count to 1. If the number is equal to max,
		 * increment count by 1.)
		 *  
		 *  Example:
			Enter numbers (input ends with number 0): 4 2 2 3 4 1 3 9 9 9 0 0
			The largest number is 9
			The occurrence count of the largest number is 3
			
		 * Bryan Chontasi
		 */
		//create scanner for inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers (input ends with number 0): ");
		int number = input.nextInt();
		
		int max= 0;//max to store the biggest number
		int count= 0;//count how many times biggest number repeats
		
		while(number !=0) { // to end inputs when 0 is entered
			number = input.nextInt();
			if ( number > max) {//if number is bigger than previous max, they need to swap
				max = number;
				count = 1;//and count starts from 1 again
			}else if(number == max) { //if number inserted is equal to max, count adds 1
				count++;
			}
		}
		System.out.println("The largest number is " + max
				+ "\nThe occurrence count of the largest number is " + count);
	}
}

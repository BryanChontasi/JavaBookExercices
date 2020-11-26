package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0612_displayNumbers {
	
	public static void main(String[] args) {
		/*
		 * (Display numbers) Write a method that prints numbers using the following
		 * header: 
		 	
		 	public static void printNumbers(int num1, int num2, int
		  		numberPerLine) 
		 
		 * This method prints the characters between num1 and num2 with
		 * the specified numbers per line. Write a test program that prints ten
		 * characters per line from 1 to 100. Numbers are separated by exactly one
		 * space.
		 * 
		 * Bryan Chontasi 26/11/2020
		 */
		
		// promt user to insert two numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		int num2 = input.nextInt();
		
		int numPerLine = 10; // numbers per line when is printed
		
		printNumbers(num1,num2,numPerLine); //calls the method	
	}
	public static void printNumbers(int num1, int num2, int numberPerLine) {
		int counter = 0; //counts how many numbers per line
		for (int i = num1; i <= num2; i++) {
			counter++;
			if(counter % numberPerLine == 0) { //when count reach to 10, creates new line
				System.out.println(i);
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}

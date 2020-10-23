package Chapter5;

import java.util.Scanner;

public class Exercice51_PassOrFailSchoolApp {

	public static void main(String[] args) {
		/*
		 * (Pass or fail) Write a program that prompts a student to enter a Java score.
		 * If the score is greater or equal to 60, display “you pass the exam”;
		 * otherwise, display “you don’t pass the exam”. Your program ends with input
		 * -1. Here is a sample run:
		 * 
		 * Enter your score: 80 
		 * You pass the exam.
		 * 
		 * Enter your score: 59 
		 * You don't pass the exam.
		 * 
		 * Enter your score: −1 
		 * No numbers are entered except 0
		 * 
		 */

		// create input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your score: ");
		double score = 0;

		while (score != -1) {
			System.out.print("Enter your score: ");
			score = input.nextDouble();

			if (score >= 60 && score <= 100) {
				System.out.println("You pass the exam.");
			} else if (score < 60 && score >= 0) {
				System.out.println("You don't pass the exam.");
			} else if (score > 100) {
				System.out.println("Enter score starting from 0 to 100.");
			} else {
				System.out.println("No numbers are entered except 0.");
			}
		}

	}

}

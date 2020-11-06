package Chapter5;

import java.util.Scanner;

public class Exercice52_RepeatMultiplicationsApp {

	public static void main(String[] args) {
		/*
		 * (Repeat multiplications) Listing 5.4, SubtractionQuizLoop.java, generates
		 * five random subtraction questions. Revise the program to generate ten random
		 * multiplication questions for two integers between 1 and 12. Display the
		 * correct count and test time.
		 * 
		 * Bryan Chontasi
		 */

		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; // output string is initially empty
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
			// Generate two random single-digit integers
			int number1 = 1 + (int) (Math.random() * ((12 - 1) + 1));
			int number2 = 1 + (int) (Math.random() * ((12 - 1) + 1));

			// If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			// Prompt the student to answer "What is number1 – number2?"
			System.out.print("What is " + number1 + " x " + number2 + "? ");
			int answer = input.nextInt();

			if (number1 * number2 == answer) {
				System.out.println("You are correct!");
				correctCount++; // Increase the correct answer count
			} else {
				System.out.println(
						"Your answer is wrong.\n" + number1 + " * " + number2 + " should be " + (number1 * number2));
			}
			// Increase the question count
			count++;
			output += "\n" + number1 + " x " + number2 + " = " + answer
					+ ((number1 * number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correctCount + " out of 10" + "\nTest time is " + testTime / 1000
				+ " seconds\n" + output);

	}

}

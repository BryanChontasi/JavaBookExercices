package Chapter5;

import java.util.Scanner;

public class Exercice59_FindTheTwoLowestScoreApp {

	public static void main(String[] args) {
		/*
		 * (Find the two lowest scores) Write a program that prompts the user to enter
		 * the number of students and each student’s name and score, and finally
		 * displays the names of the students with the lowest and second-lowest scores.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int studentNum = input.nextInt();
		
		//to use in the loop
		double score = 0; 	
		String name = "";	

		
		//to store values of worst student
		String worstStudent = "";
		double worstScore = 250; 

		//to store values of second worst student
		String secWorstStudent = "";
		double secWorstScore = 250;

		for (int i = 0; i < studentNum; i++) {
			System.out.print("Enter the name of student : ");
			name = input.next();
			System.out.print("Enter the score of " + name + " : ");
			score = input.nextDouble();

			if (score < worstScore) {
				secWorstStudent = worstStudent;
				secWorstScore = worstScore;
				worstStudent = name;
				worstScore = score;

			} else if (score == worstScore) { // if the  worst student is shared by more than one
				worstStudent += ", " + name;
			} else if (score < secWorstScore) {
				secWorstStudent = name;
				secWorstScore = score;
			} else if (score == secWorstScore) { // if the second worst is shared by more than one
				secWorstStudent += ", " + name;
			}
		}
		System.out.print(
				"\nThe Student with the lowest score is: " + worstStudent + ".  Whith a Total Score of: " + worstScore);
		System.out.print("\nThe Student  with the second lowest score is: " + secWorstStudent
				+ ". Whith a Total Score of: " + secWorstScore);
	}
}

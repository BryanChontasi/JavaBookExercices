package Chapter5;

import java.util.Scanner;

public class Exercice58_FindTheHightScoreSchoolApp {

	public static void main(String[] args) {
		/*
		 * (Find the highest score) Write a program that prompts the user to enter the
		 * number of students and each student’s name and score, and finally displays
		 * the name of the student with the highest score. Use the next() method in the
		 * Scanner class to read a name, rather than using the nextLine() method.
		 * 
		 * Bryan Chontasi
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int studentNum = input.nextInt();
		
		double score = 0;
		double maxScore = 0; //to record maximum score
		String name= "";
		String bestStudent= "";//to record the name of the best student
		for (int i = 0 ; i < studentNum; i++) {
			System.out.print("Enter the name of student : ");
			name = input.next();
			System.out.print("Enter the score of " + name + " : ");
			score = input.nextDouble();
			
			if (score > maxScore) {
				maxScore = score;
				bestStudent = name;
			}else if (score == maxScore) { //if the top score is shared by more than one
				bestStudent += ", " + name;
			}	
		}	
		System.out.print("\nBest Student is: " + bestStudent + " whith a Total Score of: "+ maxScore);
	}
}

package Chapter4;

import java.util.Scanner;

public class Exercice418_StudentMajorAndStatus {

	private static Scanner input;

	public static void main(String[] args) {
		/*
		 * (Student major and status) Write a program that prompts the user to enter two
		 * characters and displays the major and status represented in the characters.
		 * The first character indicates the major and the second is number character 1,
		 * 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior,
		 * or senior. Suppose the following characters are used to denote the majors: 
		 * I: Information Management 
		 * C: Computer Science 
		 * A: Accounting 
		 * 
		 * Here is a sample run:
		 * 
		 *  Enter two characters: I1
		 *  Information Management Freshman
		 */

		input = new Scanner(System.in);
		// create input for two characters and make them upper case
		System.out.print("Enter two characters: ");
		String chars = input.next().toUpperCase();

		// separate the characters
		char major = chars.charAt(0);
		char grade = chars.charAt(1);

		// create string for later
		String majorName = "";
		String gradeName = "";

		boolean isValid = true;

		switch (major) {
		case 'I':
			majorName = " Information Management";
			break;
		case 'C':
			majorName = " Computer Science";
			break;
		case 'A':
			majorName = " Accounting";
			break;
		default:
			isValid = false;
			break;
		}
		if (isValid != false) {
			switch (grade) {
			case '1':
				gradeName = "freshman";
				break;
			case '2':
				gradeName = " sophomore ";
				break;
			case '3':
				gradeName = " junior";
				break;
			case '4':
				gradeName = " senior";
				break;
			default:
				isValid = false;
				break;
			}
		}
		if (isValid == false) {
			System.out.println("Invalid input");
		} else {
			System.out.println(majorName + " " + gradeName);
		}
	}
}

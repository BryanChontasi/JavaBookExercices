import java.util.Scanner;

public class Exercice0620CountTheLettersInAString {

	public static void main(String[] args) {
		/*
		 * (Count the letters in a string) Write a method that counts the number of
		 * letters in a string using the following header:
		 *
		 * public static int countLetters(String s)
		 * 
		 * Write a test program that prompts the user to enter a string and displays the
		 * number of letters in the string.
		 * 
		 * Bryan Chontasi 28/11/2020
		 */
		
		//promt user to insert input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String string = input.next();

		System.out.print("The numbers of letters: " + countLetters(string));

	}
	// method to count the letters in a string
	public static int countLetters(String s) {
		int numLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				numLetters++;
			}
		}
		return numLetters;
	}
}

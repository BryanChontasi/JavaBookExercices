import java.util.Scanner;

public class Exercice0623_OcurrencesOfASpecifiedCharacter {

	public static void main(String[] args) {
		/*
		 * (Occurrences of a specified character) Write a method that finds the number
		 * of occurrences of a specified character in a string using the following
		 * header:
		 * 
		 * public static int count(String str, char a)
		 * 
		 * For example, count("Welcome", 'e') returns 2. Write a test program that prompts 
		 * the user to enter a string followed by a character then displays the number of 
		 * occurrences of the character in the string.
		 * 
		 * Bryan Chontasi 28/11/2020
		 */
		
		//promt user to insert inputs
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        
        System.out.println("The number of occurrences of " + ch + " in " + string + " is " + count(string, ch));
	}
	
	public static int count(String str, char a) {
		int counter = 0; //to count te number of ocurrences of a character in the string.
		for (int i = 0; i < str.length(); i++ ) {
			if (str.charAt(i) == a) {
				counter++;
			}
			
		}
		return counter;
	}
}

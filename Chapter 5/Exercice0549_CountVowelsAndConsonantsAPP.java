package Chapter5;

import java.util.Scanner;

public class Exercice0549_CountVowelsAndConsonantsAPP {

	public static void main(String[] args) {
		/*
		 * (Count vowels and consonants) Assume that the letters A, E, I, O, and U are
		 * vowels. Write a program that prompts the user to enter a string, and displays
		 * the number of vowels and consonants in the string.
		 *  Example:
		 	Enter a string: hello word
			The number of vowels is 3
			The number of consonants is 6
		 * 
		 * Bryan Chontasi 11/11/2020
		 */
		//create scanner for input
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a string: ");
		 String str = input.nextLine(); //to enter more than one word
		 
		 int numVowels = 0; //counter for vowels
		 int numConsonants = 0;//counter for consonants
		 
		 for(int i = 0; i < str.length(); i++) { 
			 char ch = str.toUpperCase().charAt(i); //to chose the character in Upper Case
			 //to check is character is vowel or consonant
			 if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				 numVowels++; //ig vowel add 1
			 }else if (ch >= 'A' && ch <= 'Z') {
				 numConsonants++; //if consonant add 1
			 }
		 }
		 //display results
		 System.out.println("The number of vowels is " + numVowels);
	     System.out.println("The number of consonants is " + numConsonants);
	}

}

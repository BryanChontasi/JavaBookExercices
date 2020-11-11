package Chapter5;

public class Exercice0543_MathCombinatios_Easy {

	public static void main(String[] args) {
		/*
		 * (Math: combinations) Write a program that displays all possible combinations
		 * for picking two numbers from integers 1 to 7. Also display the total number
		 * of all combinations.
		 * Example:
			1     2
			1     3
			...
			...
			5     7
			6     7
			The total number of all combinations is 21
		 * 
		 * Bryan Chontasi
		 */

		int count = 0;//to count the number of combinations
		
		//create combinations
		for (int i = 1; i < 7; i++) {
			for (int x = i + 1; x <= 7; x++) {
				System.out.println(i + "     " + x);
				count++; //add 1 to the counter with each combination
			}
		}
		System.out.println("The total number of all combinations is " + count);
	}
}

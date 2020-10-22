import java.util.Scanner;

public class Exercice026_MultiplyTheDigitsInAnIntEger {

	public static void main(String[] args) {
		
		/*Write a program that reads an integer between 0 and 1000 and multiplies all the digits in the integer. 
		 * For example, if an integer is 932, the multiplication of all its digits is 54.
		 * 	 
		 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
		 *  For instance, 932 % 10 = 2 and 932 / 10 = 93.
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");

		int initialNumber = input.nextInt();

		int number = initialNumber;
		int multiplication = initialNumber % 10;

		if (initialNumber > 1000 || initialNumber < 0) {
			System.out.println("Out of range!");
			System.out.println("Number should be between 0 & 1000!");

		} else {
			while (number / 10 != 0) {
				number = number / 10;
				multiplication *= number % 10;
			}
			System.out.print("The multiplication of all digits in " + initialNumber + " is: " + multiplication);
		}

	}
}

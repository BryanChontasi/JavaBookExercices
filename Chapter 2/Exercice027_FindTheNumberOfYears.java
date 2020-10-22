import java.util.Scanner;

public class Exercice027_FindTheNumberOfYears {

	public static void main(String[] args) {
		
		/* Write a program that prompts the user to enter the minutes (e.g., 1 billion),
		 *  and displays the number of years and remaining days for the minutes. 
		 *  For simplicity, assume that a year has 365 days.
		 *  
		 *  Example: 1000000000 minutes is approximately 1902 years and 214 days
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");

		int numberOfMinutes = input.nextInt();
		int year = 365;
		int years = numberOfMinutes / 60 / 24 / year;
		int days = numberOfMinutes / 60 / 24 % year;

		System.out.print(numberOfMinutes + " minutes is approximately " + years + " years and " + days + " days");
	}

}

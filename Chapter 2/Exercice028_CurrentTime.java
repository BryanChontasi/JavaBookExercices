import java.util.Scanner;

public class Exercice028_CurrentTime {

	public static void main(String[] args) {
		 
		/*
		 * Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
		 * displays the current time in GMT. Revise the program so it prompts the user
		 * to enter the time zone offset to GMT and displays the time in the specified
		 * time zone.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();

		// Obtain the total milliseconds since midnight,
		long totalMilliseconds = System.currentTimeMillis();
		// Obtain the total seconds since midnight,
		long totalSeconds = totalMilliseconds / 1000;
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		// Compute the current hour
		long currentHour = (totalHours + timeZone) % 24;

		if (currentHour >= 12) {
			System.out.println(
					"Current time is " + (currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " PM   GMT");
		} else {
			System.out.println(
					"Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM   GMT");
		}

	}

}

import java.util.Scanner;

public class Exercice0625_ConvertMillisecondsToHoursMinutesAndSeconds {

	public static void main(String[] args) {
		/*
		 * Convert milliseconds to hours, minutes, and seconds) Write a method that con-
		 * verts milliseconds to hours, minutes, and seconds using the following header:
		 *
		 * public static String convertMillis(long millis) 
		 * 
		 * The method returns a string
		 * as hours:minutes:seconds. For example, convertMillis(5500) returns a string
		 * 0:0:5, convertMillis(100000) returns a string 0:1:40, and
		 * convertMillis(555550000) returns a string 154:19:10. Write a test program
		 * that prompts the user to enter a long integer for milliseconds and displays a
		 * string in the format of hours:minutes:seconds.
		 * 
		 * 
		 * Bryan Chontasi 28/11/2020
		 */
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of milliseconds: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));


	}
	public static String convertMillis(long millis) {
		long hours = 0;
        long minutes = 0;
        long seconds = 0;
        
        
        //milliseconds formulas for hour, minut and second
        long millisInHour = 60 * 60 * 1000; 
        long millisInMinute = 60 * 1000;
        long millisInSecond = 1000;
        //to convert milliseconds and get output
        hours = millis / millisInHour;
        minutes = millis % millisInHour / millisInMinute;
        seconds = millis % millisInMinute / millisInSecond;

        return hours + ":" + minutes + ":" + seconds;
	}

}

package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0637_FormatAnInteger {

	public static void main(String[] args) {
		/*
		 * (Format an integer) Write a method with the following header to format the
		 * inte- ger with the specified width.
		 * 
		 * public static String format(int number, int width)
		 * 
		 * The method returns a string for the number with one or more prefix 0s. The
		 * size of the stringisthewidth.Forexample,format(34, 4) return 0034 and format
		 * (34, 5) returns 00034. If the number is longer than the width, the method
		 * returns the string representation for the number.For example,format(34, 1)
		 * returns 34. Write a test program that prompts the user to enter a number and
		 * its width, and displays a string returned by invoking format(number, width).
		 * 
		 * 
		 * Bryan Chontasi 28/11/2020
		 */
		
		//promt user to insert input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter a formatting width: ");
		int width = input.nextInt();
		System.out.println("The formatted number: " + createFormat(number, width));
	}

	public static String createFormat(int number, int width) {
		if (width <= getSize(number)) { // if width insertes is less than the size of number returns just the number
			return String.valueOf(number);
		} else {
			String result = "";
			for (int i = 0; i < width - getSize(number); i++) {
				result += "0"; //adds 0 before the number
			}
			result += String.valueOf(number);//adds the number at the end
			return result;
		}
	}
	// method to know the size of the input inserted 
	public static int getSize(int d) {
		int size = 0;
		while (d > 0) {
			size++;
			d /= 10;
		}
		return size;
	}
}

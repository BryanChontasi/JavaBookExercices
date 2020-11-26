package Chapter_6_Methods;

public class Exercice0616_NumberOfDaysInAYear {

	public static void main(String[] args) {
		/*
		 * (Number of days in a year) Write a method that returns the number of days in
		 * a year using the following header: 
		 
		 	public static int numberOfDaysInAYear(int year)
		 	 
		 * Write a test program that displays the number of days in the years
		 * between 2014 and 2034.
		 * 
		 * Bryan Chontasi 26/11/2020
		 */
		//print table
		System.out.println("Year		Number of Days");
		System.out.println("-----------------------------");
		//from year 2014 to 2034
		for (int i = 2014; i <= 2034; i++) {
			System.out.println(i + "		     " + numberOfDaysInAYear(i));
		}
	}
	//method to check how many days in a year
	public static int numberOfDaysInAYear(int year) {
		return isLeapYear(year) ? 366 : 365;// if true return 366, if not 365
	}
	//method to check if is a leap year
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}
}

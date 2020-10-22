import java.util.Scanner;

public class Exercice021_ConvertMilesToKilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program that reads a mile in a double value from the console, 
		 * converts it to kilometres, and displays the result. The formula for the conversion is as follows:
		 * 1 mile = 1.6 kilometres
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter miles: ");
			
		double miles = input.nextDouble();
		double kilometres = (int) miles * 1.6;
		
		//(int) (kilometres * 100) / 100.00 : to obtain a decimals
		System.out.println(miles + " miles is " + (int) (kilometres * 100) / 100.00 + " kilometres");
	}
}

import java.util.Scanner;

public class Exercice025_FinancialAppCalculateTips {

	public static void main(String[] args) {
		/*Write a program that reads the subtotal and the gratuity rate and 
		 * then computes the gratuity and total. For example, if the user enters 10 for subtotal 
		 * and 12% for gratuity rate, the program displays $1.2 as gratuity and $11.2 as total. 
		 * 
		 */
     
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble() / 100;

		gratuity = gratuity * subtotal;
		double total = subtotal + gratuity;

		System.out.print("The gratuity is $" + gratuity + " and total is $" + total);

	}

}

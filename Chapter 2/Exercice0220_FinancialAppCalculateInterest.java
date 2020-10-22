import java.util.Scanner;

public class Exercice0220_FinancialAppCalculateInterest {

	public static void main(String[] args) {
		
		/*(Financial application: calculate interest) If you know the balance and the annual percentage interest rate, 
		 * you can compute the interest on the next monthly payment using the following formula:
		 * interest = balance * (annualInterestRate/1200)
		 * 
		 * Write a program that reads the balance and the annual percentage interest rate and
		 * displays the interest for the next month. 
	    	*/

		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double rate = input.nextDouble();

		double interest = balance * (rate / 1200);
		System.out.print("The interest is " + (int) (interest * 100000) / 100000.0);
	}

}

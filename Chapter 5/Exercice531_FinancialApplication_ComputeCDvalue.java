package Chapter4;

import java.util.Scanner;

public class Exercice531_FinancialApplication_ComputeCDvalue {

	public static void main(String[] args) {
		/*
		 * (Financial application: compute CD value) Suppose you put $10,000 into a CD
		 * with an annual percentage yield of 6.15%. After one month, the CD is worth
		 * 10000 + 10000 * 6.15 / 1200 = 10051.25 
		 * After two months, the CD is worth
		 * 10051.25 + 10051.25 * 6.15 / 1200 = 10102.76 
		 * After three months, the CD is
		 * worth 10102.76 + 10102.76 * 6.15 / 1200 = 10154.53 
		 * and so on. 
		 *  Write a program that prompts the user to enter an amount (e.g., 10000), the annual percentage
		 * yield (e.g., 6.15), and the number of months (e.g., 18) and displays a table
		 * as shown in the sample run.
			
			Enter the initial deposit amount: 10000
			Enter annual percentage yield: 6.15
			Enter maturity period (number of months): 18
			Month		CD Value
			1               10051.25
			2               10102.76
			...
			17              10907.90
			18              10963.81

		 * 
		 * Bryan Chontasi
		 */
		//create scanner for inputs
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter the deposit amount, annual percentage and number of months 
		System.out.print("Enter the initial deposit amount: ");
		double depAmount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double percentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int numMonths = input.nextInt();

		//create headers
		System.out.println("Month" + "\t\t"+ "CD Value");
		for (int i = 1; i <= numMonths; i++) {
			depAmount +=  depAmount  * (percentageYield /1200);;
			System.out.printf("%-16d%.2f\n",i, depAmount);
		}
	}
}

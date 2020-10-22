package section3;

import java.util.Scanner;

public class Exercice331_CurrencyExchangeApp {

	public static void main(String[] args) {
		/*
		 * Financials: currency exchange) Write a program that prompts the user to enter
		 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
		 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
		 * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
		 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars,
		 * respectively.
		 * 
		 * Example:
		 * Enter the exchange rate from dollars to RMB: 6.81
		 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
		 * Enter the dollar amount: 100
		 * 
		 * $100.0 is 681.0 yuan
		 */
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double dollarsOrYuan = input.nextDouble();
		double result;

		if (dollarsOrYuan == 1) {
			System.out.print("Enter the RMB amount: ");
			double yuan = input.nextDouble();
			result = (int) ((yuan / exRate) * 100) / 100.0;
			System.out.print(yuan + " Yuan is $" + result);

		} else if (dollarsOrYuan == 0) {
			System.out.print("Enter the DOLLAR amount: ");
			double dollar = input.nextDouble();
			result = (int) ((exRate * dollar) * 100) / 100.0;
			System.out.print("$" + dollar + " is " + result + " Yuan");
		}

		else {
			System.out.print("incorrect number, try again");
			System.exit(0);
		}

	}

}

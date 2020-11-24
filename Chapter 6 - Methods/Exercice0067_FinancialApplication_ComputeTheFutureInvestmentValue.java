package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0067_FinancialApplication_ComputeTheFutureInvestmentValue {

	public static void main(String[] args) {
		/*
		 * (Financial application: compute the future investment value) Write a method
		 * that computes future investment value at a given interest rate for a
		 * specified number of years. The future investment is determined using the
		 * formula in Programming Exercise 2.21.
		 * 
		 * Use the following method header:
		 * 
		 * public static double futureInvestmentValue( double investmentAmount, double
		 * monthlyInterestRate,int years)
		 * 
		 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
		 * 
		 * Write a test program that prompts the user to enter the investment amount
		 * (e.g., 1,000) and the interest rate (e.g., 9%) and prints a table that
		 * displays future value for the years from 1 to 30, as shown below:
		 * 
				
			Years			Future Value
			1                  1093.81
			2                  1196.41
			...
			29                 13467.25
			30                 14730.58
		 * 
		 * 
		 * Bryan Chontasi 24/11/2020
		 */

		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextInt();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble() / 100; //monthly rate formula
		double monthlyInterestRate = annualInterestRate / 12; //monthly rate formula
		System.out.println("Years		Future Value");

		for (int i = 1; i <= 30; i++) { //loop for 30 years
			System.out.printf("%-19d%.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
		}

	}
	//method to display the future investment value
	public static double futureInvestmentValue(double investmentAmount, double monthtlyInterestRate, int years) {
		return investmentAmount * Math.pow((1 + monthtlyInterestRate), years * 12);
	}
}

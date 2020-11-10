package Chapter5;

import java.util.Scanner;

public class Exercice521_FinancialApp_CompareLoansWithVariousInterestRates {

	public static void main(String[] args) {
		/*
		 * (Financial application: compare loans with various interest rates) Write a
		 * program that lets the user enter the loan amount and loan period in number of
		 * years and displays the monthly and total payments for each interest rate
		 * starting from 5% to 10%, with an increment of 1/4. Here is a sample run:
		 * 	Loan Amount: 10000
        		Number of Years: 4
       			Interest Rate      Monthly Payment        Total Payment
        		5.000              230.29                 11054.06
        		5.250              231.43                 11108.50
        		5.500              232.56                 11163.11
        		5.750              233.71                 11217.88
        		6.000              234.85                 11272.81
        		6.250              236.00                 11327.91
        		6.500              237.15                 11383.18
        		6.750              238.30                 11438.61
        		7.000              239.46                 11494.20
        		7.250              240.62                 11549.95
        		7.500              241.79                 11605.87
        		7.750              242.96                 11661.96
        		8.000              244.13                 11718.20
        		8.250              245.30                 11774.61
        		8.500              246.48                 11831.19
        		8.750              247.67                 11887.92
        		9.000              248.85                 11944.82
        		9.250              250.04                 12001.88
        		9.500              251.23                 12059.11
        		9.750              252.43                 12116.49
       	 	 	10.000              253.63                 12174.04

		 * 
		 * Bryan Chontasi
		 */

		// create scanner for inputs (loan amount and number of years)
		Scanner input = new Scanner(System.in);
		System.out.printf("%21s","Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.printf("%25s","Number of Years: ");
		int numberOfYears = input.nextInt();

		// table header
		System.out.printf("%20s %20s %20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
		//display table with the rates required
		for(double i = 5.0; i<= 10; i += 0.250) {
			System.out.printf("%13.3f ", i);
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = (monthlyPayment * 12) * numberOfYears;
			System.out.printf("%19.2f", monthlyPayment);
			System.out.printf("%25.2f\n",totalPayment);
		}
	}
}

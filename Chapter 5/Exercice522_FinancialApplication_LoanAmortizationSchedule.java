package Chapter5;

import java.util.Scanner;

public class Exercice522_FinancialApplication_LoanAmortizationSchedule {

	public static void main(String[] args) {
		/*
		 * (Financial application: loan amortization schedule) The monthly payment for a
		 * given loan pays the principal and the interest. The monthly interest is
		 * computed by multiply- ing the monthly interest rate and the balance (the
		 * remaining principal). The principal paid for the month is therefore the
		 * monthly payment minus the monthly interest. Write a program that lets the
		 * user enter the loan amount, number of years, and interest rate then displays
		 * the amortization schedule for the loan. Here is a sample run:
		 * 
		 *  Loan Amount: 10000
        		Number of Years: 1
        		Anual Interest Rate: 7
        		Monthly Payment:  865.27
        		Total Payment:  10383.21
        	Payment#            Interest            Principal              Balance
         	1                   58.33                806.93               9193.07
         	2                   53.63                811.64               8381.42
         	3                   48.89                816.38               7565.05
         	4                   44.13                821.14               6743.91
         	5                   39.34                825.93               5917.98
         	6                   34.52                830.75               5087.24
         	7                   29.68                835.59               4251.65
         	8                   24.80                840.47               3411.18
         	9                   19.90                845.37               2565.81
        	10                  14.97                850.30               1715.51
        	11                  10.01                855.26                860.25
       		12                   5.02                860.25                  0.00
		 * 
		 * 
		 * Bryan Chontasi
		 */

		// Prompt user to enter the loan amount, number of years and annual interest
		// rate
		Scanner input = new Scanner(System.in);
		System.out.printf("%21s", "Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.printf("%25s", "Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.printf("%29s", "Anual Interest Rate: ");
		double anualInterestRate = input.nextDouble();

		// calculate the following financial data to display the Monthly payment and
		// Total Payment
		double monthlyInterestRate = anualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = (monthlyPayment * 12) * numberOfYears;
		System.out.printf("%25s %.2f\n", "Monthly Payment: ", monthlyPayment);
		System.out.printf("%23s %7.2f\n", "Total Payment: ", totalPayment);

		// create amortization schedule
		double balance = loanAmount;
		double principal;
		double monthInterest;

		// table header
		System.out.printf("  %14s%20s %20s %20s\n", "Payment#", "Interest", "Principal", "Balance");

		for (int i = 1; i <= numberOfYears * 12; i++) {
			monthInterest = (int) (monthlyInterestRate * balance * 100) / 100.0;
            	principal = (int) ((monthlyPayment - monthInterest) * 100) / 100.0;
            	balance = (int) ((balance - principal) * 100) / 100.0;			
			System.out.printf("%10d %23.2f %21.2f %21.2f\n", i, monthInterest, principal, balance);
		}
	}
}

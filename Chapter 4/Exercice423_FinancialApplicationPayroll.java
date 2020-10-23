package Chapter4;

import java.util.Scanner;

public class Exercice423_FinancialApplicationPayroll {

	public static void main(String[] args) {
		/*
		 * (Financial application: payroll) Write a program that reads the following
		 * information and prints a payroll statement: 
		 * 
		 * Employee’s name (e.g., Smith)
		 * Number of hours worked in a week (e.g., 10) 
		 * Hourly pay rate (e.g., 9.75)
		 * Federal tax withholding rate (e.g., 20%) 
		 * State tax withholding rate (e.g., 9%)
		 * 
		 */
		//inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee’s name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();

		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		//calculations
		double grossPay = hours * payRate;
		double federalWith = grossPay * federalTax;
		double stateWith = grossPay * stateTax;
		double totalDeduction = federalWith + stateWith;
		double netPay = grossPay - totalDeduction;

		//output
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("deductions:");
		System.out.println("	 Federal Withholding " + "(" + (federalTax * 100) + "%) :" + federalWith);
		System.out
				.println("	 State Withholding " + "(" + (stateTax * 100) + "%) : " + (int) (stateWith * 100) / 100.0);
		System.out.println("	 Total Deduction: $" + (int) (totalDeduction * 100) / 100.0);
		System.out.println("Net Pay : $" + netPay);

	}

}

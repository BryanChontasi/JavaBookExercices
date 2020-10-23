package Chapter5;

public class Exercice57_FinancialApplicationComputeFutureTuition {

	public static void main(String[] args) {
		/*
		 * (Financial application: compute future tuition) Suppose that the tuition for
		 * a university is $10,000 this year and increases 6% every year. In one year,
		 * the tuition will be $10,600. Write a program that computes the tuition in ten
		 * years and the total cost of four years’ worth of tuition after the tenth
		 * year.
		 * 
		 *BryanChontasi
		 */

		double tuition = 10000;
		double incRate = 1.06;
		double fourYearsWorth = 0;
		double Year10TotalCost = 0;

		for (int i = 1; i <= 14; i++) {
			tuition = tuition * incRate;

			if (i > 10) {
				fourYearsWorth += tuition;
			}
			if (i == 10 ) {
				Year10TotalCost = tuition;
			}
			if (i == 1 || i ==10) {
				System.out.printf("Tuition in %2d year is:$%,.2f\n", i, tuition); //to easily print an indication in year 1 and 10
			} else {
				System.out.printf("%13d year is $%,.2f\n", i, tuition); //print all the years with its worth
			}
		}
		System.out.printf("The tuition in ten years is: $%,.2f\n", Year10TotalCost);
		System.out.printf("The total cost of four years’ worth of tuition after the tenth year is: $%,.2f\n",
				fourYearsWorth);
	}
}

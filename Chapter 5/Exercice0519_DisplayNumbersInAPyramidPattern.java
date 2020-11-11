package Chapter5;

public class Exercice519_DisplayNumbersInAPyramidPattern {

	public static void main(String[] args) {
		/*
		 * (Display numbers in a pyramid pattern) Write a nested for loop that prints
		 * the following output: 
		 * 
		 *                                    1
		 *                               1    3    1
		 *                          1    3    9    3    1
		 *                     1    3    9   27    9    3    1
		 *                1    3    9   27   81   27    9    3    1
		 *           1    3    9   27   81  243   81   27    9    3    1
		 *      1    3    9   27   81  243  729  243   81   27    9    3    1
		 * 1    3    9   27   81  243  729 2187  729  243   81   27    9    3    1
		 * 
		 * 
		 * Bryan Chontasi
		 *
		 */
		
		int numberOfLines = 8;
		for (int i = 0; i < numberOfLines; i++ ) {
			for(int x = numberOfLines - i + 1; x > 0; x -- ) {
				 System.out.print("     ");
			}
			for (int j = 0; j <= i; j++) {
                if (j==0){
                   //
                	System.out.printf("%-1.0f", Math.pow(3, j)); //first number of each line
                }else {
                System.out.printf("%5.0f", Math.pow(3, j));} // numbers until the middle of the pyramid
            }
			for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%5.0f", Math.pow(3, j));// numbers for the second half of the pyramid
            }
            System.out.println();
        }
    }
}

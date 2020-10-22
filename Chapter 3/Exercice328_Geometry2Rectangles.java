package section3;

import java.util.Scanner;

public class Exercice328_Geometry2Rectangles {
	public static void main(String[] args) {
		/*
		 * Geometry: two rectangles) Write a program that prompts the user to enter the
		 * center x-, y-coordinates, width, and height of two rectangles and determines
		 * whether the second rectangle is inside the first or overlaps with the first,
		 * as shown in Figure 3.9. Test your program to cover all cases.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		double xDistance = Math.abs(x1 - x2);
		double yDistance = Math.abs(y1 - y2);

		boolean isInside = ((width1 - width2) / 2 >= xDistance) && ((height1 - height2) / 2 >= yDistance);
		boolean isOverlap = ((width1 + width2) / 2 >= xDistance) && ((height1 + height2) / 2 >= yDistance);

		if (isInside) {
			System.out.println("r2 is inside r1");
		} else if (isOverlap) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}
	}
}

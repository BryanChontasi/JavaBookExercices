package section3;

import java.util.Scanner;

public class Exercice327_GeometryPointInTriangle {

	public static void main(String[] args) {
		/*
		 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane
		 * as shown below. The right-angle point is placed at (0, 0), and the other two
		 * points are placed at (200, 0) and (0, 100). Write a program that prompts the
		 * user to enter a point with x- and y-coordinates and determines whether the
		 * point is inside the triangle
		 * 
		 * Example:
		 * 
		 * Enter a point’s x- and y-coordinates: 100.5 25.5
		 * The point is in the triangle
		 */

		// Prompt the user to enter a point with x and y coordinates
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((x >= 0) && (y >= 0) && (x <= 200) && (y <= 100) && (y <= 100 - x / 2)) {
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is not in the triangle");
		}
	}
}

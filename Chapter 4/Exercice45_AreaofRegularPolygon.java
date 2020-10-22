package Chapter4;

import java.util.Scanner;

public class Exercice45_AreaofRegularPolygon {

	public static void main(String[] args) {
		/*
		 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
		 * in which all sides are of the same length and all angles have the same degree
		 * (i.e., the polygon is both equilateral and equiangular). The formula for
		 * computing the area of a regular polygon is
		 * 
		 * Area = (n * s2) / (4 *tan(pi-n))
		 * 
		 * Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their
		 * length of a regular polygon and displays its area. Here is a sample run:
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n = input.nextDouble();
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

		System.out.print("The area of the polygon is: " + area);

	}

}

package Chapter4;

import java.util.Scanner;

public class Exercice44_AreaofHexagon {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter the side of a hexagon and
		 * displays its area.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		
		//formula for the area of Hexagon
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.printf("The area of the hexagon is %.2f", area);
	}

}

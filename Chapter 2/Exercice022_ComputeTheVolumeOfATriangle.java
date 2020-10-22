import java.util.Scanner;

public class Exercice022_ComputeTheVolumeOfATriangle {

	public static void main(String[] args) {
		/*(Compute the volume of a triangle) Write a program that reads in the length of sides of an
		 *  equilateral triangle and computes the area and volume.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
		double lengthOfSides = input.nextDouble();
		
		double hight = input.nextDouble();
		double area = Math.sqrt(3) / 4 *  Math.pow(lengthOfSides, 2);
		double volume = area * hight;
		
		System.out.println("The area is " + (int) (area * 100) / 100.0);
		System.out.println("The volume of the Triangular prism is  " + (int) (volume * 100) / 100.0);
	}
}

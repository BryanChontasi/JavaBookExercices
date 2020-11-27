package Chapter_6_Methods;

import java.util.Scanner;

public class Exercice0619_Triangles {

	public static void main(String[] args) {
		/*
		 * (Triangles) Implement the following two methods:  
		 * 
		 * Return true if the sum of every two sides is greater than the third side.
		  
		  public static boolean isValid( double side1, 
		  		double side2, double side3)
		  
		 *Return the area of the triangle
		 
		 public static double area(
				double side1, double side2, double side3)
		 
		 *Bryan Chontasi 27/11/2020
		 */
		
		//prompt the user to insert input
		Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
		
        //to test the methods and get the output
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of this triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid triangle");
        }
    }
	//Return true if the sum of every two sides is greater than the third side.
	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		}
		return false;	
	}
	//Return the area of the triangle
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) /2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));	
	}
}

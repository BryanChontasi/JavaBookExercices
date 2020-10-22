package section3;

import java.util.Scanner;

public class Exercice314_Game_HeadsOrTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (Game: heads or tails) Write a program that lets the user guess whether the
		 * flip of a coin results in heads or tails. The program randomly generates an
		 * integer 0 or 1, which represents head or tail. The program prompts the user
		 * to enter a guess, and reports whether the guess is correct or incorrect.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 for Head or 1 for Tails: ");
		int number = input.nextInt();

		int random = (int) (Math.random() * 2);

		if (number == random) {
			System.out.println("You won!!");
		} else {
			System.out.println("You lose!!");
		}
		System.out.println(" random is " + random + " and you " + (number == random ? " won" : "lost"));
	}

}

package Chapter5;

import java.util.Scanner;

public class Exercice0540_Simulation2millionTimes_HeadsorTails {

	public static void main(String[] args) {
		/*
		 * (Simulation: heads or tails) Write a program that simulates flipping a coin
		 * two millions times and displays the number of heads and tails.
		 * 
		 * Bryan Chontasi 11/11/2020
		 */

		// Create counters for tails and heads
		int tails = 0;
		int heads = 0;

		// create formula to generate a random number 2million times
		for (int i = 0; i < 2000000; i++) {
			// if number is 0 add 1 to heads, if not add 1 to tails
			int random = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
		}
		// print results
		System.out.println("Heads: " + heads + "\nTails: " + tails);
	}
}

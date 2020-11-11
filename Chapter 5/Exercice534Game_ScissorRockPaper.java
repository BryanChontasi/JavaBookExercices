package Chapter5;

import java.util.Scanner;

public class Exercice534Game_ScissorRockPaper {

	public static void main(String[] args) {
		/*
		 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
		 * plays the scissor-rock-paper game. Revise the program to let the user
		 * continuously play until either the user or the computer wins three times more
		 * than their opponent.
		 * 
		 * Bryan Chontasi 11/11/2020
		 */

		Scanner input = new Scanner(System.in);

		int countPC = 0;
		int countUser = 0;

		while (Math.abs(countPC - countUser) < 3) {

			System.out.print("\nscissor (0), rock (1), paper (2): ");

			int computer = (int) (Math.random() * 3);

			int user = input.nextInt();
			// System.out.println(computer);

			String strUser = "";
			switch (user) {
			case 0:
				strUser = " scissor ";
				break;
			case 1:
				strUser = " rock ";
				break;
			case 2:
				strUser = " paper ";
				break;
			default:
				System.out.print("Invalid input.");
				// System.exit(0);
			}

			String strComputer = "";
			switch (computer) {
			case 0:
				strComputer = " scissor ";
				break;
			case 1:
				strComputer = " rock ";
				break;
			case 2:
				strComputer = " paper ";
				break;
			}
			System.out.print("\nThe computer is " + strComputer + ". You are " + strUser);

			if (user == computer) {
				System.out.print(" too. It is a draw");
			} else if (user - computer == 1 || user - computer == -2) {
				System.out.print(" you won");
				countUser++;
			} else if (computer - user == -2 || computer - user == 1 || computer - user == -1 || computer - user == 2) {
				System.out.print(" you lost");
				countPC++;
			}
		}
		System.out.println("\nGAME OVER " + "PC: " + countPC + " USER: " + countUser);
	}
}

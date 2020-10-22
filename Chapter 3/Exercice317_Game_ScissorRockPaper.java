package section3;

import java.util.Scanner;

public class Exercice317_Game_ScissorRockPaper {

	public static void main(String[] args) {

		/*
		 * (Game: scissor, rock, paper) Write a program that plays the popular
		 * scissor–rock– paper game. (A scissor can cut a paper, a rock can knock a
		 * scissor, and a paper can wrap a rock.) The program randomly generates a
		 * number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
		 * the user to enter a number 0, 1, or 2 and displays a message indicating
		 * whether the user or the computer wins, loses, or draws.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");

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
			System.exit(0);
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
		System.out.print("The computer is " + strComputer + ". You are " + strUser);

		if (user == computer) {
			System.out.print(" too. It is a draw");
		} else if (user - computer == 1 || user - computer == -2) {
			System.out.print(" you won");
		} else if (user - computer == -1 || computer - user == 2) {
			System.out.print(" you lost");
		}
	}

}

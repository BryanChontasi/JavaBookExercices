package section3;

public class Exercice324_Game_PickACard {

	public static void main(String[] args) {

		/*
		 * (Game: pick a card) Write a program that simulates picking a card from a deck
		 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8,
		 * 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the
		 * card. 
		 * 
		 */

		int cards = (int) (Math.random() * 52.0); // pick a card 0-51
		int range = cards / 4;
		int suit = cards % 4;

		String strRange = "";
		String strSuit = "";

		switch (range) {
		case 0:
			strRange = " Ace ";
			break;
		case 10:
			strRange = " jack ";
			break;
		case 11:
			strRange = " queen ";
			break;
		case 12:
			strRange = " king ";
			break;
		default:
			strRange = "" + (range + 1);
			break;
		}

		switch (suit) {
		case 0:
			strSuit = " Clubs ";
			break;
		case 1:
			strSuit = " Diamonds ";
			break;
		case 2:
			strSuit = " Hearts ";
			break;
		case 3:
			strSuit = " Spades ";
			break;

		}
		System.out.print("The card you picked is " + strRange + " of " + strSuit);

	}

}

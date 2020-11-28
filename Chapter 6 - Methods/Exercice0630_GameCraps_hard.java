package Chapter_6_Methods;

public class Exercice0630_GameCraps_hard {

	public static void main(String[] args) {
		/*(Game: craps) Craps is a popular dice game played in casinos. Write a program 
		 * to play a variation of the game, as follows:
		 * Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respec- 
		 * tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you 
		 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value 
		 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either 
		 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
		 * 
		 * 
		 * Bryan Chontasi 28/11/2020
		 * */
		
		int dice = rollDice(); // gets 2 random numbers from 1 to 6
		System.out.println(getStatus(dice) ? "You win" : "You lose");

	}

	public static int rollDice() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);
		int sumOfDice = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sumOfDice);
		return sumOfDice;
	}
	//point will tell you if you win, lose or continue.
	public static boolean getStatus(int point) {
		if (point == 7 || point == 11) {
			return true;
		} else if (point == 2 || point == 3 || point == 12) {
			return false;
		} else {
			System.out.println("point is " + point);
			int secondPoint = rollDice();
			while (true) {
				if (secondPoint == point) {
					return true;
				} else if (secondPoint == 7) {
					return false;
				} else {
					System.out.println("point is " + secondPoint);
					secondPoint = rollDice();
				}
			}
		}
	}
}

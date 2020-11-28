package Chapter_6_Methods;

public class Exercice0633_Game_ChanceOfWinningAtCraps {

	public static void main(String[] args) {
		/*
		 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 15,000
		 * times and display the number of winning games.
		 * 
		 * Bryan Chontasi 28/11/2020
		 */
		
		int winCount = 0; //will count how many wins
        int numOfTrail = 15000; //maximum of trials
        for (int i = 0; i < numOfTrail; i++) {
            int point = rollDice();
            if (getStatus(point)) {  //if getSatus is true
                System.out.println("You win");
                winCount++;
            } else { //if getStatus is false
                System.out.println("You lose");
            }
        }
        System.out.println("\nYou won " + winCount + " times in " + numOfTrail + " trails");
    }
	// gets 2 random numbers from 1 to 6
	public static int rollDice() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);
		int sumOfDice = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sumOfDice);
		return sumOfDice;
	}
	// point will tell you if you win, lose or continue.
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

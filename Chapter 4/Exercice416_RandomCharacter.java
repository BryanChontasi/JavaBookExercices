package Chapter4;

public class Exercice416_RandomCharacter {

	public static void main(String[] args) {
		/*
		 * (Random character) Write a program that displays a random lowercase letter
		 * using the Math.random() method.
		 * 
		 */
		
		int randomNumber = (int) (Math.random() * 26 + 97);

		System.out.println(randomNumber);
		
		char character = (char) randomNumber;
		System.out.println("The generated random lowercase letter is " + character);

	}

}

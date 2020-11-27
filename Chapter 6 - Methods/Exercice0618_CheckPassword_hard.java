import java.util.Scanner;

public class Exercice0618_CheckPassword_hard {

	public static void main(String[] args) {
		/*
		 * (Check password) Some websites impose certain rules for passwords. Write a
		 * method that checks whether a string is a valid password. Suppose the password
		 * rules are as follows:
		 * 
		 * -A password must have at least ten characters.
		 * -A password consists of only letters and digits.
		 * -A password must contain at least three digits.
		 * 
		 * Write a program that prompts the user to enter a password and displays Valid Password
		 *  if the rules are followed or Invalid Password otherwise.
		 * 
		 * 
		 * Bryan Chontasi 27/11/2020
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter Password: ");
		String password = input.next();
		
		 //to test the methods and get the output
        if (validPassword(password)) {
            System.out.println("The password is valid" );
        } else {
            System.out.println("Invalid password");
        }
    }
	
	//this method returns 0 if letter, 1 if number and -1 if invalid character
	public static int isLetterOrDigit(char ch) {
		if((ch >= 'A' && ch<= 'Z') || (ch >= 'a' && ch<= 'z')) {
			return 0;
		}
		if (ch >= '0' && ch <= '9') {
			return 1;
		}
		return -1;


	}
	
	public static boolean validPassword(String password) {

		// A password must have at least ten characters.
		if (password.length() < 10) {
			System.out.println("Password must have at least ten characters.");
			return false;
		}

		int digitCount = 0; //to count how many digits the passwrod has

		for (int i = 0; i < password.length(); i++) {

			switch (isLetterOrDigit(password.charAt(i))) {
			//if is -1 is invalid
			case -1:
				System.out.print("Password must consists of only leters and digits");
				return false;
			//digit count adds 1
			case 1:
				digitCount++;
				break;
			case 0:
				break;
			}
		}
		//A password must contain at least three digits.
		if (digitCount < 3) {
			System.out.println("A password must contain at least three digits.");
			return false;
		}
		return true; //valid password
	}
}

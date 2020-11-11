package Chapter5;

public class Exercice518_DisplayFourPatternsUsingLoops {

	public static void main(String[] args) {
		/*
		 * Display four patterns using loops) Use nested loops that display the
		 * following patterns in four separate programs:
		 ** Pattern A
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * * * *
		 * * * * * * *
		 *
		 * Pattern B
		 * * * * * * *
		 * * * * * *
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 * Pattern C
		 *           *
		 *         * *
		 *       * * *
		 *     * * * *
		 *   * * * * *
		 * * * * * * *
		 *
		 * Pattern D
		 * * * * * * *
		 *   * * * * *
		 *     * * * *
		 *       * * *
		 *         * *
		 *           *
		 *
		 * 
		 * Bryan Chontasi
		 */
		
		int numberOfLines = 6;
		
		//Pattern A
		System.out.println("Pattern A");
		for(int i = 1; i <= numberOfLines; i++) {
			for (int x= 0; x < i; x++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Pattern B
		System.out.println("\nPattern B");
		for(int i = 1; i<= numberOfLines; i++) {
			for(int x = numberOfLines -i + 1; x>0;x--) {
				System.out.print("* ");
			}
			System.out.println();			
		}
		
		//Pattern C 
		System.out.println("\nPattern C");
		for (int i = 1; i <= numberOfLines; i++) {
			for (int x = numberOfLines - i; x >0; x--) {
				System.out.print("  ");
			}
			 for (int y= 0; y < i; y++) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
		
		//Pattern D
		System.out.println("\nPattern B");
		for (int i = 1; i <= numberOfLines; i++) {
			for (int x = 0 ; x < i - 1; x++) {
				System.out.print("  ");
			}
			 for (int y = numberOfLines - i + 1; y >0; y--) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
	}
}

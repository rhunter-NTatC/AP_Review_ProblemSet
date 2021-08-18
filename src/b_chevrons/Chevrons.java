package b_chevrons;

import java.util.Scanner;

/*
 * Chevrons
 * 
 * The purpose of this is to print out chevrons based upon a user's input
 * 
 * The user will input
 *    1 how many they want
 *    2 how wide they want them
 *    
 * YOU MUST!!!
 *    Print these with 5 or fewer loops
 *    Don't repeat the base character
 *    
 * Advanced (probably need more than one)
 *   Only use 3 loops
 *   Guard against bad inputs
 *   You can come up with something, just pitch it!!
 *    
 *    
 * SAMPLE RUN
 *     How wide do you want the chevrons? 8
 *     How many chevrons do you want? 3
 *     
 *     >
 *      >
 *       >
 *        >
 *         >
 *          >
 *           >
 *            >
 *           >
 *          >
 *         >
 *        >
 *       >
 *      >
 *     >
 *      >
 *       >
 *        >
 *         >
 *          >
 *           >
 *            >
 *           >
 *          >
 *         >
 *        >
 *       >
 *      >
 *     >
 *      >
 *       >
 *        >
 *         >
 *          >
 *           >
 *            >
 *           >
 *          >
 *         >
 *        >
 *       >
 *      >
 *     >
 *     
 */

public class Chevrons {

	public static void main(String[] args) {
		/*
		 * This method only need 1 statement!!!!!!!
		 */
		
		getInfo();
		
	}
	
	/*
	 * gets the width and number of chevrons from the user
	 */
	public static void getInfo() {
		
		Scanner inkey = new Scanner(System.in);
		
		System.out.print("How wide do you want the chevrons? ");
		int width = inkey.nextInt();
		System.out.print("How many chevrons do you want? ");
		int numChev = inkey.nextInt();
		
		System.out.println();
		
		printChevrons(width, numChev);
		
	}
	
	/*
	 * This actually prints the chevrons
	 */
	public static void printChevrons(int width, int numChev) {
		
		//loops the number of Chevrons needed
		for (int i = 0; i < numChev; i++) {
			
			//print 1 chevron going out
			for (int j = 1; j <= width; j++) {
				
				//print 1 chevron row
				for (int k = 1; k <= j; k++) {
					if (k < j) {
						System.out.print(" ");
					}
					else {
						System.out.println(">");
					}
				}
				
				
				
			}
			
			//print 1 chevron coming back
			for (int j = width - 1; j > 1; j--) {
				
				//print 1 chevron row
				for (int k = 1; k <= j; k++) {
					if (k < j) {
						System.out.print(" ");
					}
					else {
						System.out.println(">");
					}
				}
				
				
				
			}
			
			
		}
		System.out.println(">");
		
		
		
	}
	
	
}

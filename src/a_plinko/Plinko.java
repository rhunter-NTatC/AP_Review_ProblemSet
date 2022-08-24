package a_plinko;

import java.util.Scanner;

/*
 * PLINKO
 * 
 * Go here to see how the Pinko board works.
 * skip to 3:00 to see the board
 * https://www.youtube.com/watch?v=E7DKxe_m1AM
 * 
 * 
 * You'll be creating a Plinko board.
 * 
 * Here's how it will work
 * 
 *   1) User chooses a column to start with (1-8)
 *   
 *   2) The Plinko Chip falls through 10 (or more) rows.
 *        Each row randomly chooses wether to stay in that
 *        column or move 1 left or right.
 *        Don't go off the board
 *   
 *   3) Print each column as the "Chip" falls
 *        Include the starting and finishing rows
 * 
 * Advanced ideas
 *   Allow the user to play it multiple times and rack up or loose $$
 *   Add a betting element to it
 *   Create safeguards keeping the user from entering bad inputs
 *   Play with the odds so that it's more likely to move rather than stay in the same column
 *   Add a new element to the game (feel free to pitch ideas)
 *   
 *   
 *   SAMPLE RUN:
 *   
 *      Which row do you want to start on? (1-9): 3
 *      
 *          |1|2|3|4|5|6|7|8|9|
 *          | | |X| | | | | | |
 *          | | | |X| | | | | |
 *          | | | | |X| | | | |
 *          | | | | |X| | | | |
 *          | | | |X| | | | | |
 *          | | |X| | | | | | |
 *          | | | |X| | | | | |
 *          | | | |X| | | | | |
 *          | | | | |X| | | | |
 *          | | | | | |X| | | |
 *          | | | | |X| | | | |
 *          | | |-| |2| |-| | |
 *          |1|5|5| |0| |5|5|1|
 *          |0|0|0|0|0|0|0|0|0|
 *          |0|0|0| |0| |0|0|0|
 *          | | |-| |0| |-| | |
 *          | | | | | | | | | |
 *      
 *      
 *      JACKPOT!!!! $20,000
 *      Winnings = $20,000
 *      
 * 
 */

public class Plinko {

	
	/*
	 * This simply starts the game
	 */
	public static void main(String[] args) {
		
		
		
	}
	
	/*
	 * Have the user choose a starting column
	 * Where do they want to start the chip?
	 * 
	 */
	public static void chooseStartColumn() {
		
		
		
	}
	
	
	
	
	/*
	 * Calculates where the Plinko Chip moves to
	 * on the next row
	 */
	public static void getNextRow(int rowNum, int colNum) {
		
		
		
	}
	
	
	
	
	/*
	 * Prints the current row with the Plinko Chip at the
	 * appropriate spot
	 * 
	 * Advanced idea
	 *    Instead of a switch or if tree with every possibility printed
	 *    Use loops to print the row
	 */
	public static void printRow(int rowNum, int colNum) {
		
		
		
	}
	
	
	
	
	/*
	 * Print the last Plinko row with the $$ amounts
	 */
	public static void printResults(int colNum) {
		
		
		
		
	}
	
	
	
	
}

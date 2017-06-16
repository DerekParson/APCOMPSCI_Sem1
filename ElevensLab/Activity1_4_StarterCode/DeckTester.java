/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank = {"1", "2", "3", "4"};	
		String[] suit = {"Hearts", "Hearts", "Spades", "Diamonds"};
		int[] pointValue = {9, 12, 3, 7};
		Deck d = new Deck(rank, suit, pointValue);
		System.out.println("Deck is Empty - " + d.isEmpty());
		System.out.println("Size of Deck - " + d.size());
		System.out.println("Deal Deck - " + d.deal());
		
	}
}

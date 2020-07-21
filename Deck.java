package deck.basic;
import java.util.*;
/**
 * A class representing a deck of cards.
 * @author MrEgggga
 * @version 1.0
 * */
public class Deck {
	private LinkedList<Card> cards = new LinkedList<Card>();
	private Random rng = new Random();
	
	/**
	 * Standard constructor for Decks, giving an ordered deck with all 52 cards.
	 * @since 1.0
	 * */
	public Deck() {
		for(Suit s : Suit.values()) {
			for(FaceValue f : FaceValue.values()) { // For each suit and value...
				cards.add(new Card(s, f)); // add that card to the deck.
			}
		}
	}
	
	/**
	 * Remove a card from the top of the deck and return it.
	 * @return The drawn card
	 * @since 1.0
	 * */
	public Card drawCard() {
		return cards.removeLast();
	}
	
	/**
	 * Add the card to the deck if it is not in the deck already.
	 * @param card The card to add to the deck
	 * */
	public void addCard(Card card) {
		if(cards.indexOf(card) == -1) {
			cards.add(card);
		}
	}
	
	/**
	 * Shuffle the deck.
	 * */
	public void shuffle() {
		LinkedList<Card> storageDeck = new LinkedList<Card>(); // Create a new list to store the cards in.
		while(cards.size() > 0) { // While the deck isn't empty...
			int chosenCard = (int) (rng.nextDouble() * cards.size());
			storageDeck.add(cards.remove(chosenCard)); // remove a random card and add it to the storage deck.
		}
		cards = storageDeck; // Set cards to storageDeck.
	}
	
	/**
	 * Return the String representation of the deck.
	 * @return All hte cards in the deck in order, seperated by spaces (the last one is the top)
	 * */
	public String toString() {
		String returnString = "";
		for(Card c : cards) {
			returnString += c.toString() + ", ";
		}
		returnString.replaceAll(", $","");
		return returnString;
	}
}

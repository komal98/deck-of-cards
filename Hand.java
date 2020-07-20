package deck.basic;
import java.util.*;

/**
 * A class for a hand of cards.
 * @author MrEgggga
 * @version 1.0
 * */
public class Hand {
	private HashSet<Card> cards;
	
	/**
	 * Creates a new empty Hand instance.
	 * */
	public Hand() {
		this.cards = new HashSet<Card>();
	}
	
	/**
	 * Add a new card to the hand. If the card is a duplicate of another card in the hand,
	 * don't add it.
	 * @param card The card to add
	 * @return Whether the card was added
	 * @since 1.0
	 * */
	public boolean addCard(Card card) {
		return cards.add(card);
	}
	
	/**
	 * Discard a card from the hand and return the card. If the card wasn't in the hand, throw an error.
	 * @param card The card to be played
	 * @return The card that was played
	 * @throws NoSuchElementException if the card specified was not in the hand.
	 * @since 1.0
	 * */
	public Card playCard(Card card) throws NoSuchElementException {
		if(cards.contains(card)) {
			cards.remove(card);
			return card;
		} else {
			throw new NoSuchElementException();
		}
	}
}

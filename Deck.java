import java.util.*;
public class Deck {
	private LinkedList<Card> cards = new LinkedList<Card>();
	private Random rng = new Random();
	
	public Deck() {
		for(Suit s : Suit.values()) {
			for(FaceValue f : FaceValue.values()) {
				cards.add(new Card(s, f));
			}
		}
	}
	
	public Card drawCard() {
		return cards.removeLast();
	}
	
	public void addCard(Card card) {
		if(cards.indexOf(card) == -1) {
			cards.add(card);
		}
	}
	
	public void shuffle() {
		LinkedList<Card> storageDeck = new LinkedList<Card>();
		while(cards.size() > 0) {
			int chosenCard = (int) (rng.nextDouble() * cards.size());
			storageDeck.add(cards.remove(chosenCard));
		}
		cards = storageDeck;
	}
	
	public String toString() {
		String returnString = "";
		for(Card c : cards) {
			returnString += c.toString() + " ";
		}
		return returnString;
	}
}

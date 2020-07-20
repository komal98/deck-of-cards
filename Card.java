package deck.basic;
/**
 * A class representing a playing card.
 * @version 1.0
 * @author MrEgggga
 * */
public class Card {
	private Suit suit;
	private FaceValue faceValue;
	
	/**
	 * Normal constructor for Cards.
	 * @param suit The suit of the card
	 * @param faceValue The face value of the card
	 * @since 1.0
	 * */
	public Card(Suit suit, FaceValue faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	/**
	 * Get the suit of the card.
	 * @return The suit of the card
	 * @since 1.0
	 * */
	public Suit getSuit() {
		return this.suit;
	}
	
	/**
	 * Get the face value of the card.
	 * @return The face value of the card
	 * @since 1.0
	 * */
	public FaceValue getFaceValue() {
		return this.faceValue;
	}
	
	/**
	 * Get the String representation of the card.
	 * @return The String representation of the card
	 * @since 1.0
	 * */
	public String toString() {
		// The face value, then the suit, like 3[diamonds] or T[spades], but with cool Unicode.
		return this.faceValue.toString() + this.suit.toString();
	}
}

package deck.basic;
/**
 * Enum for suit of card.
 * @author MrEgggga
 * @version 1.0
 * */
public enum Suit {
	/**Spades*/
	SPADES("\u2664"),
	/**Hearts*/
	HEARTS("\u2665"),
	/**Diamonds*/
	DIAMONDS("\u2666"),
	/**Clubs*/
	CLUBS("\u2667");
	
	private String symbol;
	
	private Suit(String symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Return the Unicode symbol of the suit.
	 * @return The Unicode symbol of the suit
	 * @since 1.0
	 * */
	public String toString() {
		return this.symbol;
	}
}

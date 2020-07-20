package deck.basic;
/**
 * Enum for face value of card.
 * @author MrEgggga
 * @version 1.0
 * */
public enum FaceValue {
	/**Ace*/
	ACE("A"),
	/**Deuce (two)*/
	DEUCE("2"),
	/**Three*/
	THREE("3"),
	/**Four*/
	FOUR("4"),
	/**Five*/
	FIVE("5"),
	/**Six*/
	SIX("6"),
	/**Seven*/
	SEVEN("7"),
	/**Eight*/
	EIGHT("8"),
	/**Nine*/
	NINE("9"),
	/**Ten*/
	TEN("T"),
	/**Jack*/
	JACK("J"),
	/**Queen*/
	QUEEN("Q"),
	/**King*/
	KING("K");
	
	private String symbol;
	
	private FaceValue(String symbol) {this.symbol = symbol;}
	
	/**
	 * Return the symbol of the face value (using T for ten).
	 * @return The symbol of the face value
	 * @since 1.0
	 * */
	public String toString() {
		return this.symbol;
	}
}

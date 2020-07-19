public enum FaceValue {
	ACE("A"),
	DEUCE("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("T"),
	JACK("J"),
	QUEEN("Q"),
	KING("K");
	
	private String symbol;
	
	private FaceValue(String symbol) {this.symbol = symbol;}
	
	public String toString() {
		return this.symbol;
	}
}

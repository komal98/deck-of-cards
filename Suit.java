public enum Suit {
	SPADES("\u2664"),
	HEARTS("\u2665"),
	DIAMONDS("\u2666"),
	CLUBS("\u2667");
	
	private String symbol;
	
	private Suit(String symbol) {
		this.symbol = symbol;
	}
	
	public String toString() {
		return this.symbol;
	}
}

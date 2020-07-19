public class Card {
	private Suit suit;
	private FaceValue faceValue;
	
	public Card(Suit suit, FaceValue faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	public FaceValue getFaceValue() {
		return this.faceValue;
	}
	
	public String toString() {
		return this.faceValue.toString() + this.suit.toString();
	}
}

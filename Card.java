public class Card<S extends Enum, F extends Enum> {
	private S suit;
	private F faceValue;
	
	public Card(S suit, F faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public S getSuit() {
		return this.suit;
	}
	public F getFaceValue() {
		return this.faceValue;
	}
	
	public String toString() {
		return this.faceValue.toString() + this.suit.toString();
	}
}

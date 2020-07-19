public class CardTest {
	public static void main(String[] args) {
		System.out.println(new Card(Suit.DIAMONDS, FaceValue.TEN));
		Deck deck = new Deck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
	}
}

/**
 * Standard face value ranking of cards (with A as 14).
 * @author MrEgggga
 * @version 1.0
 * */
public class StandardValueRanking {
	/**
	 * Return the value of the specified face value.
	 * @param faceval The face value
	 * @return The value of the specified face value
	 * @since 1.0
	 * */
	public static int rankingOf(FaceValue faceval) {
		switch (faceval.toString()) {
			case "2": 	return 2;
						break;
			case "3":	return 3;
						break;
			case "4":	return 4;
						break;
			case "5":	return 5;
						break;
			case "6":	return 6;
						break;
			case "7":	return 7;
						break;
			case "8":	return 8;
						break;
			case "9":	return 9;
						break;
			case "T":	return 10;
						break;
			case "J":	return 11;
						break;
			case "Q":	return 12;
						break;
			case "K":	return 13;
						break;
			case "A":	return 14;
						break;
			default:	return 0;
						break;
		}
	}
}

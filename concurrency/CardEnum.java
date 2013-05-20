public class CardEnum {
	public static enum Suit {
		HEARTS("Hearts"),
		DIAMONDS("Diamonds"),
		CLUBS("Clubs"),
		SPADES("Spades");

		String string;

		Suit(String string) {
			this.string = string;
		}

		String string(){
			return string;
		}
	}

	public static enum Rank {
		ACE("Ace"),
		DEUCE("Deuce"),
		THREE("Three"),
		FOUR("Four"),
		FIVE("Five"),
		SIX("Six"),
		SEVEN("Seven"),
		EIGHT("Eight"),
		NINE("Nine"),
		TEN("Ten"),
		JACK("Jack"),
		QUEEN("Queen"),
		KING("King");

		String string;

		Rank(String string) {
			this.string = string;
		}

		String string(){
			return string;
		}
	}


	private final Suit suit;
	private final Rank rank;

	public CardEnum(Suit suit, Rank rank) { 
		this.rank = rank;
		this.suit = suit;
	}

	public Suit getSuit(){
		return suit;
	}

	public Rank getRank(){
		return rank;
	}

	public String toString() {
		return String.format("%s of %s", rank.string(), suit.string());
	}

	public static void main(String[] args) {
		assert(new CardEnum(Suit.HEARTS, Rank.ACE).toString().equals("Ace of Hearts"));
		assert(new CardEnum(Suit.HEARTS, Rank.KING).toString().equals("King of Hearts"));
	}
}
public class Card {
	//private Enum Suit {Heart, Spade, Clover, Diamond};
	//private Enum Rank {A, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, King, Queen}
	private final String suit;
	private final int rank;

	public Card (String suit, int rank) { 
		switch (suit){
			case("Heart"):
			case("Spade"):
			case("Clubs"):
			case("Diamond"):
				this.suit = suit;
				break;
			default:
				this.suit = suit;
				System.out.println("Invalid suit");
				System.exit(1);
		}
		if(rank <= 13 && rank > 0) {
			this.rank = rank;
		} else {
			this.rank = -1;
			System.out.println("Invalid rank");
			System.exit(1);
		}
	}

	public String getSuite(){
		return suit;
	}

	public int getRank(){
		return rank;
	}

	public String toString() {
		switch (rank) {
			case(1):
				return String.format("%s of %ss", "Ace", suit);
			case(11):
				return String.format("%s of %ss", "Jack", suit);
			case(12):
				return String.format("%s of %ss", "Queen", suit);
			case(13):
				return String.format("%s of %ss", "King", suit);
			default:
				break;
		}
		return String.format("%d of %ss", rank, suit);
	}
}
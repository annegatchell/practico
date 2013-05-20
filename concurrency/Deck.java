public class Deck {
	Card[] cards = new Card[52];

	public Deck() {
		String[] suites = {
			"Heart",
			"Spade",
			"Clover",
			"Diamond"
		};
		int current = 0;
		for(String s : suites) {
			for(int i = 1; i < 14; i++) {
				cards[current] = new Card(s, i);
				current++;
			}
		}
	}

	public String toString(){
		StringBuilder s = new StringBuilder();
		for(Card card : cards){
			s.append(card.toString());
			s.append("\n");
		}
		return s.toString();
	}
}
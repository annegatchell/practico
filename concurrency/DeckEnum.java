public class DeckEnum {
	CardEnum[] cards = new CardEnum[52];

	public DeckEnum() {
		int current = 0;
		for(CardEnum.Suit s : CardEnum.Suit.values()) {
			for(CardEnum.Rank r : CardEnum.Rank.values()) {
				cards[current] = new CardEnum(s, r);
				current++;
			}
		}
	}

	public String toString(){
		StringBuilder s = new StringBuilder();
		for(CardEnum card : cards){
			s.append(card.toString());
			s.append("\n");
		}
		return s.toString();
	}
}
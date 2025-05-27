package TwentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Deck class
class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        for (CardSuit suit : CardSuit.values()) {
            CardColor color = (suit == CardSuit.CLUBS || suit == CardSuit.SPADES) ? CardColor.BLACK : CardColor.RED;
            for (CardRank rank : CardRank.values()) {
                cards.add(new Card(color, suit, rank));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card pullFirst() {
        return cards.remove(0);
    }

    public Card pullLast() {
        return cards.remove(cards.size() - 1);
    }

    public Card pullRandom() {
        return cards.remove(new Random().nextInt(cards.size()));
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
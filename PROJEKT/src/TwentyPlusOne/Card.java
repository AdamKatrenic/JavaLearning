package TwentyPlusOne;

import java.util.*;

// Define enums for Card properties
enum CardColor {
    RED, BLACK;
}

enum CardSuit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}

enum CardRank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(10), KING(10), ACE(11);

    private final int value;

    CardRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// Card class
class Card {
    private final CardColor color;
    private final CardSuit suit;
    private final CardRank rank;

    public Card(CardColor color, CardSuit suit, CardRank rank) {
        this.color = color;
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (" + color + ")";
    }
}
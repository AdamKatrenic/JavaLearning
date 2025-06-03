package dev.lpa;

public class PlayingCard {

    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts")) ? 11 : 12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard that = (PlayingCard) o;
        return suit.equals(that.suit) && face.equals(that.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }
}

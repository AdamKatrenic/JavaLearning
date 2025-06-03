package dev.lpa;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dtext = "He". concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dtext, eText);

        hellos.forEach(s ->  System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet: " + mySet);
        System.out.println("# of elements: " + mySet.size());

        for(String setValue : mySet){
            System.out.println(setValue + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if (setValue == hellos.get(i)) {
                    System.out.println(i+", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Queen", "Spades");

        List<PlayingCard> playingCards = Arrays.asList(aceHearts, kingClubs, queenSpades);
        playingCards.forEach(s ->System.out.println(s+": "+s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard c : playingCards) {
            if (!deck.add(c)) {
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);

    }
}

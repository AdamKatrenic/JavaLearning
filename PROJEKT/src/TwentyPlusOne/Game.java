package TwentyPlusOne;

import java.util.Random;
import java.util.Scanner;

// Game class
class Game {
    private final Deck deck = new Deck();
    private int playerScore = 0;
    private final int opponentScore;

    public Game() {
        deck.shuffleDeck();
        opponentScore = new Random().nextInt(7) + 15; // Random number between 15 and 21
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opponent's target score: " + opponentScore);

        while (true) {
            System.out.println("Your current score: " + playerScore);
            System.out.print("Draw a card? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("no")) {
                break;
            } else if (choice.equals("yes")) {
                Card card = deck.pullFirst();
                playerScore += card.getValue();
                System.out.println("You drew: " + card);

                if (playerScore > 21) {
                    System.out.println("Your score exceeded 21. You lose!");
                    return;
                }
            } else {
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }
        }

        System.out.println("Final score: " + playerScore);
        if (playerScore >= opponentScore && playerScore <= 21) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
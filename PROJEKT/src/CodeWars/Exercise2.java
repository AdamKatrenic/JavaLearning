package CodeWars;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Use StringBuilder for input processing
        StringBuilder text = new StringBuilder(input);
        reverseLongWords(text);

        // Display the result
        System.out.println("Processed text: " + text);

        scanner.close();
    }

    public static void reverseLongWords(StringBuilder sb) {
        String[] words = sb.toString().split(" "); // Split text into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse word if it has 5 or more letters
            if (word.length() >= 5) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                result.append(reversedWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Update the original StringBuilder with the result
        sb.setLength(0); // Clear the original StringBuilder
        sb.append(result.toString().trim());
    }
}
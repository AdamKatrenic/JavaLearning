package dev.lpa;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World");

        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"First", "Second", "Third", "Fourth",  "Fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        for (String text : textList) {
            System.out.println(text);
        }
    }
}

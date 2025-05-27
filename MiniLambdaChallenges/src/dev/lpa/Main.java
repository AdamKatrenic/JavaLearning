package dev.lpa;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printTheParts = sentence -> {
            String[] words = sentence.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        };

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));

        String result = everySecondCharMethod(everySecondChar,"1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I LOVE JAVA!";
        System.out.println(iLoveJava.get());


    }


    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharMethod(Function<String, String> func, String source) {
        return func.apply(source);
    }
}

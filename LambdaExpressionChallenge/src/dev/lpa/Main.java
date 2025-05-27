package dev.lpa;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String[] firstNames = new String[]{"Adam","Lea","Anna","Bob","Tomas", "Daryl"};

        List<String> firstNamesList = Arrays.asList(firstNames);

        System.out.println(firstNamesList);

        System.out.println("-".repeat(100));

        UnaryOperator<String> firstNameFunction = (firstName) -> firstName.toUpperCase();
        System.out.println(firstNameFunction.apply(firstNamesList.toString()));

        System.out.println("-".repeat(100));

        Random random = new Random();
        UnaryOperator<String> addMiddleInitialFunction = (String firstName) -> {
            char middleInitial = (char) ('A' + random.nextInt(26));
            return firstName + " " +middleInitial + ".";
        };

        List<String> updatedNames = new ArrayList<>();
        for(String firstName : firstNames) {
            updatedNames.add(addMiddleInitialFunction.apply(firstName));
        }

        System.out.println(updatedNames);

        System.out.println("-".repeat(100));

        List<String> reversedMena = firstNamesList.stream()
                .map(meno -> new StringBuilder(meno).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedMena);

        System.out.println("-".repeat(100));

        for (int i = 0; i < firstNamesList.size(); i++) {
            System.out.println(firstNamesList.get(i)+" "+reversedMena.get(i));
        }

    }

}

package dev.lpa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        System.out.println(player);

        List<String> savedPlayer = player.write();

        Player newPlayer = new Player("Default", 1, 1);
        newPlayer.read(savedPlayer);
        System.out.println(newPlayer);

        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println(monster);

        List<String> savedMonster = monster.write();

        Monster newMonster = new Monster("Unknown", 0, 0);
        newMonster.read(savedMonster);
        System.out.println(newMonster);
    }
}


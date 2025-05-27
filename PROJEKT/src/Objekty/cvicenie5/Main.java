package Objekty.cvicenie5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonListOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "fighting", "water");

        // Which pokemon should Ash use?
        // Write the necessary code to get the name of the right pokemon and print it:
        for (int i = 0; i < pokemonListOfAsh.size(); i++) {
            Pokemon pokemonTeraz = pokemonListOfAsh.get(i);
            if (pokemonTeraz.isEffectiveAgainst(wildPokemon)){

            System.out.print("I choose you, " + pokemonTeraz.name);
            break;
        }
        }
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon("Bulbasaur", "grass", "water"));
        pokemonList.add(new Pokemon("Pikachu", "electric", "water"));
        pokemonList.add(new Pokemon("Charizard", "fire", "grass"));
        pokemonList.add(new Pokemon("Pidgeot", "flying", "fighting"));
        pokemonList.add(new Pokemon("Kingler", "water", "fire"));

        return pokemonList;
    }


}
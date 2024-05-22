package SOLID.DIP;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Trainer trainer = new Trainer(pikachu);
        trainer.catchPokemon();
        trainer.battle();
    }
}
package SOLID.DIP;

public class PokemonGame {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.catchPokemon();
        trainer.battle();
    }
}
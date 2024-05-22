package SOLID.LSP;

public class PokemonDemo {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.atttackPokemon(new FirePokemon());
        trainer.atttackPokemon(new WaterPokemon());
        trainer.atttackPokemon(new ElectricPokemon());
    }
}